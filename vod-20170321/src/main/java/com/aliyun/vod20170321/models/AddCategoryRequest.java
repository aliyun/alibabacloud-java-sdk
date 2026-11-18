// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>The category name.</p>
     * <ul>
     * <li>It can be up to 64 bytes in length.</li>
     * <li>It is encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Comedy</p>
     */
    @NameInMap("CateName")
    public String cateName;

    /**
     * <p>The ID of the parent category.</p>
     * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> &gt; <strong>Audio/Video/Image Categories</strong> or <strong>Short Video Material Categories</strong> to view the category ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, a subcategory is created under the specified parent category. If you do not specify this parameter, a level-1 category is created.</li>
     * <li>All level-1 categories for short video materials are built-in and cannot be modified, added, or deleted. You can only create subcategories under level-1 categories. Therefore, this parameter is required when <code>Type</code> is set to <code>material</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100012****</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The category type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: audio, video, and image categories. This is the default value.</li>
     * <li><strong>material</strong>: short video material categories.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryRequest self = new AddCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddCategoryRequest setCateName(String cateName) {
        this.cateName = cateName;
        return this;
    }
    public String getCateName() {
        return this.cateName;
    }

    public AddCategoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public AddCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
