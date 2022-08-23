// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRussianRequest extends TeaModel {
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

    public static RecognizeRussianRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussianRequest self = new RecognizeRussianRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeRussianRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeRussianRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeRussianRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeRussianRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeRussianRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
