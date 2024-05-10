// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryRequest extends TeaModel {
    /**
     * <p>The domain name of the image repository.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The additional parameter of the image repository. This parameter is required when you set the RegistryType parameter to **quay**. Valid values:</p>
     * <br>
     * <p>*   **namespace**</p>
     * <p>*   **authToken**</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   **1**: Internet</p>
     * <p>*   **2**: virtual private cloud (VPC)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetType")
    public Long netType;

    /**
     * <p>The password that is used to log on to the image repository.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port number.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <br>
     * <p>*   **1**: HTTP</p>
     * <p>*   **2**: HTTPS</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtocolType")
    public Long protocolType;

    /**
     * <p>The IP address of the image repository.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>>  You can call the [ListImageRegistryRegion](~~ListImageRegistryRegion~~) operation to query the IDs of supported regions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistryRegionId")
    public String registryRegionId;

    /**
     * <p>The type of the private image repository. Valid values:</p>
     * <br>
     * <p>*   **harbor**</p>
     * <p>*   **quay**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    /**
     * <p>The version of the image repository. Valid values:</p>
     * <br>
     * <p>*   **V1**</p>
     * <p>*   **V2**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistryVersion")
    public String registryVersion;

    /**
     * <p>The number of images that are scanned per hour.</p>
     */
    @NameInMap("TransPerHour")
    public Integer transPerHour;

    /**
     * <p>The username that is used to log on to the image repository.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the VPC.</p>
     */
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

    public AddPrivateRegistryRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
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
