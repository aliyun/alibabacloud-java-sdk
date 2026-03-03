// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuthorizationResource extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("authorizerId")
    public String authorizerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>developer</p>
     */
    @NameInMap("authorizerType")
    public String authorizerType;

    public static AuthorizationResource build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationResource self = new AuthorizationResource();
        return TeaModel.build(map, self);
    }

    public AuthorizationResource setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public AuthorizationResource setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

}
