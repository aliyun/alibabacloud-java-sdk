// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class OpenServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order associated with the activation request.</p>
     * 
     * <strong>example:</strong>
     * <p>2000000000000001</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("spInstanceId")
    public String spInstanceId;

    /**
     * <p>The service activation status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST_OK</p>
     */
    @NameInMap("status")
    public String status;

    public static OpenServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceResponseBody self = new OpenServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenServiceResponseBody setSpInstanceId(String spInstanceId) {
        this.spInstanceId = spInstanceId;
        return this;
    }
    public String getSpInstanceId() {
        return this.spInstanceId;
    }

    public OpenServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
