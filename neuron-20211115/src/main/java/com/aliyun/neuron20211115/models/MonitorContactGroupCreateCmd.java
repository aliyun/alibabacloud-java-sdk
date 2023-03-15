// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactGroupCreateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("contactIds")
    public java.util.List<Long> contactIds;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    public static MonitorContactGroupCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactGroupCreateCmd self = new MonitorContactGroupCreateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorContactGroupCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public MonitorContactGroupCreateCmd setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    public MonitorContactGroupCreateCmd setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public MonitorContactGroupCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
