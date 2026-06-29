// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class CreateTaskDetail extends TeaModel {
    /**
     * <p>Administrators; defaults to the Creator.</p>
     */
    @NameInMap("Admins")
    public CreateTaskDetailAdmins admins;

    /**
     * <p>Indicates whether appending new data is supported. Valid values:</p>
     * <ul>
     * <li>true: Supported</li>
     * <li>false: Not supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowAppendData")
    public Boolean allowAppendData;

    /**
     * <p>Job assignment mechanism.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssignConfig")
    public TaskAssginConfig assignConfig;

    /**
     * <p>List of dataset configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetProxyRelations")
    public java.util.List<DatasetProxyConfig> datasetProxyRelations;

    /**
     * <p>Additional configuration. JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{  &quot;TaskCaptionType&quot;: &quot;DOC_LINK&quot;}</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>List of job labels.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务202208101424</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Template Configuration.</p>
     */
    @NameInMap("TaskTemplateConfig")
    public TaskTemplateConfig taskTemplateConfig;

    /**
     * <p>List of pipelines.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskWorkflow")
    public java.util.List<CreateTaskDetailTaskWorkflow> taskWorkflow;

    /**
     * <p>Template ID. For more information, see <a href="https://help.aliyun.com/document_detail/454654.html">ListTemplates</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>152936***8342353920</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Unique identifier (UUID), controlled by the business side.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16623***80757311</p>
     */
    @NameInMap("UUID")
    public String UUID;

    /**
     * <p>Vote configuration</p>
     */
    @NameInMap("VoteConfigs")
    public java.util.Map<String, CreateTaskDetailVoteInfo> voteConfigs;

    public static CreateTaskDetail build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskDetail self = new CreateTaskDetail();
        return TeaModel.build(map, self);
    }

    public CreateTaskDetail setAdmins(CreateTaskDetailAdmins admins) {
        this.admins = admins;
        return this;
    }
    public CreateTaskDetailAdmins getAdmins() {
        return this.admins;
    }

    public CreateTaskDetail setAllowAppendData(Boolean allowAppendData) {
        this.allowAppendData = allowAppendData;
        return this;
    }
    public Boolean getAllowAppendData() {
        return this.allowAppendData;
    }

    public CreateTaskDetail setAssignConfig(TaskAssginConfig assignConfig) {
        this.assignConfig = assignConfig;
        return this;
    }
    public TaskAssginConfig getAssignConfig() {
        return this.assignConfig;
    }

    public CreateTaskDetail setDatasetProxyRelations(java.util.List<DatasetProxyConfig> datasetProxyRelations) {
        this.datasetProxyRelations = datasetProxyRelations;
        return this;
    }
    public java.util.List<DatasetProxyConfig> getDatasetProxyRelations() {
        return this.datasetProxyRelations;
    }

    public CreateTaskDetail setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public CreateTaskDetail setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CreateTaskDetail setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateTaskDetail setTaskTemplateConfig(TaskTemplateConfig taskTemplateConfig) {
        this.taskTemplateConfig = taskTemplateConfig;
        return this;
    }
    public TaskTemplateConfig getTaskTemplateConfig() {
        return this.taskTemplateConfig;
    }

    public CreateTaskDetail setTaskWorkflow(java.util.List<CreateTaskDetailTaskWorkflow> taskWorkflow) {
        this.taskWorkflow = taskWorkflow;
        return this;
    }
    public java.util.List<CreateTaskDetailTaskWorkflow> getTaskWorkflow() {
        return this.taskWorkflow;
    }

    public CreateTaskDetail setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateTaskDetail setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

    public CreateTaskDetail setVoteConfigs(java.util.Map<String, CreateTaskDetailVoteInfo> voteConfigs) {
        this.voteConfigs = voteConfigs;
        return this;
    }
    public java.util.Map<String, CreateTaskDetailVoteInfo> getVoteConfigs() {
        return this.voteConfigs;
    }

    public static class CreateTaskDetailAdmins extends TeaModel {
        /**
         * <p>List of administrators.</p>
         */
        @NameInMap("Users")
        public java.util.List<SimpleUser> users;

        public static CreateTaskDetailAdmins build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskDetailAdmins self = new CreateTaskDetailAdmins();
            return TeaModel.build(map, self);
        }

        public CreateTaskDetailAdmins setUsers(java.util.List<SimpleUser> users) {
            this.users = users;
            return this;
        }
        public java.util.List<SimpleUser> getUsers() {
            return this.users;
        }

    }

    public static class CreateTaskDetailTaskWorkflow extends TeaModel {
        /**
         * <p>Node name. Valid values:</p>
         * <ul>
         * <li>MARK: Annotate.</li>
         * <li>CHECK: Check.</li>
         * <li>SAMPLING: Validate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MARK</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static CreateTaskDetailTaskWorkflow build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskDetailTaskWorkflow self = new CreateTaskDetailTaskWorkflow();
            return TeaModel.build(map, self);
        }

        public CreateTaskDetailTaskWorkflow setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
