// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information about applications.</p>
     */
    @NameInMap("Data")
    public ListApplicationsResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <br>
     * <p>- The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>- The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of applications was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the list was obtained.</p>
     * <p>*   **false**: indicates that the list could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of applications.</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationsResponseBody setData(ListApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApplicationsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListApplicationsResponseBodyDataApplicationsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListApplicationsResponseBodyDataApplicationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplicationsTags self = new ListApplicationsResponseBodyDataApplicationsTags();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplicationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListApplicationsResponseBodyDataApplicationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListApplicationsResponseBodyDataApplications extends TeaModel {
        /**
         * <p>Indicates whether the application is being deleted. Valid values:</p>
         * <br>
         * <p>*   **true**: The application is being deleted.</p>
         * <p>*   **false**: The application is not being deleted.</p>
         */
        @NameInMap("AppDeletingStatus")
        public Boolean appDeletingStatus;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of application instances.</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The tags of the application.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsTags> tags;

        public static ListApplicationsResponseBodyDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplications self = new ListApplicationsResponseBodyDataApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplications setAppDeletingStatus(Boolean appDeletingStatus) {
            this.appDeletingStatus = appDeletingStatus;
            return this;
        }
        public Boolean getAppDeletingStatus() {
            return this.appDeletingStatus;
        }

        public ListApplicationsResponseBodyDataApplications setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListApplicationsResponseBodyDataApplications setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyDataApplications setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseBodyDataApplications setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationsResponseBodyDataApplications setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListApplicationsResponseBodyDataApplications setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationsResponseBodyDataApplications setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public ListApplicationsResponseBodyDataApplications setTags(java.util.List<ListApplicationsResponseBodyDataApplicationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplicationsTags> getTags() {
            return this.tags;
        }

    }

    public static class ListApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The list of applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationsResponseBodyDataApplications> applications;

        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of applications.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyData self = new ListApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyData setApplications(java.util.List<ListApplicationsResponseBodyDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListApplicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApplicationsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
