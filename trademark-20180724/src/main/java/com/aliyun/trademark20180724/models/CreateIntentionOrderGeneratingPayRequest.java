// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderGeneratingPayRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("PaymentCallback")
    public String paymentCallback;

    public static CreateIntentionOrderGeneratingPayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentionOrderGeneratingPayRequest self = new CreateIntentionOrderGeneratingPayRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntentionOrderGeneratingPayRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateIntentionOrderGeneratingPayRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public CreateIntentionOrderGeneratingPayRequest setPaymentCallback(String paymentCallback) {
        this.paymentCallback = paymentCallback;
        return this;
    }
    public String getPaymentCallback() {
        return this.paymentCallback;
    }

}
