// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>Modifies a video category.</p>
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
