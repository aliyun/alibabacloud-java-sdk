// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachProjectManagersToProjectAuthorizationRequest extends TeaModel {
    /**
     * <p>The project authorization ID.</p>
     * <blockquote>
     * <p>You can call the ListProjectAuthorizations operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuthorizationId")
    public Long authorizationId;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The information about the project administrators specified in the project authorization.</p>
     */
    @NameInMap("Principals")
    public java.util.List<AttachProjectManagersToProjectAuthorizationRequestPrincipals> principals;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachProjectManagersToProjectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachProjectManagersToProjectAuthorizationRequest self = new AttachProjectManagersToProjectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AttachProjectManagersToProjectAuthorizationRequest setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    public AttachProjectManagersToProjectAuthorizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachProjectManagersToProjectAuthorizationRequest setPrincipals(java.util.List<AttachProjectManagersToProjectAuthorizationRequestPrincipals> principals) {
        this.principals = principals;
        return this;
    }
    public java.util.List<AttachProjectManagersToProjectAuthorizationRequestPrincipals> getPrincipals() {
        return this.principals;
    }

    public AttachProjectManagersToProjectAuthorizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AttachProjectManagersToProjectAuthorizationRequestPrincipals extends TeaModel {
        /**
         * <p>When PrincipalType is set to RamUser, specify the ID of the RAM user to be designated as the project administrator. When PrincipalType is set to RamRole, specify the ARN of the RAM role to be designated as the project administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>160****2519</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The display name of the RAM user or RAM role designated as the project administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the project administrator. Valid values:</p>
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

        public static AttachProjectManagersToProjectAuthorizationRequestPrincipals build(java.util.Map<String, ?> map) throws Exception {
            AttachProjectManagersToProjectAuthorizationRequestPrincipals self = new AttachProjectManagersToProjectAuthorizationRequestPrincipals();
            return TeaModel.build(map, self);
        }

        public AttachProjectManagersToProjectAuthorizationRequestPrincipals setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public AttachProjectManagersToProjectAuthorizationRequestPrincipals setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public AttachProjectManagersToProjectAuthorizationRequestPrincipals setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
