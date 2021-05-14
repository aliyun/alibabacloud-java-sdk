// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeImageVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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
        @NameInMap("MatchList")
        public String matchList;

        @NameInMap("Layer")
        public String layer;

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

        public static DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchList(String matchList) {
            this.matchList = matchList;
            return this;
        }
        public String getMatchList() {
            return this.matchList;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

    }

    public static class DescribeImageVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        @NameInMap("OsRelease")
        public String osRelease;

        @NameInMap("Os")
        public String os;

        @NameInMap("RpmEntityList")
        public java.util.List<DescribeImageVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        public static DescribeImageVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecordsExtendContentJson self = new DescribeImageVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
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
        @NameInMap("CanUpdate")
        public Boolean canUpdate;

        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ModifyTs")
        public Long modifyTs;

        @NameInMap("ImageDigest")
        public String imageDigest;

        @NameInMap("PrimaryId")
        public Long primaryId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Related")
        public String related;

        @NameInMap("FirstTs")
        public Long firstTs;

        @NameInMap("LastTs")
        public Long lastTs;

        @NameInMap("Necessity")
        public String necessity;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Layers")
        public java.util.List<String> layers;

        @NameInMap("ExtendContentJson")
        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        public static DescribeImageVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulListResponseBodyVulRecords self = new DescribeImageVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulListResponseBodyVulRecords setCanUpdate(Boolean canUpdate) {
            this.canUpdate = canUpdate;
            return this;
        }
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        public DescribeImageVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeImageVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setImageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public String getImageDigest() {
            return this.imageDigest;
        }

        public DescribeImageVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeImageVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeImageVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeImageVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeImageVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeImageVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulListResponseBodyVulRecords setLayers(java.util.List<String> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<String> getLayers() {
            return this.layers;
        }

        public DescribeImageVulListResponseBodyVulRecords setExtendContentJson(DescribeImageVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeImageVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

    }

}
