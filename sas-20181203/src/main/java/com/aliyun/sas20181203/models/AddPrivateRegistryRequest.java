// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPrivateRegistryRequest extends TeaModel {
    /**
     * <p>The domain name of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The additional parameter of the image repository. This parameter is required when you set the RegistryType parameter to <strong>quay</strong>. Valid values:</p>
     * <ul>
     * <li><strong>namespace</strong></li>
     * <li><strong>authToken</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;namespace&quot;:&quot;aa&quot;,&quot;authToken&quot;:&quot;aa&quot;}]</p>
     */
    @NameInMap("ExtraParam")
    public String extraParam;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Internet</li>
     * <li><strong>2</strong>: virtual private cloud (VPC)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetType")
    public Long netType;

    /**
     * <p>The password that is used to log on to the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: HTTP</li>
     * <li><strong>2</strong>: HTTPS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProtocolType")
    public Long protocolType;

    /**
     * <p>The IP address of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><code>114.55.**.**</code></p>
     */
    @NameInMap("RegistryHostIp")
    public String registryHostIp;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListImageRegistryRegion~~">ListImageRegistryRegion</a> operation to query the IDs of supported regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegistryRegionId")
    public String registryRegionId;

    /**
     * <p>The type of the private image repository. Valid values:</p>
     * <ul>
     * <li><strong>harbor</strong></li>
     * <li><strong>quay</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>harbor</p>
     */
    @NameInMap("RegistryType")
    public String registryType;

    /**
     * <p>The version of the image repository. Valid values:</p>
     * <ul>
     * <li><strong>V1</strong></li>
     * <li><strong>V2</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("RegistryVersion")
    public String registryVersion;

    /**
     * <p>The number of images that are scanned per hour.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TransPerHour")
    public Integer transPerHour;

    /**
     * <p>The username that is used to log on to the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9hs3e5*******908kd</p>
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
