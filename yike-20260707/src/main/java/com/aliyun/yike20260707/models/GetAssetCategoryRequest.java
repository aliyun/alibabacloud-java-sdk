// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAssetCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the category ID by using the following methods:</p>
     * <ul>
     * <li><p>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of CategoryId in the response.</p>
     * </li>
     * <li><p>When you query the category list by calling the ListAssetCategories operation, the category ID is the value of CategoryId in the corresponding entry in the response.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>scenery</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    public static GetAssetCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetCategoryRequest self = new GetAssetCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
