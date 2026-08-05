// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StopOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5D56E988-A189-53A4-A0A6-C8D744B59775</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public StopOfflineTaskResponseBodyResult result;

    public static StopOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopOfflineTaskResponseBody self = new StopOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopOfflineTaskResponseBody setResult(StopOfflineTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public StopOfflineTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class StopOfflineTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The billing specification.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("computeResource")
        public String computeResource;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static StopOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResultMeta self = new StopOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResultMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public StopOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class StopOfflineTaskResponseBodyResultProcessors extends TeaModel {
        /**
         * <p>The input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;key&quot;: &quot;content&quot;
         * }</p>
         */
        @NameInMap("input")
        public java.util.Map<String, ?> input;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;processor1&quot;</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The processor processing parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;service_id&quot;: &quot;xxx&quot;
         * }</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("type")
        public String type;

        public static StopOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResultProcessors self = new StopOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public StopOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StopOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public StopOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StopOfflineTaskResponseBodyResultSink extends TeaModel {
        /**
         * <p>The name of the data sink.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The configuration parameters of the data sink.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The primary key field of the data sink.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("primaryKey")
        public String primaryKey;

        /**
         * <p>The schema of the data sink.</p>
         */
        @NameInMap("schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The type of the data sink.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("type")
        public String type;

        public static StopOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResultSink self = new StopOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StopOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public StopOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public StopOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public StopOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StopOfflineTaskResponseBodyResultSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The datasource config parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The primary key field of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("primaryKey")
        public String primaryKey;

        /**
         * <p>The schema of the data source.</p>
         */
        @NameInMap("schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("type")
        public String type;

        public static StopOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResultSource self = new StopOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StopOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public StopOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public StopOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public StopOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StopOfflineTaskResponseBodyResultStatus extends TeaModel {
        /**
         * <p>The time when the node was started.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The time when the node was stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("deleteTime")
        public Long deleteTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static StopOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResultStatus self = new StopOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResultStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public StopOfflineTaskResponseBodyResultStatus setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public StopOfflineTaskResponseBodyResultStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public StopOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class StopOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The metadata.</p>
         */
        @NameInMap("meta")
        public StopOfflineTaskResponseBodyResultMeta meta;

        /**
         * <p>The node processing parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;parameter1&quot;: {
         * &quot;key&quot;: &quot;value&quot;
         * },
         * &quot;parameter2&quot;: {
         * &quot;key&quot;: &quot;value&quot;
         * }
         * }</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The processing flow operators.</p>
         */
        @NameInMap("processors")
        public java.util.List<StopOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The data sink information.</p>
         */
        @NameInMap("sink")
        public java.util.List<StopOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The data source information.</p>
         */
        @NameInMap("source")
        public java.util.List<StopOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The node status.</p>
         */
        @NameInMap("status")
        public StopOfflineTaskResponseBodyResultStatus status;

        public static StopOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            StopOfflineTaskResponseBodyResult self = new StopOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public StopOfflineTaskResponseBodyResult setMeta(StopOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public StopOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public StopOfflineTaskResponseBodyResult setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public StopOfflineTaskResponseBodyResult setProcessors(java.util.List<StopOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<StopOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public StopOfflineTaskResponseBodyResult setSink(java.util.List<StopOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<StopOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public StopOfflineTaskResponseBodyResult setSource(java.util.List<StopOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<StopOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public StopOfflineTaskResponseBodyResult setStatus(StopOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public StopOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
