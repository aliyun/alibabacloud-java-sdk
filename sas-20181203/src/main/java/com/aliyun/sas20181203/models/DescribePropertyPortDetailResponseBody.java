// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyPortDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The fingerprints of the ports.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0FA7F1F4-488D-52CA-9BFC-3E47793B49D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyPortDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailResponseBody self = new DescribePropertyPortDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailResponseBody setPageInfo(DescribePropertyPortDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyPortDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyPortDetailResponseBody setPropertys(java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyPortDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyPortDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyPortDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPageInfo self = new DescribePropertyPortDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyPortDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyPortDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The IP address bound to the port.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.X.X</p>
         */
        @NameInMap("BindIp")
        public String bindIp;

        /**
         * <p>The timestamp of the last fingerprint collection. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649149566000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp35tftuh52wbp1g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-host-****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the network interface controller (NIC) that is bound to the listening port.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the server process that listens on the port.</p>
         * 
         * <strong>example:</strong>
         * <p>522</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the server process.</p>
         * 
         * <strong>example:</strong>
         * <p>sshd</p>
         */
        @NameInMap("ProcName")
        public String procName;

        /**
         * <p>The network protocol that is used by the listening port.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribePropertyPortDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyPortDetailResponseBodyPropertys self = new DescribePropertyPortDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyPortDetailResponseBodyPropertys setBindIp(String bindIp) {
            this.bindIp = bindIp;
            return this;
        }
        public String getBindIp() {
            return this.bindIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProcName(String procName) {
            this.procName = procName;
            return this;
        }
        public String getProcName() {
            return this.procName;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribePropertyPortDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
