// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class StartOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CC93E65-6734-5060-BEF7-0EB0A4862BCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public StartOfflineTaskResponseBodyResult result;

    public static StartOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartOfflineTaskResponseBody self = new StartOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartOfflineTaskResponseBody setResult(StartOfflineTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public StartOfflineTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class StartOfflineTaskResponseBodyResultMeta extends TeaModel {
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
         * <p>taskName</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static StartOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResultMeta self = new StartOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResultMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public StartOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class StartOfflineTaskResponseBodyResultProcessors extends TeaModel {
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
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>processor1</p>
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
         * <p>The data sink type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("type")
        public String type;

        public static StartOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResultProcessors self = new StartOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public StartOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public StartOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartOfflineTaskResponseBodyResultSink extends TeaModel {
        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>milvus-ali-cn-hangzhou-1</p>
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
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ModuleRelation</p>
         */
        @NameInMap("type")
        public String type;

        public static StartOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResultSink self = new StartOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public StartOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public StartOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public StartOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartOfflineTaskResponseBodyResultSource extends TeaModel {
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

        public static StartOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResultSource self = new StartOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public StartOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public StartOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public StartOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartOfflineTaskResponseBodyResultStatus extends TeaModel {
        /**
         * <p>The task start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744941600000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The task stop time.</p>
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
         * <p>The request status.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("status")
        public String status;

        public static StartOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResultStatus self = new StartOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResultStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public StartOfflineTaskResponseBodyResultStatus setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public StartOfflineTaskResponseBodyResultStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public StartOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class StartOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The metadata.</p>
         */
        @NameInMap("meta")
        public StartOfflineTaskResponseBodyResultMeta meta;

        /**
         * <p>The task processing parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;parameter1&quot;: {
         *        &quot;key&quot;: &quot;value&quot;
         *     },
         *     &quot;parameter2&quot;: {
         *          &quot;key&quot;: &quot;value&quot;
         *      }
         * }</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The processing operators.</p>
         */
        @NameInMap("processors")
        public java.util.List<StartOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The data sink information.</p>
         */
        @NameInMap("sink")
        public java.util.List<StartOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The source.</p>
         */
        @NameInMap("source")
        public java.util.List<StartOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PENDING: In progress.</li>
         * <li>SUCCESS: Parsing succeeded.</li>
         * <li>FAILED: Parsing failed.</li>
         * </ul>
         */
        @NameInMap("status")
        public StartOfflineTaskResponseBodyResultStatus status;

        public static StartOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            StartOfflineTaskResponseBodyResult self = new StartOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public StartOfflineTaskResponseBodyResult setMeta(StartOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public StartOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public StartOfflineTaskResponseBodyResult setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public StartOfflineTaskResponseBodyResult setProcessors(java.util.List<StartOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<StartOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public StartOfflineTaskResponseBodyResult setSink(java.util.List<StartOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<StartOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public StartOfflineTaskResponseBodyResult setSource(java.util.List<StartOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<StartOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public StartOfflineTaskResponseBodyResult setStatus(StartOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public StartOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
