// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMultiLanguageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Languages")
    public String languagesShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedSortPage")
    public Boolean needSortPage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputTable")
    public Boolean outputTable;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg">https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeMultiLanguageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMultiLanguageShrinkRequest self = new RecognizeMultiLanguageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMultiLanguageShrinkRequest setLanguagesShrink(String languagesShrink) {
        this.languagesShrink = languagesShrink;
        return this;
    }
    public String getLanguagesShrink() {
        return this.languagesShrink;
    }

    public RecognizeMultiLanguageShrinkRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeMultiLanguageShrinkRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    public RecognizeMultiLanguageShrinkRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeMultiLanguageShrinkRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeMultiLanguageShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeMultiLanguageShrinkRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
