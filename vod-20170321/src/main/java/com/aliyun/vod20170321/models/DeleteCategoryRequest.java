// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can specify only one category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration management</strong> &gt; <strong>Media asset management configuration</strong> &gt; <strong>Category management</strong> to view the category ID.</li>
     * <li>Call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category. The category ID is returned in the response.</li>
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
