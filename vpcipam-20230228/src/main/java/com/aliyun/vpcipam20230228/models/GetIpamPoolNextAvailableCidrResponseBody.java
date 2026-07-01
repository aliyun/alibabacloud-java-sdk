// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolNextAvailableCidrResponseBody extends TeaModel {
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIpamPoolNextAvailableCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolNextAvailableCidrResponseBody self = new GetIpamPoolNextAvailableCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolNextAvailableCidrResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public GetIpamPoolNextAvailableCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
