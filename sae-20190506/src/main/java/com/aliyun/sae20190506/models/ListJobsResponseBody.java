// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The job templates.</p>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <br>
     * <p>*   If the call is successful, **ErrorCode** is not returned.</p>
     * <p>*   If the call fails, **ErrorCode** is returned. For more information, see the "**Error codes**" section in this topic.</p>
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
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the applications were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of job templates.</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListJobsResponseBody setData(ListJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobsResponseBodyData getData() {
        return this.data;
    }

    public ListJobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListJobsResponseBodyDataApplicationsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListJobsResponseBodyDataApplicationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataApplicationsTags self = new ListJobsResponseBodyDataApplicationsTags();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataApplicationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobsResponseBodyDataApplicationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobsResponseBodyDataApplications extends TeaModel {
        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>The description of the job template.</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The ID of the job template.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the job template.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the job was last completed.</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of instances that failed to run.</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>Indicates whether the latest change order was executed. Valid values:</p>
         * <br>
         * <p>*   **0**: The latest change order failed to be executed.</p>
         * <p>*   **1**: The latest change order was executed.</p>
         */
        @NameInMap("LastChangeorderState")
        public String lastChangeorderState;

        /**
         * <p>The running status of the latest job. Valid values:</p>
         * <br>
         * <p>*   **0**: The job is not executed.</p>
         * <p>*   **1**: The job was executed.</p>
         * <p>*   **2**: The job failed to be executed.</p>
         * <p>*   **3**: The job is being executed.</p>
         */
        @NameInMap("LastJobState")
        public String lastJobState;

        /**
         * <p>The time when the job was last started.</p>
         */
        @NameInMap("LastStartTime")
        public Long lastStartTime;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("Message")
        public String message;

        /**
         * <p>The namespace ID.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of instances that were successfully run.</p>
         */
        @NameInMap("Succeeded")
        public Long succeeded;

        /**
         * <p>Indicates whether the job template is suspended.</p>
         */
        @NameInMap("Suspend")
        public Boolean suspend;

        /**
         * <p>The tag of the job template.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListJobsResponseBodyDataApplicationsTags> tags;

        @NameInMap("TriggerConfig")
        public String triggerConfig;

        public static ListJobsResponseBodyDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyDataApplications self = new ListJobsResponseBodyDataApplications();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyDataApplications setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public ListJobsResponseBodyDataApplications setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListJobsResponseBodyDataApplications setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListJobsResponseBodyDataApplications setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListJobsResponseBodyDataApplications setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public ListJobsResponseBodyDataApplications setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListJobsResponseBodyDataApplications setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListJobsResponseBodyDataApplications setLastChangeorderState(String lastChangeorderState) {
            this.lastChangeorderState = lastChangeorderState;
            return this;
        }
        public String getLastChangeorderState() {
            return this.lastChangeorderState;
        }

        public ListJobsResponseBodyDataApplications setLastJobState(String lastJobState) {
            this.lastJobState = lastJobState;
            return this;
        }
        public String getLastJobState() {
            return this.lastJobState;
        }

        public ListJobsResponseBodyDataApplications setLastStartTime(Long lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public Long getLastStartTime() {
            return this.lastStartTime;
        }

        public ListJobsResponseBodyDataApplications setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListJobsResponseBodyDataApplications setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListJobsResponseBodyDataApplications setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListJobsResponseBodyDataApplications setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListJobsResponseBodyDataApplications setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

        public ListJobsResponseBodyDataApplications setSuspend(Boolean suspend) {
            this.suspend = suspend;
            return this;
        }
        public Boolean getSuspend() {
            return this.suspend;
        }

        public ListJobsResponseBodyDataApplications setTags(java.util.List<ListJobsResponseBodyDataApplicationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataApplicationsTags> getTags() {
            return this.tags;
        }

        public ListJobsResponseBodyDataApplications setTriggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class ListJobsResponseBodyData extends TeaModel {
        /**
         * <p>The job templates.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListJobsResponseBodyDataApplications> applications;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of job templates.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyData self = new ListJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyData setApplications(java.util.List<ListJobsResponseBodyDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListJobsResponseBodyDataApplications> getApplications() {
            return this.applications;
        }

        public ListJobsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
