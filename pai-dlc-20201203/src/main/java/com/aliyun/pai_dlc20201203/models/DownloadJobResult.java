// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DownloadJobResult extends TeaModel {
    /**
     * <p>The display name of the download job.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the download job.</p>
     */
    @NameInMap("DownloadJobId")
    public String downloadJobId;

    /**
     * <p>A temporary, pre-signed URL for downloading the result file.</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The completion time of the download job, in UTC format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of file to download, such as <code>logs</code> or <code>output</code>.</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The creation time of the download job, in UTC format.</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The last modification time of the download job, in UTC format.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The number of log entries included in the download.</p>
     */
    @NameInMap("LogCount")
    public Integer logCount;

    /**
     * <p>The IDs of the pods for the source job.</p>
     */
    @NameInMap("PodIds")
    public java.util.List<String> podIds;

    /**
     * <p>The UIDs of the pods for the source job.</p>
     */
    @NameInMap("PodUids")
    public java.util.List<String> podUids;

    /**
     * <p>The ID of the source job whose results are downloaded.</p>
     */
    @NameInMap("SourceJobId")
    public String sourceJobId;

    /**
     * <p>The start time of the download job, in UTC format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the download job. Valid values: <code>Running</code>, <code>Succeeded</code>, and <code>Failed</code>.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the tenant that the job belongs to.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The type of the download job.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the download URL expires, in UTC format.</p>
     */
    @NameInMap("UrlExpireTime")
    public String urlExpireTime;

    /**
     * <p>The ID of the user who created the job.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace where the job was created.</p>
     */
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
