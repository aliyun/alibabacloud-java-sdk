// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    @NameInMap("AuthorizationType")
    public String authorizationType;

    @NameInMap("AuthorizedAccount")
    public String authorizedAccount;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("TrainTaskId")
    public Long trainTaskId;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public CreateServiceRequest setAuthorizedAccount(String authorizedAccount) {
        this.authorizedAccount = authorizedAccount;
        return this;
    }
    public String getAuthorizedAccount() {
        return this.authorizedAccount;
    }

    public CreateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceRequest setTrainTaskId(Long trainTaskId) {
        this.trainTaskId = trainTaskId;
        return this;
    }
    public Long getTrainTaskId() {
        return this.trainTaskId;
    }

}
