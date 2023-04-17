// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateConstraintRequest extends TeaModel {
    /**
     * <p>The configurations of the constraint.</p>
     * <br>
     * <p>Format: { "LocalRoleName": "\<role_name>" }.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the constraint.</p>
     */
    @NameInMap("ConstraintId")
    public String constraintId;

    /**
     * <p>The description of the constraint.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    public static UpdateConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConstraintRequest self = new UpdateConstraintRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConstraintRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateConstraintRequest setConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }
    public String getConstraintId() {
        return this.constraintId;
    }

    public UpdateConstraintRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
