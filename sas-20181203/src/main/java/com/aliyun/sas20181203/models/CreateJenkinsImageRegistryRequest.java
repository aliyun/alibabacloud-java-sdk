// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ExtraParam")
    public String extraParam;

    @NameInMap("NetType")
    public Integer netType;

    @NameInMap("Password")
    public String password;

    @NameInMap("PersistenceDay")
    public Integer persistenceDay;

    @NameInMap("ProtocolType")
    public Integer protocolType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    @NameInMap("RegistryName")
    public String registryName;

    @NameInMap("RegistryType")
    public String registryType;

    @NameInMap("RegistryVersion")
    public String registryVersion;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TransPerHour")
    public Integer transPerHour;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WhiteList")
    public String whiteList;

    public static CreateJenkinsImageRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageRegistryRequest self = new CreateJenkinsImageRegistryRequest();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageRegistryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateJenkinsImageRegistryRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public CreateJenkinsImageRegistryRequest setNetType(Integer netType) {
        this.netType = netType;
        return this;
    }
    public Integer getNetType() {
        return this.netType;
    }

    public CreateJenkinsImageRegistryRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateJenkinsImageRegistryRequest setPersistenceDay(Integer persistenceDay) {
        this.persistenceDay = persistenceDay;
        return this;
    }
    public Integer getPersistenceDay() {
        return this.persistenceDay;
    }

    public CreateJenkinsImageRegistryRequest setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public Integer getProtocolType() {
        return this.protocolType;
    }

    public CreateJenkinsImageRegistryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateJenkinsImageRegistryRequest setRegistryHostIp(String registryHostIp) {
        this.registryHostIp = registryHostIp;
        return this;
    }
    public String getRegistryHostIp() {
        return this.registryHostIp;
    }

    public CreateJenkinsImageRegistryRequest setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }
    public String getRegistryName() {
        return this.registryName;
    }

    public CreateJenkinsImageRegistryRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public CreateJenkinsImageRegistryRequest setRegistryVersion(String registryVersion) {
        this.registryVersion = registryVersion;
        return this;
    }
    public String getRegistryVersion() {
        return this.registryVersion;
    }

    public CreateJenkinsImageRegistryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateJenkinsImageRegistryRequest setTransPerHour(Integer transPerHour) {
        this.transPerHour = transPerHour;
        return this;
    }
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    public CreateJenkinsImageRegistryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateJenkinsImageRegistryRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateJenkinsImageRegistryRequest setWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public String getWhiteList() {
        return this.whiteList;
    }

}
