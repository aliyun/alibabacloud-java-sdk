// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: **10**</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The vulnerabilities.</p>
     */
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
        /**
         * <p>The complete version number of the package.</p>
         */
        @NameInMap("FullVersion")
        public String fullVersion;

        /**
         * <p>The SHA-256 value of the digest of the image layer.</p>
         */
        @NameInMap("Layer")
        public String layer;

        /**
         * <p>The reason why the vulnerability is detected.</p>
         */
        @NameInMap("MatchDetail")
        public String matchDetail;

        /**
         * <p>The details of the rules that are used to detect the vulnerability.</p>
         */
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        /**
         * <p>The name of the software package.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path to the software that has the vulnerability.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The command that is used to fix the vulnerability.</p>
         */
        @NameInMap("UpdateCmd")
        public String updateCmd;

        /**
         * <p>The version number of the package.</p>
         */
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
        /**
         * <p>The name of the operating system.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The version of the operating system in the image.</p>
         */
        @NameInMap("OsRelease")
        public String osRelease;

        /**
         * <p>The details of the packages of the software that has the vulnerability.</p>
         */
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
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:</p>
         * <br>
         * <p>*   **yes**</p>
         * <p>*   **no**</p>
         */
        @NameInMap("CanFix")
        public String canFix;

        /**
         * <p>Indicates whether the packages of the software that has the vulnerability can be upgraded by using Security Center. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("CanUpdate")
        public Boolean canUpdate;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The ID of the container.</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The extended information about the vulnerability.</p>
         */
        @NameInMap("ExtendContentJson")
        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("FirstTs")
        public Long firstTs;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The digest of the image.</p>
         */
        @NameInMap("ImageDigest")
        public String imageDigest;

        /**
         * <p>The name of the asset.</p>
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
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LastTs")
        public Long lastTs;

        /**
         * <p>The image layers.</p>
         */
        @NameInMap("Layers")
        public java.util.List<String> layers;

        /**
         * <p>The source of the malicious file. Valid values:</p>
         * <br>
         * <p>*   **agentless**: agentless detection</p>
         * <p>*   **image**: image</p>
         * <p>*   **container**: container</p>
         */
        @NameInMap("MaliciousSource")
        public String maliciousSource;

        /**
         * <p>The timestamp when the information about the vulnerability was updated. Unit: milliseconds.</p>
         */
        @NameInMap("ModifyTs")
        public Long modifyTs;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **asap**: high. You must fix the vulnerability at the earliest opportunity.</p>
         * <p>*   **later**: medium. You can fix the vulnerability based on your business requirements.</p>
         * <p>*   **nntf**: low. You can ignore the vulnerability.</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>The pod.</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the associated vulnerability.</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>The name of the image repository.</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The time at which the scan was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **1**: unfixed</p>
         * <p>*   **7**: fixed</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag that is added to the vulnerability.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The ID of the asset on which the vulnerability is detected.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset on which the vulnerability is detected.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset on which the vulnerability is detected. Valid values:</p>
         * <br>
         * <p>*   **ECS_IMAGE**: image</p>
         * <p>*   **ECS_SNAPSHOT**: snapshot</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The type of the vulnerability. The value is fixed as cve, which indicates image vulnerabilities.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the server.</p>
         */
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
