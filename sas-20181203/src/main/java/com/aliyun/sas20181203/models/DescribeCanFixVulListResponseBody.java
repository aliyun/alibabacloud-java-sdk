// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanFixVulListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the vulnerability.</p>
     */
    @NameInMap("VulRecords")
    public java.util.List<DescribeCanFixVulListResponseBodyVulRecords> vulRecords;

    public static DescribeCanFixVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanFixVulListResponseBody self = new DescribeCanFixVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCanFixVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCanFixVulListResponseBody setVulRecords(java.util.List<DescribeCanFixVulListResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeCanFixVulListResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        /**
         * <p>The complete version number of the software package.</p>
         */
        @NameInMap("FullVersion")
        public String fullVersion;

        /**
         * <p>The SHA-256 value of the digest of the image layer.</p>
         */
        @NameInMap("Layer")
        public String layer;

        /**
         * <p>The information about the detected vulnerability.</p>
         */
        @NameInMap("MatchDetail")
        public String matchDetail;

        /**
         * <p>The rule that is used to detect the vulnerability.</p>
         */
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        /**
         * <p>The name of the software package.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the software that has the vulnerability.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The command that is used to fix the vulnerability.</p>
         */
        @NameInMap("UpdateCmd")
        public String updateCmd;

        /**
         * <p>The version number of the software package.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchList(java.util.List<String> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<String> getMatchList() {
            return this.matchList;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
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
         * <p>The RPM packages.</p>
         */
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        public static DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson self = new DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeCanFixVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

    }

    public static class DescribeCanFixVulListResponseBodyVulRecords extends TeaModel {
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
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The container ID.</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The extended information about the vulnerability.</p>
         */
        @NameInMap("ExtendContentJson")
        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        /**
         * <p>The timestamp generated when the vulnerability was first detected. Unit: milliseconds.</p>
         */
        @NameInMap("FirstTs")
        public Long firstTs;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The unique identifier of the image.</p>
         */
        @NameInMap("ImageDigest")
        public String imageDigest;

        /**
         * <p>The name of the instance.</p>
         * <br>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the asset.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp generated when the vulnerability was last detected. Unit: milliseconds.</p>
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
         * <p>*   **agentless**</p>
         * <p>*   **image**</p>
         * <p>*   **container**</p>
         */
        @NameInMap("MaliciousSource")
        public String maliciousSource;

        /**
         * <p>The timestamp generated when the vulnerability status was modified. Unit: milliseconds.</p>
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
         * <p>*   **asap**: high</p>
         * <p>*   **later**: medium</p>
         * <p>*   **nntf**: low</p>
         * <br>
         * <p>>  We recommend that you fix high-level vulnerabilities as soon as possible.</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>The name of the container group.</p>
         */
        @NameInMap("Pod")
        public String pod;

        /**
         * <p>The vulnerability ID.</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The CVE IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).</p>
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
         * <p>The timestamp generated when the scan task was performed. Unit: milliseconds.</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **1**: The vulnerability is unfixed.</p>
         * <p>*   **4**: The vulnerability is being fixed.</p>
         * <p>*   **7**: The vulnerability is fixed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag that is added to the image.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The ID of the asset that is scanned.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset that is scanned.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset that is scanned. Valid values:</p>
         * <br>
         * <p>*   **IMAGE**</p>
         * <p>*   **ECS_IMAGE**</p>
         * <p>*   **ECS_SNAPSHOT**</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: system vulnerability</p>
         * <p>*   **sca**: application vulnerability</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the container image.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCanFixVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCanFixVulListResponseBodyVulRecords self = new DescribeCanFixVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCanFixVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setCanFix(String canFix) {
            this.canFix = canFix;
            return this;
        }
        public String getCanFix() {
            return this.canFix;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setCanUpdate(Boolean canUpdate) {
            this.canUpdate = canUpdate;
            return this;
        }
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setExtendContentJson(DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeCanFixVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setImageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public String getImageDigest() {
            return this.imageDigest;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setLayers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<String> getLayers() {
            return this.layers;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setMaliciousSource(String maliciousSource) {
            this.maliciousSource = maliciousSource;
            return this;
        }
        public String getMaliciousSource() {
            return this.maliciousSource;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCanFixVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
