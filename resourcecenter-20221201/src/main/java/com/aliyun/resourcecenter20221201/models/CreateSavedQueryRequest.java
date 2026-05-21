// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateSavedQueryRequest extends TeaModel {
    /**
     * <p>The description of the template.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The query statement in the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM resources;</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The name of the template.</p>
     * <ul>
     * <li>The name must be 1 to 64 characters in length.</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must be unique.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Query of All Alibaba Cloud Resources</p>
     */
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
