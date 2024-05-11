// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateCrowdRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("Users")
    public String users;

    public static UpdateCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrowdRequest self = new UpdateCrowdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrowdRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCrowdRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public UpdateCrowdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCrowdRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
