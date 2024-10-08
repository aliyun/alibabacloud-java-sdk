// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeHybridProxyListResponseBodyPageInfo pageInfo;

    @NameInMap("ProxyList")
    public java.util.List<DescribeHybridProxyListResponseBodyProxyList> proxyList;

    /**
     * <strong>example:</strong>
     * <p>75801E5D-E2EB-5C1D-B65D-2F7D2B00EF93</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridProxyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyListResponseBody self = new DescribeHybridProxyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyListResponseBody setPageInfo(DescribeHybridProxyListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeHybridProxyListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeHybridProxyListResponseBody setProxyList(java.util.List<DescribeHybridProxyListResponseBodyProxyList> proxyList) {
        this.proxyList = proxyList;
        return this;
    }
    public java.util.List<DescribeHybridProxyListResponseBodyProxyList> getProxyList() {
        return this.proxyList;
    }

    public DescribeHybridProxyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridProxyListResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHybridProxyListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyListResponseBodyPageInfo self = new DescribeHybridProxyListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeHybridProxyListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeHybridProxyListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeHybridProxyListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeHybridProxyListResponseBodyProxyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ClientCount")
        public Integer clientCount;

        /**
         * <strong>example:</strong>
         * <p>proxy_01_05</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <strong>example:</strong>
         * <p>i-uf61q03boqhhmeai1XXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>47.76.XXX.XXX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>172.23.XXX.XXX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>inet-proxy-3bb11fad-37d6-4aee-9c37-b0ad1612a18e</p>
         */
        @NameInMap("ProxyUuid")
        public String proxyUuid;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>59a9d158-b2f0-4766-a893-ae67b9432721</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeHybridProxyListResponseBodyProxyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyListResponseBodyProxyList self = new DescribeHybridProxyListResponseBodyProxyList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyListResponseBodyProxyList setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public DescribeHybridProxyListResponseBodyProxyList setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeHybridProxyListResponseBodyProxyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHybridProxyListResponseBodyProxyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHybridProxyListResponseBodyProxyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeHybridProxyListResponseBodyProxyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeHybridProxyListResponseBodyProxyList setProxyUuid(String proxyUuid) {
            this.proxyUuid = proxyUuid;
            return this;
        }
        public String getProxyUuid() {
            return this.proxyUuid;
        }

        public DescribeHybridProxyListResponseBodyProxyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHybridProxyListResponseBodyProxyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
