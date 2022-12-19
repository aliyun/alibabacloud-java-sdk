// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of vulnerabilities returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // An array that consists of the vulnerabilities.
    @NameInMap("VulRecords")
    public java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords;

    public static DescribeVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListResponseBody self = new DescribeVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulListResponseBody setVulRecords(java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeVulListResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity extends TeaModel {
        // The asset importance score. Valid values:
        // 
        // *   **2**: an important asset
        // *   **1**: a common asset
        // *   **0**: a test asset
        @NameInMap("Assets_factor")
        public String assetsFactor;

        // The Common Vulnerability Scoring System (CVSS) score.
        @NameInMap("Cvss_factor")
        public String cvssFactor;

        // The environment score.
        @NameInMap("Enviroment_factor")
        public String enviromentFactor;

        // Indicates whether the score of urgency to fix a vulnerability is calculated. Valid values:
        // 
        // *   **0**: no
        // *   **1**: yes
        @NameInMap("Is_calc")
        public String isCalc;

        // The status of the score of urgency to fix a vulnerability. Valid values:
        // 
        // *   **none**: No score is generated.
        // *   **pending**: The score is pending calculation.
        // *   **normal**: The calculation is normal.
        @NameInMap("Status")
        public String status;

        // The time score.
        @NameInMap("Time_factor")
        public String timeFactor;

        // The score of urgency to fix a vulnerability.
        // 
        // The following list describes scores and related fixing suggestions:
        // 
        // *   If the score is from **13.5 to 15**, the vulnerability is a high-risk vulnerability. You must fix the vulnerability at the earliest opportunity.
        // *   If the score is **greater than or equal to 7 but less than 13.5**, the vulnerability is a medium-risk vulnerability. You can fix the vulnerability at your convenience.
        // *   If the score is **less than 7**, the vulnerability is a low-risk vulnerability. You can ignore the vulnerability.
        @NameInMap("Total_score")
        public String totalScore;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setAssetsFactor(String assetsFactor) {
            this.assetsFactor = assetsFactor;
            return this;
        }
        public String getAssetsFactor() {
            return this.assetsFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setCvssFactor(String cvssFactor) {
            this.cvssFactor = cvssFactor;
            return this;
        }
        public String getCvssFactor() {
            return this.cvssFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setEnviromentFactor(String enviromentFactor) {
            this.enviromentFactor = enviromentFactor;
            return this;
        }
        public String getEnviromentFactor() {
            return this.enviromentFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setIsCalc(String isCalc) {
            this.isCalc = isCalc;
            return this;
        }
        public String getIsCalc() {
            return this.isCalc;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setTimeFactor(String timeFactor) {
            this.timeFactor = timeFactor;
            return this;
        }
        public String getTimeFactor() {
            return this.timeFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setTotalScore(String totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public String getTotalScore() {
            return this.totalScore;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        // The name of the container.
        @NameInMap("ContainerName")
        public String containerName;

        // The complete version number.
        @NameInMap("FullVersion")
        public String fullVersion;

        // The name of the image.
        @NameInMap("ImageName")
        public String imageName;

        // The reason why the vulnerability is detected.
        @NameInMap("MatchDetail")
        public String matchDetail;

        // The rule that is used to detect the vulnerability.
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        // The name of the RPM package.
        @NameInMap("Name")
        public String name;

        // The path of the software that has the vulnerability.
        @NameInMap("Path")
        public String path;

        // The process ID.
        @NameInMap("Pid")
        public String pid;

        // The command that is used to fix the vulnerability.
        @NameInMap("UpdateCmd")
        public String updateCmd;

        // The package version number of the software that has the vulnerability.
        @NameInMap("Version")
        public String version;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchList(java.util.List<String> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<String> getMatchList() {
            return this.matchList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        // The package path of the software that has the vulnerability.
        @NameInMap("AbsolutePath")
        public String absolutePath;

        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The description of the vulnerability.
        @NameInMap("Description")
        public String description;

        // The public IP address of the asset that is associated with the vulnerability.
        @NameInMap("Ip")
        public String ip;

        // The timestamp when the vulnerability was last detected. Unit: milliseconds.
        @NameInMap("LastTs")
        public Long lastTs;

        // Indicates whether the vulnerability needs to be fixed.
        @NameInMap("Necessity")
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity;

        // The name of the operating system for your asset.
        @NameInMap("Os")
        public String os;

        // The release of the operating system.
        @NameInMap("OsRelease")
        public String osRelease;

        // The ID of the vulnerability.
        @NameInMap("PrimaryId")
        public Long primaryId;

        // An array that consists of the information about RPM Package Manager (RPM) packages.
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        // The status of the vulnerability. Valid values:
        // 
        // *   **1**: unfixed
        // *   **2**: fix failed
        // *   3: rollback failed
        // *   **4**: being fixed
        // *   **5**: being rolled back
        // *   **6**: being verified
        // *   **7**: fixed
        // *   **8**: fixed and to be restarted
        // *   **9**: rolled back
        // *   **10**: ignored
        // *   **11**: rolled back and to be restarted
        // *   **12**: not found
        // *   **20**: expired
        @NameInMap("Status")
        public String status;

        // The tag that is added to the vulnerability.
        @NameInMap("Tag")
        public String tag;

        // The CVE list.
        @NameInMap("cveList")
        public java.util.List<String> cveList;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJson self = new DescribeVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAbsolutePath(String absolutePath) {
            this.absolutePath = absolutePath;
            return this;
        }
        public String getAbsolutePath() {
            return this.absolutePath;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setNecessity(DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity) {
            this.necessity = necessity;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

    }

    public static class DescribeVulListResponseBodyVulRecords extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The edition of Security Center that is authorized to scan the asset. Valid values:
        // 
        // *   **1**: Basic edition
        // *   **6**: Anti-virus edition
        // *   **5**: Advanced edition
        // *   **3**: Enterprise edition
        // *   **7**: Ultimate edition
        // *   **10**: Value-added Plan edition
        @NameInMap("AuthVersion")
        public String authVersion;

        // Indicates whether Security Center is authorized to scan the asset. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Bind")
        public Boolean bind;

        // The extended information about the vulnerability.
        @NameInMap("ExtendContentJson")
        public DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        // The timestamp when the vulnerability was first detected. Unit: milliseconds.
        @NameInMap("FirstTs")
        public Long firstTs;

        // The ID of the asset group.
        @NameInMap("GroupId")
        public Integer groupId;

        // The instance ID of the asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the asset.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the asset.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the asset.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The timestamp when the vulnerability was last detected. Unit: milliseconds.
        @NameInMap("LastTs")
        public Long lastTs;

        // The timestamp when the vulnerability status was modified. Unit: milliseconds.
        @NameInMap("ModifyTs")
        public Long modifyTs;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The priority to fix the vulnerability. Valid values:
        // 
        // *   **asap**: high
        // *   **later**: medium
        // *   **nntf**: low
        // 
        // >  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
        @NameInMap("Necessity")
        public String necessity;

        // Indicates whether the Security Center agent on the asset is online. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Online")
        public Boolean online;

        // The name of the operating system for your asset.
        @NameInMap("OsName")
        public String osName;

        // The name of the operating system for your asset.
        @NameInMap("OsVersion")
        public String osVersion;

        // The ID of the vulnerability.
        @NameInMap("PrimaryId")
        public Long primaryId;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        // The Common Vulnerabilities and Exposures (CVE) IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).
        @NameInMap("Related")
        public String related;

        // The timestamp when the vulnerability was fixed. Unit: milliseconds.
        @NameInMap("RepairTs")
        public Long repairTs;

        // The code that indicates the vulnerability fixing result.
        @NameInMap("ResultCode")
        public String resultCode;

        // The message that indicates the vulnerability fixing result.
        @NameInMap("ResultMessage")
        public String resultMessage;

        // The status of the vulnerability. Valid values:
        // 
        // *   **1**: unfixed
        // *   **2**: fix failed
        // *   **3**: rollback failed
        // *   **4**: being fixed
        // *   **5**: being rolled back
        // *   **6**: being verified
        // *   **7**: fixed
        // *   **8**: fixed and to be restarted
        // *   **9**: rolled back
        // *   **10**: ignored
        // *   **11**: rolled back and to be restarted
        // *   **12**: not found
        // *   **20**: expired
        @NameInMap("Status")
        public Integer status;

        // The tag that is added to the vulnerability.
        @NameInMap("Tag")
        public String tag;

        // The type of the vulnerability. Valid values:
        // 
        // *   **cve**: Linux software vulnerability
        // *   **sys**: Windows system vulnerability
        // *   **cms**: Web-CMS vulnerability
        // *   **emg**: urgent vulnerability
        // *   **app**: application vulnerability
        @NameInMap("Type")
        public String type;

        // The instance UUID of the asset.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecords self = new DescribeVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecords setAuthVersion(String authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public String getAuthVersion() {
            return this.authVersion;
        }

        public DescribeVulListResponseBodyVulRecords setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeVulListResponseBodyVulRecords setExtendContentJson(DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        public DescribeVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeVulListResponseBodyVulRecords setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVulListResponseBodyVulRecords setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVulListResponseBodyVulRecords setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecords setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeVulListResponseBodyVulRecords setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeVulListResponseBodyVulRecords setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeVulListResponseBodyVulRecords setRepairTs(Long repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public Long getRepairTs() {
            return this.repairTs;
        }

        public DescribeVulListResponseBodyVulRecords setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVulListResponseBodyVulRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
