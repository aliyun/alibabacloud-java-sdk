// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeKoreanRequest extends TeaModel {
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    @NameInMap("OutputTable")
    public Boolean outputTable;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeKoreanRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeKoreanRequest self = new RecognizeKoreanRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeKoreanRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeKoreanRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeKoreanRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeKoreanRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeKoreanRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
