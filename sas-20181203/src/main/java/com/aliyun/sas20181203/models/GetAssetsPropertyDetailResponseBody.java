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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The timestamp of the last fingerprint collection. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The domain name of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The path to the kernel module file.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **lkm**.</p>
         */
        @NameInMap("Filepath")
        public String filepath;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
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
         * <p>The IP address of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The listening protocol that the website uses.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("ListenProtocol")
        public String listenProtocol;

        /**
         * <p>The name of the module.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **lkm**.</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The path. The value of this parameter varies based on the value of **Biz**.</p>
         * <br>
         * <p>*   If **Biz** is set to **web_server**, the value of this parameter indicates the path to the website root directory.</p>
         * <p>*   If **Biz** is set to **autorun**, the value of this parameter indicates the path to the startup item.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The permissions on the root directory of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("PathMode")
        public String pathMode;

        /**
         * <p>The process ID (PID) of the process that runs the website service.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The port of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The timestamp generated when the process was started. Unit: milliseconds.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("ProcessStarted")
        public Long processStarted;

        /**
         * <p>The ID of the region in which the server resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The size of the kernel module.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **lkm**.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The number of times that the kernel module is referenced.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **lkm**.</p>
         */
        @NameInMap("UsedByCount")
        public Integer usedByCount;

        /**
         * <p>The user who started the process of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The path to the root directory of the website.</p>
         * <br>
         * <p>> This parameter is returned only when **Biz** is set to **web_server**.</p>
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
