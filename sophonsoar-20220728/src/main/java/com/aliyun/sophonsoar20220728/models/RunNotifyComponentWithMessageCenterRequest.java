// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithMessageCenterRequest extends TeaModel {
    /**
     * <p>The name of the playbook action.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notifyByMessageCenter</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The ID of the user who receives the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>146789xxxx733152</p>
     */
    @NameInMap("Aliuid")
    public String aliuid;

    /**
     * <p>The ID of the asset. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>A collection of channel types. If you do not specify this parameter, messages are sent through all channels by default.</p>
     */
    @NameInMap("ChannelTypeList")
    public java.util.List<String> channelTypeList;

    /**
     * <p>The name of the playbook component.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NotifyMessage</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The ID of the message event in Message Center. Valid values:</p>
     * <ul>
     * <li><p>yundun_soar_incident_generate: An event is generated.</p>
     * </li>
     * <li><p>yundun_soar_alert_generate: An alert is generated.</p>
     * </li>
     * <li><p>yundun_soar_incident_update: An event is updated.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun_soar_incident_generate</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the playbook node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notify_message</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The template parameters for the message event.</p>
     * <ul>
     * <li><p>Event generation: aliyunUID, incidentName, incidentID, startTime</p>
     * </li>
     * <li><p>Alert generation: aliyunUID, alertName, alertID, startTime</p>
     * </li>
     * <li><p>Event update: aliyunUID, incidentName, incidentID, startTime, endTime, status, level</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;startTime&quot;:&quot;test222&quot;,&quot;incidentName&quot;:&quot;test123&quot;,&quot;incidentID&quot;:&quot;teset123&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c88b5e-97ca-435d-8c20-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The user ID of the member. This parameter is used when an administrator calls the operation on behalf of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>1467894xxx733152</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li><p>0 (default): The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static RunNotifyComponentWithMessageCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithMessageCenterRequest self = new RunNotifyComponentWithMessageCenterRequest();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithMessageCenterRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public RunNotifyComponentWithMessageCenterRequest setAliuid(String aliuid) {
        this.aliuid = aliuid;
        return this;
    }
    public String getAliuid() {
        return this.aliuid;
    }

    public RunNotifyComponentWithMessageCenterRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public RunNotifyComponentWithMessageCenterRequest setChannelTypeList(java.util.List<String> channelTypeList) {
        this.channelTypeList = channelTypeList;
        return this;
    }
    public java.util.List<String> getChannelTypeList() {
        return this.channelTypeList;
    }

    public RunNotifyComponentWithMessageCenterRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public RunNotifyComponentWithMessageCenterRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RunNotifyComponentWithMessageCenterRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RunNotifyComponentWithMessageCenterRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public RunNotifyComponentWithMessageCenterRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RunNotifyComponentWithMessageCenterRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public RunNotifyComponentWithMessageCenterRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public RunNotifyComponentWithMessageCenterRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
