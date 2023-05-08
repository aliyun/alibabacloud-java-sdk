// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailResponseBody extends TeaModel {
    /**
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyPortDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>Specifies whether fuzzy search by port number is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyPortDetailResponseBodyPropertys> propertys;

    /**
     * <p>0.0.XX.XX</p>
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
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>An array that consists of the fingerprints of the ports.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The ID of the server process that listens on the port.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The name of the server process.</p>
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
         * <p>The pagination information.</p>
         */
        @NameInMap("BindIp")
        public String bindIp;

        /**
         * <p>Queries the fingerprints of ports on a specified server.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The IP address of the network interface controller (NIC) that is bound to the listening port.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The number of the page to return. Default value: **1**.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>10</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>sshd</p>
         */
        @NameInMap("ProcName")
        public String procName;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
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
