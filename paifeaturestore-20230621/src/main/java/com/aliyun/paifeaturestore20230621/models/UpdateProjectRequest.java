// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
