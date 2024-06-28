// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnConnectionResponseBody extends TeaModel {
    /**
     * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1544666102000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The name of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>082AD562-B8DB-4BB2-861F-DA1FCA01FD76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-bp15oes1py4i6****</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static CreateVpnConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnConnectionResponseBody self = new CreateVpnConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpnConnectionResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CreateVpnConnectionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpnConnectionResponseBody setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

}
