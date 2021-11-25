// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetVpcResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Vpc的ID
    @NameInMap("VpcId")
    public Integer vpcId;

    // Vpc名称
    @NameInMap("VpcName")
    public String vpcName;

    public static GetVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcResponseBody self = new GetVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcResponseBody setVpcId(Integer vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public Integer getVpcId() {
        return this.vpcId;
    }

    public GetVpcResponseBody setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
