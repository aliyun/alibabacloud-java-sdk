// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
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
     * <p>The information about the file logs.</p>
     */
    @NameInMap("Data")
    public ListLogConfigsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> list in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of application logs was obtained. Valid values:</p>
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
     * <p>The trace ID of the request. You can use the trace ID to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1d5e2c15671581252413581d****</p>
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
         * <p>The name of the Simple Log Service configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-1f240907a6faf58c653f09e81b7e****</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>The time when the log configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-29 17:18:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The path of the log file. This is the log source.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/logs/hsf/hsf.log</p>
         */
        @NameInMap("LogDir")
        public String logDir;

        /**
         * <p>The log type. Only <strong>file_log</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>file_log</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the Logstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-1f240907a6faf58c653f09e81b7e****</p>
         */
        @NameInMap("SlsLogStore")
        public String slsLogStore;

        /**
         * <p>The ID of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-56f77b65-788d-442a-9885-7f20d91f****</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The storage class for Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The log configurations.</p>
         */
        @NameInMap("LogConfigs")
        public java.util.List<ListLogConfigsResponseBodyDataLogConfigs> logConfigs;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
