// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Enterprise extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("type")
    public String type;

    public static Enterprise build(java.util.Map<String, ?> map) throws Exception {
        Enterprise self = new Enterprise();
        return TeaModel.build(map, self);
    }

    public Enterprise setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public Enterprise setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Enterprise setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Enterprise setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Enterprise setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Enterprise setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
