// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>test</p>
     */
    @NameInMap("CateName")
    public String cateName;

    /**
     * <p>test</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the category. Valid values:</p>
     * <br>
     * <p>- **default** (default): default category</p>
     * <p>- **material**: material category</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryRequest self = new AddCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddCategoryRequest setCateName(String cateName) {
        this.cateName = cateName;
        return this;
    }
    public String getCateName() {
        return this.cateName;
    }

    public AddCategoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public AddCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
