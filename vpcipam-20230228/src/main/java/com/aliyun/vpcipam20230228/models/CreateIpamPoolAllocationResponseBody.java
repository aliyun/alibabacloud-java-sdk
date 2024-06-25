// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolAllocationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <strong>example:</strong>
     * <p>ipam-pool-alloc-112za33e4****</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    /**
     * <strong>example:</strong>
     * <p>CE9CDAE5-341E-5D0B-AC8A-2BAC707D3EB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    public static CreateIpamPoolAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolAllocationResponseBody self = new CreateIpamPoolAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolAllocationResponseBody setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateIpamPoolAllocationResponseBody setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        return this;
    }
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    public CreateIpamPoolAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpamPoolAllocationResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

}
