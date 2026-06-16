// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("Criteria")
        public String criteria;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Flags")
        public String flags;

        @NameInMap("Importance")
        public Integer importance;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("LogicalExp")
        public String logicalExp;

        @NameInMap("MachineTypes")
        public String machineTypes;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("NoGroupTrace")
        public Boolean noGroupTrace;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("ResourceDirectoryAccountId")
        public String resourceDirectoryAccountId;

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
