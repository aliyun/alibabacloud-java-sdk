// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorNotifyStrategy extends TeaModel {
    @NameInMap("channels")
    public java.util.List<String> channels;

    @NameInMap("contactGroupIds")
    public java.util.List<Long> contactGroupIds;

    @NameInMap("contactGroups")
    public java.util.List<MonitorContactGroup> contactGroups;

    @NameInMap("contactIds")
    public java.util.List<Long> contactIds;

    @NameInMap("contacts")
    public java.util.List<MonitorContact> contacts;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("webhookIds")
    public java.util.List<Long> webhookIds;

    @NameInMap("webhooks")
    public java.util.List<MonitorWebhook> webhooks;

    public static MonitorNotifyStrategy build(java.util.Map<String, ?> map) throws Exception {
        MonitorNotifyStrategy self = new MonitorNotifyStrategy();
        return TeaModel.build(map, self);
    }

    public MonitorNotifyStrategy setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public MonitorNotifyStrategy setContactGroupIds(java.util.List<Long> contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public java.util.List<Long> getContactGroupIds() {
        return this.contactGroupIds;
    }

    public MonitorNotifyStrategy setContactGroups(java.util.List<MonitorContactGroup> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public java.util.List<MonitorContactGroup> getContactGroups() {
        return this.contactGroups;
    }

    public MonitorNotifyStrategy setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    public MonitorNotifyStrategy setContacts(java.util.List<MonitorContact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    public MonitorNotifyStrategy setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MonitorNotifyStrategy setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorNotifyStrategy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorNotifyStrategy setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorNotifyStrategy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MonitorNotifyStrategy setWebhookIds(java.util.List<Long> webhookIds) {
        this.webhookIds = webhookIds;
        return this;
    }
    public java.util.List<Long> getWebhookIds() {
        return this.webhookIds;
    }

    public MonitorNotifyStrategy setWebhooks(java.util.List<MonitorWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public java.util.List<MonitorWebhook> getWebhooks() {
        return this.webhooks;
    }

}
