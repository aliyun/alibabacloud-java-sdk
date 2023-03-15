// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactGroupUpdateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("contactIds")
    public java.util.List<Long> contactIds;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    public static MonitorContactGroupUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactGroupUpdateCmd self = new MonitorContactGroupUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorContactGroupUpdateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public MonitorContactGroupUpdateCmd setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    public MonitorContactGroupUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorContactGroupUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
