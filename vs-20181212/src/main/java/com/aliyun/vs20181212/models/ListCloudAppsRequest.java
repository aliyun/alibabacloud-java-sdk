// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application. This ID corresponds to a unique application package.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Application name.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aaa.bbb</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Application version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The time range filter parameter. Express it in ISO8601 standard format, using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-30T02:23:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Return only the latest submitted version of the application. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LatestVersionOnly")
    public Boolean latestVersionOnly;

    /**
     * <p>The page number for the query list. The starting value is 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of rows per page for paged queries. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Valid values:</p>
     * <ol>
     * <li><p>Valid values:
     * a. hot
     * b. game
     * c. app</p>
     * </li>
     * <li><p>Special case:a. To list applications that have no tags, enter NULL.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("PkgLabel")
    public String pkgLabel;

    /**
     * <p>The package type. Valid values:</p>
     * <ol>
     * <li><p>android</p>
     * </li>
     * <li><p>win</p>
     * </li>
     * <li><p>android_appmarket</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PkgType")
    public String pkgType;

    /**
     * <p>The time range filter parameter. Express it in ISO8601 standard format, using UTC time: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-29T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The application upload status. Valid values:</p>
     * <ol>
     * <li><p>Success: The desired state, indicating success.</p>
     * </li>
     * <li><p>Failed: The desired state, indicating failure.</p>
     * </li>
     * <li><p>Created</p>
     * </li>
     * <li><p>Doing</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCloudAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppsRequest self = new ListCloudAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAppsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCloudAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListCloudAppsRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ListCloudAppsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCloudAppsRequest setLatestVersionOnly(Boolean latestVersionOnly) {
        this.latestVersionOnly = latestVersionOnly;
        return this;
    }
    public Boolean getLatestVersionOnly() {
        return this.latestVersionOnly;
    }

    public ListCloudAppsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppsRequest setPkgLabel(String pkgLabel) {
        this.pkgLabel = pkgLabel;
        return this;
    }
    public String getPkgLabel() {
        return this.pkgLabel;
    }

    public ListCloudAppsRequest setPkgType(String pkgType) {
        this.pkgType = pkgType;
        return this;
    }
    public String getPkgType() {
        return this.pkgType;
    }

    public ListCloudAppsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListCloudAppsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
