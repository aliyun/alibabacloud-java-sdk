// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ExtraParam")
    public String extraParam;

    @NameInMap("NetType")
    public Long netType;

    @NameInMap("Password")
    public String password;

    @NameInMap("ProtocolType")
    public Long protocolType;

    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    @NameInMap("RegistryRegionId")
    public String registryRegionId;

    @NameInMap("RegistryType")
    public String registryType;

    @NameInMap("RegistryVersion")
    public String registryVersion;

    @NameInMap("TransPerHour")
    public Integer transPerHour;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VpcId")
    public String vpcId;

    public static AddPrivateRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateRegistryRequest self = new AddPrivateRegistryRequest();
        return TeaModel.build(map, self);
    }

    public AddPrivateRegistryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddPrivateRegistryRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public AddPrivateRegistryRequest setNetType(Long netType) {
        this.netType = netType;
        return this;
    }
    public Long getNetType() {
        return this.netType;
    }

    public AddPrivateRegistryRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddPrivateRegistryRequest setProtocolType(Long protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public Long getProtocolType() {
        return this.protocolType;
    }

    public AddPrivateRegistryRequest setRegistryHostIp(String registryHostIp) {
        this.registryHostIp = registryHostIp;
        return this;
    }
    public String getRegistryHostIp() {
        return this.registryHostIp;
    }

    public AddPrivateRegistryRequest setRegistryRegionId(String registryRegionId) {
        this.registryRegionId = registryRegionId;
        return this;
    }
    public String getRegistryRegionId() {
        return this.registryRegionId;
    }

    public AddPrivateRegistryRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public AddPrivateRegistryRequest setRegistryVersion(String registryVersion) {
        this.registryVersion = registryVersion;
        return this;
    }
    public String getRegistryVersion() {
        return this.registryVersion;
    }

    public AddPrivateRegistryRequest setTransPerHour(Integer transPerHour) {
        this.transPerHour = transPerHour;
        return this;
    }
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    public AddPrivateRegistryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AddPrivateRegistryRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
