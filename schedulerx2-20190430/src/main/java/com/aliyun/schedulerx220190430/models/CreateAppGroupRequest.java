// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MaxJobs")
    public Integer maxJobs;

    @NameInMap("MonitorConfigJson")
    public String monitorConfigJson;

    @NameInMap("MonitorContactsJson")
    public String monitorContactsJson;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceName")
    public String namespaceName;

    @NameInMap("NamespaceSource")
    public String namespaceSource;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScheduleBusyWorkers")
    public Boolean scheduleBusyWorkers;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateAppGroupRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppGroupRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public CreateAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateAppGroupRequest setMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
        return this;
    }
    public Integer getMaxJobs() {
        return this.maxJobs;
    }

    public CreateAppGroupRequest setMonitorConfigJson(String monitorConfigJson) {
        this.monitorConfigJson = monitorConfigJson;
        return this;
    }
    public String getMonitorConfigJson() {
        return this.monitorConfigJson;
    }

    public CreateAppGroupRequest setMonitorContactsJson(String monitorContactsJson) {
        this.monitorContactsJson = monitorContactsJson;
        return this;
    }
    public String getMonitorContactsJson() {
        return this.monitorContactsJson;
    }

    public CreateAppGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAppGroupRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateAppGroupRequest setNamespaceSource(String namespaceSource) {
        this.namespaceSource = namespaceSource;
        return this;
    }
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    public CreateAppGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppGroupRequest setScheduleBusyWorkers(Boolean scheduleBusyWorkers) {
        this.scheduleBusyWorkers = scheduleBusyWorkers;
        return this;
    }
    public Boolean getScheduleBusyWorkers() {
        return this.scheduleBusyWorkers;
    }

}
