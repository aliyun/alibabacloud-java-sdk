// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayClientUserResponseBody extends TeaModel {
    @NameInMap("UserName")
    public String userName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserMail")
    public String userMail;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ClientIp")
    public String clientIp;

    public static ModifySmartAccessGatewayClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayClientUserResponseBody self = new ModifySmartAccessGatewayClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayClientUserResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifySmartAccessGatewayClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySmartAccessGatewayClientUserResponseBody setUserMail(String userMail) {
        this.userMail = userMail;
        return this;
    }
    public String getUserMail() {
        return this.userMail;
    }

    public ModifySmartAccessGatewayClientUserResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifySmartAccessGatewayClientUserResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

}
