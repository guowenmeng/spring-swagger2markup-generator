package com.bkhech.swagger2markup.generator;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.net.URL;
import java.nio.file.Paths;

/**
 * @author guowm
 * @description 使用代码生成
 */
public class GeneratorByCode {

    static final String URL = "http://192.168.85.125:52001/api/v2/api-docs";

    public static void main(String[] args) throws Exception {
//        generateMarkdownDocs();
        generateMarkdownDocsToFile();
    }

    /**
     * 生成Markdown格式文档
     * @throws Exception
     */
    public static void generateMarkdownDocs() throws Exception {
        //    输出Markdown格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL(URL))
                .withConfig(config)
                .build()
                .toFolder(Paths.get("./docs/markdown/generated"));
    }

    /**
     * 生成Markdown格式文档,并汇总成一个文件
     * @throws Exception
     */
    public static void generateMarkdownDocsToFile() throws Exception {
        //    输出Markdown到单文件
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL(URL))
                .withConfig(config)
                .build()
                .toFile(Paths.get("./docs/markdown/generated/all"));
    }
}
