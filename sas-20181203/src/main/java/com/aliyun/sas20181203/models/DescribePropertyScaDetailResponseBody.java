// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponseBody extends TeaModel {
    /**
     * <p>192.168</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyScaDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The listening status of the process. Valid values:</p>
     * <br>
     * <p>*   **NONE**: not listening</p>
     * <p>*   **LISTEN**: listening</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys;

    /**
     * <p>1641024565</p>
     */
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
        /**
         * <p>The name of the server on which the middleware, database, or web service is run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>name</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The version of the runtime environment.</p>
         * <br>
         * <p>>  The value of this parameter can be the Java Development Kit (JDK) version of the runtime environment for a Java process.</p>
         */
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
        /**
         * <p>The path to the configuration file.</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The UUID of the server on which the middleware, database, or web service is run.</p>
         */
        @NameInMap("BizTypeDispaly")
        public String bizTypeDispaly;

        /**
         * <p>The latest collection timestamp, which indicates the last timestamp when Security Center collected the information about the middleware, database, or web service. Unit: milliseconds.</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The name of the user who runs the process.</p>
         */
        @NameInMap("ConfigPath")
        public String configPath;

        /**
         * <p>uuid-02ebabe7-1c19-ab****</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>756</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The search condition, such as a server name or a server IP address.</p>
         * <br>
         * <p>>  Fuzzy match is supported.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>version</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>1.0.2k</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>openssl</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>68</p>
         */
        @NameInMap("ListenIp")
        public String listenIp;

        /**
         * <p>The PID.</p>
         */
        @NameInMap("ListenProtocol")
        public String listenProtocol;

        /**
         * <p>The type of the subquery. Valid values:</p>
         * <br>
         * <p>*   **port**</p>
         * <p>*   **pid**</p>
         * <p>*   **version**</p>
         * <p>*   **user**</p>
         */
        @NameInMap("ListenStatus")
        public String listenStatus;

        /**
         * <p>The version verification information about the middleware, database, or web service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the middleware, database, or web service.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The command line of the process.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>1</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the parent process.</p>
         */
        @NameInMap("Ppid")
        public String ppid;

        /**
         * <p>The user who runs the process.</p>
         */
        @NameInMap("ProcessStarted")
        public Long processStarted;

        /**
         * <p>The port that the process monitors.</p>
         */
        @NameInMap("ProcessUser")
        public String processUser;

        /**
         * <p>The type of the middleware, database, or web service.</p>
         */
        @NameInMap("Proof")
        public String proof;

        /**
         * <p>open</p>
         */
        @NameInMap("RuntimeEnvVersion")
        public String runtimeEnvVersion;

        /**
         * <p>The name of the asset fingerprint that you want to query.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The protocol of the traffic on which the process listens. Valid values:</p>
         * <br>
         * <p>*   **UDP**</p>
         * <p>*   **TCP**</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The type of the middleware, database, or web service that you want to query. Valid values:</p>
         * <br>
         * <p>*   **system_service**: system service</p>
         * <p>*   **software_library**: software library</p>
         * <p>*   **docker_component**: container component</p>
         * <p>*   **database**: database</p>
         * <p>*   **web_container**: web container</p>
         * <p>*   **jar**: JAR package</p>
         * <p>*   **web_framework**: web framework</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>zh</p>
         */
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
