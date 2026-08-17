// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class PauseCampaignRequest extends TeaModel {
    /**
     * <p>The ID of the campaign.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6ac878ab-115b-4170-a5d8-547481273364</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The instance ID of the outbound call instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PauseCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseCampaignRequest self = new PauseCampaignRequest();
        return TeaModel.build(map, self);
    }

    public PauseCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public PauseCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
