// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The IPv4 CIDR block to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The version of the IP address. Valid values:</p>
     * <ul>
     * <li><strong>IPV4</strong>: the IPv4 address.</li>
     * <li><strong>IPV6</strong>: the IPv6 address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1221A1F-2ACD-4592-8F27-474E02883159</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateVpcCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockResponseBody self = new AssociateVpcCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateVpcCidrBlockResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public AssociateVpcCidrBlockResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AssociateVpcCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
