// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithWebhookRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notifyByCustom</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AssetId")
    public Integer assetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NotifyMessage</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;at&quot;: {
     *         &quot;atMobiles&quot;:[
     *             &quot;180xxxxxx&quot;
     *         ],
     *         &quot;atUserIds&quot;:[
     *             &quot;user123&quot;
     *         ],
     *         &quot;isAtAll&quot;: false
     *     },
     *     &quot;text&quot;: {
     *         &quot;content&quot;:&quot;1234&quot;
     *     },
     *     &quot;msgtype&quot;:&quot;text&quot;
     * }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MsgType")
    public String msgType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>notify_message_node</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>94bc318c-<strong><strong>-4cba-</strong></strong>-801ccb0d739f</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <strong>example:</strong>
     * <p>126339xxxx805497</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <strong>example:</strong>
     * <p>SECc1<em><strong><strong>e157b32b380f</strong></strong></em>***bb8c70e1a67a22072</p>
     */
    @NameInMap("Secret")
    public String secret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;10651\&quot;]</p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static RunNotifyComponentWithWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithWebhookRequest self = new RunNotifyComponentWithWebhookRequest();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithWebhookRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public RunNotifyComponentWithWebhookRequest setAssetId(Integer assetId) {
        this.assetId = assetId;
        return this;
    }
    public Integer getAssetId() {
        return this.assetId;
    }

    public RunNotifyComponentWithWebhookRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public RunNotifyComponentWithWebhookRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunNotifyComponentWithWebhookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RunNotifyComponentWithWebhookRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public RunNotifyComponentWithWebhookRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public RunNotifyComponentWithWebhookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public RunNotifyComponentWithWebhookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public RunNotifyComponentWithWebhookRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public RunNotifyComponentWithWebhookRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public RunNotifyComponentWithWebhookRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
