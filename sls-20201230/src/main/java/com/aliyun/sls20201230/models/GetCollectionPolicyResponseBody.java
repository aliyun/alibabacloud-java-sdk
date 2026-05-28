// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCollectionPolicyResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("dataProject")
        public String dataProject;

        /**
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
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("resourceMode")
        public String resourceMode;

        /**
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
         * <strong>example:</strong>
         * <p>all,custom</p>
         */
        @NameInMap("accountGroupType")
        public String accountGroupType;

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
        @NameInMap("centralizeConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig centralizeConfig;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("centralizeEnabled")
        public Boolean centralizeEnabled;

        /**
         * <strong>example:</strong>
         * <p>access_log</p>
         */
        @NameInMap("dataCode")
        public String dataCode;

        @NameInMap("dataConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyDataConfig dataConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("internalPolicy")
        public Boolean internalPolicy;

        @NameInMap("policyConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig policyConfig;

        /**
         * <strong>example:</strong>
         * <p>your_log_policy</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>148***********50</p>
         */
        @NameInMap("policyUid")
        public String policyUid;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("productCode")
        public String productCode;

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
