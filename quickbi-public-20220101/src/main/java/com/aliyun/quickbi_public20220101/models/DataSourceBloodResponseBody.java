// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSourceBloodResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e537a5****,3dadsu****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DataSourceBloodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DataSourceBloodResponseBody self = new DataSourceBloodResponseBody();
        return TeaModel.build(map, self);
    }

    public DataSourceBloodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DataSourceBloodResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public DataSourceBloodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
