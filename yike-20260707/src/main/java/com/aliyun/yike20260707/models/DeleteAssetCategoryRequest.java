// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteAssetCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the value by using one of the following methods:</p>
     * <ul>
     * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of CategoryId in the response.</li>
     * <li>When you query categories by calling the ListAssetCategories operation, the category ID is the value of CategoryId in the corresponding entry in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    public static DeleteAssetCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetCategoryRequest self = new DeleteAssetCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAssetCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
