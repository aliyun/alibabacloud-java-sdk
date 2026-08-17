// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ResumeCampaignRequest extends TeaModel {
    /**
     * <p>The ID of the campaign.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcee2bca-0fa0-4826-89b8-1f693574023b</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The outbound instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33040b9a-b04b-452f-b554-cd6f3a15f850</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ResumeCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeCampaignRequest self = new ResumeCampaignRequest();
        return TeaModel.build(map, self);
    }

    public ResumeCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ResumeCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
