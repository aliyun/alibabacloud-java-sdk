// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ManualRunMailTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
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

    public static ManualRunMailTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManualRunMailTaskResponseBody self = new ManualRunMailTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ManualRunMailTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ManualRunMailTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ManualRunMailTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
