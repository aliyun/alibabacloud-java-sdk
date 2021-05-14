// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribePropertyScaDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys;

    public static DescribePropertyScaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaDetailResponseBody self = new DescribePropertyScaDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePropertyScaDetailResponseBody setPageInfo(DescribePropertyScaDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribePropertyScaDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribePropertyScaDetailResponseBody setPropertys(java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public static class DescribePropertyScaDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribePropertyScaDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaDetailResponseBodyPageInfo self = new DescribePropertyScaDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribePropertyScaDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePropertyScaDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribePropertyScaDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribePropertyScaDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("BizTypeDispaly")
        public String bizTypeDispaly;

        @NameInMap("ProcessStarted")
        public Long processStarted;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("ConfigPath")
        public String configPath;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Port")
        public String port;

        @NameInMap("Cmdline")
        public String cmdline;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ListenIp")
        public String listenIp;

        @NameInMap("Version")
        public String version;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ListenStatus")
        public String listenStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Create")
        public String create;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ProcessUser")
        public String processUser;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("WebPath")
        public String webPath;

        @NameInMap("Ppid")
        public String ppid;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("ListenProtocol")
        public String listenProtocol;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Path")
        public String path;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Proof")
        public String proof;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribePropertyScaDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaDetailResponseBodyPropertys self = new DescribePropertyScaDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaDetailResponseBodyPropertys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setBizTypeDispaly(String bizTypeDispaly) {
            this.bizTypeDispaly = bizTypeDispaly;
            return this;
        }
        public String getBizTypeDispaly() {
            return this.bizTypeDispaly;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProcessStarted(Long processStarted) {
            this.processStarted = processStarted;
            return this;
        }
        public Long getProcessStarted() {
            return this.processStarted;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setConfigPath(String configPath) {
            this.configPath = configPath;
            return this;
        }
        public String getConfigPath() {
            return this.configPath;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setListenIp(String listenIp) {
            this.listenIp = listenIp;
            return this;
        }
        public String getListenIp() {
            return this.listenIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setListenStatus(String listenStatus) {
            this.listenStatus = listenStatus;
            return this;
        }
        public String getListenStatus() {
            return this.listenStatus;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setCreate(String create) {
            this.create = create;
            return this;
        }
        public String getCreate() {
            return this.create;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProcessUser(String processUser) {
            this.processUser = processUser;
            return this;
        }
        public String getProcessUser() {
            return this.processUser;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setWebPath(String webPath) {
            this.webPath = webPath;
            return this;
        }
        public String getWebPath() {
            return this.webPath;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setPpid(String ppid) {
            this.ppid = ppid;
            return this;
        }
        public String getPpid() {
            return this.ppid;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setListenProtocol(String listenProtocol) {
            this.listenProtocol = listenProtocol;
            return this;
        }
        public String getListenProtocol() {
            return this.listenProtocol;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProof(String proof) {
            this.proof = proof;
            return this;
        }
        public String getProof() {
            return this.proof;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
