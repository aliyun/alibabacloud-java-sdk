// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetOfflineTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetOfflineTaskResponseBodyResult result;

    public static GetOfflineTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfflineTaskResponseBody self = new GetOfflineTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfflineTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfflineTaskResponseBody setResult(GetOfflineTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOfflineTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOfflineTaskResponseBodyResultMeta extends TeaModel {
        /**
         * <p>The billing specification.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("computeResource")
        public String computeResource;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static GetOfflineTaskResponseBodyResultMeta build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResultMeta self = new GetOfflineTaskResponseBodyResultMeta();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResultMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public GetOfflineTaskResponseBodyResultMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class GetOfflineTaskResponseBodyResultProcessors extends TeaModel {
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

        public static GetOfflineTaskResponseBodyResultProcessors build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResultProcessors self = new GetOfflineTaskResponseBodyResultProcessors();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResultProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public GetOfflineTaskResponseBodyResultProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOfflineTaskResponseBodyResultProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetOfflineTaskResponseBodyResultProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetOfflineTaskResponseBodyResultSink extends TeaModel {
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

        public static GetOfflineTaskResponseBodyResultSink build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResultSink self = new GetOfflineTaskResponseBodyResultSink();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResultSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOfflineTaskResponseBodyResultSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetOfflineTaskResponseBodyResultSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetOfflineTaskResponseBodyResultSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public GetOfflineTaskResponseBodyResultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetOfflineTaskResponseBodyResultSource extends TeaModel {
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

        public static GetOfflineTaskResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResultSource self = new GetOfflineTaskResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOfflineTaskResponseBodyResultSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetOfflineTaskResponseBodyResultSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetOfflineTaskResponseBodyResultSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public GetOfflineTaskResponseBodyResultSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetOfflineTaskResponseBodyResultStatus extends TeaModel {
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
         * <p>“”</p>
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

        public static GetOfflineTaskResponseBodyResultStatus build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResultStatus self = new GetOfflineTaskResponseBodyResultStatus();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResultStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetOfflineTaskResponseBodyResultStatus setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public GetOfflineTaskResponseBodyResultStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetOfflineTaskResponseBodyResultStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetOfflineTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The node metadata.</p>
         */
        @NameInMap("meta")
        public GetOfflineTaskResponseBodyResultMeta meta;

        /**
         * <p>The node processing parameters.</p>
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
         * <p>The processing flow operators.</p>
         */
        @NameInMap("processors")
        public java.util.List<GetOfflineTaskResponseBodyResultProcessors> processors;

        /**
         * <p>The data sink information.</p>
         */
        @NameInMap("sink")
        public java.util.List<GetOfflineTaskResponseBodyResultSink> sink;

        /**
         * <p>The data source information.</p>
         */
        @NameInMap("source")
        public java.util.List<GetOfflineTaskResponseBodyResultSource> source;

        /**
         * <p>The node status.</p>
         */
        @NameInMap("status")
        public GetOfflineTaskResponseBodyResultStatus status;

        public static GetOfflineTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOfflineTaskResponseBodyResult self = new GetOfflineTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOfflineTaskResponseBodyResult setMeta(GetOfflineTaskResponseBodyResultMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetOfflineTaskResponseBodyResultMeta getMeta() {
            return this.meta;
        }

        public GetOfflineTaskResponseBodyResult setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetOfflineTaskResponseBodyResult setProcessors(java.util.List<GetOfflineTaskResponseBodyResultProcessors> processors) {
            this.processors = processors;
            return this;
        }
        public java.util.List<GetOfflineTaskResponseBodyResultProcessors> getProcessors() {
            return this.processors;
        }

        public GetOfflineTaskResponseBodyResult setSink(java.util.List<GetOfflineTaskResponseBodyResultSink> sink) {
            this.sink = sink;
            return this;
        }
        public java.util.List<GetOfflineTaskResponseBodyResultSink> getSink() {
            return this.sink;
        }

        public GetOfflineTaskResponseBodyResult setSource(java.util.List<GetOfflineTaskResponseBodyResultSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<GetOfflineTaskResponseBodyResultSource> getSource() {
            return this.source;
        }

        public GetOfflineTaskResponseBodyResult setStatus(GetOfflineTaskResponseBodyResultStatus status) {
            this.status = status;
            return this;
        }
        public GetOfflineTaskResponseBodyResultStatus getStatus() {
            return this.status;
        }

    }

}
