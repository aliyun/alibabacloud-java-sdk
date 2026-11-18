// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateAssetCategoryRequest extends TeaModel {
    /**
     * <p>The name of the category.</p>
     * <p>The name can be up to 64 bytes in length.</p>
     * <p>The name must be encoded in UTF-8.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Third-level subcategory</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The ID of the parent category.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    public static CreateAssetCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCategoryRequest self = new CreateAssetCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssetCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public CreateAssetCategoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
