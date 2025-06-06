// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleResponseBody extends TeaModel {
    /**
     * <p>Check rules.</p>
     */
    @NameInMap("CheckRules")
    public java.util.List<ListCheckRuleResponseBodyCheckRules> checkRules;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckRuleResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of this request, which is a unique identifier generated by Alibaba Cloud for the request. It can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleResponseBody self = new ListCheckRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleResponseBody setCheckRules(java.util.List<ListCheckRuleResponseBodyCheckRules> checkRules) {
        this.checkRules = checkRules;
        return this;
    }
    public java.util.List<ListCheckRuleResponseBodyCheckRules> getCheckRules() {
        return this.checkRules;
    }

    public ListCheckRuleResponseBody setPageInfo(ListCheckRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckRuleResponseBodyCheckRulesCheckPolicies extends TeaModel {
        /**
         * <p>Display name of the item\&quot;s chapter.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Control</p>
         */
        @NameInMap("sectionShowName")
        public String sectionShowName;

        public static ListCheckRuleResponseBodyCheckRulesCheckPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRuleResponseBodyCheckRulesCheckPolicies self = new ListCheckRuleResponseBodyCheckRulesCheckPolicies();
            return TeaModel.build(map, self);
        }

        public ListCheckRuleResponseBodyCheckRulesCheckPolicies setSectionShowName(String sectionShowName) {
            this.sectionShowName = sectionShowName;
            return this;
        }
        public String getSectionShowName() {
            return this.sectionShowName;
        }

    }

    public static class ListCheckRuleResponseBodyCheckRules extends TeaModel {
        /**
         * <p>The UID of the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>176316827610****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The subtype of the cloud product.</p>
         * <blockquote>
         * <p>For specific meanings, refer to the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> AssetSubType.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of cloud asset.</p>
         * <blockquote>
         * <p>For specific meanings, refer to the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> AssetType.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The display name of the check item section.</p>
         */
        @NameInMap("CheckPolicies")
        public java.util.List<ListCheckRuleResponseBodyCheckRulesCheckPolicies> checkPolicies;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Check for IPS Whitelist on CEN (Enterprise Edition) Tab</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The sub-asset type of the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>8000**</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The type of rule. Default is <strong>WHITE</strong>. Values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: Add to whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHITE</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The scope where the rule applies. Values:</p>
         * <ul>
         * <li><strong>INSTNACE</strong>: Instance</li>
         * <li><strong>ITEM</strong>: Check item</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <p>The server vendor. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: Non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other cloud assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The name of the server provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        public static ListCheckRuleResponseBodyCheckRules build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRuleResponseBodyCheckRules self = new ListCheckRuleResponseBodyCheckRules();
            return TeaModel.build(map, self);
        }

        public ListCheckRuleResponseBodyCheckRules setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListCheckRuleResponseBodyCheckRules setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListCheckRuleResponseBodyCheckRules setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCheckRuleResponseBodyCheckRules setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckRuleResponseBodyCheckRules setCheckPolicies(java.util.List<ListCheckRuleResponseBodyCheckRulesCheckPolicies> checkPolicies) {
            this.checkPolicies = checkPolicies;
            return this;
        }
        public java.util.List<ListCheckRuleResponseBodyCheckRulesCheckPolicies> getCheckPolicies() {
            return this.checkPolicies;
        }

        public ListCheckRuleResponseBodyCheckRules setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListCheckRuleResponseBodyCheckRules setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListCheckRuleResponseBodyCheckRules setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCheckRuleResponseBodyCheckRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCheckRuleResponseBodyCheckRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListCheckRuleResponseBodyCheckRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListCheckRuleResponseBodyCheckRules setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListCheckRuleResponseBodyCheckRules setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public ListCheckRuleResponseBodyCheckRules setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

    public static class ListCheckRuleResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of data entries displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of data entries displayed per page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRuleResponseBodyPageInfo self = new ListCheckRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckRuleResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
