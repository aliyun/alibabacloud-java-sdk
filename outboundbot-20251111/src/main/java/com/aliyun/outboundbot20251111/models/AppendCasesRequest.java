// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class AppendCasesRequest extends TeaModel {
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
    public java.util.List<AppendCasesRequestCases> cases;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static AppendCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesRequest self = new AppendCasesRequest();
        return TeaModel.build(map, self);
    }

    public AppendCasesRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public AppendCasesRequest setCases(java.util.List<AppendCasesRequestCases> cases) {
        this.cases = cases;
        return this;
    }
    public java.util.List<AppendCasesRequestCases> getCases() {
        return this.cases;
    }

    public AppendCasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class AppendCasesRequestCases extends TeaModel {
        /**
         * <p>The custom variables defined by the customer. The value is a JSON object that contains up to 10 properties. The name and value of each property are defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;key1&quot;:&quot;value1&quot;]</p>
         */
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1331234****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The business system ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>business3-watermark-2704-1776997551</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static AppendCasesRequestCases build(java.util.Map<String, ?> map) throws Exception {
            AppendCasesRequestCases self = new AppendCasesRequestCases();
            return TeaModel.build(map, self);
        }

        public AppendCasesRequestCases setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public AppendCasesRequestCases setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public AppendCasesRequestCases setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AppendCasesRequestCases setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
