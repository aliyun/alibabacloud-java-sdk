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
     * <p>The operation that you want to perform. Set the value to **AddCategory**.</p>
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
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>AddCategory</p>
         */
        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Level")
        public Long level;

        /**
         * <p>Creates a video category.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The ID of the video category.</p>
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
