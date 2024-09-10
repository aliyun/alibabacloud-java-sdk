// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedAssetsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the affected servers.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<DescribeAffectedAssetsResponseBodyAssetList> assetList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeAffectedAssetsResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42XXXXXXXX</p>
     */
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
        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.0.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of viruses detected on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskNum")
        public Integer riskNum;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>947d7514-258a-4b47-9dde-9dxxxxxxxxxx</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
