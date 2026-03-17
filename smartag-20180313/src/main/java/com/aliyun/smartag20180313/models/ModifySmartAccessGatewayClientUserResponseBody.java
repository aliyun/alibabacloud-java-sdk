// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayClientUserResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth allocated to the client account. Unit: Kbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.1</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5F0078B5-8AAD-4B53-8351-4C91B8EA528A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The email address of the client account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("UserMail")
    public String userMail;

    /**
     * <p>The username of the client account.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static ModifySmartAccessGatewayClientUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayClientUserResponseBody self = new ModifySmartAccessGatewayClientUserResponseBody();
        return TeaModel.build(map, self);
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

    public ModifySmartAccessGatewayClientUserResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
