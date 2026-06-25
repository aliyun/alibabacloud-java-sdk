// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The status of the interface or the POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of job templates.</p>
     */
    @NameInMap("Data")
    public ListJobsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of job templates was obtained. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The list was obtained.</p>
     * </li>
     * <li><p><strong>false</strong>: The list failed to be obtained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of job templates.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>The description of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The ID of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the last job was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522839</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        /**
         * <p>The CPU required for each instance, in millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><p><strong>500</strong></p>
         * </li>
         * <li><p><strong>1000</strong></p>
         * </li>
         * <li><p><strong>2000</strong></p>
         * </li>
         * <li><p><strong>4000</strong></p>
         * </li>
         * <li><p><strong>8000</strong></p>
         * </li>
         * <li><p><strong>16000</strong></p>
         * </li>
         * <li><p><strong>32000</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of failed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The image URL.</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>Indicates whether the last release order was successfully executed. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The release order failed to be executed.</p>
         * </li>
         * <li><p><strong>1</strong>: The release order was successfully executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LastChangeorderState")
        public String lastChangeorderState;

        /**
         * <p>The state of the last job. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Not executed.</p>
         * </li>
         * <li><p><strong>1</strong>: Successful.</p>
         * </li>
         * <li><p><strong>2</strong>: Failed.</p>
         * </li>
         * <li><p><strong>3</strong>: Running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastJobState")
        public String lastJobState;

        /**
         * <p>The time when the last job was started.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522800</p>
         */
        @NameInMap("LastStartTime")
        public Long lastStartTime;

        /**
         * <p>The memory required for each instance, in MB. The value cannot be 0. This parameter corresponds to the CPU parameter. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><p><strong>1024</strong>: corresponds to 500 and 1,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>2048</strong>: corresponds to 500, 1,000, and 2,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>4096</strong>: corresponds to 1,000, 2,000, and 4,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>8192</strong>: corresponds to 2,000, 4,000, and 8,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>12288</strong>: corresponds to 12,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>16384</strong>: corresponds to 4,000, 8,000, and 16,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>24576</strong>: corresponds to 12,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>32768</strong>: corresponds to 16,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>65536</strong>: corresponds to 8,000, 16,000, and 32,000 millicores of CPU.</p>
         * </li>
         * <li><p><strong>131072</strong>: corresponds to 32,000 millicores of CPU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>Additional information about the call.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:demo</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of successful instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Succeeded")
        public Long succeeded;

        /**
         * <p>Indicates whether the job template is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Suspend")
        public Boolean suspend;

        /**
         * <p>The tags of the job template.</p>
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

        public ListJobsResponseBodyDataApplications setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
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
         * <p>The list of job templates.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListJobsResponseBodyDataApplications> applications;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of job templates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
