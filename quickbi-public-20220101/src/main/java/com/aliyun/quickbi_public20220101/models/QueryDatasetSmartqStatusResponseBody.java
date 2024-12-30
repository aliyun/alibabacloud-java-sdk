// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetSmartqStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetSmartqStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetSmartqStatusResponseBody self = new QueryDatasetSmartqStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetSmartqStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetSmartqStatusResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public QueryDatasetSmartqStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
