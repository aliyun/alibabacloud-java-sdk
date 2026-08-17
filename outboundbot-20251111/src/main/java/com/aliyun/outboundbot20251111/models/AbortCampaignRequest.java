// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class AbortCampaignRequest extends TeaModel {
    /**
     * <p>The outbound call task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b3ca876-bc64-4d57-98b4-b5d78280afca</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AbortCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortCampaignRequest self = new AbortCampaignRequest();
        return TeaModel.build(map, self);
    }

    public AbortCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AbortCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
