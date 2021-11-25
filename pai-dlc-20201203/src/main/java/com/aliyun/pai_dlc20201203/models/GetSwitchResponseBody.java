// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSwitchResponseBody extends TeaModel {
    // 网段
    @NameInMap("CidrBlock")
    public String cidrBlock;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 交换机的id
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // 交换机的名称
    @NameInMap("VSwitchName")
    public String vSwitchName;

    // 所属VPC的id
    @NameInMap("VpcId")
    public String vpcId;

    public static GetSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchResponseBody self = new GetSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public GetSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwitchResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public GetSwitchResponseBody setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public GetSwitchResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
