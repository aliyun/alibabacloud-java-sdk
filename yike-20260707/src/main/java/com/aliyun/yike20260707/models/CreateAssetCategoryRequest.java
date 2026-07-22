// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateAssetCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Third-level subcategory</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
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
