// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The name of the category.</p>
     * <br>
     * <p>*   The value can be up to 64 bytes in length.</p>
     * <p>*   The string must be encoded in the UTF-8 format.</p>
     */
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
