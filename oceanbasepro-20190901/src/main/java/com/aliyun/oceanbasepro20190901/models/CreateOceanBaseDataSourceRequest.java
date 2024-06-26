// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOceanBaseDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cluster_name</p>
     */
    @NameInMap("Cluster")
    public String cluster;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx.xxx.xxx.2:2883/services?Action=ObRootServiceInfo&User_ID=alibaba&UID=ocpmaster&ObRegion=ob_1***29.admin">http://xxx.xxx.xxx.2:2883/services?Action=ObRootServiceInfo&amp;User_ID=alibaba&amp;UID=ocpmaster&amp;ObRegion=ob_1***29.admin</a></p>
     */
    @NameInMap("ConfigUrl")
    public String configUrl;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>pas***</p>
     */
    @NameInMap("DrcPassword")
    public String drcPassword;

    /**
     * <strong>example:</strong>
     * <p>user_na***</p>
     */
    @NameInMap("DrcUserName")
    public String drcUserName;

    /**
     * <strong>example:</strong>
     * <p>in***</p>
     */
    @NameInMap("InnerDrcPassword")
    public String innerDrcPassword;

    /**
     * <strong>example:</strong>
     * <p>xxx.xxx.xxx.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>LogProxy IP。</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("LogProxyIp")
    public String logProxyIp;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("LogProxyPort")
    public String logProxyPort;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pass_word</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>2883</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant_name</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OB_MYSQL_VPC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_name</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1d2q3mhg9i23ofi****</p>
     */
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
