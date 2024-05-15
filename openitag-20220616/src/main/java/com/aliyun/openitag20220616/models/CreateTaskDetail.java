// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class CreateTaskDetail extends TeaModel {
    @NameInMap("Admins")
    public CreateTaskDetailAdmins admins;

    @NameInMap("AllowAppendData")
    public Boolean allowAppendData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssignConfig")
    public TaskAssginConfig assignConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetProxyRelations")
    public java.util.List<DatasetProxyConfig> datasetProxyRelations;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskTemplateConfig")
    public TaskTemplateConfig taskTemplateConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskWorkflow")
    public java.util.List<CreateTaskDetailTaskWorkflow> taskWorkflow;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UUID")
    public String UUID;

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
