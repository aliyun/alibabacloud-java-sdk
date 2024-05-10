// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertCollectionPolicyRequest extends TeaModel {
    @NameInMap("attribute")
    public UpsertCollectionPolicyRequestAttribute attribute;

    @NameInMap("centralizeConfig")
    public UpsertCollectionPolicyRequestCentralizeConfig centralizeConfig;

    @NameInMap("centralizeEnabled")
    public Boolean centralizeEnabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataCode")
    public String dataCode;

    /**
     * <p>This parameter is required.</p>
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
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("productCode")
    public String productCode;

    public static UpsertCollectionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionPolicyRequest self = new UpsertCollectionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionPolicyRequest setAttribute(UpsertCollectionPolicyRequestAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public UpsertCollectionPolicyRequestAttribute getAttribute() {
        return this.attribute;
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

    public static class UpsertCollectionPolicyRequestAttribute extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("policyGroup")
        public String policyGroup;

        public static UpsertCollectionPolicyRequestAttribute build(java.util.Map<String, ?> map) throws Exception {
            UpsertCollectionPolicyRequestAttribute self = new UpsertCollectionPolicyRequestAttribute();
            return TeaModel.build(map, self);
        }

        public UpsertCollectionPolicyRequestAttribute setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public UpsertCollectionPolicyRequestAttribute setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

    }

    public static class UpsertCollectionPolicyRequestCentralizeConfig extends TeaModel {
        @NameInMap("destLogstore")
        public String destLogstore;

        @NameInMap("destProject")
        public String destProject;

        @NameInMap("destRegion")
        public String destRegion;

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

    public static class UpsertCollectionPolicyRequestPolicyConfig extends TeaModel {
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <p>This parameter is required.</p>
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

}
