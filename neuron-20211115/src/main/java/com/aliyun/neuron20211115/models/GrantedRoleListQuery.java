// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GrantedRoleListQuery extends TeaModel {
    @NameInMap("authorizerId")
    public String authorizerId;

    @NameInMap("authorizerType")
    public String authorizerType;

    @NameInMap("name")
    public String name;

    public static GrantedRoleListQuery build(java.util.Map<String, ?> map) throws Exception {
        GrantedRoleListQuery self = new GrantedRoleListQuery();
        return TeaModel.build(map, self);
    }

    public GrantedRoleListQuery setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public GrantedRoleListQuery setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public GrantedRoleListQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
