// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSecurityGroupResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 所属vpc的id
    @NameInMap("VpcId")
    public String vpcId;

    // 安全组id
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // 安全组名称
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static GetSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityGroupResponseBody self = new GetSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityGroupResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetSecurityGroupResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public GetSecurityGroupResponseBody setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
