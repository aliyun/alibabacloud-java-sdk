// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryResponseBody extends TeaModel {
    // The information about the video category.
    @NameInMap("Category")
    public AddCategoryResponseBodyCategory category;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static AddCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponseBody self = new AddCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCategoryResponseBody setCategory(AddCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public AddCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public AddCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddCategoryResponseBodyCategory extends TeaModel {
        // The ID of the video category.
        @NameInMap("CateId")
        public Long cateId;

        // The name of the category.
        // 
        // - The value can be up to 64 bytes in length.
        // - The string must be encoded in the UTF-8 format.
        @NameInMap("CateName")
        public String cateName;

        // The level of the category. A value of **0** indicates a level 1 category.
        @NameInMap("Level")
        public Long level;

        // The ID of the parent category. The parent category ID of a level 1 category is **-1**.
        @NameInMap("ParentId")
        public Long parentId;

        // The type of the category. Valid values:
        // 
        // - **default** (default): default category
        // - **material**: material category
        @NameInMap("Type")
        public String type;

        public static AddCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            AddCategoryResponseBodyCategory self = new AddCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public AddCategoryResponseBodyCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public AddCategoryResponseBodyCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public AddCategoryResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public AddCategoryResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public AddCategoryResponseBodyCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
