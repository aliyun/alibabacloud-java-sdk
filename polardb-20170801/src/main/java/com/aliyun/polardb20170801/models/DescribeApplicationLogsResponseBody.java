// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Items")
    public DescribeApplicationLogsResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeApplicationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationLogsResponseBody self = new DescribeApplicationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationLogsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationLogsResponseBody setItems(DescribeApplicationLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeApplicationLogsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeApplicationLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationLogsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationLogsResponseBodyItemsLogRecords extends TeaModel {
        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Content")
        public String content;

        @NameInMap("Date")
        public String date;

        @NameInMap("FileLine")
        public String fileLine;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FullFilePath")
        public String fullFilePath;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("LogLevelId")
        public Long logLevelId;

        @NameInMap("LogLevelName")
        public String logLevelName;

        @NameInMap("Method")
        public String method;

        @NameInMap("Name")
        public String name;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("RuntimeVersion")
        public String runtimeVersion;

        @NameInMap("Time")
        public String time;

        public static DescribeApplicationLogsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationLogsResponseBodyItemsLogRecords self = new DescribeApplicationLogsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setFileLine(String fileLine) {
            this.fileLine = fileLine;
            return this;
        }
        public String getFileLine() {
            return this.fileLine;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setFullFilePath(String fullFilePath) {
            this.fullFilePath = fullFilePath;
            return this;
        }
        public String getFullFilePath() {
            return this.fullFilePath;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setLogLevelId(Long logLevelId) {
            this.logLevelId = logLevelId;
            return this;
        }
        public Long getLogLevelId() {
            return this.logLevelId;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setLogLevelName(String logLevelName) {
            this.logLevelName = logLevelName;
            return this;
        }
        public String getLogLevelName() {
            return this.logLevelName;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeApplicationLogsResponseBodyItemsLogRecords setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeApplicationLogsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeApplicationLogsResponseBodyItemsLogRecords> logRecords;

        public static DescribeApplicationLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationLogsResponseBodyItems self = new DescribeApplicationLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationLogsResponseBodyItems setLogRecords(java.util.List<DescribeApplicationLogsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeApplicationLogsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}
