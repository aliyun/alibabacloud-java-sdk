// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class LoadDataToLabelDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LoadDataToLabelDataSetResponseBody body;

    public static LoadDataToLabelDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadDataToLabelDataSetResponse self = new LoadDataToLabelDataSetResponse();
        return TeaModel.build(map, self);
    }

    public LoadDataToLabelDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadDataToLabelDataSetResponse setBody(LoadDataToLabelDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadDataToLabelDataSetResponseBody getBody() {
        return this.body;
    }

}
