// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryRequest extends TeaModel {
    /**
     * <p>The name of the category.</p>
     * <ul>
     * <li>The value can be up to 64 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CateName")
    public String cateName;

    /**
     * <p>The ID of the parent category.</p>
     * <p>To obtain the category ID, perform the following steps: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. Choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong>. On the <strong>Audio and Video / Image Category</strong> or <strong>Short Video Material Category</strong> tab, view the category ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, the system creates a subcategory under the parent category. If you leave this parameter empty, the system creates a level 1 category.</li>
     * <li>You cannot modify, add, or delete level 1 categories of short video materials. You can create only subcategories under level 1 categories for short video materials. This parameter is required when you set <code>Type</code> to <code>material</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100012****</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the category. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> (default): audio, video, and image files</li>
     * <li><strong>material</strong>: short video materials</li>
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
