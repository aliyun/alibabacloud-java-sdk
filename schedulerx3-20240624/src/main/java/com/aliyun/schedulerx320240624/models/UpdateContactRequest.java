// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateContactRequest extends TeaModel {
    /**
     * <p>The JSON character string for channel parameter settings. This parameter is optional. If specified, the settings are updated.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;channels&quot;:[{&quot;channelType&quot;:&quot;dingtalk&quot;,&quot;clientId&quot;:&quot;xxx&quot;,&quot;clientSecret&quot;:&quot;xxx&quot;,&quot;targetType&quot;:&quot;group&quot;,&quot;targetId&quot;:&quot;xxx&quot;,&quot;robotCode&quot;:&quot;xxx&quot;}]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The name of the contact to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>Specifies whether to enable or disable the notification channel for the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The type of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>IM</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactRequest self = new UpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateContactRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateContactRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
