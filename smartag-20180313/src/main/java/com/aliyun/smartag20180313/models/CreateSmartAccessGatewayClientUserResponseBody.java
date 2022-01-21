// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayClientUserResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserMail")
    public String userMail;

    @NameInMap("UserName")
    public String userName;

    public static CreateSmartAccessGatewayClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayClientUserResponseBody self = new CreateSmartAccessGatewayClientUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayClientUserResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateSmartAccessGatewayClientUserResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateSmartAccessGatewayClientUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmartAccessGatewayClientUserResponseBody setUserMail(String userMail) {
        this.userMail = userMail;
        return this;
    }
    public String getUserMail() {
        return this.userMail;
    }

    public CreateSmartAccessGatewayClientUserResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
