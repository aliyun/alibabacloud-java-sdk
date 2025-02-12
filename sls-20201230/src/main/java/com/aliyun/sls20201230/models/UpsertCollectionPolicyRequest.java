// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertCollectionPolicyRequest extends TeaModel {
    /**
     * <p>The configurations of centralized storage.</p>
     */
    @NameInMap("centralizeConfig")
    public UpsertCollectionPolicyRequestCentralizeConfig centralizeConfig;

    /**
     * <p>Specifies whether to enable centralized storage. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("centralizeEnabled")
    public Boolean centralizeEnabled;

    /**
     * <p>The code of the log type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("dataCode")
    public String dataCode;

    /**
     * <p>The data configurations. The configuration is returned only for global logs. For example, if productCode is set to sls, the configuration is returned.</p>
     */
    @NameInMap("dataConfig")
    public UpsertCollectionPolicyRequestDataConfig dataConfig;

    /**
     * <p>Specifies whether to enable the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The configurations of the policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("policyConfig")
    public UpsertCollectionPolicyRequestPolicyConfig policyConfig;

    /**
     * <p>The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start with a letter.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>your_log_policy</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("productCode")
    public String productCode;

    /**
     * <p>The configurations of the resource directory. The account must have activated the resource directory and be a management account or a delegated administrator of the resource directory.</p>
     */
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
         * <p>The destination logstore for centralized storage. Make sure that the region of the destination logstore is consistent with the region specified by destRegion and the destination logstore belongs to the destination project specified by destProject.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-logstore-in-beijing</p>
         */
        @NameInMap("destLogstore")
        public String destLogstore;

        /**
         * <p>The destination project for centralized storage. Make sure that the region of the destination project is consistent with the region specified by destRegion.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-project-in-beijing</p>
         */
        @NameInMap("destProject")
        public String destProject;

        /**
         * <p>The destination region for centralized storage.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("destRegion")
        public String destRegion;

        /**
         * <p>The data retention period for centralized storage. Unit: days. This parameter takes effect only when you use an existing logstore for centralized storage.</p>
         * 
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
        /**
         * <p>The region for storing the global logs that are collected for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
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
        /**
         * <p>The IDs of the instances. This parameter takes effect only when resourceMode is set to instanceMode. Logs are collected only from instances that use the specified IDs.</p>
         */
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The regions of the instances. This parameter takes effect only when resourceMode is set to attributeMode. Wildcard characters are supported. If you leave this parameter empty, region-based filtering is not performed. The system considers that all instances are matched. If you specify a value for this parameter, logs of instances that reside in the specified regions are collected. Logs are collected from an instance only if the resource tags and region of the instance match the specified conditions.</p>
         */
        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <p>The resource collection mode. Valid values: all, attributeMode, and instanceMode. The value all specifies that logs of all instances within your account are collected to the default logstore. The value attributeMode specifies that logs are collected based on the regions of instances and resource tags. The value instanceMode specifies that logs are collected based on instance IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("resourceMode")
        public String resourceMode;

        /**
         * <p>The resource tags. This parameter takes effect only when resourceMode is set to attributeMode. If you leave this parameter empty, resource tag-based filtering is not performed. The system considers that all instances are matched. If you specify a value for this parameter, logs of instances that use the specified resource tags are collected. Logs are collected from an instance only if the resource tags and region of the instance match the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1&quot;:&quot;value1&quot;,“tag2&quot;:&quot;value2&quot;}</p>
         */
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
        /**
         * <p>The mode of the resource directory. Valid values: all and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>all,custom</p>
         */
        @NameInMap("accountGroupType")
        public String accountGroupType;

        /**
         * <p>The members. If accountGroupType is set to custom, the members are returned.</p>
         */
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
