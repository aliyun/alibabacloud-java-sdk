// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class VerifyConsumeMessageRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zeekr-settlement-server-dc555456f-v2lcg@1@1@qfvorazqns</p>
     */
    @NameInMap("clientId")
    public String clientId;

    /**
     * <p>The ID of the consumer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST_FINANCE_STOCK_OUT_GROUP</p>
     */
    @NameInMap("consumerGroupId")
    public String consumerGroupId;

    public static VerifyConsumeMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyConsumeMessageRequest self = new VerifyConsumeMessageRequest();
        return TeaModel.build(map, self);
    }

    public VerifyConsumeMessageRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public VerifyConsumeMessageRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

}
