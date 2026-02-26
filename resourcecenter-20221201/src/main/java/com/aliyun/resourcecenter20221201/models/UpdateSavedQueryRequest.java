// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateSavedQueryRequest extends TeaModel {
    /**
     * <p>The description of the template.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>查询我的所有资源，返回所有的列。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expression of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM resources;</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The name of the template.</p>
     * <ul>
     * <li><p>The name must be 1 to 64 characters in length.</p>
     * </li>
     * <li><p>It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>It must be globally unique.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>查询我的所有资源。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cq-GeAck****</p>
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
