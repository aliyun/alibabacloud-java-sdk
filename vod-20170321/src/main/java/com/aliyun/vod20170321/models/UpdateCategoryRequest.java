// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    // The ID of the category.
    @NameInMap("CateId")
    public Long cateId;

    // The name of the category.
    // 
    // *   The value can be up to 64 bytes in length.
    // *   The string must be encoded in the UTF-8 format.
    @NameInMap("CateName")
    public String cateName;

    public static UpdateCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryRequest self = new UpdateCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateCategoryRequest setCateName(String cateName) {
        this.cateName = cateName;
        return this;
    }
    public String getCateName() {
        return this.cateName;
    }

}
