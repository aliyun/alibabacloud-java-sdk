// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsResponseBody extends TeaModel {
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
     * <p>The logging configurations.</p>
     */
    @NameInMap("Data")
    public ListLogConfigsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the logging configurations of an application were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the configurations were obtained.</p>
     * <p>*   **false**: indicates that the configurations could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListLogConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogConfigsResponseBody self = new ListLogConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLogConfigsResponseBody setData(ListLogConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLogConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListLogConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLogConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLogConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLogConfigsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListLogConfigsResponseBodyDataLogConfigs extends TeaModel {
        /**
         * <p>The name of the Log Service configuration.</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>The time when the configuration was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The path of logs.</p>
         */
        @NameInMap("LogDir")
        public String logDir;

        /**
         * <p>The type of the log. Set this value to **file_log**.</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the Logstore in Log Service.</p>
         */
        @NameInMap("SlsLogStore")
        public String slsLogStore;

        /**
         * <p>The ID of the Log Service project.</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The storage type of logs.</p>
         */
        @NameInMap("StoreType")
        public String storeType;

        public static ListLogConfigsResponseBodyDataLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListLogConfigsResponseBodyDataLogConfigs self = new ListLogConfigsResponseBodyDataLogConfigs();
            return TeaModel.build(map, self);
        }

        public ListLogConfigsResponseBodyDataLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setLogDir(String logDir) {
            this.logDir = logDir;
            return this;
        }
        public String getLogDir() {
            return this.logDir;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setSlsLogStore(String slsLogStore) {
            this.slsLogStore = slsLogStore;
            return this;
        }
        public String getSlsLogStore() {
            return this.slsLogStore;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public ListLogConfigsResponseBodyDataLogConfigs setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

    }

    public static class ListLogConfigsResponseBodyData extends TeaModel {
        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The details of logging configurations.</p>
         */
        @NameInMap("LogConfigs")
        public java.util.List<ListLogConfigsResponseBodyDataLogConfigs> logConfigs;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListLogConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLogConfigsResponseBodyData self = new ListLogConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLogConfigsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListLogConfigsResponseBodyData setLogConfigs(java.util.List<ListLogConfigsResponseBodyDataLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<ListLogConfigsResponseBodyDataLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public ListLogConfigsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLogConfigsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
