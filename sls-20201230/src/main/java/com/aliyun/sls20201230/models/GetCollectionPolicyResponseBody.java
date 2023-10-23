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

    public static class GetCollectionPolicyResponseBodyCollectionPolicyAttribute extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("policyGroup")
        public String policyGroup;

        public static GetCollectionPolicyResponseBodyCollectionPolicyAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicyAttribute self = new GetCollectionPolicyResponseBodyCollectionPolicyAttribute();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyAttribute setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetCollectionPolicyResponseBodyCollectionPolicyAttribute setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

    }

    public static class GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig extends TeaModel {
        @NameInMap("destLogstore")
        public String destLogstore;

        @NameInMap("destProject")
        public String destProject;

        @NameInMap("destRegion")
        public String destRegion;

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

    public static class GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig extends TeaModel {
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("regions")
        public java.util.List<String> regions;

        @NameInMap("resourceMode")
        public String resourceMode;

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

    public static class GetCollectionPolicyResponseBodyCollectionPolicy extends TeaModel {
        @NameInMap("attribute")
        public GetCollectionPolicyResponseBodyCollectionPolicyAttribute attribute;

        @NameInMap("centralizeConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyCentralizeConfig centralizeConfig;

        @NameInMap("centralizeEnabled")
        public Boolean centralizeEnabled;

        @NameInMap("dataCode")
        public String dataCode;

        @NameInMap("enabled")
        public String enabled;

        @NameInMap("policyConfig")
        public GetCollectionPolicyResponseBodyCollectionPolicyPolicyConfig policyConfig;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("productCode")
        public String productCode;

        public static GetCollectionPolicyResponseBodyCollectionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetCollectionPolicyResponseBodyCollectionPolicy self = new GetCollectionPolicyResponseBodyCollectionPolicy();
            return TeaModel.build(map, self);
        }

        public GetCollectionPolicyResponseBodyCollectionPolicy setAttribute(GetCollectionPolicyResponseBodyCollectionPolicyAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public GetCollectionPolicyResponseBodyCollectionPolicyAttribute getAttribute() {
            return this.attribute;
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

        public GetCollectionPolicyResponseBodyCollectionPolicy setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
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

        public GetCollectionPolicyResponseBodyCollectionPolicy setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
