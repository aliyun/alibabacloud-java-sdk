// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // An array that consists of the vulnerabilities.
    @NameInMap("VulRecords")
    public java.util.List<DescribeImageVulListResponseBodyVulRecords> vulRecords;

    public static DescribeImageVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulListResponseBody self = new DescribeImageVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageVulListResponseBody setVulRecords(java.util.List<DescribeImageVulListResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeImageVulListResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        // The complete version number of the package.
        @NameInMap("FullVersion")
        public String fullVersion;

        // The SHA-256 value of the digest of the image layer.
        @NameInMap("Layer")
        public String layer;

        // The reason why the vulnerability is detected.
        @NameInMap("MatchDetail")
        public String matchDetail;

        // The details of the rules that are used to detect the vulnerability.
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        // The name of the software package.
        @NameInMap("Name")
        public String name;

        // The path of the software that has the vulnerability.
        @NameInMap("Path")
        public String path;

        // The command that is used to fix the vulnerability.
        @NameInMap("UpdateCmd")
        public String updateCmd;

        // The version number of the package.
        @NameInMap("Version")
        public String version;

        public static DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchList(java.util.List<String> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<String> getMatchList() {
            return this.matchList;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeImageVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        // The name of the operating system.
        @NameInMap("Os")
        public String os;

        // The version of the operating system in the image.
        @NameInMap("OsRelease")
        public String osRelease;

        // The details of the packages of the software that has the vulnerability.
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        public static DescribeImageVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecordsExtendContentJson self = new DescribeImageVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

    }

    public static class DescribeImageVulListResponseBodyVulRecords extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:
        // 
        // *   **yes**: yes
        // *   **no**: no
        @NameInMap("CanFix")
        public String canFix;

        // Indicates whether the package of the software that has the vulnerability can be upgraded by using Security Center. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanUpdate")
        public Boolean canUpdate;

        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The name of the cluster.
        @NameInMap("ClusterName")
        public String clusterName;

        // The ID of the container.
        @NameInMap("ContainerId")
        public String containerId;

        // The extended information about the vulnerability.
        @NameInMap("ExtendContentJson")
        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        // The timestamp when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstTs")
        public Long firstTs;

        // The name of the image.
        @NameInMap("Image")
        public String image;

        // The digest of the image.
        @NameInMap("ImageDigest")
        public String imageDigest;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        // The timestamp when the last scan was performed. Unit: milliseconds.
        @NameInMap("LastTs")
        public Long lastTs;

        // The image layers.
        @NameInMap("Layers")
        public java.util.List<String> layers;

        @NameInMap("MaliciousSource")
        public String maliciousSource;

        // The timestamp when the information about the vulnerability was updated. Unit: milliseconds.
        @NameInMap("ModifyTs")
        public Long modifyTs;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The priority to fix the vulnerability. Valid values:
        // 
        // *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
        // *   **later**: medium. You can fix the vulnerability based on your business requirements.
        // *   **nntf**: low. You can ignore the vulnerability.
        @NameInMap("Necessity")
        public String necessity;

        // The pod.
        @NameInMap("Pod")
        public String pod;

        // The ID of the vulnerability.
        @NameInMap("PrimaryId")
        public Long primaryId;

        // The Common Vulnerabilities and Exposures (CVE) ID of the associated vulnerability.
        @NameInMap("Related")
        public String related;

        // The name of the image repository.
        @NameInMap("RepoName")
        public String repoName;

        // The namespace to which the image repository belongs.
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("ScanTime")
        public Long scanTime;

        // The status of the vulnerability. Valid values:
        // 
        // *   **1**: unfixed
        // *   **7**: fixed
        @NameInMap("Status")
        public Integer status;

        // The tag that is added to the vulnerability.
        @NameInMap("Tag")
        public String tag;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        // The type of the vulnerability. The value is fixed as CVE, which indicates image vulnerabilities.
        @NameInMap("Type")
        public String type;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeImageVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecords self = new DescribeImageVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageVulListResponseBodyVulRecords setCanFix(String canFix) {
            this.canFix = canFix;
            return this;
        }
        public String getCanFix() {
            return this.canFix;
        }

        public DescribeImageVulListResponseBodyVulRecords setCanUpdate(Boolean canUpdate) {
            this.canUpdate = canUpdate;
            return this;
        }
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        public DescribeImageVulListResponseBodyVulRecords setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeImageVulListResponseBodyVulRecords setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeImageVulListResponseBodyVulRecords setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeImageVulListResponseBodyVulRecords setExtendContentJson(DescribeImageVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        public DescribeImageVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeImageVulListResponseBodyVulRecords setImageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public String getImageDigest() {
            return this.imageDigest;
        }

        public DescribeImageVulListResponseBodyVulRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeImageVulListResponseBodyVulRecords setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeImageVulListResponseBodyVulRecords setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeImageVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setLayers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<String> getLayers() {
            return this.layers;
        }

        public DescribeImageVulListResponseBodyVulRecords setMaliciousSource(String maliciousSource) {
            this.maliciousSource = maliciousSource;
            return this;
        }
        public String getMaliciousSource() {
            return this.maliciousSource;
        }

        public DescribeImageVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulListResponseBodyVulRecords setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeImageVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeImageVulListResponseBodyVulRecords setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeImageVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeImageVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeImageVulListResponseBodyVulRecords setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageVulListResponseBodyVulRecords setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageVulListResponseBodyVulRecords setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public DescribeImageVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageVulListResponseBodyVulRecords setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DescribeImageVulListResponseBodyVulRecords setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeImageVulListResponseBodyVulRecords setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeImageVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
