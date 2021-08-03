// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMultiLanguageRequest extends TeaModel {
    // 图片链接（长度不超 1014，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 识别语种
    @NameInMap("Languages")
    public java.util.List<String> languages;

    // 是否输出单字识别结果
    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    // 是否需要自动旋转功能(结构化检测、混贴场景、教育相关场景会自动做旋转，无需设置)，返回角度信息
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    // 是否输出表格识别结果，包含单元格信息
    @NameInMap("OutputTable")
    public Boolean outputTable;

    // 是否按顺序输出文字块。false表示从左往右，从上到下的顺序；true表示从上到下，从左往右的顺序
    @NameInMap("NeedSortPage")
    public Boolean needSortPage;

    public static RecognizeMultiLanguageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMultiLanguageRequest self = new RecognizeMultiLanguageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMultiLanguageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeMultiLanguageRequest setLanguages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public RecognizeMultiLanguageRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeMultiLanguageRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeMultiLanguageRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeMultiLanguageRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

}
