// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpRequest extends TeaModel {
    /**
     * <p>The time when the review security group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
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
