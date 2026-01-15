// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatIpCidrAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the VPC NAT gateway instance to which the queried NAT IP address range belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8v16wgvtq26vh59****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The queried NAT IP address range.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("NatIpCidr")
    public String natIpCidr;

    /**
     * <p>Description of the queried NAT IP address range.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("NatIpCidrDescription")
    public String natIpCidrDescription;

    /**
     * <p>The instance ID of the queried NAT IP address range.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatcidr-gw8lhqtvdn4qnea****</p>
     */
    @NameInMap("NatIpCidrId")
    public String natIpCidrId;

    /**
     * <p>The name of the queried NAT IP address range.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("NatIpCidrName")
    public String natIpCidrName;

    /**
     * <p>The status of the queried NAT IP address segment. Values:</p>
     * <ul>
     * <li>Available: Available status.</li>
     * <li>Deleting: In the process of being deleted.</li>
     * <li>Creating: In the process of being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("NatIpCidrStatus")
    public String natIpCidrStatus;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNatIpCidrAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatIpCidrAttributeResponseBody self = new GetNatIpCidrAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatIpCidrAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatIpCidrAttributeResponseBody setNatIpCidr(String natIpCidr) {
        this.natIpCidr = natIpCidr;
        return this;
    }
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    public GetNatIpCidrAttributeResponseBody setNatIpCidrDescription(String natIpCidrDescription) {
        this.natIpCidrDescription = natIpCidrDescription;
        return this;
    }
    public String getNatIpCidrDescription() {
        return this.natIpCidrDescription;
    }

    public GetNatIpCidrAttributeResponseBody setNatIpCidrId(String natIpCidrId) {
        this.natIpCidrId = natIpCidrId;
        return this;
    }
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    public GetNatIpCidrAttributeResponseBody setNatIpCidrName(String natIpCidrName) {
        this.natIpCidrName = natIpCidrName;
        return this;
    }
    public String getNatIpCidrName() {
        return this.natIpCidrName;
    }

    public GetNatIpCidrAttributeResponseBody setNatIpCidrStatus(String natIpCidrStatus) {
        this.natIpCidrStatus = natIpCidrStatus;
        return this;
    }
    public String getNatIpCidrStatus() {
        return this.natIpCidrStatus;
    }

    public GetNatIpCidrAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
