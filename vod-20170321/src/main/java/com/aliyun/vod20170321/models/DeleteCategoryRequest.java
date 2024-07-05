// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCategoryRequest extends TeaModel {
    /**
     * <p>The ID of the category. You can specify only one ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. Choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the Audio and Video / Image Category or Short Video Material Category tab, view the category ID.</li>
     * <li>Obtain the category ID from the response to the <a href="~~AddCategory~~">AddCategory</a> operation.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify the ID of a parent category, all subcategories under the parent category are deleted at the same time.</p>
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
