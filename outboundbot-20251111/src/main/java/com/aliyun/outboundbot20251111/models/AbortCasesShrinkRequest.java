// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class AbortCasesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the predictive outbound call campaign.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2180afb0-83a9-4a13-9f19-467d63041dbf</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dcb09c5-d5db-4397-bf65-db854463beea</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of contact phone numbers to cancel.</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbersShrink;

    public static AbortCasesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortCasesShrinkRequest self = new AbortCasesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AbortCasesShrinkRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AbortCasesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AbortCasesShrinkRequest setPhoneNumbersShrink(String phoneNumbersShrink) {
        this.phoneNumbersShrink = phoneNumbersShrink;
        return this;
    }
    public String getPhoneNumbersShrink() {
        return this.phoneNumbersShrink;
    }

}
