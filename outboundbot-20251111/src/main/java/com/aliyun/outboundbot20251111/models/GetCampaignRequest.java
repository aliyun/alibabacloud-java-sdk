// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetCampaignRequest extends TeaModel {
    /**
     * <p>The ID of the outbound task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6ac878ab-115b-4170-a5d8-547481273364</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The outbound instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>024f8cf0-c842-4c01-b74b-c8667e4579c7</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCampaignRequest self = new GetCampaignRequest();
        return TeaModel.build(map, self);
    }

    public GetCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public GetCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
