// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertCollectionPolicyRequest extends TeaModel {
    @NameInMap("centralizeConfig")
    public UpsertCollectionPolicyRequestCentralizeConfig centralizeConfig;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("centralizeEnabled")
    public Boolean centralizeEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("dataCode")
    public String dataCode;

    @NameInMap("dataConfig")
    public UpsertCollectionPolicyRequestDataConfig dataConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("policyConfig")
    public UpsertCollectionPolicyRequestPolicyConfig policyConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>your_log_policy</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("productCode")
    public String productCode;

    @NameInMap("resourceDirectory")
    public UpsertCollectionPolicyRequestResourceDirectory resourceDirectory;

    public static UpsertCollectionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionPolicyRequest self = new UpsertCollectionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionPolicyRequest setCentralizeConfig(UpsertCollectionPolicyRequestCentralizeConfig centralizeConfig) {
        this.centralizeConfig = centralizeConfig;
        return this;
    }
    public UpsertCollectionPolicyRequestCentralizeConfig getCentralizeConfig() {
        return this.centralizeConfig;
    }

    public UpsertCollectionPolicyRequest setCentralizeEnabled(Boolean centralizeEnabled) {
        this.centralizeEnabled = centralizeEnabled;
        return this;
    }
    public Boolean getCentralizeEnabled() {
        return this.centralizeEnabled;
    }

    public UpsertCollectionPolicyRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public UpsertCollectionPolicyRequest setDataConfig(UpsertCollectionPolicyRequestDataConfig dataConfig) {
        this.dataConfig = dataConfig;
        return this;
    }
    public UpsertCollectionPolicyRequestDataConfig getDataConfig() {
        return this.dataConfig;
    }

    public UpsertCollectionPolicyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpsertCollectionPolicyRequest setPolicyConfig(UpsertCollectionPolicyRequestPolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
        return this;
    }
    public UpsertCollectionPolicyRequestPolicyConfig getPolicyConfig() {
        return this.policyConfig;
    }

    public UpsertCollectionPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpsertCollectionPolicyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpsertCollectionPolicyRequest setResourceDirectory(UpsertCollectionPolicyRequestResourceDirectory resourceDirectory) {
        this.resourceDirectory = resourceDirectory;
        return this;
    }
    public UpsertCollectionPolicyRequestResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static class UpsertCollectionPolicyRequestCentralizeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>your-sls-logstore-in-beijing</p>
         */
        @NameInMap("destLogstore")
        public String destLogstore;

        /**
         * <strong>example:</strong>
         * <p>your-sls-project-in-beijing</p>
         */
        @NameInMap("destProject")
        public String destProject;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("destRegion")
        public String destRegion;

        /**
         * <strong>example:</strong>
         * <p>your-sls-logstore-ttl</p>
         */
        @NameInMap("destTTL")
        public Integer destTTL;

        public static UpsertCollectionPolicyRequestCentralizeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionPolicyRequestCentralizeConfig self = new UpsertCollectionPolicyRequestCentralizeConfig();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionPolicyRequestCentralizeConfig setDestLogstore(String destLogstore) {
            this.destLogstore = destLogstore;
            return this;
        }
        public String getDestLogstore() {
            return this.destLogstore;
        }

        public UpsertCollectionPolicyRequestCentralizeConfig setDestProject(String destProject) {
            this.destProject = destProject;
            return this;
        }
        public String getDestProject() {
            return this.destProject;
        }

        public UpsertCollectionPolicyRequestCentralizeConfig setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public UpsertCollectionPolicyRequestCentralizeConfig setDestTTL(Integer destTTL) {
            this.destTTL = destTTL;
            return this;
        }
        public Integer getDestTTL() {
            return this.destTTL;
        }

    }

    public static class UpsertCollectionPolicyRequestDataConfig extends TeaModel {
        @NameInMap("dataRegion")
        public String dataRegion;

        public static UpsertCollectionPolicyRequestDataConfig build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionPolicyRequestDataConfig self = new UpsertCollectionPolicyRequestDataConfig();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionPolicyRequestDataConfig setDataRegion(String dataRegion) {
            this.dataRegion = dataRegion;
            return this;
        }
        public String getDataRegion() {
            return this.dataRegion;
        }

    }

    public static class UpsertCollectionPolicyRequestPolicyConfig extends TeaModel {
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("resourceMode")
        public String resourceMode;

        @NameInMap("resourceTags")
        public java.util.Map<String, ?> resourceTags;

        public static UpsertCollectionPolicyRequestPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionPolicyRequestPolicyConfig self = new UpsertCollectionPolicyRequestPolicyConfig();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionPolicyRequestPolicyConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public UpsertCollectionPolicyRequestPolicyConfig setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public UpsertCollectionPolicyRequestPolicyConfig setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public UpsertCollectionPolicyRequestPolicyConfig setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

    }

    public static class UpsertCollectionPolicyRequestResourceDirectory extends TeaModel {
        @NameInMap("accountGroupType")
        public String accountGroupType;

        @NameInMap("members")
        public java.util.List<String> members;

        public static UpsertCollectionPolicyRequestResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionPolicyRequestResourceDirectory self = new UpsertCollectionPolicyRequestResourceDirectory();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionPolicyRequestResourceDirectory setAccountGroupType(String accountGroupType) {
            this.accountGroupType = accountGroupType;
            return this;
        }
        public String getAccountGroupType() {
            return this.accountGroupType;
        }

        public UpsertCollectionPolicyRequestResourceDirectory setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

}
