// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaProcessDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyScaProcessDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The processes collected by the asset fingerprints feature.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaProcessDetailResponseBodyPropertys> propertys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyScaProcessDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaProcessDetailResponseBody self = new DescribePropertyScaProcessDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaProcessDetailResponseBody setPageInfo(DescribePropertyScaProcessDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyScaProcessDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyScaProcessDetailResponseBody setPropertys(java.util.List<DescribePropertyScaProcessDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyScaProcessDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyScaProcessDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyScaProcessDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
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
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyScaProcessDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaProcessDetailResponseBodyPageInfo self = new DescribePropertyScaProcessDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaProcessDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyScaProcessDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyScaProcessDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyScaProcessDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyScaProcessDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The command line of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>java -Xms128m -Xmx512m -DNACOS_URL=<a href="http://10.184.XX.XX:8848">http://10.184.XX.XX:8848</a> -DNACOS_NAMESPACE=iam-sit -jar /opt/service/xxl-job/xxl-job-admin-2.3.0.jar</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1597987834000</p>
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
         * <p>120.26.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>522</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Version")
        public String version;

        public static DescribePropertyScaProcessDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaProcessDetailResponseBodyPropertys self = new DescribePropertyScaProcessDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertyScaProcessDetailResponseBodyPropertys setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
