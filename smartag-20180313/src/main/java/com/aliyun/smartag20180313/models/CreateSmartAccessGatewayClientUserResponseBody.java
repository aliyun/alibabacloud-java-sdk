// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayClientUserResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth value. Unit: Kbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The IP address of the client app.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72E82F5E-66E8-4C22-BF1F-5CEB7DC132E7</p>
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
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>doc</p>
     */
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
