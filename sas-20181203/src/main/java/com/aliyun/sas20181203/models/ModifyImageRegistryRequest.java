// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyImageRegistryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the image repository. You can call the listImageRegistry operation to query the ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>390103286</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The password.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    /**
     * <p>The number of images that are scanned per hour.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TransPerHour")
    public Integer transPerHour;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ModifyImageRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageRegistryRequest self = new ModifyImageRegistryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageRegistryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
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

    public ModifyImageRegistryRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyImageRegistryRequest setRegistryHostIp(String registryHostIp) {
        this.registryHostIp = registryHostIp;
        return this;
    }
    public String getRegistryHostIp() {
        return this.registryHostIp;
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
