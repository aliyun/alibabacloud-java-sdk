// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static ModifyCommonBandwidthPackagePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeResponse self = new ModifyCommonBandwidthPackagePayTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCommonBandwidthPackagePayTypeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
