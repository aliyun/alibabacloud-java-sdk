// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ViewPoint")
    public String viewPointShrink;

    public static UpdateSubSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneShrinkRequest self = new UpdateSubSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSubSceneShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSubSceneShrinkRequest setViewPointShrink(String viewPointShrink) {
        this.viewPointShrink = viewPointShrink;
        return this;
    }
    public String getViewPointShrink() {
        return this.viewPointShrink;
    }

}
