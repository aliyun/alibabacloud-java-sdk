// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryResponseBody extends TeaModel {
    /**
     * <p>The information about the video category.</p>
     */
    @NameInMap("Category")
    public AddCategoryResponseBodyCategory category;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the video category.</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * <br>
         * <p>- The value can be up to 64 bytes in length.</p>
         * <p>- The string must be encoded in the UTF-8 format.</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category. A value of **0** indicates a level 1 category.</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category. The parent category ID of a level 1 category is **-1**.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The type of the category. Valid values:</p>
         * <br>
         * <p>- **default** (default): default category</p>
         * <p>- **material**: material category</p>
         */
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
