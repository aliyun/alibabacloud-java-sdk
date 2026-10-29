// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppInstallationsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application, which corresponds to a unique application package.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The version of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The start time of the time range filter. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-02T02:18:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number of the list to query. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the patch package. This parameter is supported only in Windows scenarios. If you enter origin, only the original version is filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>patch-7bdf679812484df08a956b73e0b3bdf6</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The ID of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>project-b93ea81de76f48609eed3cd420f0399f</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The cloud application service instance ID, which is used to query the cloud applications installed on the specified instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The start time of the time range filter. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-26T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListCloudAppInstallationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppInstallationsRequest self = new ListCloudAppInstallationsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAppInstallationsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCloudAppInstallationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListCloudAppInstallationsRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ListCloudAppInstallationsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCloudAppInstallationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppInstallationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppInstallationsRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public ListCloudAppInstallationsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListCloudAppInstallationsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListCloudAppInstallationsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
