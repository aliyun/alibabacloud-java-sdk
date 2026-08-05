// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0abb793917165176014887584e28d9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public ModifyOfflineTaskResponseBodyResult result;

    public static ModifyOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskResponseBody self = new ModifyOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyOfflineTaskResponseBody setResult(ModifyOfflineTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyOfflineTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyOfflineTaskResponseBodyResultMeta extends TeaModel {
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

        public static ModifyOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResultMeta self = new ModifyOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResultMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public ModifyOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ModifyOfflineTaskResponseBodyResultProcessors extends TeaModel {
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
         * <p>processor1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The processor parameters.</p>
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
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("type")
        public String type;

        public static ModifyOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResultProcessors self = new ModifyOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public ModifyOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskResponseBodyResultSink extends TeaModel {
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

        public static ModifyOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResultSink self = new ModifyOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ModifyOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ModifyOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskResponseBodyResultSource extends TeaModel {
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

        public static ModifyOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResultSource self = new ModifyOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ModifyOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ModifyOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskResponseBodyResultStatus extends TeaModel {
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

        public static ModifyOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResultStatus self = new ModifyOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResultStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyOfflineTaskResponseBodyResultStatus setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public ModifyOfflineTaskResponseBodyResultStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ModifyOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The metadata.</p>
         */
        @NameInMap("meta")
        public ModifyOfflineTaskResponseBodyResultMeta meta;

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
         * <p>The processing flow operators.</p>
         */
        @NameInMap("processors")
        public java.util.List<ModifyOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The data sink information.</p>
         */
        @NameInMap("sink")
        public java.util.List<ModifyOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The data source information.</p>
         */
        @NameInMap("source")
        public java.util.List<ModifyOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The task status.</p>
         */
        @NameInMap("status")
        public ModifyOfflineTaskResponseBodyResultStatus status;

        public static ModifyOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskResponseBodyResult self = new ModifyOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskResponseBodyResult setMeta(ModifyOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public ModifyOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public ModifyOfflineTaskResponseBodyResult setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskResponseBodyResult setProcessors(java.util.List<ModifyOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<ModifyOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public ModifyOfflineTaskResponseBodyResult setSink(java.util.List<ModifyOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<ModifyOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public ModifyOfflineTaskResponseBodyResult setSource(java.util.List<ModifyOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<ModifyOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public ModifyOfflineTaskResponseBodyResult setStatus(ModifyOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public ModifyOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
