// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCollectionPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("collectionPolicy")
    public GetCollectionPolicyResponseBodyCollectionPolicy collectionPolicy;

    public static GetCollectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCollectionPolicyResponseBody self = new GetCollectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCollectionPolicyResponseBody setCollectionPolicy(GetCollectionPolicyResponseBodyCollectionPolicy collectionPolicy) {
        this.collectionPolicy = collectionPolicy;
        return this;
    }
    public GetCollectionPolicyResponseBodyCollectionPolicy getCollectionPolicy() {
        return this.collectionPolicy;
    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig extends TeaModel {
        /**
         * <p>The destination Logstore for centralized shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-logstore-in-beijing</p>
         */
        @NameInMap("destLogstore")
        public String destLogstore;

        /**
         * <p>The destination project for centralized shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-project-in-beijing</p>
         */
        @NameInMap("destProject")
        public String destProject;

        /**
         * <p>The destination region for centralized shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("destRegion")
        public String destRegion;

        /**
         * <p>The retention period of the destination Logstore. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("destTTL")
        public Integer destTTL;

        public static GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig self = new GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig setDestLogstore(String destLogstore) {
            this.destLogstore = destLogstore;
            return this;
        }
        public String getDestLogstore() {
            return this.destLogstore;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig setDestProject(String destProject) {
            this.destProject = destProject;
            return this;
        }
        public String getDestProject() {
            return this.destProject;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig setDestTTL(Integer destTTL) {
            this.destTTL = destTTL;
            return this;
        }
        public Integer getDestTTL() {
            return this.destTTL;
        }

    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicyDataConfig extends TeaModel {
        /**
         * <p>This parameter is valid only for global log types, such as when \<code>productCode\\</code> is \<code>sls\\</code>. If this parameter is left empty, logs are collected to the default project of the account in the specified \<code>dataRegion\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("dataProject")
        public String dataProject;

        /**
         * <p>This parameter is supported only for global log types, such as when \<code>productCode\\</code> is \<code>sls\\</code>. This parameter specifies the region to which global logs are collected during the initial configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("dataRegion")
        public String dataRegion;

        public static GetCollectionPolicyResponseBodyCollectionPolicyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicyDataConfig self = new GetCollectionPolicyResponseBodyCollectionPolicyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyDataConfig setDataProject(String dataProject) {
            this.dataProject = dataProject;
            return this;
        }
        public String getDataProject() {
            return this.dataProject;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyDataConfig setDataRegion(String dataRegion) {
            this.dataRegion = dataRegion;
            return this;
        }
        public String getDataRegion() {
            return this.dataRegion;
        }

    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig extends TeaModel {
        /**
         * <p>The instance IDs.</p>
         */
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The regions where the instances reside. Wildcard characters are supported.</p>
         */
        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <p>The collection pattern for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("resourceMode")
        public String resourceMode;

        /**
         * <p>The resource tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1&quot;:&quot;value1&quot;,&quot;tag2&quot;:&quot;value2&quot;}</p>
         */
        @NameInMap("resourceTags")
        public java.util.Map<String, ?> resourceTags;

        public static GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig self = new GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory extends TeaModel {
        /**
         * <p>The mode for selecting accounts in the resource directory. Valid values: \<code>all\\</code> and \<code>custom\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>all,custom</p>
         */
        @NameInMap("accountGroupType")
        public String accountGroupType;

        /**
         * <p>The member accounts. This parameter is returned only when \<code>accountGroupType\\</code> is set to \<code>custom\\</code>.</p>
         */
        @NameInMap("members")
        public java.util.List<String> members;

        public static GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory self = new GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory setAccountGroupType(String accountGroupType) {
            this.accountGroupType = accountGroupType;
            return this;
        }
        public String getAccountGroupType() {
            return this.accountGroupType;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicy extends TeaModel {
        /**
         * <p>The configuration for centralized shipping.</p>
         */
        @NameInMap("centralizeConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig centralizeConfig;

        /**
         * <p>Indicates whether centralized storage is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("centralizeEnabled")
        public Boolean centralizeEnabled;

        /**
         * <p>The code for the log type.</p>
         * 
         * <strong>example:</strong>
         * <p>access_log</p>
         */
        @NameInMap("dataCode")
        public String dataCode;

        /**
         * <p>The configuration that is supported only for global log types, such as when \<code>productCode\\</code> is \<code>sls\\</code>. Otherwise, this parameter is empty.</p>
         */
        @NameInMap("dataConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyDataConfig dataConfig;

        /**
         * <p>Indicates whether the rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the rule is a built-in rule. Built-in rules cannot be modified or deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("internalPolicy")
        public Boolean internalPolicy;

        /**
         * <p>The configuration of the collection rule.</p>
         */
        @NameInMap("policyConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig policyConfig;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>your_log_policy</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the rule belongs. If the rule is created by a resource directory administrator or a delegated administrator, this parameter specifies the ID of the administrator\&quot;s Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>148***********50</p>
         */
        @NameInMap("policyUid")
        public String policyUid;

        /**
         * <p>The code of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("productCode")
        public String productCode;

        /**
         * <p>The configuration of the resource directory. This parameter is empty if no configuration is specified.</p>
         */
        @NameInMap("resourceDirectory")
        public GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory resourceDirectory;

        public static GetCollectionPolicyResponseBodyCollectionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicy self = new GetCollectionPolicyResponseBodyCollectionPolicy();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setCentralizeConfig(GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig centralizeConfig) {
            this.centralizeConfig = centralizeConfig;
            return this;
        }
        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig getCentralizeConfig() {
            return this.centralizeConfig;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setCentralizeEnabled(Boolean centralizeEnabled) {
            this.centralizeEnabled = centralizeEnabled;
            return this;
        }
        public Boolean getCentralizeEnabled() {
            return this.centralizeEnabled;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setDataCode(String dataCode) {
            this.dataCode = dataCode;
            return this;
        }
        public String getDataCode() {
            return this.dataCode;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setDataConfig(GetCollectionPolicyResponseBodyCollectionPolicyDataConfig dataConfig) {
            this.dataConfig = dataConfig;
            return this;
        }
        public GetCollectionPolicyResponseBodyCollectionPolicyDataConfig getDataConfig() {
            return this.dataConfig;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setInternalPolicy(Boolean internalPolicy) {
            this.internalPolicy = internalPolicy;
            return this;
        }
        public Boolean getInternalPolicy() {
            return this.internalPolicy;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setPolicyConfig(GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            return this;
        }
        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig getPolicyConfig() {
            return this.policyConfig;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setPolicyUid(String policyUid) {
            this.policyUid = policyUid;
            return this;
        }
        public String getPolicyUid() {
            return this.policyUid;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setResourceDirectory(GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }
        public GetCollectionPolicyResponseBodyCollectionPolicyResourceDirectory getResourceDirectory() {
            return this.resourceDirectory;
        }

    }

}
