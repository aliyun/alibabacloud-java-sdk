// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateAssetCategoryResponseBody extends TeaModel {
    /**
     * <p>The media asset category information.</p>
     */
    @NameInMap("Category")
    public CreateAssetCategoryResponseBodyCategory category;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAssetCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCategoryResponseBody self = new CreateAssetCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssetCategoryResponseBody setCategory(CreateAssetCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public CreateAssetCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public CreateAssetCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAssetCategoryResponseBodyCategory extends TeaModel {
        /**
         * <p>The ID of the created category.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The media asset category information.</p>
         * 
         * <strong>example:</strong>
         * <p>see below</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The level of the category. The level is 0 for level-1 categories, 1 for level-2 categories, and 2 for level-3 categories.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The ID of the parent category. If the ParentId parameter is left empty or set to a value less than 1, the default return value is -1, which indicates that the created category is the root folder.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static CreateAssetCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            CreateAssetCategoryResponseBodyCategory self = new CreateAssetCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public CreateAssetCategoryResponseBodyCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public CreateAssetCategoryResponseBodyCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public CreateAssetCategoryResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public CreateAssetCategoryResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
