// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribePropertyScaDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The details about the asset fingerprints returned.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<DescribePropertyScaDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F9146867-16C8-4AAB-BB4FB8C2A4</p>
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The value of NextToken that is returned when the NextToken method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>B60***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public DescribePropertyScaDetailResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
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
         * <p>The type of the middleware, database, or web service. Valid values:</p>
         * <ul>
         * <li><strong>system_service</strong>: system service</li>
         * <li><strong>software_library</strong>: software library</li>
         * <li><strong>docker_component</strong>: container component</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>web_container</strong>: web container</li>
         * <li><strong>jar</strong>: JAR package</li>
         * <li><strong>web_framework</strong>: web framework</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>software_library</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The display name of the type of the middleware, database, or web service . Valid values:</p>
         * <ul>
         * <li>System service</li>
         * <li>Software library</li>
         * <li>Container component</li>
         * <li>Database</li>
         * <li>Web container</li>
         * <li>JAR package</li>
         * <li>Web framework</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System Service</p>
         */
        @NameInMap("BizTypeDispaly")
        public String bizTypeDispaly;

        /**
         * <p>The command line of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>/sbin/dhclient -H iz2zeflhhbtk8gtxzt087az -1 -q -lf /var/lib/dhclient/dhclient--eth0.lease -pf /var/run/dhclient-eth0.pid eth0</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The path to the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/my.cnf</p>
         */
        @NameInMap("ConfigPath")
        public String configPath;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>5-rce_web_1</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The latest collection timestamp, which indicates the last timestamp when Security Center collected the information about the middleware, database, or web service. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1597987834000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.aliyuncs.com/acs/aliyun-ingress-controller****</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zeclqj7ti****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>Test01</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>192.210.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The public IP address of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP address that the process monitors.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.XX.XX</p>
         */
        @NameInMap("ListenIp")
        public String listenIp;

        /**
         * <p>The protocol of the traffic on which the process listens. Valid values:</p>
         * <ul>
         * <li><strong>UDP</strong></li>
         * <li><strong>TCP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("ListenProtocol")
        public String listenProtocol;

        /**
         * <p>The listening status of the process. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: not listening</li>
         * <li><strong>LISTEN</strong>: listening</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ListenStatus")
        public String listenStatus;

        /**
         * <p>The name of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>openssl</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/lib64/libssl.so.1.0.2k</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The PID.</p>
         * 
         * <strong>example:</strong>
         * <p>756</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The name of the Kubernetes pod.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp-pod</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>The port of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The ID of the parent process.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ppid")
        public String ppid;

        /**
         * <p>The timestamp when the process starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1596539788</p>
         */
        @NameInMap("ProcessStarted")
        public Long processStarted;

        /**
         * <p>The name of the user who runs the process.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("ProcessUser")
        public String processUser;

        /**
         * <p>The version verification information about the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/lib64/libssl.so.1.0.2k</p>
         */
        @NameInMap("Proof")
        public String proof;

        /**
         * <p>The version of the runtime environment.</p>
         * <blockquote>
         * <p> The value of this parameter can be the Java Development Kit (JDK) version of the runtime environment for a Java process.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.8.0_144</p>
         */
        @NameInMap("RuntimeEnvVersion")
        public String runtimeEnvVersion;

        /**
         * <p>The type of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the server on which the middleware, database, or web service is run.</p>
         * 
         * <strong>example:</strong>
         * <p>uuid-02ebabe7-1c19-a****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The version of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2k</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The web directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/nginx/html</p>
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

        public DescribePropertyScaDetailResponseBodyPropertys setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
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
