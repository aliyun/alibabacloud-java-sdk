// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateAssetCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of CategoryId in the response.</li>
     * <li>When you query categories by calling the ListAssetCategories operation, the category ID is the value of CategoryId in the corresponding entry in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The updated category name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scenery</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    public static UpdateAssetCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetCategoryRequest self = new UpdateAssetCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssetCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateAssetCategoryRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

}
