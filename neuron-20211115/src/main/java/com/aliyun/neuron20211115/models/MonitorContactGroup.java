// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactGroup extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("contacts")
    public java.util.List<MonitorContact> contacts;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    /**
     * <strong>example:</strong>
     * <p>2022-05-01T00:00:00.000Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-05-01T00:00:00.000Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yani</p>
     */
    @NameInMap("name")
    public String name;

    public static MonitorContactGroup build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactGroup self = new MonitorContactGroup();
        return TeaModel.build(map, self);
    }

    public MonitorContactGroup setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public MonitorContactGroup setContacts(java.util.List<MonitorContact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<MonitorContact> getContacts() {
        return this.contacts;
    }

    public MonitorContactGroup setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public MonitorContactGroup setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MonitorContactGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MonitorContactGroup setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorContactGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
