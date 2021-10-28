// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLDAPInfoResponseBody extends TeaModel {
    @NameInMap("BaseDN")
    public String baseDN;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("IsTls")
    public Boolean isTls;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootDN")
    public String rootDN;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayLDAPInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLDAPInfoResponseBody self = new DescribeGatewayLDAPInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLDAPInfoResponseBody setBaseDN(String baseDN) {
        this.baseDN = baseDN;
        return this;
    }
    public String getBaseDN() {
        return this.baseDN;
    }

    public DescribeGatewayLDAPInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayLDAPInfoResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public DescribeGatewayLDAPInfoResponseBody setIsTls(Boolean isTls) {
        this.isTls = isTls;
        return this;
    }
    public Boolean getIsTls() {
        return this.isTls;
    }

    public DescribeGatewayLDAPInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayLDAPInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayLDAPInfoResponseBody setRootDN(String rootDN) {
        this.rootDN = rootDN;
        return this;
    }
    public String getRootDN() {
        return this.rootDN;
    }

    public DescribeGatewayLDAPInfoResponseBody setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public DescribeGatewayLDAPInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
