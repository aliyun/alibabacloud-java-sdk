// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateAppGroupRequest extends TeaModel {
    /**
     * <p>The application version. 1: Basic version, 2: Professional version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AppVersion")
    public Integer appVersion;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableLog")
    public Boolean enableLog;

    /**
     * <p>The ID of the application. You can obtain the application ID on the <strong>Application Management</strong> page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of concurrent instances. Default value: 1. A value of 1 specifies that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the next instance is reached.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <p>The configuration of the alert. The value is a JSON string. For more information about this parameter, see <strong>Additional information about request parameters</strong>.</p>
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
     * <p>The configuration of alert contacts. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;userName&quot;:&quot;Tom&quot;,&quot;userPhone&quot;:&quot;89756******&quot;},{&quot;userName&quot;:&quot;Bob&quot;,&quot;ding&quot;:&quot;<a href="http://www.example.com%22%7D%5D">http://www.example.com&quot;}]</a></p>
     */
    @NameInMap("MonitorContactsJson")
    public String monitorContactsJson;

    /**
     * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>test-workday-notification</p>
     */
    @NameInMap("NotificationPolicyName")
    public String notificationPolicyName;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupRequest self = new UpdateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupRequest setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public Integer getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppGroupRequest setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
        return this;
    }
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    public UpdateAppGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateAppGroupRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateAppGroupRequest setMonitorConfigJson(String monitorConfigJson) {
        this.monitorConfigJson = monitorConfigJson;
        return this;
    }
    public String getMonitorConfigJson() {
        return this.monitorConfigJson;
    }

    public UpdateAppGroupRequest setMonitorContactsJson(String monitorContactsJson) {
        this.monitorContactsJson = monitorContactsJson;
        return this;
    }
    public String getMonitorContactsJson() {
        return this.monitorContactsJson;
    }

    public UpdateAppGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAppGroupRequest setNotificationPolicyName(String notificationPolicyName) {
        this.notificationPolicyName = notificationPolicyName;
        return this;
    }
    public String getNotificationPolicyName() {
        return this.notificationPolicyName;
    }

    public UpdateAppGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
