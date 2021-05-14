// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribePropertyProcDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyProcDetailResponseBodyPropertys> propertys;

    public static DescribePropertyProcDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailResponseBody self = new DescribePropertyProcDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribePropertyProcDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertyProcDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcDetailResponseBodyPageInfo self = new DescribePropertyProcDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
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

        public DescribePropertyProcDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribePropertyProcDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("Create")
        public String create;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("User")
        public String user;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Cmdline")
        public String cmdline;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("EuidName")
        public String euidName;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Pname")
        public String pname;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Path")
        public String path;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribePropertyProcDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyProcDetailResponseBodyPropertys self = new DescribePropertyProcDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyProcDetailResponseBodyPropertys setCreate(String create) {
            this.create = create;
            return this;
        }
        public String getCreate() {
            return this.create;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setEuidName(String euidName) {
            this.euidName = euidName;
            return this;
        }
        public String getEuidName() {
            return this.euidName;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPname(String pname) {
            this.pname = pname;
            return this;
        }
        public String getPname() {
            return this.pname;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyProcDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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

        public DescribePropertyProcDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
