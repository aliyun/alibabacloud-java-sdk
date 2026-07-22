// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteAssetCategoryRequest extends TeaModel {
    /**
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
