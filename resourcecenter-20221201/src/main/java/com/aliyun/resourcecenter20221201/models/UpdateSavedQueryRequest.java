// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateSavedQueryRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Name")
    public String name;

    @NameInMap("QueryId")
    public String queryId;

    public static UpdateSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSavedQueryRequest self = new UpdateSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSavedQueryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSavedQueryRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateSavedQueryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSavedQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
