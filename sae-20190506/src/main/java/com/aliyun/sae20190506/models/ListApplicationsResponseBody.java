// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>Queries applications.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>20</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("Data")
    public ListApplicationsResponseBodyData data;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>20</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>cn-beijing:demo</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>1</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>demo-app</p>
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
         * <p>appName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The key of the tag.</p>
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
         * <p>demo-app</p>
         */
        @NameInMap("AppDeletingStatus")
        public Boolean appDeletingStatus;

        /**
         * <p>\[{"key":"key","value":"value"}]</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The total number of applications.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The total number of applications.</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>demo-app</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>cn-beijing:demo</p>
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

        public ListApplicationsResponseBodyDataApplications setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListApplicationsResponseBodyDataApplications setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationsResponseBodyDataApplications setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
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
         * <p>The description of the application.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationsResponseBodyDataApplications> applications;

        /**
         * <p>The number of application instances.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The tags of the application.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information about applications.</p>
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
