// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayOspfRouteRequest extends TeaModel {
    /**
     * <p>The OSPF area ID.</p>
     * <p>Valid values: <strong>1</strong> to <strong>2147483647</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AreaId")
    public Integer areaId;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><p><strong>NONE</strong>: disables authentication.</p>
     * </li>
     * <li><p><strong>CLEARTEXT</strong>: uses plaintext authentication.</p>
     * </li>
     * <li><p><strong>MD5</strong>: uses MD5 authentication.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("AuthenticationType")
    public String authenticationType;

    /**
     * <p>Specifies whether to query only cross-account Smart Access Gateway instances. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The OSPF dead interval. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("DeadTime")
    public Integer deadTime;

    /**
     * <p>The interval at which Hello packets are sent. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("HelloTime")
    public Integer helloTime;

    /**
     * <p>The port name.</p>
     * <blockquote>
     * <p>This parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InterfaceName")
    public String interfaceName;

    /**
     * <p>The value of the MD5 key.</p>
     * <p>Valid values: <strong>1</strong> to <strong>47</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Md5Key")
    public String md5Key;

    /**
     * <p>The ID of the MD5 key.</p>
     * <p>Valid values: <strong>1</strong> to <strong>2147483647</strong>.</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>AuthenticationType</strong> is set to <strong>MD5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    /**
     * <p>The CIDR block.</p>
     * <blockquote>
     * <p>This parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("Networks")
    public String networks;

    /**
     * <p>The OSPF route cost.</p>
     * <blockquote>
     * <p>This parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("OspfCost")
    public Integer ospfCost;

    /**
     * <p>The OSPF area type.</p>
     * <blockquote>
     * <p>This parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NSSA</p>
     */
    @NameInMap("OspfNetworkType")
    public String ospfNetworkType;

    /**
     * <p>The password for plaintext authentication.</p>
     * <p>The password must be 1 to 8 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <blockquote>
     * <p>This parameter is required only when <strong>AuthenticationType</strong> is set to <strong>CLEARTEXT</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>duuf****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The route redistribution protocol.</p>
     * <blockquote>
     * <p>This parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OSPF</p>
     */
    @NameInMap("RedistributeProtocol")
    public String redistributeProtocol;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to obtain region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>109790620697****</p>
     */
    @NameInMap("ResourceUid")
    public String resourceUid;

    /**
     * <p>The OSPF router ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The Smart Access Gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-3manef62evrfr6****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the Smart Access Gateway device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4dk****</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    public static UpdateSmartAccessGatewayOspfRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayOspfRouteRequest self = new UpdateSmartAccessGatewayOspfRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }
    public Integer getAreaId() {
        return this.areaId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setNetworks(String networks) {
        this.networks = networks;
        return this;
    }
    public String getNetworks() {
        return this.networks;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setOspfCost(Integer ospfCost) {
        this.ospfCost = ospfCost;
        return this;
    }
    public Integer getOspfCost() {
        return this.ospfCost;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setOspfNetworkType(String ospfNetworkType) {
        this.ospfNetworkType = ospfNetworkType;
        return this;
    }
    public String getOspfNetworkType() {
        return this.ospfNetworkType;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRedistributeProtocol(String redistributeProtocol) {
        this.redistributeProtocol = redistributeProtocol;
        return this;
    }
    public String getRedistributeProtocol() {
        return this.redistributeProtocol;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
