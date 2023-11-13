// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateSavedQueryRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Name")
    public String name;

    public static CreateSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedQueryRequest self = new CreateSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavedQueryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSavedQueryRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateSavedQueryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
