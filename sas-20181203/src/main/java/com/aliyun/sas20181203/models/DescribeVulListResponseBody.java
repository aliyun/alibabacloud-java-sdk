// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListResponseBody extends TeaModel {
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
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>An array that consists of the details about the vulnerability.</p>
     */
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
        /**
         * <p>The name of the operating system for your asset.</p>
         */
        @NameInMap("Assets_factor")
        public String assetsFactor;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Cvss_factor")
        public String cvssFactor;

        /**
         * <p>The score of urgency to fix a vulnerability.</p>
         * <br>
         * <p>The following list describes scores and related fixing suggestions:</p>
         * <br>
         * <p>*   If the score is from **13.5 to 15**, the vulnerability is a high-risk vulnerability. You must fix the vulnerability at the earliest opportunity.</p>
         * <p>*   If the score is **greater than or equal to 7 but less than 13.5**, the vulnerability is a medium-risk vulnerability. You can fix the vulnerability at your convenience.</p>
         * <p>*   If the score is **less than 7**, the vulnerability is a low-risk vulnerability. You can ignore the vulnerability.</p>
         */
        @NameInMap("Enviroment_factor")
        public String enviromentFactor;

        /**
         * <p>The Common Vulnerability Scoring System (CVSS) score.</p>
         */
        @NameInMap("Is_calc")
        public String isCalc;

        /**
         * <p>The environment score.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the score of urgency to fix a vulnerability is calculated. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("Time_factor")
        public String timeFactor;

        /**
         * <p>The asset importance score. Valid values:</p>
         * <br>
         * <p>*   **2**: an important asset</p>
         * <p>*   **1**: a common asset</p>
         * <p>*   **0**: a test asset</p>
         */
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
        /**
         * <p>The command that is used to fix the vulnerability.</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The reason why the vulnerability is detected.</p>
         */
        @NameInMap("FullVersion")
        public String fullVersion;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The path of the software that has the vulnerability.</p>
         */
        @NameInMap("MatchDetail")
        public String matchDetail;

        /**
         * <p>The process ID.</p>
         */
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        /**
         * <p>The rule that is used to detect the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the RPM package.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The CVE list.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The rule that is used to detect the vulnerability.</p>
         */
        @NameInMap("UpdateCmd")
        public String updateCmd;

        /**
         * <p>The name of the image.</p>
         */
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
        /**
         * <p>The complete version number.</p>
         */
        @NameInMap("AbsolutePath")
        public String absolutePath;

        /**
         * <p>The RPM Package Manager (RPM) packages.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the operating system.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The release of the operating system.</p>
         */
        @NameInMap("LastTs")
        public Long lastTs;

        /**
         * <p>The time score.</p>
         */
        @NameInMap("Necessity")
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The package path of the software that has the vulnerability.</p>
         */
        @NameInMap("OsRelease")
        public String osRelease;

        /**
         * <p>The tag that is added to the vulnerability.</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The package version number of the software that has the vulnerability.</p>
         */
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the vulnerability.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>Indicates whether the vulnerability needs to be fixed.</p>
         */
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
        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **1**: unfixed</p>
         * <p>*   **2**: fix failed</p>
         * <p>*   3: rollback failed</p>
         * <p>*   **4**: fixing</p>
         * <p>*   **5**: being rolled back</p>
         * <p>*   **6**: being verified</p>
         * <p>*   **7**: fixed</p>
         * <p>*   **8**: fixed and to be restarted</p>
         * <p>*   **9**: rolled back</p>
         * <p>*   **10**: ignored</p>
         * <p>*   **11**: rolled back and to be restarted</p>
         * <p>*   **12**: not found</p>
         * <p>*   **20**: expired</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("AuthVersion")
        public String authVersion;

        /**
         * <p>CentOS 7.2 64-bit</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The public IP address of the asset that is associated with the vulnerability.</p>
         */
        @NameInMap("ExtendContentJson")
        public DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **asap**: high</p>
         * <p>*   **later**: medium</p>
         * <p>*   **nntf**: low</p>
         * <br>
         * <p>> We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.</p>
         */
        @NameInMap("FirstTs")
        public Long firstTs;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The private IP address of the asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the operating system for your asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The tag that is added to the vulnerability.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The timestamp when the vulnerability was first detected. Unit: milliseconds.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the region in which the server resides.</p>
         */
        @NameInMap("LastTs")
        public Long lastTs;

        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("ModifyTs")
        public Long modifyTs;

        /**
         * <p>The instance ID of the asset.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **1**: Basic edition</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         * <p>*   **10**: Value-added Plan edition</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The code that indicates the vulnerability fixing result.</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability</p>
         * <p>*   **sys**: Windows system vulnerability</p>
         * <p>*   **cms**: Web-CMS vulnerability</p>
         * <p>*   **emg**: urgent vulnerability</p>
         * <p>*   **app**: application vulnerability</p>
         * <p>*   **sca**: application vulnerability that is detected by using software component analysis</p>
         */
        @NameInMap("RaspDefend")
        public Integer raspDefend;

        /**
         * <p>The timestamp when the vulnerability status was modified. Unit: milliseconds.</p>
         */
        @NameInMap("RaspStatus")
        public Integer raspStatus;

        /**
         * <p>The timestamp when the vulnerability was fixed. Unit: milliseconds.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>The ID of the asset group.</p>
         */
        @NameInMap("RepairTs")
        public Long repairTs;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The extended information about the vulnerability.</p>
         */
        @NameInMap("ResultMessage")
        public String resultMessage;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **1**: unfixed</p>
         * <p>*   **2**: fix failed</p>
         * <p>*   **3**: rollback failed</p>
         * <p>*   **4**: fixing</p>
         * <p>*   **5**: being rolled back</p>
         * <p>*   **6**: being verified</p>
         * <p>*   **7**: fixed</p>
         * <p>*   **8**: fixed and to be restarted</p>
         * <p>*   **9**: rolled back</p>
         * <p>*   **10**: ignored</p>
         * <p>*   **11**: rolled back and to be restarted</p>
         * <p>*   **12**: not found</p>
         * <p>*   **20**: expired</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the Security Center agent on the asset is online. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The public IP address of the asset.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The message that indicates the vulnerability fixing result.</p>
         */
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

        public DescribeVulListResponseBodyVulRecords setRaspDefend(Integer raspDefend) {
            this.raspDefend = raspDefend;
            return this;
        }
        public Integer getRaspDefend() {
            return this.raspDefend;
        }

        public DescribeVulListResponseBodyVulRecords setRaspStatus(Integer raspStatus) {
            this.raspStatus = raspStatus;
            return this;
        }
        public Integer getRaspStatus() {
            return this.raspStatus;
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
