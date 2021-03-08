// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpRequest extends TeaModel {
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("Ips")
    public String ips;

    @NameInMap("OperateMode")
    public String operateMode;

    public static SetAuditSecurityIpRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpRequest self = new SetAuditSecurityIpRequest();
        return TeaModel.build(map, self);
    }

    public SetAuditSecurityIpRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public SetAuditSecurityIpRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

    public SetAuditSecurityIpRequest setOperateMode(String operateMode) {
        this.operateMode = operateMode;
        return this;
    }
    public String getOperateMode() {
        return this.operateMode;
    }

}
