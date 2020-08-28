// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpRequest extends TeaModel {
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("Ips")
    @Validation(required = true)
    public String ips;

    @NameInMap("OperateMode")
    public String operateMode;

    public static SetAuditSecurityIpRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpRequest self = new SetAuditSecurityIpRequest();
        return TeaModel.build(map, self);
    }

}
