// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpAttributeResponseBody extends TeaModel {
    /**
     * <p>The creation time of the queried NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-16T16:47Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The ID of the VPC NAT gateway instance to which the queried NAT IP address belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8v16wgvtq26vh59****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The queried NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.34</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The address range where the queried NAT IP address is located.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>Description of the queried NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("NatIpDescription")
    public String natIpDescription;

    /**
     * <p>The ID of the queried NAT IP address instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatip-gw8y7q3cpk3fggs87****</p>
     */
    @NameInMap("NatIpId")
    public String natIpId;

    /**
     * <p>Name of the queried NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NatIpName")
    public String natIpName;

    /**
     * <p>The status of the queried NAT IP address. Values:</p>
     * <ul>
     * <li><strong>Available</strong>: Available.</li>
     * <li><strong>Deleting</strong>: Deleting.</li>
     * <li><strong>Creating</strong>: Creating.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("NatIpStatus")
    public String natIpStatus;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D55DB90-0D57-46AB-841D-1D4238514AC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNatIpAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpAttributeResponseBody self = new GetNatIpAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatIpAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetNatIpAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatIpAttributeResponseBody setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public GetNatIpAttributeResponseBody setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public GetNatIpAttributeResponseBody setNatIpDescription(String natIpDescription) {
        this.natIpDescription = natIpDescription;
        return this;
    }
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    public GetNatIpAttributeResponseBody setNatIpId(String natIpId) {
        this.natIpId = natIpId;
        return this;
    }
    public String getNatIpId() {
        return this.natIpId;
    }

    public GetNatIpAttributeResponseBody setNatIpName(String natIpName) {
        this.natIpName = natIpName;
        return this;
    }
    public String getNatIpName() {
        return this.natIpName;
    }

    public GetNatIpAttributeResponseBody setNatIpStatus(String natIpStatus) {
        this.natIpStatus = natIpStatus;
        return this;
    }
    public String getNatIpStatus() {
        return this.natIpStatus;
    }

    public GetNatIpAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
