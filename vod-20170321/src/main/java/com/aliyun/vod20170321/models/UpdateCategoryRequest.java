// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. You can specify only one category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> &gt; <strong>Audio/Video and Image Categories</strong> or <strong>Short Video Material Categories</strong> to view the category ID.</li>
     * <li>The category ID is returned when you call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10020****</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The category name.</p>
     * <ul>
     * <li>The name can be up to 64 bytes in length.</li>
     * <li>The name must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Landscape</p>
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
