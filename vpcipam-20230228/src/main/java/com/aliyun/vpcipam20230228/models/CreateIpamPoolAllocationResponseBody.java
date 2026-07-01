// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolAllocationResponseBody extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    @NameInMap("RequestId")
    public String requestId;

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
