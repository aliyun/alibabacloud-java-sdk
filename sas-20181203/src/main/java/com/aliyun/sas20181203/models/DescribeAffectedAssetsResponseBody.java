// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedAssetsResponseBody extends TeaModel {
    @NameInMap("AssetList")
    public java.util.List<DescribeAffectedAssetsResponseBodyAssetList> assetList;

    @NameInMap("PageInfo")
    public DescribeAffectedAssetsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAffectedAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedAssetsResponseBody self = new DescribeAffectedAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedAssetsResponseBody setAssetList(java.util.List<DescribeAffectedAssetsResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeAffectedAssetsResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeAffectedAssetsResponseBody setPageInfo(DescribeAffectedAssetsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAffectedAssetsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAffectedAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAffectedAssetsResponseBodyAssetList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("RiskNum")
        public Integer riskNum;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAffectedAssetsResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedAssetsResponseBodyAssetList self = new DescribeAffectedAssetsResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeAffectedAssetsResponseBodyAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAffectedAssetsResponseBodyAssetList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAffectedAssetsResponseBodyAssetList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAffectedAssetsResponseBodyAssetList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAffectedAssetsResponseBodyAssetList setRiskNum(Integer riskNum) {
            this.riskNum = riskNum;
            return this;
        }
        public Integer getRiskNum() {
            return this.riskNum;
        }

        public DescribeAffectedAssetsResponseBodyAssetList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeAffectedAssetsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAffectedAssetsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAffectedAssetsResponseBodyPageInfo self = new DescribeAffectedAssetsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAffectedAssetsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAffectedAssetsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAffectedAssetsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAffectedAssetsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
