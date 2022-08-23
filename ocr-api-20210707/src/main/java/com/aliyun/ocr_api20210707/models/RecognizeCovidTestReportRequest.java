// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCovidTestReportRequest extends TeaModel {
    @NameInMap("MultipleResult")
    public Boolean multipleResult;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeCovidTestReportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCovidTestReportRequest self = new RecognizeCovidTestReportRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCovidTestReportRequest setMultipleResult(Boolean multipleResult) {
        this.multipleResult = multipleResult;
        return this;
    }
    public Boolean getMultipleResult() {
        return this.multipleResult;
    }

    public RecognizeCovidTestReportRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeCovidTestReportRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
