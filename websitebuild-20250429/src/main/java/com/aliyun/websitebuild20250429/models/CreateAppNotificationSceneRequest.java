// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppNotificationSceneRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The notification channels in a JSON array string, such as [&quot;sms&quot;,&quot;email&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sms&quot;,&quot;email&quot;]</p>
     */
    @NameInMap("ChannelsJson")
    public String channelsJson;

    /**
     * <p>The description of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_graph_prod</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The email notification fields in a JSON array string. A maximum of 10 fields are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EmailFieldsJson")
    public String emailFieldsJson;

    /**
     * <p>The email sending limit in a JSON string, including the minInterval and dailyLimit fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EmailLimitJson")
    public String emailLimitJson;

    /**
     * <p>The list of email recipient IDs in a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EmailRecipientIdsJson")
    public String emailRecipientIdsJson;

    /**
     * <p>The name of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>设备能力手册</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of SMS recipient IDs in a JSON array string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("PhoneRecipientIdsJson")
    public String phoneRecipientIdsJson;

    /**
     * <p>The SMS notification fields in a JSON array string. A maximum of 3 fields are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SmsFieldsJson")
    public String smsFieldsJson;

    /**
     * <p>The SMS sending limit in a JSON string, including the minInterval and dailyLimit fields.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SmsLimitJson")
    public String smsLimitJson;

    /**
     * <p>The name of the monitored data table.</p>
     * 
     * <strong>example:</strong>
     * <p>default.ai_advertising_material_rec_train_v1103</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The trigger events in a JSON array string, such as [&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;]</p>
     */
    @NameInMap("TriggerEventsJson")
    public String triggerEventsJson;

    public static CreateAppNotificationSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppNotificationSceneRequest self = new CreateAppNotificationSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppNotificationSceneRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAppNotificationSceneRequest setChannelsJson(String channelsJson) {
        this.channelsJson = channelsJson;
        return this;
    }
    public String getChannelsJson() {
        return this.channelsJson;
    }

    public CreateAppNotificationSceneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppNotificationSceneRequest setEmailFieldsJson(String emailFieldsJson) {
        this.emailFieldsJson = emailFieldsJson;
        return this;
    }
    public String getEmailFieldsJson() {
        return this.emailFieldsJson;
    }

    public CreateAppNotificationSceneRequest setEmailLimitJson(String emailLimitJson) {
        this.emailLimitJson = emailLimitJson;
        return this;
    }
    public String getEmailLimitJson() {
        return this.emailLimitJson;
    }

    public CreateAppNotificationSceneRequest setEmailRecipientIdsJson(String emailRecipientIdsJson) {
        this.emailRecipientIdsJson = emailRecipientIdsJson;
        return this;
    }
    public String getEmailRecipientIdsJson() {
        return this.emailRecipientIdsJson;
    }

    public CreateAppNotificationSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppNotificationSceneRequest setPhoneRecipientIdsJson(String phoneRecipientIdsJson) {
        this.phoneRecipientIdsJson = phoneRecipientIdsJson;
        return this;
    }
    public String getPhoneRecipientIdsJson() {
        return this.phoneRecipientIdsJson;
    }

    public CreateAppNotificationSceneRequest setSmsFieldsJson(String smsFieldsJson) {
        this.smsFieldsJson = smsFieldsJson;
        return this;
    }
    public String getSmsFieldsJson() {
        return this.smsFieldsJson;
    }

    public CreateAppNotificationSceneRequest setSmsLimitJson(String smsLimitJson) {
        this.smsLimitJson = smsLimitJson;
        return this;
    }
    public String getSmsLimitJson() {
        return this.smsLimitJson;
    }

    public CreateAppNotificationSceneRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateAppNotificationSceneRequest setTriggerEventsJson(String triggerEventsJson) {
        this.triggerEventsJson = triggerEventsJson;
        return this;
    }
    public String getTriggerEventsJson() {
        return this.triggerEventsJson;
    }

}
