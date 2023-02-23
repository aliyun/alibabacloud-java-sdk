// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    /**
     * <p>The AppKey for the application.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public Integer appType;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableLog")
    public Boolean enableLog;

    /**
     * <p>The ID of the application. You can obtain the application ID on the Application Management page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of jobs.</p>
     */
    @NameInMap("MaxJobs")
    public Integer maxJobs;

    /**
     * <p>The configuration of the alert. The value is a JSON string. For more information about this parameter, see **Additional information about request parameters**.</p>
     */
    @NameInMap("MonitorConfigJson")
    public String monitorConfigJson;

    /**
     * <p>The configuration of alert contacts. The value is a JSON string.</p>
     */
    @NameInMap("MonitorContactsJson")
    public String monitorContactsJson;

    /**
     * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in Distributed Task Scheduling Platform.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>This parameter is not supported. You do not need to specify this parameter.</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to schedule a busy worker.</p>
     */
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

    public CreateAppGroupRequest setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
        return this;
    }
    public Boolean getEnableLog() {
        return this.enableLog;
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
