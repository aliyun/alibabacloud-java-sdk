// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOceanBaseDataSourceRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("ConfigUrl")
    public String configUrl;

    @NameInMap("Description")
    public String description;

    @NameInMap("DrcPassword")
    public String drcPassword;

    @NameInMap("DrcUserName")
    public String drcUserName;

    @NameInMap("InnerDrcPassword")
    public String innerDrcPassword;

    @NameInMap("Ip")
    public String ip;

    /**
     * <p>LogProxy IP。</p>
     */
    @NameInMap("LogProxyIp")
    public String logProxyIp;

    @NameInMap("LogProxyPort")
    public String logProxyPort;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Tenant")
    public String tenant;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateOceanBaseDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOceanBaseDataSourceRequest self = new CreateOceanBaseDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateOceanBaseDataSourceRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateOceanBaseDataSourceRequest setConfigUrl(String configUrl) {
        this.configUrl = configUrl;
        return this;
    }
    public String getConfigUrl() {
        return this.configUrl;
    }

    public CreateOceanBaseDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOceanBaseDataSourceRequest setDrcPassword(String drcPassword) {
        this.drcPassword = drcPassword;
        return this;
    }
    public String getDrcPassword() {
        return this.drcPassword;
    }

    public CreateOceanBaseDataSourceRequest setDrcUserName(String drcUserName) {
        this.drcUserName = drcUserName;
        return this;
    }
    public String getDrcUserName() {
        return this.drcUserName;
    }

    public CreateOceanBaseDataSourceRequest setInnerDrcPassword(String innerDrcPassword) {
        this.innerDrcPassword = innerDrcPassword;
        return this;
    }
    public String getInnerDrcPassword() {
        return this.innerDrcPassword;
    }

    public CreateOceanBaseDataSourceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateOceanBaseDataSourceRequest setLogProxyIp(String logProxyIp) {
        this.logProxyIp = logProxyIp;
        return this;
    }
    public String getLogProxyIp() {
        return this.logProxyIp;
    }

    public CreateOceanBaseDataSourceRequest setLogProxyPort(String logProxyPort) {
        this.logProxyPort = logProxyPort;
        return this;
    }
    public String getLogProxyPort() {
        return this.logProxyPort;
    }

    public CreateOceanBaseDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOceanBaseDataSourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOceanBaseDataSourceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateOceanBaseDataSourceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateOceanBaseDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateOceanBaseDataSourceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateOceanBaseDataSourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
