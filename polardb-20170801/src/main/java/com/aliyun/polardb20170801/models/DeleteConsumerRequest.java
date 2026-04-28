// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteConsumerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-mqveroemc***</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerRequest self = new DeleteConsumerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public DeleteConsumerRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DeleteConsumerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
