// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckDatasetExistedResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C67ABB*********682B0B214</p>
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

    public static CheckDatasetExistedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetExistedResponseBody self = new CheckDatasetExistedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDatasetExistedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDatasetExistedResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CheckDatasetExistedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
