// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithMessageCenterRequest extends TeaModel {
    /**
     * <p>The action name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notifyByMessageCenter</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The user ID receiving the message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>146789xxxx733152</p>
     */
    @NameInMap("Aliuid")
    public String aliuid;

    /**
     * <p>Resource instance ID. This parameter is currently deprecated and no longer in use.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AssetId")
    public String assetId;

    /**
     * <p>Collection of channel types. If not provided, all channels will be used by default, and it is not required to provide this parameter by default.</p>
     */
    @NameInMap("ChannelTypeList")
    public java.util.List<String> channelTypeList;

    /**
     * <p>The component name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NotifyMessage</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>Cloud Pigeon\&quot;s message event ID. Values:</p>
     * <ul>
     * <li>yundun_soar_incident_generate: Incident generation.</li>
     * <li>yundun_soar_alert_generate: Alert generation.</li>
     * <li>yundun_soar_incident_update: Incident update.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun_soar_incident_generate</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The language type for requesting and receiving messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The node name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notify_message</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>Template parameters for the message event.</p>
     * <ul>
     * <li>For incident generation: aliyunUID, incidentName, incidentID, startTime</li>
     * <li>For alert generation: aliyunUID, alertName, alertID, startTime</li>
     * <li>For incident update: aliyunUID, incidentName, incidentID, startTime, endTime, status, level</li>
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
     * <p>You can obtain this parameter by calling the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c88b5e-97ca-435d-8c20-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The user ID when an administrator switches to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>1467894xxx733152</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>View type. Values:</p>
     * <ul>
     * <li>0 (default): Current Alibaba Cloud account view.</li>
     * <li>1: View for all accounts under the enterprise.</li>
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
