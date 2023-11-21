// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateSavedQueryRequest extends TeaModel {
    /**
     * <p>The description of the template.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The query statement in the template.</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The name of the template.</p>
     * <br>
     * <p>*   The name must be 1 to 64 characters in length.</p>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must be unique.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the template.</p>
     */
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
