// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ApplyNotaryPostRequest extends TeaModel {
    @NameInMap("NotaryOrderId")
    public Long notaryOrderId;

    @NameInMap("ReceiverName")
    public String receiverName;

    @NameInMap("ReceiverAddress")
    public String receiverAddress;

    @NameInMap("ReceiverPhone")
    public String receiverPhone;

    public static ApplyNotaryPostRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNotaryPostRequest self = new ApplyNotaryPostRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNotaryPostRequest setNotaryOrderId(Long notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public Long getNotaryOrderId() {
        return this.notaryOrderId;
    }

    public ApplyNotaryPostRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public ApplyNotaryPostRequest setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public ApplyNotaryPostRequest setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

}
