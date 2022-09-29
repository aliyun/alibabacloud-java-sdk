// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListGrantedRolesRequest extends TeaModel {
    @NameInMap("authorizer_id")
    public String authorizerId;

    @NameInMap("authorizer_type")
    public String authorizerType;

    @NameInMap("name")
    public String name;

    public static ListGrantedRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGrantedRolesRequest self = new ListGrantedRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListGrantedRolesRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public ListGrantedRolesRequest setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public ListGrantedRolesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
