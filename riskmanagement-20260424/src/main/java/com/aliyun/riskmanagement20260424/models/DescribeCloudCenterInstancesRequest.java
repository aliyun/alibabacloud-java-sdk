// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
    @NameInMap("SdkRequest")
    public DescribeCloudCenterInstancesRequestSdkRequest sdkRequest;

    public static DescribeCloudCenterInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesRequest self = new DescribeCloudCenterInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudCenterInstancesRequest setSdkRequest(DescribeCloudCenterInstancesRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public DescribeCloudCenterInstancesRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class DescribeCloudCenterInstancesRequestSdkRequest extends TeaModel {
        /**
         * <p>The search conditions for assets. This parameter is in JSON format. Note that the parameter names are case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;contactIds\&quot;:[\&quot;job-658854766790086656\&quot;,\&quot;job-658854801112113152\&quot;]}</p>
         */
        @NameInMap("Criteria")
        public String criteria;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The asset vendor. Separate multiple asset vendors with commas (,). Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0,10,13</p>
         */
        @NameInMap("Flags")
        public String flags;

        /**
         * <p>The importance level of the asset. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The language of the response. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The logical relationship between multiple search conditions. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("LogicalExp")
        public String logicalExp;

        /**
         * <p>The type of asset to query. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MachineTypes")
        public String machineTypes;

        /**
         * <p>The pagination token used to retrieve the next page of results. If no more results are available, this field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAZak7VOTMl2OSt/xmc4J6gbg4Z5eXuWnrvKgOsGARL76TVbKERXHXKNFurqjtfDdRw==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Specifies whether to internationalize the default group name <strong>Ungrouped</strong>. Default value: <strong>false</strong>. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NoGroupTrace")
        public Boolean noGroupTrace;

        /**
         * <p>The number of assets to display per page in a paged query. Default value: 20, which indicates that 20 asset records are displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The ID of the member accounts in the resource folder.</p>
         * 
         * <strong>example:</strong>
         * <p>1587359978118481</p>
         */
        @NameInMap("ResourceDirectoryAccountId")
        public String resourceDirectoryAccountId;

        /**
         * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseNextToken")
        public Boolean useNextToken;

        public static DescribeCloudCenterInstancesRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesRequestSdkRequest self = new DescribeCloudCenterInstancesRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setCriteria(String criteria) {
            this.criteria = criteria;
            return this;
        }
        public String getCriteria() {
            return this.criteria;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setFlags(String flags) {
            this.flags = flags;
            return this;
        }
        public String getFlags() {
            return this.flags;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setLogicalExp(String logicalExp) {
            this.logicalExp = logicalExp;
            return this;
        }
        public String getLogicalExp() {
            return this.logicalExp;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setMachineTypes(String machineTypes) {
            this.machineTypes = machineTypes;
            return this;
        }
        public String getMachineTypes() {
            return this.machineTypes;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setNoGroupTrace(Boolean noGroupTrace) {
            this.noGroupTrace = noGroupTrace;
            return this;
        }
        public Boolean getNoGroupTrace() {
            return this.noGroupTrace;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }
        public String getResourceDirectoryAccountId() {
            return this.resourceDirectoryAccountId;
        }

        public DescribeCloudCenterInstancesRequestSdkRequest setUseNextToken(Boolean useNextToken) {
            this.useNextToken = useNextToken;
            return this;
        }
        public Boolean getUseNextToken() {
            return this.useNextToken;
        }

    }

}
