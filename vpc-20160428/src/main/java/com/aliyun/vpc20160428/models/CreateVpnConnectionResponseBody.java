// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    @NameInMap("Name")
    public String name;

    public static CreateVpnConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionResponseBody self = new CreateVpnConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnConnectionResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnConnectionResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public CreateVpnConnectionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
