// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAssetCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of the CategoryId response parameter.</li>
     * <li>When you query the category list by calling the ListAssetCategories operation, the category ID is the value of the CategoryId parameter in the corresponding returned entry.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>45</p>
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
