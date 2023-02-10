// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribePropertyScaDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePropertyScaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaDetailResponseBody self = new DescribePropertyScaDetailResponseBody();
        return TeaModel.build(map, self);
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

    public DescribePropertyScaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePropertyScaDetailResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePropertyScaDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaDetailResponseBodyPageInfo self = new DescribePropertyScaDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
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

    }

    public static class DescribePropertyScaDetailResponseBodyPropertys extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BizTypeDispaly")
        public String bizTypeDispaly;

        @NameInMap("Cmdline")
        public String cmdline;

        @NameInMap("ConfigPath")
        public String configPath;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ListenIp")
        public String listenIp;

        @NameInMap("ListenProtocol")
        public String listenProtocol;

        @NameInMap("ListenStatus")
        public String listenStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Port")
        public String port;

        @NameInMap("Ppid")
        public String ppid;

        @NameInMap("ProcessStarted")
        public Long processStarted;

        @NameInMap("ProcessUser")
        public String processUser;

        @NameInMap("Proof")
        public String proof;

        @NameInMap("RuntimeEnvVersion")
        public String runtimeEnvVersion;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Version")
        public String version;

        @NameInMap("WebPath")
        public String webPath;

        public static DescribePropertyScaDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            DescribePropertyScaDetailResponseBodyPropertys self = new DescribePropertyScaDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public DescribePropertyScaDetailResponseBodyPropertys setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setBizTypeDispaly(String bizTypeDispaly) {
            this.bizTypeDispaly = bizTypeDispaly;
            return this;
        }
        public String getBizTypeDispaly() {
            return this.bizTypeDispaly;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setConfigPath(String configPath) {
            this.configPath = configPath;
            return this;
        }
        public String getConfigPath() {
            return this.configPath;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setListenIp(String listenIp) {
            this.listenIp = listenIp;
            return this;
        }
        public String getListenIp() {
            return this.listenIp;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setListenProtocol(String listenProtocol) {
            this.listenProtocol = listenProtocol;
            return this;
        }
        public String getListenProtocol() {
            return this.listenProtocol;
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

        public DescribePropertyScaDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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

        public DescribePropertyScaDetailResponseBodyPropertys setPpid(String ppid) {
            this.ppid = ppid;
            return this;
        }
        public String getPpid() {
            return this.ppid;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProcessStarted(Long processStarted) {
            this.processStarted = processStarted;
            return this;
        }
        public Long getProcessStarted() {
            return this.processStarted;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProcessUser(String processUser) {
            this.processUser = processUser;
            return this;
        }
        public String getProcessUser() {
            return this.processUser;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setProof(String proof) {
            this.proof = proof;
            return this;
        }
        public String getProof() {
            return this.proof;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setRuntimeEnvVersion(String runtimeEnvVersion) {
            this.runtimeEnvVersion = runtimeEnvVersion;
            return this;
        }
        public String getRuntimeEnvVersion() {
            return this.runtimeEnvVersion;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribePropertyScaDetailResponseBodyPropertys setWebPath(String webPath) {
            this.webPath = webPath;
            return this;
        }
        public String getWebPath() {
            return this.webPath;
        }

    }

}
