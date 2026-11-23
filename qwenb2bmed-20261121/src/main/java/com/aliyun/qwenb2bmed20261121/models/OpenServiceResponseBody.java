// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class OpenServiceResponseBody extends TeaModel {
    /**
     * <p>关联本次开通申请的订单 ID，存在时返回。</p>
     * 
     * <strong>example:</strong>
     * <p>2000000000000001</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>服务已开通时返回的实例标识。</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("spInstanceId")
    public String spInstanceId;

    /**
     * <p>TEST_OK 表示仅验证调用成功。OPENING 表示开通处理中。ACTIVE 表示已开通。ORDER_UNKNOWN 表示暂时无法确认开通结果。REJECTED 表示开通请求未获通过。</p>
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
