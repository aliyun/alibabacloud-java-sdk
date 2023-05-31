// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyProcDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the fingerprints of the processes.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyProcDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyProcDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailResponseBody self = new DescribePropertyProcDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailResponseBody setPageInfo(DescribePropertyProcDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyProcDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyProcDetailResponseBody setPropertys(java.util.List<DescribePropertyProcDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyProcDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertyProcDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyProcDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyProcDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcDetailResponseBodyPageInfo self = new DescribePropertyProcDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyProcDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertyProcDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyProcDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyProcDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertyProcDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The startup parameter of the process.</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The timestamp of last data collection. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The permission that is required to run the process.</p>
         */
        @NameInMap("EuidName")
        public String euidName;

        /**
         * <p>The ID of the server that is associated with the process.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server that is associated with the process.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether the process is a package installation process. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("IsPackage")
        public Integer isPackage;

        /**
         * <p>The MD5 hash value of the process file.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the process.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the process.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The ID of the process.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The name of the parent process to which the process belongs.</p>
         */
        @NameInMap("Pname")
        public String pname;

        /**
         * <p>The time when the process starts.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The timestamp when the process starts. Unit: milliseconds.</p>
         */
        @NameInMap("StartTimeDt")
        public Long startTimeDt;

        /**
         * <p>The status of the process.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The user who runs the process.</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server that is associated with the process.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribePropertyProcDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcDetailResponseBodyPropertys self = new DescribePropertyProcDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyProcDetailResponseBodyPropertys setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setEuidName(String euidName) {
            this.euidName = euidName;
            return this;
        }
        public String getEuidName() {
            return this.euidName;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setIsPackage(Integer isPackage) {
            this.isPackage = isPackage;
            return this;
        }
        public Integer getIsPackage() {
            return this.isPackage;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPname(String pname) {
            this.pname = pname;
            return this;
        }
        public String getPname() {
            return this.pname;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setStartTimeDt(Long startTimeDt) {
            this.startTimeDt = startTimeDt;
            return this;
        }
        public Long getStartTimeDt() {
            return this.startTimeDt;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
