// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetAssetsPropertyDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>An array that consists of the details about the asset fingerprints.</p>
     */
    @NameInMap("Propertys")
    public java.util.List<GetAssetsPropertyDetailResponseBodyPropertys> propertys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C1AE3F3-18FA-4108-BBB9-AFA1A032****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAssetsPropertyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetsPropertyDetailResponseBody self = new GetAssetsPropertyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetsPropertyDetailResponseBody setPageInfo(GetAssetsPropertyDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetAssetsPropertyDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetAssetsPropertyDetailResponseBody setPropertys(java.util.List<GetAssetsPropertyDetailResponseBodyPropertys> propertys) {
        this.propertys = propertys;
        return this;
    }
    public java.util.List<GetAssetsPropertyDetailResponseBodyPropertys> getPropertys() {
        return this.propertys;
    }

    public GetAssetsPropertyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAssetsPropertyDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries returned per page.</p>
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
         * <p>23</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAssetsPropertyDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyDetailResponseBodyPageInfo self = new GetAssetsPropertyDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAssetsPropertyDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAssetsPropertyDetailResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetAssetsPropertyDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAssetsPropertyDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetAssetsPropertyDetailResponseBodyPropertys extends TeaModel {
        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>5-rce_web_1</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The timestamp of the last fingerprint collection. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649149566000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>localhost</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>LLM service endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>dashscope.aliyuncs.com</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>File path for requesting the LLM service.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/llm.py</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <p>The path to the kernel module file.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/lib/modules/4****</p>
         */
        @NameInMap("Filepath")
        public String filepath;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-beijing.aliyuncs.com/acs/aliyun-ingress-controller****</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>AI tool installation path</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/pip3/env/vllm</p>
         */
        @NameInMap("InstallationPath")
        public String installationPath;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp35tftuh52wbp1g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
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
         * <p>47.42.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>47.42.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The listening protocol that the website uses.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("ListenProtocol")
        public String listenProtocol;

        /**
         * <p>AI tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>vllm</p>
         */
        @NameInMap("MiddlewareName")
        public String middlewareName;

        /**
         * <p>AI tool version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("MiddlewareVersion")
        public String middlewareVersion;

        /**
         * <p>Name of the LLM vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The name of the module.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alihids</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The path. The value of this parameter varies based on the value of <strong>Biz</strong>.</p>
         * <ul>
         * <li>If <strong>Biz</strong> is set to <strong>web_server</strong>, the value of this parameter indicates the path to the website root directory.</li>
         * <li>If <strong>Biz</strong> is set to <strong>autorun</strong>, the value of this parameter indicates the path to the startup item.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/lib/systemd/system****</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The permissions on the root directory of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>755</p>
         */
        @NameInMap("PathMode")
        public String pathMode;

        /**
         * <p>The process ID (PID) of the process that runs the website service.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>813</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The port of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The timestamp generated when the process was started. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1671186801000</p>
         */
        @NameInMap("ProcessStarted")
        public Long processStarted;

        /**
         * <p>The ID of the region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The size of the kernel module.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The number of times that the kernel module is referenced.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>lkm</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UsedByCount")
        public Integer usedByCount;

        /**
         * <p>The user who started the process of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The path to the root directory of the website.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Biz</strong> is set to <strong>web_server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/nginx/html</p>
         */
        @NameInMap("WebPath")
        public String webPath;

        public static GetAssetsPropertyDetailResponseBodyPropertys build(java.util.Map<String, ?> map) throws Exception {
            GetAssetsPropertyDetailResponseBodyPropertys self = new GetAssetsPropertyDetailResponseBodyPropertys();
            return TeaModel.build(map, self);
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setFilepath(String filepath) {
            this.filepath = filepath;
            return this;
        }
        public String getFilepath() {
            return this.filepath;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setInstallationPath(String installationPath) {
            this.installationPath = installationPath;
            return this;
        }
        public String getInstallationPath() {
            return this.installationPath;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setListenProtocol(String listenProtocol) {
            this.listenProtocol = listenProtocol;
            return this;
        }
        public String getListenProtocol() {
            return this.listenProtocol;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setMiddlewareName(String middlewareName) {
            this.middlewareName = middlewareName;
            return this;
        }
        public String getMiddlewareName() {
            return this.middlewareName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setMiddlewareVersion(String middlewareVersion) {
            this.middlewareVersion = middlewareVersion;
            return this;
        }
        public String getMiddlewareVersion() {
            return this.middlewareVersion;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setPathMode(String pathMode) {
            this.pathMode = pathMode;
            return this;
        }
        public String getPathMode() {
            return this.pathMode;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setProcessStarted(Long processStarted) {
            this.processStarted = processStarted;
            return this;
        }
        public Long getProcessStarted() {
            return this.processStarted;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setUsedByCount(Integer usedByCount) {
            this.usedByCount = usedByCount;
            return this;
        }
        public Integer getUsedByCount() {
            return this.usedByCount;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetAssetsPropertyDetailResponseBodyPropertys setWebPath(String webPath) {
            this.webPath = webPath;
            return this;
        }
        public String getWebPath() {
            return this.webPath;
        }

    }

}
