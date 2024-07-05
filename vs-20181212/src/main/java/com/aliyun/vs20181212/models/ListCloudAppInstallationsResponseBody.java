// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppInstallationsResponseBody extends TeaModel {
    @NameInMap("InstallationInfos")
    public java.util.List<ListCloudAppInstallationsResponseBodyInstallationInfos> installationInfos;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudAppInstallationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppInstallationsResponseBody self = new ListCloudAppInstallationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAppInstallationsResponseBody setInstallationInfos(java.util.List<ListCloudAppInstallationsResponseBodyInstallationInfos> installationInfos) {
        this.installationInfos = installationInfos;
        return this;
    }
    public java.util.List<ListCloudAppInstallationsResponseBodyInstallationInfos> getInstallationInfos() {
        return this.installationInfos;
    }

    public ListCloudAppInstallationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudAppInstallationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCloudAppInstallationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAppInstallationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAppInstallationsResponseBodyInstallationInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>com.aaa.bbb</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1.5.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>2024-05-28T14:48:34+08:00</p>
         */
        @NameInMap("InstallationTime")
        public String installationTime;

        /**
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>installed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>install success</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <strong>example:</strong>
         * <p>2024-05-28T14:50:04+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListCloudAppInstallationsResponseBodyInstallationInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAppInstallationsResponseBodyInstallationInfos self = new ListCloudAppInstallationsResponseBodyInstallationInfos();
            return TeaModel.build(map, self);
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setInstallationTime(String installationTime) {
            this.installationTime = installationTime;
            return this;
        }
        public String getInstallationTime() {
            return this.installationTime;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public ListCloudAppInstallationsResponseBodyInstallationInfos setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
