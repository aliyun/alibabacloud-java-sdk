// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddClriskProductSceneRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentId")
    public Long parentId;

    public static AddClriskProductSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClriskProductSceneRequest self = new AddClriskProductSceneRequest();
        return TeaModel.build(map, self);
    }

    public AddClriskProductSceneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddClriskProductSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddClriskProductSceneRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
