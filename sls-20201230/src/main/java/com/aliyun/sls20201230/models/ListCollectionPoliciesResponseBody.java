// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesResponseBody extends TeaModel {
    @NameInMap("currentCount")
    public Integer currentCount;

    @NameInMap("data")
    public java.util.List<ListCollectionPoliciesResponseBodyData> data;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListCollectionPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionPoliciesResponseBody self = new ListCollectionPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectionPoliciesResponseBody setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public ListCollectionPoliciesResponseBody setData(java.util.List<ListCollectionPoliciesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCollectionPoliciesResponseBodyData> getData() {
        return this.data;
    }

    public ListCollectionPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCollectionPoliciesResponseBodyDataAttribute extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("policyGroup")
        public String policyGroup;

        public static ListCollectionPoliciesResponseBodyDataAttribute build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyDataAttribute self = new ListCollectionPoliciesResponseBodyDataAttribute();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyDataAttribute setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListCollectionPoliciesResponseBodyDataAttribute setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

    }

    public static class ListCollectionPoliciesResponseBodyDataCentralizeConfig extends TeaModel {
        @NameInMap("destLogstore")
        public String destLogstore;

        @NameInMap("destProject")
        public String destProject;

        @NameInMap("destRegion")
        public String destRegion;

        @NameInMap("destTTL")
        public Integer destTTL;

        public static ListCollectionPoliciesResponseBodyDataCentralizeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyDataCentralizeConfig self = new ListCollectionPoliciesResponseBodyDataCentralizeConfig();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyDataCentralizeConfig setDestLogstore(String destLogstore) {
            this.destLogstore = destLogstore;
            return this;
        }
        public String getDestLogstore() {
            return this.destLogstore;
        }

        public ListCollectionPoliciesResponseBodyDataCentralizeConfig setDestProject(String destProject) {
            this.destProject = destProject;
            return this;
        }
        public String getDestProject() {
            return this.destProject;
        }

        public ListCollectionPoliciesResponseBodyDataCentralizeConfig setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ListCollectionPoliciesResponseBodyDataCentralizeConfig setDestTTL(Integer destTTL) {
            this.destTTL = destTTL;
            return this;
        }
        public Integer getDestTTL() {
            return this.destTTL;
        }

    }

    public static class ListCollectionPoliciesResponseBodyDataPolicyConfig extends TeaModel {
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("regions")
        public java.util.List<String> regions;

        @NameInMap("resourceMode")
        public String resourceMode;

        @NameInMap("resourceTags")
        public java.util.Map<String, ?> resourceTags;

        public static ListCollectionPoliciesResponseBodyDataPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyDataPolicyConfig self = new ListCollectionPoliciesResponseBodyDataPolicyConfig();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyDataPolicyConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ListCollectionPoliciesResponseBodyDataPolicyConfig setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public ListCollectionPoliciesResponseBodyDataPolicyConfig setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public ListCollectionPoliciesResponseBodyDataPolicyConfig setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

    }

    public static class ListCollectionPoliciesResponseBodyData extends TeaModel {
        @NameInMap("attribute")
        public ListCollectionPoliciesResponseBodyDataAttribute attribute;

        @NameInMap("centralizeConfig")
        public ListCollectionPoliciesResponseBodyDataCentralizeConfig centralizeConfig;

        @NameInMap("centralizeEnabled")
        public Boolean centralizeEnabled;

        @NameInMap("dataCode")
        public String dataCode;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("policyConfig")
        public ListCollectionPoliciesResponseBodyDataPolicyConfig policyConfig;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("productCode")
        public String productCode;

        public static ListCollectionPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyData self = new ListCollectionPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyData setAttribute(ListCollectionPoliciesResponseBodyDataAttribute attribute) {
            this.attribute = attribute;
            return this;
        }
        public ListCollectionPoliciesResponseBodyDataAttribute getAttribute() {
            return this.attribute;
        }

        public ListCollectionPoliciesResponseBodyData setCentralizeConfig(ListCollectionPoliciesResponseBodyDataCentralizeConfig centralizeConfig) {
            this.centralizeConfig = centralizeConfig;
            return this;
        }
        public ListCollectionPoliciesResponseBodyDataCentralizeConfig getCentralizeConfig() {
            return this.centralizeConfig;
        }

        public ListCollectionPoliciesResponseBodyData setCentralizeEnabled(Boolean centralizeEnabled) {
            this.centralizeEnabled = centralizeEnabled;
            return this;
        }
        public Boolean getCentralizeEnabled() {
            return this.centralizeEnabled;
        }

        public ListCollectionPoliciesResponseBodyData setDataCode(String dataCode) {
            this.dataCode = dataCode;
            return this;
        }
        public String getDataCode() {
            return this.dataCode;
        }

        public ListCollectionPoliciesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListCollectionPoliciesResponseBodyData setPolicyConfig(ListCollectionPoliciesResponseBodyDataPolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            return this;
        }
        public ListCollectionPoliciesResponseBodyDataPolicyConfig getPolicyConfig() {
            return this.policyConfig;
        }

        public ListCollectionPoliciesResponseBodyData setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListCollectionPoliciesResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
