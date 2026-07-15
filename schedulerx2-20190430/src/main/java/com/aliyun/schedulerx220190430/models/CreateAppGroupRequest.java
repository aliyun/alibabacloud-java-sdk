// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    /**
     * <p>The AppKey of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>adcExHZviLcl****</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DocTest</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application type.</p>
     * <ul>
     * <li><p><code>1</code>: Standard application.</p>
     * </li>
     * <li><p><code>2</code>: Kubernetes (K8s) application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    /**
     * <p>The application version. Valid values: <code>1</code> (Basic Edition) and <code>2</code> (Professional Edition).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AppVersion")
    public Integer appVersion;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable logging.</p>
     * <ul>
     * <li><p><code>true</code>: Enable logging.</p>
     * </li>
     * <li><p><code>false</code>: Disable logging.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLog")
    public Boolean enableLog;

    /**
     * <p>The ID of the application group. You can find this ID on the <strong>Application Management</strong> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxJobs")
    public Integer maxJobs;

    /**
     * <p>Specifies the alert notification configuration as a JSON string. The string can contain the following properties: <code>sendChannel</code>, <code>alarmType</code>, and <code>webhookIsAtAll</code>.</p>
     * <blockquote>
     * <p>For more information, see the <strong>Additional information about request parameters</strong> section.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;sendChannel&quot;: &quot;ding,sms,mail,phone&quot;,
     *     &quot;alarmType&quot;: &quot;Contacts&quot;,
     *     &quot;webhookIsAtAll&quot;: false
     * }</p>
     */
    @NameInMap("MonitorConfigJson")
    public String monitorConfigJson;

    /**
     * <p>The alert contacts. This can include individual contacts and contact groups.</p>
     * <blockquote>
     * <p>For more information, see the <strong>Additional information about request parameters</strong> section.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {&quot;name&quot;: &quot;Alice Johnson&quot;},
     *     {&quot;name&quot;: &quot;Lee Smith&quot;}
     * ]</p>
     */
    @NameInMap("MonitorContactsJson")
    public String monitorContactsJson;

    /**
     * <p>The ID of the namespace. You can find this ID on the <strong>Namespace</strong> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("NamespaceName")
    public String namespaceName;

    /**
     * <p>This parameter is currently unsupported and can be left unspecified.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("NamespaceSource")
    public String namespaceSource;

    /**
     * <p>The notification policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workday-notification</p>
     */
    @NameInMap("NotificationPolicyName")
    public String notificationPolicyName;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to schedule jobs on a busy worker.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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

    public CreateAppGroupRequest setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public Integer getAppVersion() {
        return this.appVersion;
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

    public CreateAppGroupRequest setNotificationPolicyName(String notificationPolicyName) {
        this.notificationPolicyName = notificationPolicyName;
        return this;
    }
    public String getNotificationPolicyName() {
        return this.notificationPolicyName;
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
