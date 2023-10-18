// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpRequest extends TeaModel {
    /**
     * <p>The name of the review security group in which you want to query IP addresses. If you do not specify this parameter, IP addresses in all review security groups are queried.</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static ListAuditSecurityIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuditSecurityIpRequest self = new ListAuditSecurityIpRequest();
        return TeaModel.build(map, self);
    }

    public ListAuditSecurityIpRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
