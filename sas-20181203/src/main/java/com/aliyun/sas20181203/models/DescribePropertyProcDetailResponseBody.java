// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyProcDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyProcDetailResponseBodyPropertys> propertys;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("Cmdline")
        public String cmdline;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EuidName")
        public String euidName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("IsPackage")
        public Integer isPackage;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Pname")
        public String pname;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StartTimeDt")
        public Long startTimeDt;

        @NameInMap("State")
        public String state;

        @NameInMap("User")
        public String user;

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
