// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyClusterListResponseBody extends TeaModel {
    /**
     * <p>The proxy clusters.</p>
     */
    @NameInMap("ClusterList")
    public java.util.List<DescribeHybridProxyClusterListResponseBodyClusterList> clusterList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeHybridProxyClusterListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1A36413-50B2-5B2F-843F-EB14C582713F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridProxyClusterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyClusterListResponseBody self = new DescribeHybridProxyClusterListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyClusterListResponseBody setClusterList(java.util.List<DescribeHybridProxyClusterListResponseBodyClusterList> clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public java.util.List<DescribeHybridProxyClusterListResponseBodyClusterList> getClusterList() {
        return this.clusterList;
    }

    public DescribeHybridProxyClusterListResponseBody setPageInfo(DescribeHybridProxyClusterListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeHybridProxyClusterListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeHybridProxyClusterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridProxyClusterListResponseBodyClusterList extends TeaModel {
        /**
         * <p>The ID of the credential that is used for cluster authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The key of the credential that is used for cluster authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthKeySecret")
        public String authKeySecret;

        /**
         * <p>The number of servers that are connected to the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ClientCount")
        public Integer clientCount;

        /**
         * <p>The name of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>idc-sas-proxy</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The installation command for the node of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstallCommand")
        public String installCommand;

        /**
         * <p>The endpoint of the cluster. An IP address or a domain name is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>114.115.XXX.XXX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The timestamp when the cluster last sent a heartbeat message. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1608304654000</p>
         */
        @NameInMap("LastHeartTime")
        public Long lastHeartTime;

        /**
         * <p>The number of proxy nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProxyCount")
        public Integer proxyCount;

        /**
         * <p>The description of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHybridProxyClusterListResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyClusterListResponseBodyClusterList self = new DescribeHybridProxyClusterListResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setAuthKeySecret(String authKeySecret) {
            this.authKeySecret = authKeySecret;
            return this;
        }
        public String getAuthKeySecret() {
            return this.authKeySecret;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setInstallCommand(String installCommand) {
            this.installCommand = installCommand;
            return this;
        }
        public String getInstallCommand() {
            return this.installCommand;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setLastHeartTime(Long lastHeartTime) {
            this.lastHeartTime = lastHeartTime;
            return this;
        }
        public Long getLastHeartTime() {
            return this.lastHeartTime;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setProxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
            return this;
        }
        public Integer getProxyCount() {
            return this.proxyCount;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeHybridProxyClusterListResponseBodyClusterList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHybridProxyClusterListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>45</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHybridProxyClusterListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyClusterListResponseBodyPageInfo self = new DescribeHybridProxyClusterListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyClusterListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeHybridProxyClusterListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeHybridProxyClusterListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeHybridProxyClusterListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
