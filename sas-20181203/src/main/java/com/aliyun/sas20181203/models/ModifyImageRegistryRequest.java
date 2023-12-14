// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageRegistryRequest extends TeaModel {
    /**
     * <p>The ID of the image repository. You can call the listImageRegistry operation to query the ID of the image repository.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The password.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The number of images that are scanned per hour.</p>
     */
    @NameInMap("TransPerHour")
    public Integer transPerHour;

    /**
     * <p>The username.</p>
     */
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
