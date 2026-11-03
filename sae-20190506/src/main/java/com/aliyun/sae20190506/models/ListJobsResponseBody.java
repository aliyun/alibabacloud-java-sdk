// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success</li>
     * <li><strong>3xx</strong>: redirection</li>
     * <li><strong>4xx</strong>: client error</li>
     * <li><strong>5xx</strong>: server error</li>
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
     * <p>The error code. Take note of the following items:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidAppId.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the operation result.</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the job template list was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
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
         * <p>The completion time of the last job.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522839</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        /**
         * <p>The CPU required for each instance. Unit: millicores. The value cannot be 0. Currently, only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
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
         * 
         * <strong>example:</strong>
         * <p>registry.cn-beijing.aliyuncs.com/sae-dev-test/nginx:stable</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>Specifies whether the last change order was executed successfully. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The change order failed.</li>
         * <li><strong>1</strong>: The change order succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LastChangeorderState")
        public String lastChangeorderState;

        /**
         * <p>The running status of the last job. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not executed</li>
         * <li><strong>1</strong>: executed successfully</li>
         * <li><strong>2</strong>: execution failed</li>
         * <li><strong>3</strong>: executing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LastJobState")
        public String lastJobState;

        /**
         * <p>The start time of the last job.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522800</p>
         */
        @NameInMap("LastStartTime")
        public Long lastStartTime;

        /**
         * <p>The memory required for each instance. Unit: MB. The value cannot be 0. The memory has a one-to-one mapping with the CPU. Currently, only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: corresponds to 500 and 1000 millicores</li>
         * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores</li>
         * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores</li>
         * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores</li>
         * <li><strong>12288</strong>: corresponds to 12000 millicores</li>
         * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores</li>
         * <li><strong>24576</strong>: corresponds to 12000 millicores</li>
         * <li><strong>32768</strong>: corresponds to 16000 millicores</li>
         * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores</li>
         * <li><strong>131072</strong>: corresponds to 32000 millicores</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The additional information about the operation result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the namespace.</p>
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
         * <p>Specifies whether the job template is paused.</p>
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
