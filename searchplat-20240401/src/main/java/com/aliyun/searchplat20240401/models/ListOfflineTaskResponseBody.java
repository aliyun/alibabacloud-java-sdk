// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>786CC01F-0F1D-5FB5-8BFF-B0F3DB289772</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListOfflineTaskResponseBodyResult> result;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskResponseBody self = new ListOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOfflineTaskResponseBody setResult(java.util.List<ListOfflineTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOfflineTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOfflineTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOfflineTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The list of labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The region ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>jly-fesOffline-172.16.8.133-20912</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2192861158</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResultMeta self = new ListOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResultMeta setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ListOfflineTaskResponseBodyResultMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListOfflineTaskResponseBodyResultMeta setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListOfflineTaskResponseBodyResultProcessors extends TeaModel {
        /**
         * <p>The input parameters.</p>
         */
        @NameInMap("Input")
        public java.util.Map<String, String> input;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>processor1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameters.</p>
         */
        @NameInMap("Output")
        public java.util.Map<String, String> output;

        /**
         * <p>The processor parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResultProcessors self = new ListOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, String> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, String> getInput() {
            return this.input;
        }

        public ListOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOfflineTaskResponseBodyResultProcessors setOutput(java.util.Map<String, String> output) {
            this.output = output;
            return this;
        }
        public java.util.Map<String, String> getOutput() {
            return this.output;
        }

        public ListOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ListOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListOfflineTaskResponseBodyResultSink extends TeaModel {
        /**
         * <p>The data sink name.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data sink configuration parameters, which are determined by the type.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The primary key field of the data sink.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The data sink schema.</p>
         */
        @NameInMap("Schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The data sink type.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResultSink self = new ListOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ListOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ListOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ListOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListOfflineTaskResponseBodyResultSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data source configuration parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The primary key field of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The data source schema.</p>
         */
        @NameInMap("Schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResultSource self = new ListOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ListOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ListOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ListOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListOfflineTaskResponseBodyResultStatus extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The monitoring information.</p>
         */
        @NameInMap("MetricData")
        public java.util.Map<String, String> metricData;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResultStatus self = new ListOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResultStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOfflineTaskResponseBodyResultStatus setMetricData(java.util.Map<String, String> metricData) {
            this.metricData = metricData;
            return this;
        }
        public java.util.Map<String, String> getMetricData() {
            return this.metricData;
        }

        public ListOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOfflineTaskResponseBodyResultStatus setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The task metadata.</p>
         */
        @NameInMap("Meta")
        public ListOfflineTaskResponseBodyResultMeta meta;

        /**
         * <p>The processing pipeline operators.</p>
         */
        @NameInMap("Processors")
        public java.util.List<ListOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The data sink information.</p>
         */
        @NameInMap("Sink")
        public java.util.List<ListOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The data source information.</p>
         */
        @NameInMap("Source")
        public java.util.List<ListOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The task status.</p>
         */
        @NameInMap("Status")
        public ListOfflineTaskResponseBodyResultStatus status;

        public static ListOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOfflineTaskResponseBodyResult self = new ListOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOfflineTaskResponseBodyResult setMeta(ListOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ListOfflineTaskResponseBodyResult setProcessors(java.util.List<ListOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<ListOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public ListOfflineTaskResponseBodyResult setSink(java.util.List<ListOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<ListOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public ListOfflineTaskResponseBodyResult setSource(java.util.List<ListOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<ListOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public ListOfflineTaskResponseBodyResult setStatus(ListOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public ListOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
