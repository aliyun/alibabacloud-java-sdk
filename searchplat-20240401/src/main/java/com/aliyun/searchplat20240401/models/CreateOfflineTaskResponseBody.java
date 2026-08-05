// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B7C901ED-2BC1-5CFB-BE23-242DE5E3BA5C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("result")
    public CreateOfflineTaskResponseBodyResult result;

    public static CreateOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOfflineTaskResponseBody self = new CreateOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOfflineTaskResponseBody setResult(CreateOfflineTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateOfflineTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateOfflineTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The billing specification.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("computeResource")
        public String computeResource;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static CreateOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResultMeta self = new CreateOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResultMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public CreateOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateOfflineTaskResponseBodyResultProcessors extends TeaModel {
        /**
         * <p>The input parameters.</p>
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
         * <p>The processor parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;service_id&quot;: &quot;xxx&quot;
         * }</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;document-analyze&quot;</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResultProcessors self = new CreateOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public CreateOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskResponseBodyResultSink extends TeaModel {
        /**
         * <p>The data sink name.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data sink configuration parameters, which are determined by the type.</p>
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
         * <p>The data sink schema.</p>
         */
        @NameInMap("schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The data sink type.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResultSink self = new CreateOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public CreateOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public CreateOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskResponseBodyResultSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The datasource config parameters, which are determined by the type.</p>
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
         * <p>The data source schema.</p>
         */
        @NameInMap("schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResultSource self = new CreateOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public CreateOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public CreateOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskResponseBodyResultStatus extends TeaModel {
        /**
         * <p>The task start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The task stop time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("deleteTime")
        public String deleteTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResultStatus self = new CreateOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResultStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateOfflineTaskResponseBodyResultStatus setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public CreateOfflineTaskResponseBodyResultStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The task metadata.</p>
         */
        @NameInMap("meta")
        public CreateOfflineTaskResponseBodyResultMeta meta;

        /**
         * <p>The task processing parameters.</p>
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
         * <p>The processing pipeline operators.</p>
         */
        @NameInMap("processors")
        public java.util.List<CreateOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The output destination information.</p>
         */
        @NameInMap("sink")
        public java.util.List<CreateOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The data source information.</p>
         */
        @NameInMap("source")
        public java.util.List<CreateOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The task status.</p>
         */
        @NameInMap("status")
        public CreateOfflineTaskResponseBodyResultStatus status;

        public static CreateOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskResponseBodyResult self = new CreateOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskResponseBodyResult setMeta(CreateOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public CreateOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public CreateOfflineTaskResponseBodyResult setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskResponseBodyResult setProcessors(java.util.List<CreateOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<CreateOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public CreateOfflineTaskResponseBodyResult setSink(java.util.List<CreateOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<CreateOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public CreateOfflineTaskResponseBodyResult setSource(java.util.List<CreateOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<CreateOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public CreateOfflineTaskResponseBodyResult setStatus(CreateOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public CreateOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
