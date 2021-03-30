// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryEmbeddedStausResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public Boolean result;

    public static QueryEmbeddedStausResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedStausResponseBody self = new QueryEmbeddedStausResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedStausResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEmbeddedStausResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEmbeddedStausResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
