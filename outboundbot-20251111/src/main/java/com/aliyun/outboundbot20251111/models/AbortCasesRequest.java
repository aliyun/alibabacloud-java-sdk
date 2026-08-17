// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class AbortCasesRequest extends TeaModel {
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
    public java.util.List<String> phoneNumbers;

    public static AbortCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortCasesRequest self = new AbortCasesRequest();
        return TeaModel.build(map, self);
    }

    public AbortCasesRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AbortCasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AbortCasesRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
