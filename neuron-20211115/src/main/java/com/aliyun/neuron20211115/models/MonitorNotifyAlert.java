// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorNotifyAlert extends TeaModel {
    @NameInMap("contactGroups")
    public java.util.List<MonitorContactGroup> contactGroups;

    @NameInMap("contacts")
    public java.util.List<MonitorContact> contacts;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("notifyChannels")
    public java.util.List<String> notifyChannels;

    @NameInMap("ruleNames")
    public java.util.List<String> ruleNames;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("type")
    public String type;

    @NameInMap("webhooks")
    public java.util.List<MonitorWebhook> webhooks;

    public static MonitorNotifyAlert build(java.util.Map<String, ?> map) throws Exception {
        MonitorNotifyAlert self = new MonitorNotifyAlert();
        return TeaModel.build(map, self);
    }

    public MonitorNotifyAlert setContactGroups(java.util.List<MonitorContactGroup> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public java.util.List<MonitorContactGroup> getContactGroups() {
        return this.contactGroups;
    }

    public MonitorNotifyAlert setContacts(java.util.List<MonitorContact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    public MonitorNotifyAlert setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MonitorNotifyAlert setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorNotifyAlert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorNotifyAlert setNotifyChannels(java.util.List<String> notifyChannels) {
        this.notifyChannels = notifyChannels;
        return this;
    }
    public java.util.List<String> getNotifyChannels() {
        return this.notifyChannels;
    }

    public MonitorNotifyAlert setRuleNames(java.util.List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

    public MonitorNotifyAlert setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MonitorNotifyAlert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MonitorNotifyAlert setWebhooks(java.util.List<MonitorWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public java.util.List<MonitorWebhook> getWebhooks() {
        return this.webhooks;
    }

}
