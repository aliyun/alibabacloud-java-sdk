// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetConsumerApiKeyRequest extends TeaModel {
    /**
     * <p>The ID of the consumer. You can obtain the ID by calling the DescribeConsumers operation. Call sequence: CreateGateway, CreateConsumer, and then ResetConsumerApiKey.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-mqveroemc***</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>Instance ID of the gateway instance. You can obtain instance ID by calling the DescribeGatewayAttribute operation. Before calling this operation, create a gateway and confirm its VPC, vSwitch, and zone configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetConsumerApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumerApiKeyRequest self = new ResetConsumerApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ResetConsumerApiKeyRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ResetConsumerApiKeyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ResetConsumerApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
