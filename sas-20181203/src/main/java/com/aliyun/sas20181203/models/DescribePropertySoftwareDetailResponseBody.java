// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribePropertySoftwareDetailResponseBodyPageInfo pageInfo;

    // The details of the software asset.
    @NameInMap("Propertys")
    public java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> propertys;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertySoftwareDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailResponseBody self = new DescribePropertySoftwareDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailResponseBody setPageInfo(DescribePropertySoftwareDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertySoftwareDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertySoftwareDetailResponseBody setPropertys(java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertySoftwareDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public DescribePropertySoftwareDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertySoftwareDetailResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **10**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertySoftwareDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareDetailResponseBodyPageInfo self = new DescribePropertySoftwareDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertySoftwareDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePropertySoftwareDetailResponseBodyPropertys extends TeaModel {
        // The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        // The time at which the software is installed.
        @NameInMap("InstallTime")
        public String installTime;

        // The timestamp at which the software is installed. Unit: milliseconds.
        @NameInMap("InstallTimeDt")
        public Long installTimeDt;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The IP addresses of the server.
        @NameInMap("Ip")
        public String ip;

        // The name of the software.
        @NameInMap("Name")
        public String name;

        // The installation path of the software.
        @NameInMap("Path")
        public String path;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        // The version of the software.
        @NameInMap("Version")
        public String version;

        public static DescribePropertySoftwareDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertySoftwareDetailResponseBodyPropertys self = new DescribePropertySoftwareDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstallTimeDt(Long installTimeDt) {
            this.installTimeDt = installTimeDt;
            return this;
        }
        public Long getInstallTimeDt() {
            return this.installTimeDt;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertySoftwareDetailResponseBodyPropertys setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
