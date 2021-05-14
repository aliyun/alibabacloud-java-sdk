// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        @NameInMap("FullVersion")
        public String fullVersion;

        @NameInMap("Version")
        public String version;

        @NameInMap("MatchDetail")
        public String matchDetail;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateCmd")
        public String updateCmd;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Time_factor")
        public String timeFactor;

        @NameInMap("Enviroment_factor")
        public String enviromentFactor;

        @NameInMap("Is_calc")
        public String isCalc;

        @NameInMap("Total_score")
        public String totalScore;

        @NameInMap("Cvss_factor")
        public String cvssFactor;

        @NameInMap("Assets_factor")
        public String assetsFactor;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity();
            return TeaModel.build(map, self);
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

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setTotalScore(String totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public String getTotalScore() {
            return this.totalScore;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setCvssFactor(String cvssFactor) {
            this.cvssFactor = cvssFactor;
            return this;
        }
        public String getCvssFactor() {
            return this.cvssFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setAssetsFactor(String assetsFactor) {
            this.assetsFactor = assetsFactor;
            return this;
        }
        public String getAssetsFactor() {
            return this.assetsFactor;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PrimaryId")
        public Long primaryId;

        @NameInMap("Os")
        public String os;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("LastTs")
        public Long lastTs;

        @NameInMap("OsRelease")
        public String osRelease;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("AbsolutePath")
        public String absolutePath;

        @NameInMap("RpmEntityList")
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        @NameInMap("cveList")
        public java.util.List<String> cveList;

        @NameInMap("Necessity")
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJson self = new DescribeVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAbsolutePath(String absolutePath) {
            this.absolutePath = absolutePath;
            return this;
        }
        public String getAbsolutePath() {
            return this.absolutePath;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setNecessity(DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity) {
            this.necessity = necessity;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity getNecessity() {
            return this.necessity;
        }

    }

    public static class DescribeVulListResponseBodyVulRecords extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        @NameInMap("ModifyTs")
        public Long modifyTs;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("PrimaryId")
        public Long primaryId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Related")
        public String related;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LastTs")
        public Long lastTs;

        @NameInMap("FirstTs")
        public Long firstTs;

        @NameInMap("Necessity")
        public String necessity;

        @NameInMap("RepairTs")
        public Long repairTs;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("ExtendContentJson")
        public DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        public static DescribeVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecords self = new DescribeVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeVulListResponseBodyVulRecords setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVulListResponseBodyVulRecords setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeVulListResponseBodyVulRecords setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecords setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
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

        public DescribeVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecords setRepairTs(Long repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public Long getRepairTs() {
            return this.repairTs;
        }

        public DescribeVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeVulListResponseBodyVulRecords setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeVulListResponseBodyVulRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecords setExtendContentJson(DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

    }

}
