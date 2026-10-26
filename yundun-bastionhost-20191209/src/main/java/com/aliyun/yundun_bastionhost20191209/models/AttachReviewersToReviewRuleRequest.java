// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachReviewersToReviewRuleRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to obtain the Bastionhost instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2ve7h00a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The information about the auditors to be associated with the audit policy.</p>
     */
    @NameInMap("Principals")
    public java.util.List<AttachReviewersToReviewRuleRequestPrincipals> principals;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the audit policy.</p>
     * <blockquote>
     * <p>You can invoke the ListReviewRules operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReviewRuleId")
    public Long reviewRuleId;

    public static AttachReviewersToReviewRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachReviewersToReviewRuleRequest self = new AttachReviewersToReviewRuleRequest();
        return TeaModel.build(map, self);
    }

    public AttachReviewersToReviewRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachReviewersToReviewRuleRequest setPrincipals(java.util.List<AttachReviewersToReviewRuleRequestPrincipals> principals) {
        this.principals = principals;
        return this;
    }
    public java.util.List<AttachReviewersToReviewRuleRequestPrincipals> getPrincipals() {
        return this.principals;
    }

    public AttachReviewersToReviewRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachReviewersToReviewRuleRequest setReviewRuleId(Long reviewRuleId) {
        this.reviewRuleId = reviewRuleId;
        return this;
    }
    public Long getReviewRuleId() {
        return this.reviewRuleId;
    }

    public static class AttachReviewersToReviewRuleRequestPrincipals extends TeaModel {
        /**
         * <p>The ID of the RAM user or the ARN of the RAM role of the auditor to be associated. If PrincipalType is set to RamUser, specify the RAM user ID. If PrincipalType is set to RamRole, specify the ARN of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>160****9214</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The display name of the RAM user or RAM role of the associated auditor.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the auditor to be associated. Valid values:</p>
         * <ul>
         * <li><p><strong>RamUser</strong>: Resource Access Management (RAM) user.</p>
         * </li>
         * <li><p><strong>RamRole</strong>: RAM role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static AttachReviewersToReviewRuleRequestPrincipals build(java.util.Map<String, ?> map) throws Exception {
            AttachReviewersToReviewRuleRequestPrincipals self = new AttachReviewersToReviewRuleRequestPrincipals();
            return TeaModel.build(map, self);
        }

        public AttachReviewersToReviewRuleRequestPrincipals setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public AttachReviewersToReviewRuleRequestPrincipals setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public AttachReviewersToReviewRuleRequestPrincipals setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
