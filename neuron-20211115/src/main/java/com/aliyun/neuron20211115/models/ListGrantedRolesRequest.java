// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListGrantedRolesRequest extends TeaModel {
    @NameInMap("authorizerId")
    public String authorizerId;

    @NameInMap("authorizerType")
    public String authorizerType;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

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

    public ListGrantedRolesRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListGrantedRolesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
