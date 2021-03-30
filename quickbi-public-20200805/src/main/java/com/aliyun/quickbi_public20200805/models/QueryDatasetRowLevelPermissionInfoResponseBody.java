// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class QueryDatasetRowLevelPermissionInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public String result;

    public static QueryDatasetRowLevelPermissionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetRowLevelPermissionInfoResponseBody self = new QueryDatasetRowLevelPermissionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetRowLevelPermissionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetRowLevelPermissionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDatasetRowLevelPermissionInfoResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
