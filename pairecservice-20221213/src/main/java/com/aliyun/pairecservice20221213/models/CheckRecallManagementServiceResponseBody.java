// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckRecallManagementServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result details.</p>
     */
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static CheckRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRecallManagementServiceResponseBody self = new CheckRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRecallManagementServiceResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
