// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExcelExportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeExcelExportResponseBody body;

    public static RecognizeExcelExportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExcelExportResponse self = new RecognizeExcelExportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExcelExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeExcelExportResponse setBody(RecognizeExcelExportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExcelExportResponseBody getBody() {
        return this.body;
    }

}
