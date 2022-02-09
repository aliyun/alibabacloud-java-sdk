// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // IP安全白名单组的组名。 由小写英文字符开头，由小写英文字符或者数字结尾，只能包含小写英文字符，数字和下划线，长度在 2-32 个字符之间。
    @NameInMap("SecurityIpGroupName")
    public String securityIpGroupName;

    // IP安全白名单列表。 其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。最多可设置 40 个。
    @NameInMap("SecurityIps")
    public String securityIps;

    public static CreateSecurityIpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIpGroupRequest self = new CreateSecurityIpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIpGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSecurityIpGroupRequest setSecurityIpGroupName(String securityIpGroupName) {
        this.securityIpGroupName = securityIpGroupName;
        return this;
    }
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    public CreateSecurityIpGroupRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

}
