// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppsResponseBody extends TeaModel {
    /**
     * <p>The list of cloud applications.</p>
     */
    @NameInMap("CloudApps")
    public java.util.List<ListCloudAppsResponseBodyCloudApps> cloudApps;

    /**
     * <p>The page number of the returned list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The Settings for the number of entries returned on each page during paging for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud applications that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppsResponseBody self = new ListCloudAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAppsResponseBody setCloudApps(java.util.List<ListCloudAppsResponseBodyCloudApps> cloudApps) {
        this.cloudApps = cloudApps;
        return this;
    }
    public java.util.List<ListCloudAppsResponseBodyCloudApps> getCloudApps() {
        return this.cloudApps;
    }

    public ListCloudAppsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAppsResponseBodyCloudApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
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
         * <p>1.5.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The format of the installation package.</p>
         * 
         * <strong>example:</strong>
         * <p>apk</p>
         */
        @NameInMap("PkgFormat")
        public String pkgFormat;

        /**
         * <p>The type of the installation package, such as android or win.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("PkgType")
        public String pkgType;

        /**
         * <p>The relative path of the post-command in the application package. This parameter is supported only for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>install.ps1</p>
         */
        @NameInMap("PostCommandPath")
        public String postCommandPath;

        /**
         * <p>The timeout period for executing the post-command, in seconds. This parameter is supported only for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PostCommandTimeoutSec")
        public Integer postCommandTimeoutSec;

        /**
         * <p>The ID of the stable patch package.</p>
         * 
         * <strong>example:</strong>
         * <p>patch-7bdf679812484df08a956b73e0b3bdf6</p>
         */
        @NameInMap("StablePatchId")
        public String stablePatchId;

        /**
         * <p>The upload status of the application. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Doing</li>
         * <li>Success: This is a final state.</li>
         * <li>Failed: This is a final state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>upload success</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>The time when the status was last updated. The time is displayed in the ISO 8601 standard with a time zone offset, in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-28T14:48:34+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the application was uploaded. The time is displayed in the ISO 8601 standard with a time zone offset, in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-28T14:28:14+08:00</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static ListCloudAppsResponseBodyCloudApps build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAppsResponseBodyCloudApps self = new ListCloudAppsResponseBodyCloudApps();
            return TeaModel.build(map, self);
        }

        public ListCloudAppsResponseBodyCloudApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCloudAppsResponseBodyCloudApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCloudAppsResponseBodyCloudApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListCloudAppsResponseBodyCloudApps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudAppsResponseBodyCloudApps setPkgFormat(String pkgFormat) {
            this.pkgFormat = pkgFormat;
            return this;
        }
        public String getPkgFormat() {
            return this.pkgFormat;
        }

        public ListCloudAppsResponseBodyCloudApps setPkgType(String pkgType) {
            this.pkgType = pkgType;
            return this;
        }
        public String getPkgType() {
            return this.pkgType;
        }

        public ListCloudAppsResponseBodyCloudApps setPostCommandPath(String postCommandPath) {
            this.postCommandPath = postCommandPath;
            return this;
        }
        public String getPostCommandPath() {
            return this.postCommandPath;
        }

        public ListCloudAppsResponseBodyCloudApps setPostCommandTimeoutSec(Integer postCommandTimeoutSec) {
            this.postCommandTimeoutSec = postCommandTimeoutSec;
            return this;
        }
        public Integer getPostCommandTimeoutSec() {
            return this.postCommandTimeoutSec;
        }

        public ListCloudAppsResponseBodyCloudApps setStablePatchId(String stablePatchId) {
            this.stablePatchId = stablePatchId;
            return this;
        }
        public String getStablePatchId() {
            return this.stablePatchId;
        }

        public ListCloudAppsResponseBodyCloudApps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudAppsResponseBodyCloudApps setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public ListCloudAppsResponseBodyCloudApps setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudAppsResponseBodyCloudApps setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
