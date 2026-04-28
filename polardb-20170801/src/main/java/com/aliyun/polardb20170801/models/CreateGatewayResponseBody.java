// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pg-2ze2079ueg20****</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>2035629******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F9F1CB1A-B1D5-4EF5-A53A-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayResponseBody self = new CreateGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateGatewayResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
