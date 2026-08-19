// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. Only a single category ID is supported. You can obtain the category ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> to view the category ID.</li>
     * <li>Obtain the category ID from the response of the <a href="~~AddCategory~~">AddCategory</a> operation when you create a category.</li>
     * </ul>
     * <blockquote>
     * <p>If the specified category ID is the ID of a parent category, the parent category and all its subcategories are deleted. Proceed with caution.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3300****</p>
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
