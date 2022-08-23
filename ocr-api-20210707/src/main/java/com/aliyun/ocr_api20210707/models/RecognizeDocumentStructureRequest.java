// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDocumentStructureRequest extends TeaModel {
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("NeedSortPage")
    public Boolean needSortPage;

    @NameInMap("NoStamp")
    public Boolean noStamp;

    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    @NameInMap("OutputTable")
    public Boolean outputTable;

    @NameInMap("Page")
    public Boolean page;

    @NameInMap("Paragraph")
    public Boolean paragraph;

    @NameInMap("Row")
    public Boolean row;

    @NameInMap("Url")
    public String url;

    @NameInMap("UseNewStyleOutput")
    public Boolean useNewStyleOutput;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeDocumentStructureRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDocumentStructureRequest self = new RecognizeDocumentStructureRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDocumentStructureRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeDocumentStructureRequest setNeedSortPage(Boolean needSortPage) {
        this.needSortPage = needSortPage;
        return this;
    }
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    public RecognizeDocumentStructureRequest setNoStamp(Boolean noStamp) {
        this.noStamp = noStamp;
        return this;
    }
    public Boolean getNoStamp() {
        return this.noStamp;
    }

    public RecognizeDocumentStructureRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeDocumentStructureRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeDocumentStructureRequest setPage(Boolean page) {
        this.page = page;
        return this;
    }
    public Boolean getPage() {
        return this.page;
    }

    public RecognizeDocumentStructureRequest setParagraph(Boolean paragraph) {
        this.paragraph = paragraph;
        return this;
    }
    public Boolean getParagraph() {
        return this.paragraph;
    }

    public RecognizeDocumentStructureRequest setRow(Boolean row) {
        this.row = row;
        return this;
    }
    public Boolean getRow() {
        return this.row;
    }

    public RecognizeDocumentStructureRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeDocumentStructureRequest setUseNewStyleOutput(Boolean useNewStyleOutput) {
        this.useNewStyleOutput = useNewStyleOutput;
        return this;
    }
    public Boolean getUseNewStyleOutput() {
        return this.useNewStyleOutput;
    }

    public RecognizeDocumentStructureRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
