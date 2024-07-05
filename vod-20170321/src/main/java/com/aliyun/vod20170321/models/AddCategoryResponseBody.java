// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryResponseBody extends TeaModel {
    /**
     * <p>The information about the category.</p>
     */
    @NameInMap("Category")
    public AddCategoryResponseBodyCategory category;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
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
         * <p>The ID of the category. You can use the value of this parameter when you call the <a href="~~UpdateCategory~~">UpdateCategory</a>, <a href="~~DeleteCategory~~">DeleteCategory</a>, and <a href="~~GetCategories~~">GetCategories</a> operations.</p>
         * 
         * <strong>example:</strong>
         * <p>10020</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The level of the category. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: level 1 category</li>
         * <li><strong>1</strong>: level 2 category</li>
         * <li><strong>1</strong>: level 3 category</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category.</p>
         * 
         * <strong>example:</strong>
         * <p>100012</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The type of the category. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: audio, video, and image files</li>
         * <li><strong>material</strong>: short video materials</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
