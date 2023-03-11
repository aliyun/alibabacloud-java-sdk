// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageRegistryRequest extends TeaModel {
    /**
     * <p>The domain name of the image repository.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The additional parameters of the image repository. The value of this parameter contains the following fields:</p>
     * <br>
     * <p>*   **namespace**: the namespace</p>
     * <p>*   **authToken**: the authorization token</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   **1**: Internet</p>
     * <p>*   **2**: Virtual Private Cloud (VPC)</p>
     */
    @NameInMap("NetType")
    public Integer netType;

    /**
     * <p>The password.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The number of days during which assets can be retained.</p>
     */
    @NameInMap("PersistenceDay")
    public Integer persistenceDay;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <br>
     * <p>*   **1**: HTTP</p>
     * <p>*   **2**: HTTPS</p>
     */
    @NameInMap("ProtocolType")
    public Integer protocolType;

    /**
     * <p>The region ID of the image repository.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address of the image repository.</p>
     */
    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    /**
     * <p>The alias of the image repository.</p>
     */
    @NameInMap("RegistryName")
    public String registryName;

    /**
     * <p>The type of the image repository. Valid values:</p>
     * <br>
     * <p>*   **CI/CD**: Jenkins</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    /**
     * <p>The version of the image repository. Default value: -. Valid values:</p>
     * <br>
     * <p>*   **-**: the default version</p>
     * <p>*   **V1**: V1.0</p>
     * <p>*   **V2**: V2.0</p>
     */
    @NameInMap("RegistryVersion")
    public String registryVersion;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The number of images that can be scanned per hour.</p>
     */
    @NameInMap("TransPerHour")
    public Integer transPerHour;

    /**
     * <p>The username.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The whitelist of IP addresses.</p>
     */
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
