// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class AppendCasesShrinkRequest extends TeaModel {
    /**
     * <p>The outbound call task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40ea7fc2-c9d4-47e3-af1e-216bf7f79a44</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The list of contacts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cases")
    public String casesShrink;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AppendCasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesShrinkRequest self = new AppendCasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AppendCasesShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AppendCasesShrinkRequest setCasesShrink(String casesShrink) {
        this.casesShrink = casesShrink;
        return this;
    }
    public String getCasesShrink() {
        return this.casesShrink;
    }

    public AppendCasesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
