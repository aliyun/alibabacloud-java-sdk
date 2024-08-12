// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaTaskRequest extends TeaModel {
    @NameInMap("AppVersionUid")
    public String appVersionUid;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ClientIdList")
    public java.util.List<String> clientIdList;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("ForceUpgrade")
    public Integer forceUpgrade;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Project")
    public String project;

    @NameInMap("Regions")
    public java.util.List<String> regions;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskType")
    public Integer taskType;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateAppOtaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaTaskRequest self = new CreateAppOtaTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaTaskRequest setAppVersionUid(String appVersionUid) {
        this.appVersionUid = appVersionUid;
        return this;
    }
    public String getAppVersionUid() {
        return this.appVersionUid;
    }

    public CreateAppOtaTaskRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateAppOtaTaskRequest setClientIdList(java.util.List<String> clientIdList) {
        this.clientIdList = clientIdList;
        return this;
    }
    public java.util.List<String> getClientIdList() {
        return this.clientIdList;
    }

    public CreateAppOtaTaskRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public CreateAppOtaTaskRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateAppOtaTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppOtaTaskRequest setForceUpgrade(Integer forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
        return this;
    }
    public Integer getForceUpgrade() {
        return this.forceUpgrade;
    }

    public CreateAppOtaTaskRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateAppOtaTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppOtaTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateAppOtaTaskRequest setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public CreateAppOtaTaskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateAppOtaTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public CreateAppOtaTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
