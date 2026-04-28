// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateConsumerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6c4b1f0317cd4fd7a5b446d3503d**</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>c-mqveroemc***</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <strong>example:</strong>
     * <p>ApiKey</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerResponseBody self = new CreateConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConsumerResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateConsumerResponseBody setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateConsumerResponseBody setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public CreateConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
