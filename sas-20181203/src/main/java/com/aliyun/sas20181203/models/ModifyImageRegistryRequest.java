// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageRegistryRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Password")
    public String password;

    @NameInMap("TransPerHour")
    public Integer transPerHour;

    @NameInMap("UserName")
    public String userName;

    public static ModifyImageRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageRegistryRequest self = new ModifyImageRegistryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageRegistryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyImageRegistryRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyImageRegistryRequest setTransPerHour(Integer transPerHour) {
        this.transPerHour = transPerHour;
        return this;
    }
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    public ModifyImageRegistryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
