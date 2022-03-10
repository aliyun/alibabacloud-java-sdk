// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetDetailInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDetailInfoResponseBody self = new QueryDatasetDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetDetailInfoResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryDatasetDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
