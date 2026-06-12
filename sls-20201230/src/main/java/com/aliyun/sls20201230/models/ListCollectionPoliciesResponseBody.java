// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of collection rules returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentCount")
    public Integer currentCount;

    /**
     * <p>The collection rules that are returned on the current page.</p>
     */
    @NameInMap("data")
    public java.util.List<ListCollectionPoliciesResponseBodyData> data;

    /**
     * <p>Statistics returned based on the query conditions.</p>
     */
    @NameInMap("statistics")
    public java.util.List<ListCollectionPoliciesResponseBodyStatistics> statistics;

    /**
     * <p>The total number of collection rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public ListCollectionPoliciesResponseBody setStatistics(java.util.List<ListCollectionPoliciesResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<ListCollectionPoliciesResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public ListCollectionPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCollectionPoliciesResponseBodyDataCentralizeConfig extends TeaModel {
        /**
         * <p>The destination Logstore for centralized data shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-logstore-in-beijing</p>
         */
        @NameInMap("destLogstore")
        public String destLogstore;

        /**
         * <p>The destination project for centralized data shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>your-sls-project-in-beijing</p>
         */
        @NameInMap("destProject")
        public String destProject;

        /**
         * <p>The destination region for centralized data shipping.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("destRegion")
        public String destRegion;

        /**
         * <p>The data retention period of the destination Logstore for centralized data shipping. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

    public static class ListCollectionPoliciesResponseBodyDataDataConfig extends TeaModel {
        /**
         * <p>The project for global logs. This parameter is used only for global log types, such as sls. If this parameter is empty, logs are collected to the default project of the account in the region specified by dataRegion.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("dataProject")
        public String dataProject;

        /**
         * <p>The region where global logs are first collected. This parameter is used only for global log types, such as sls.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("dataRegion")
        public String dataRegion;

        public static ListCollectionPoliciesResponseBodyDataDataConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyDataDataConfig self = new ListCollectionPoliciesResponseBodyDataDataConfig();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyDataDataConfig setDataProject(String dataProject) {
            this.dataProject = dataProject;
            return this;
        }
        public String getDataProject() {
            return this.dataProject;
        }

        public ListCollectionPoliciesResponseBodyDataDataConfig setDataRegion(String dataRegion) {
            this.dataRegion = dataRegion;
            return this;
        }
        public String getDataRegion() {
            return this.dataRegion;
        }

    }

    public static class ListCollectionPoliciesResponseBodyDataPolicyConfig extends TeaModel {
        /**
         * <p>The IDs of the instances.</p>
         */
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The regions to which the instances belong.</p>
         */
        @NameInMap("regions")
        public java.util.List<String> regions;

        /**
         * <p>The resource collection mode.</p>
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

    public static class ListCollectionPoliciesResponseBodyDataResourceDirectory extends TeaModel {
        /**
         * <p>The mode for selecting accounts in the resource directory. Valid values: all and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>all,custom</p>
         */
        @NameInMap("accountGroupType")
        public String accountGroupType;

        /**
         * <p>The list of member accounts. This parameter is returned only if accountGroupType is set to custom.</p>
         */
        @NameInMap("members")
        public java.util.List<String> members;

        public static ListCollectionPoliciesResponseBodyDataResourceDirectory build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyDataResourceDirectory self = new ListCollectionPoliciesResponseBodyDataResourceDirectory();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyDataResourceDirectory setAccountGroupType(String accountGroupType) {
            this.accountGroupType = accountGroupType;
            return this;
        }
        public String getAccountGroupType() {
            return this.accountGroupType;
        }

        public ListCollectionPoliciesResponseBodyDataResourceDirectory setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

    }

    public static class ListCollectionPoliciesResponseBodyData extends TeaModel {
        /**
         * <p>The configuration for centralized data shipping.</p>
         */
        @NameInMap("centralizeConfig")
        public ListCollectionPoliciesResponseBodyDataCentralizeConfig centralizeConfig;

        /**
         * <p>Indicates whether centralized data shipping is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("centralizeEnabled")
        public Boolean centralizeEnabled;

        /**
         * <p>The code of the log type.</p>
         * 
         * <strong>example:</strong>
         * <p>access_log</p>
         */
        @NameInMap("dataCode")
        public String dataCode;

        /**
         * <p>Configurations for global log types, such as sls. This parameter is empty for other log types.</p>
         */
        @NameInMap("dataConfig")
        public ListCollectionPoliciesResponseBodyDataDataConfig dataConfig;

        /**
         * <p>Indicates whether the collection rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the policy is a built-in policy. Built-in policies cannot be modified or deleted.</p>
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
        public ListCollectionPoliciesResponseBodyDataPolicyConfig policyConfig;

        /**
         * <p>The name of the collection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>your_log_policy</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the collection rule. If a resource directory administrator or delegated administrator creates the rule, this is the ID of that administrator\&quot;s account.</p>
         * 
         * <strong>example:</strong>
         * <p>148***********50</p>
         */
        @NameInMap("policyUid")
        public String policyUid;

        /**
         * <p>The code of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("productCode")
        public String productCode;

        /**
         * <p>The configuration of the resource directory. This parameter is empty if no configuration is available.</p>
         */
        @NameInMap("resourceDirectory")
        public ListCollectionPoliciesResponseBodyDataResourceDirectory resourceDirectory;

        public static ListCollectionPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyData self = new ListCollectionPoliciesResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListCollectionPoliciesResponseBodyData setDataConfig(ListCollectionPoliciesResponseBodyDataDataConfig dataConfig) {
            this.dataConfig = dataConfig;
            return this;
        }
        public ListCollectionPoliciesResponseBodyDataDataConfig getDataConfig() {
            return this.dataConfig;
        }

        public ListCollectionPoliciesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListCollectionPoliciesResponseBodyData setInternalPolicy(Boolean internalPolicy) {
            this.internalPolicy = internalPolicy;
            return this;
        }
        public Boolean getInternalPolicy() {
            return this.internalPolicy;
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

        public ListCollectionPoliciesResponseBodyData setPolicyUid(String policyUid) {
            this.policyUid = policyUid;
            return this;
        }
        public String getPolicyUid() {
            return this.policyUid;
        }

        public ListCollectionPoliciesResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListCollectionPoliciesResponseBodyData setResourceDirectory(ListCollectionPoliciesResponseBodyDataResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }
        public ListCollectionPoliciesResponseBodyDataResourceDirectory getResourceDirectory() {
            return this.resourceDirectory;
        }

    }

    public static class ListCollectionPoliciesResponseBodyStatisticsPolicySourceList extends TeaModel {
        /**
         * <p>The name of the collection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_name1_from148</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the collection rule. If a resource directory administrator or delegated administrator creates the rule, this is the ID of that administrator\&quot;s account.</p>
         * 
         * <strong>example:</strong>
         * <p>148***********50</p>
         */
        @NameInMap("policyUid")
        public String policyUid;

        public static ListCollectionPoliciesResponseBodyStatisticsPolicySourceList build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyStatisticsPolicySourceList self = new ListCollectionPoliciesResponseBodyStatisticsPolicySourceList();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyStatisticsPolicySourceList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListCollectionPoliciesResponseBodyStatisticsPolicySourceList setPolicyUid(String policyUid) {
            this.policyUid = policyUid;
            return this;
        }
        public String getPolicyUid() {
            return this.policyUid;
        }

    }

    public static class ListCollectionPoliciesResponseBodyStatistics extends TeaModel {
        /**
         * <p>The list of collection rule sources.</p>
         */
        @NameInMap("policySourceList")
        public java.util.List<ListCollectionPoliciesResponseBodyStatisticsPolicySourceList> policySourceList;

        /**
         * <p>The code of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("productCode")
        public String productCode;

        public static ListCollectionPoliciesResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListCollectionPoliciesResponseBodyStatistics self = new ListCollectionPoliciesResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public ListCollectionPoliciesResponseBodyStatistics setPolicySourceList(java.util.List<ListCollectionPoliciesResponseBodyStatisticsPolicySourceList> policySourceList) {
            this.policySourceList = policySourceList;
            return this;
        }
        public java.util.List<ListCollectionPoliciesResponseBodyStatisticsPolicySourceList> getPolicySourceList() {
            return this.policySourceList;
        }

        public ListCollectionPoliciesResponseBodyStatistics setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
