// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribePropertyScaDetailResponseBodyPageInfo pageInfo;

    // The details about the asset fingerprints returned.
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The type of the middleware, database, or web service. Valid values:
        // 
        // *   **system_service**: system service
        // *   **software_library**: software library
        // *   **docker_component**: container component
        // *   **database**: database
        // *   **web_container**: web container
        // *   **jar**: JAR package
        // *   **web_framework**: web framework
        @NameInMap("BizType")
        public String bizType;

        // The display name of the type of the middleware, database, or web service . Valid values:
        // 
        // *   System service
        // *   Software library
        // *   Container component
        // *   Database
        // *   Web container
        // *   JAR package
        // *   Web framework
        @NameInMap("BizTypeDispaly")
        public String bizTypeDispaly;

        // The command line of the process.
        @NameInMap("Cmdline")
        public String cmdline;

        // The path to the configuration file.
        @NameInMap("ConfigPath")
        public String configPath;

        // The name of the container.
        @NameInMap("ContainerName")
        public String containerName;

        // The latest collection timestamp, which indicates the last timestamp when Security Center collected the information about the middleware, database, or web service. Unit: milliseconds.
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        // The name of the image.
        @NameInMap("ImageName")
        public String imageName;

        // The ID of the server on which the middleware, database, or web service is run.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server on which the middleware, database, or web service is run.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server on which the middleware, database, or web service is run.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server on which the middleware, database, or web service is run.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The public IP address of the server on which the middleware, database, or web service is run.
        @NameInMap("Ip")
        public String ip;

        // The IP address that the process monitors.
        @NameInMap("ListenIp")
        public String listenIp;

        // The protocol of the traffic on which the process listens. Valid values:
        // 
        // *   **UDP**
        // *   **TCP**
        @NameInMap("ListenProtocol")
        public String listenProtocol;

        // The listening status of the process. Valid values:
        // 
        // *   **NONE**: not listening
        // *   **LISTEN**: listening
        @NameInMap("ListenStatus")
        public String listenStatus;

        // The name of the middleware, database, or web service.
        @NameInMap("Name")
        public String name;

        // The path of the middleware, database, or web service.
        @NameInMap("Path")
        public String path;

        // The PID.
        @NameInMap("Pid")
        public String pid;

        // The port of the middleware, database, or web service.
        @NameInMap("Port")
        public String port;

        // The ID of the parent process.
        @NameInMap("Ppid")
        public String ppid;

        // The timestamp when the process starts. Unit: milliseconds.
        @NameInMap("ProcessStarted")
        public Long processStarted;

        // The name of the user who runs the process.
        @NameInMap("ProcessUser")
        public String processUser;

        // The version verification information about the middleware, database, or web service.
        @NameInMap("Proof")
        public String proof;

        // The version of the runtime environment.
        // 
        // >  The value of this parameter can be the Java Development Kit (JDK) version of the runtime environment for a Java process.
        @NameInMap("RuntimeEnvVersion")
        public String runtimeEnvVersion;

        // The type of the middleware, database, or web service.
        @NameInMap("Type")
        public String type;

        // The UUID of the server on which the middleware, database, or web service is run.
        @NameInMap("Uuid")
        public String uuid;

        // The version of the middleware, database, or web service.
        @NameInMap("Version")
        public String version;

        // The web directory.
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
