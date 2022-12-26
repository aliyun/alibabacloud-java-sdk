// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetsPropertyDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public GetAssetsPropertyDetailResponseBodyPageInfo pageInfo;

    @NameInMap("Propertys")
    public java.util.List<GetAssetsPropertyDetailResponseBodyPropertys> propertys;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Filepath")
        public String filepath;

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

        @NameInMap("ListenProtocol")
        public String listenProtocol;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathMode")
        public String pathMode;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProcessStarted")
        public Long processStarted;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("UsedByCount")
        public Integer usedByCount;

        @NameInMap("User")
        public String user;

        @NameInMap("Uuid")
        public String uuid;

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
