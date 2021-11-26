// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLogConfigsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LogDir")
        public String logDir;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SlsLogStore")
        public String slsLogStore;

        @NameInMap("SlsProject")
        public String slsProject;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LogConfigs")
        public java.util.List<ListLogConfigsResponseBodyDataLogConfigs> logConfigs;

        @NameInMap("PageSize")
        public Integer pageSize;

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
