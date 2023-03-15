// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorNotifyObjectResult extends TeaModel {
    @NameInMap("contactGroups")
    public java.util.List<MonitorContactGroup> contactGroups;

    @NameInMap("contacts")
    public java.util.List<MonitorContact> contacts;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("webhooks")
    public java.util.List<MonitorWebhook> webhooks;

    public static MonitorNotifyObjectResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorNotifyObjectResult self = new MonitorNotifyObjectResult();
        return TeaModel.build(map, self);
    }

    public MonitorNotifyObjectResult setContactGroups(java.util.List<MonitorContactGroup> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public java.util.List<MonitorContactGroup> getContactGroups() {
        return this.contactGroups;
    }

    public MonitorNotifyObjectResult setContacts(java.util.List<MonitorContact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    public MonitorNotifyObjectResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorNotifyObjectResult setWebhooks(java.util.List<MonitorWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public java.util.List<MonitorWebhook> getWebhooks() {
        return this.webhooks;
    }

}
