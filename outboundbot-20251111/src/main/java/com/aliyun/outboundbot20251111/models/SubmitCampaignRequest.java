// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class SubmitCampaignRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f295a472-35ee-442a-9013-b13862505a1a</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The outbound instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3dbfb82-1ae6-4e73-b717-f494727d2af3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SubmitCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCampaignRequest self = new SubmitCampaignRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCampaignRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public SubmitCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
