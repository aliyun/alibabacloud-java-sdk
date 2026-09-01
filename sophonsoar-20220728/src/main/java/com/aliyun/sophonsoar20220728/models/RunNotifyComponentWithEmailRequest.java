// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithEmailRequest extends TeaModel {
    /**
     * <p>The name of the component action.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notifyByCustom</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The ID of the asset that is used to send the email.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeComponentAssets~~">DescribeComponentAssets</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AssetId")
    public String assetId;

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
     * <p>The body of the email.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>email content</p>
     */
    @NameInMap("Content")
    public String content;

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
     * <p>notify_message_1</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e99dab31-499b-4307-9248-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>A list of email addresses.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Receivers")
    public java.util.List<String> receivers;

    /**
     * <p>The UID of the member whose data an administrator wants to access.</p>
     * 
     * <strong>example:</strong>
     * <p>137602xxx718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
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

    /**
     * <p>The title of the email.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Subject")
    public String subject;

    public static RunNotifyComponentWithEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithEmailRequest self = new RunNotifyComponentWithEmailRequest();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithEmailRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public RunNotifyComponentWithEmailRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public RunNotifyComponentWithEmailRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public RunNotifyComponentWithEmailRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunNotifyComponentWithEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RunNotifyComponentWithEmailRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public RunNotifyComponentWithEmailRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public RunNotifyComponentWithEmailRequest setReceivers(java.util.List<String> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    public RunNotifyComponentWithEmailRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public RunNotifyComponentWithEmailRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public RunNotifyComponentWithEmailRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
