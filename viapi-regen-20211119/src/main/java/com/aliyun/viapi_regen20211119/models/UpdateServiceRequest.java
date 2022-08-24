// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    @NameInMap("AuthorizationType")
    public String authorizationType;

    @NameInMap("AuthorizedAccount")
    public String authorizedAccount;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public UpdateServiceRequest setAuthorizedAccount(String authorizedAccount) {
        this.authorizedAccount = authorizedAccount;
        return this;
    }
    public String getAuthorizedAccount() {
        return this.authorizedAccount;
    }

    public UpdateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
