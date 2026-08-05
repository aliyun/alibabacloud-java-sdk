// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateOfflineTaskRequest extends TeaModel {
    /**
     * <p>The task metadata.</p>
     */
    @NameInMap("meta")
    public CreateOfflineTaskRequestMeta meta;

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
     * <p>The processing pipeline operators.</p>
     */
    @NameInMap("processors")
    public java.util.List<CreateOfflineTaskRequestProcessors> processors;

    /**
     * <p>The data sink information.</p>
     */
    @NameInMap("sink")
    public java.util.List<CreateOfflineTaskRequestSink> sink;

    /**
     * <p>The data source information.</p>
     */
    @NameInMap("source")
    public java.util.List<CreateOfflineTaskRequestSource> source;

    /**
     * <p>The task status.</p>
     */
    @NameInMap("status")
    public CreateOfflineTaskRequestStatus status;

    /**
     * <p>Specifies whether the task is a draft.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("draft")
    public Boolean draft;

    /**
     * <p>Specifies whether to validate the parameters without creating the task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfflineTaskRequest self = new CreateOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfflineTaskRequest setMeta(CreateOfflineTaskRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public CreateOfflineTaskRequestMeta getMeta() {
        return this.meta;
    }

    public CreateOfflineTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public CreateOfflineTaskRequest setProcessors(java.util.List<CreateOfflineTaskRequestProcessors> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<CreateOfflineTaskRequestProcessors> getProcessors() {
        return this.processors;
    }

    public CreateOfflineTaskRequest setSink(java.util.List<CreateOfflineTaskRequestSink> sink) {
        this.sink = sink;
        return this;
    }
    public java.util.List<CreateOfflineTaskRequestSink> getSink() {
        return this.sink;
    }

    public CreateOfflineTaskRequest setSource(java.util.List<CreateOfflineTaskRequestSource> source) {
        this.source = source;
        return this;
    }
    public java.util.List<CreateOfflineTaskRequestSource> getSource() {
        return this.source;
    }

    public CreateOfflineTaskRequest setStatus(CreateOfflineTaskRequestStatus status) {
        this.status = status;
        return this;
    }
    public CreateOfflineTaskRequestStatus getStatus() {
        return this.status;
    }

    public CreateOfflineTaskRequest setDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
    public Boolean getDraft() {
        return this.draft;
    }

    public CreateOfflineTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateOfflineTaskRequestMeta extends TeaModel {
        /**
         * <p>The access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>OS-xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The billing specification.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("computeResource")
        public String computeResource;

        /**
         * <p>The list of labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<String> labels;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static CreateOfflineTaskRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskRequestMeta self = new CreateOfflineTaskRequestMeta();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskRequestMeta setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateOfflineTaskRequestMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public CreateOfflineTaskRequestMeta setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public CreateOfflineTaskRequestMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateOfflineTaskRequestMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class CreateOfflineTaskRequestProcessors extends TeaModel {
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
         * <p>The output parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;vector&quot;: &quot;syh_image_uri_multi-modal-embedding&quot;
         * }</p>
         */
        @NameInMap("output")
        public java.util.Map<String, ?> output;

        /**
         * <p>The processor parameters.</p>
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

        public static CreateOfflineTaskRequestProcessors build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskRequestProcessors self = new CreateOfflineTaskRequestProcessors();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskRequestProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public CreateOfflineTaskRequestProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskRequestProcessors setOutput(java.util.Map<String, ?> output) {
            this.output = output;
            return this;
        }
        public java.util.Map<String, ?> getOutput() {
            return this.output;
        }

        public CreateOfflineTaskRequestProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskRequestProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskRequestSink extends TeaModel {
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

        public static CreateOfflineTaskRequestSink build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskRequestSink self = new CreateOfflineTaskRequestSink();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskRequestSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskRequestSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskRequestSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public CreateOfflineTaskRequestSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public CreateOfflineTaskRequestSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskRequestSource extends TeaModel {
        /**
         * <p><strong>The data source name.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p><strong>The datasource config parameters, which are determined by the type.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;key1&quot;: &quot;value1&quot;,
         *    &quot;key2&quot;: &quot;value2&quot;
         * }</p>
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
         * <p><strong>The data source schema.</strong>.</p>
         */
        @NameInMap("schema")
        public java.util.List<java.util.Map<String, String>> schema;

        /**
         * <p><strong>The data source type.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateOfflineTaskRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskRequestSource self = new CreateOfflineTaskRequestSource();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskRequestSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOfflineTaskRequestSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public CreateOfflineTaskRequestSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public CreateOfflineTaskRequestSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public CreateOfflineTaskRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOfflineTaskRequestStatus extends TeaModel {
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
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateOfflineTaskRequestStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateOfflineTaskRequestStatus self = new CreateOfflineTaskRequestStatus();
            return TeaModel.build(map, self);
        }

        public CreateOfflineTaskRequestStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateOfflineTaskRequestStatus setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public CreateOfflineTaskRequestStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateOfflineTaskRequestStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
