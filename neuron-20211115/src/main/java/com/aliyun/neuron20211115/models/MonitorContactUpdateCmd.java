// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactUpdateCmd extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("phone")
    public String phone;

    public static MonitorContactUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactUpdateCmd self = new MonitorContactUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorContactUpdateCmd setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public MonitorContactUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorContactUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorContactUpdateCmd setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
