// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeKmsKeyRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("KmsKey")
    public String kmsKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeKmsKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeyRequest self = new DescribeKmsKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeKmsKeyRequest setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
        return this;
    }
    public String getKmsKey() {
        return this.kmsKey;
    }

    public DescribeKmsKeyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
