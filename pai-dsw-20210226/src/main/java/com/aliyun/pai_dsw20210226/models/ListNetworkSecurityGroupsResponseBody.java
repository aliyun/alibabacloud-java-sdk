// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkSecurityGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // security groups
    @NameInMap("SecurityGroups")
    public java.util.List<SecurityGroup> securityGroups;

    public static ListNetworkSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkSecurityGroupsResponseBody self = new ListNetworkSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkSecurityGroupsResponseBody setSecurityGroups(java.util.List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<SecurityGroup> getSecurityGroups() {
        return this.securityGroups;
    }

}
