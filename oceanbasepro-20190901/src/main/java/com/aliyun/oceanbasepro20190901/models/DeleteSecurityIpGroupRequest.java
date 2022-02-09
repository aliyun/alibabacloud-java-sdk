// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // IP安全白名单组的组名。 由小写英文字符开头，由小写英文字符或者数字结尾，只能包含小写英文字符，数字和下划线，长度在 2-32 个字符之间。
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    public static DeleteSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIpGroupRequest self = new DeleteSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

}
