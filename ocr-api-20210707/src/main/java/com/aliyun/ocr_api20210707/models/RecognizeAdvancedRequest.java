// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAdvancedRequest extends TeaModel {
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
    @NameInMap("NoStamp")
    public Boolean noStamp;

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
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputTable")
    public Boolean outputTable;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Paragraph")
    public Boolean paragraph;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Row")
    public Boolean row;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg">https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeAdvancedRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAdvancedRequest self = new RecognizeAdvancedRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeAdvancedRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeAdvancedRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    public RecognizeAdvancedRequest setNoStamp(Boolean noStamp) {
        this.noStamp = noStamp;
        return this;
    }
    public Boolean getNoStamp() {
        return this.noStamp;
    }

    public RecognizeAdvancedRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeAdvancedRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeAdvancedRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeAdvancedRequest setParagraph(Boolean paragraph) {
        this.paragraph = paragraph;
        return this;
    }
    public Boolean getParagraph() {
        return this.paragraph;
    }

    public RecognizeAdvancedRequest setRow(Boolean row) {
        this.row = row;
        return this;
    }
    public Boolean getRow() {
        return this.row;
    }

    public RecognizeAdvancedRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeAdvancedRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
