// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ModifyOfflineTaskRequest extends TeaModel {
    /**
     * <p>The task metadata.</p>
     */
    @NameInMap("meta")
    public ModifyOfflineTaskRequestMeta meta;

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
     * <p>The processing flow operators.</p>
     */
    @NameInMap("processors")
    public java.util.List<ModifyOfflineTaskRequestProcessors> processors;

    /**
     * <p>The data sink information.</p>
     */
    @NameInMap("sink")
    public java.util.List<ModifyOfflineTaskRequestSink> sink;

    /**
     * <p>The data source information.</p>
     */
    @NameInMap("source")
    public java.util.List<ModifyOfflineTaskRequestSource> source;

    /**
     * <p>The task status.</p>
     */
    @NameInMap("status")
    public ModifyOfflineTaskRequestStatus status;

    /**
     * <p>Specifies whether to validate the request parameters without performing the actual operation. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static ModifyOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineTaskRequest self = new ModifyOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineTaskRequest setMeta(ModifyOfflineTaskRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public ModifyOfflineTaskRequestMeta getMeta() {
        return this.meta;
    }

    public ModifyOfflineTaskRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public ModifyOfflineTaskRequest setProcessors(java.util.List<ModifyOfflineTaskRequestProcessors> processors) {
        this.processors = processors;
        return this;
    }
    public java.util.List<ModifyOfflineTaskRequestProcessors> getProcessors() {
        return this.processors;
    }

    public ModifyOfflineTaskRequest setSink(java.util.List<ModifyOfflineTaskRequestSink> sink) {
        this.sink = sink;
        return this;
    }
    public java.util.List<ModifyOfflineTaskRequestSink> getSink() {
        return this.sink;
    }

    public ModifyOfflineTaskRequest setSource(java.util.List<ModifyOfflineTaskRequestSource> source) {
        this.source = source;
        return this;
    }
    public java.util.List<ModifyOfflineTaskRequestSource> getSource() {
        return this.source;
    }

    public ModifyOfflineTaskRequest setStatus(ModifyOfflineTaskRequestStatus status) {
        this.status = status;
        return this;
    }
    public ModifyOfflineTaskRequestStatus getStatus() {
        return this.status;
    }

    public ModifyOfflineTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyOfflineTaskRequestMeta extends TeaModel {
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
         * <p>The list of task labels.</p>
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
         * <p>syh</p>
         */
        @NameInMap("taskName")
        public String taskName;

        public static ModifyOfflineTaskRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskRequestMeta self = new ModifyOfflineTaskRequestMeta();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskRequestMeta setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ModifyOfflineTaskRequestMeta setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public ModifyOfflineTaskRequestMeta setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ModifyOfflineTaskRequestMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyOfflineTaskRequestMeta setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ModifyOfflineTaskRequestProcessors extends TeaModel {
        /**
         * <p>The input parameters.</p>
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

        public static ModifyOfflineTaskRequestProcessors build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskRequestProcessors self = new ModifyOfflineTaskRequestProcessors();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskRequestProcessors setInput(java.util.Map<String, ?> input) {
            this.input = input;
            return this;
        }
        public java.util.Map<String, ?> getInput() {
            return this.input;
        }

        public ModifyOfflineTaskRequestProcessors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskRequestProcessors setOutput(java.util.Map<String, ?> output) {
            this.output = output;
            return this;
        }
        public java.util.Map<String, ?> getOutput() {
            return this.output;
        }

        public ModifyOfflineTaskRequestProcessors setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskRequestProcessors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskRequestSink extends TeaModel {
        /**
         * <p>The data sink name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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

        public static ModifyOfflineTaskRequestSink build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskRequestSink self = new ModifyOfflineTaskRequestSink();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskRequestSink setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskRequestSink setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskRequestSink setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ModifyOfflineTaskRequestSink setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ModifyOfflineTaskRequestSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskRequestSource extends TeaModel {
        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>tmp-exec-pop-eTcMpC</p>
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

        public static ModifyOfflineTaskRequestSource build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskRequestSource self = new ModifyOfflineTaskRequestSource();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskRequestSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOfflineTaskRequestSource setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public ModifyOfflineTaskRequestSource setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public ModifyOfflineTaskRequestSource setSchema(java.util.List<java.util.Map<String, String>> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSchema() {
            return this.schema;
        }

        public ModifyOfflineTaskRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyOfflineTaskRequestStatus extends TeaModel {
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
         * <p>“”</p>
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

        public static ModifyOfflineTaskRequestStatus build(java.util.Map<String, ?> map) throws Exception {
            ModifyOfflineTaskRequestStatus self = new ModifyOfflineTaskRequestStatus();
            return TeaModel.build(map, self);
        }

        public ModifyOfflineTaskRequestStatus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifyOfflineTaskRequestStatus setDeleteTime(Long deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        public ModifyOfflineTaskRequestStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ModifyOfflineTaskRequestStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
