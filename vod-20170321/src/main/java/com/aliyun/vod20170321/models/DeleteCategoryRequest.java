// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    public static DeleteCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryRequest self = new DeleteCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCategoryRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

}
