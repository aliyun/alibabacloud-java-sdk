// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAssetCategoryRequest extends TeaModel {
    /**
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
