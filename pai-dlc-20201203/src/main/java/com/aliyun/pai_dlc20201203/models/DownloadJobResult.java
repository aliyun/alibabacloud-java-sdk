// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DownloadJobResult extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("DownloadJobId")
    public String downloadJobId;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("GmtCreated")
    public String gmtCreated;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("LogCount")
    public Integer logCount;

    @NameInMap("PodIds")
    public java.util.List<String> podIds;

    @NameInMap("PodUids")
    public java.util.List<String> podUids;

    @NameInMap("SourceJobId")
    public String sourceJobId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UrlExpireTime")
    public String urlExpireTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DownloadJobResult build(java.util.Map<String, ?> map) throws Exception {
        DownloadJobResult self = new DownloadJobResult();
        return TeaModel.build(map, self);
    }

    public DownloadJobResult setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DownloadJobResult setDownloadJobId(String downloadJobId) {
        this.downloadJobId = downloadJobId;
        return this;
    }
    public String getDownloadJobId() {
        return this.downloadJobId;
    }

    public DownloadJobResult setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DownloadJobResult setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadJobResult setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DownloadJobResult setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DownloadJobResult setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DownloadJobResult setLogCount(Integer logCount) {
        this.logCount = logCount;
        return this;
    }
    public Integer getLogCount() {
        return this.logCount;
    }

    public DownloadJobResult setPodIds(java.util.List<String> podIds) {
        this.podIds = podIds;
        return this;
    }
    public java.util.List<String> getPodIds() {
        return this.podIds;
    }

    public DownloadJobResult setPodUids(java.util.List<String> podUids) {
        this.podUids = podUids;
        return this;
    }
    public java.util.List<String> getPodUids() {
        return this.podUids;
    }

    public DownloadJobResult setSourceJobId(String sourceJobId) {
        this.sourceJobId = sourceJobId;
        return this;
    }
    public String getSourceJobId() {
        return this.sourceJobId;
    }

    public DownloadJobResult setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadJobResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DownloadJobResult setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadJobResult setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DownloadJobResult setUrlExpireTime(String urlExpireTime) {
        this.urlExpireTime = urlExpireTime;
        return this;
    }
    public String getUrlExpireTime() {
        return this.urlExpireTime;
    }

    public DownloadJobResult setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DownloadJobResult setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
