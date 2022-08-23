// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMultiLanguageRequest extends TeaModel {
    @NameInMap("Languages")
    public java.util.List<String> languages;

    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("NeedSortPage")
    public Boolean needSortPage;

    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    @NameInMap("OutputTable")
    public Boolean outputTable;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeMultiLanguageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMultiLanguageRequest self = new RecognizeMultiLanguageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMultiLanguageRequest setLanguages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public RecognizeMultiLanguageRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeMultiLanguageRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    public RecognizeMultiLanguageRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeMultiLanguageRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeMultiLanguageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeMultiLanguageRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
