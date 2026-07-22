// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAssetCategoryResponseBody extends TeaModel {
    @NameInMap("Category")
    public GetAssetCategoryResponseBodyCategory category;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCategories")
    public java.util.List<GetAssetCategoryResponseBodySubCategories> subCategories;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SubTotal")
    public Long subTotal;

    public static GetAssetCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetCategoryResponseBody self = new GetAssetCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetCategoryResponseBody setCategory(GetAssetCategoryResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public GetAssetCategoryResponseBodyCategory getCategory() {
        return this.category;
    }

    public GetAssetCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetCategoryResponseBody setSubCategories(java.util.List<GetAssetCategoryResponseBodySubCategories> subCategories) {
        this.subCategories = subCategories;
        return this;
    }
    public java.util.List<GetAssetCategoryResponseBodySubCategories> getSubCategories() {
        return this.subCategories;
    }

    public GetAssetCategoryResponseBody setSubTotal(Long subTotal) {
        this.subTotal = subTotal;
        return this;
    }
    public Long getSubTotal() {
        return this.subTotal;
    }

    public static class GetAssetCategoryResponseBodyCategory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>scenery</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static GetAssetCategoryResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            GetAssetCategoryResponseBodyCategory self = new GetAssetCategoryResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public GetAssetCategoryResponseBodyCategory setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetAssetCategoryResponseBodyCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetAssetCategoryResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetAssetCategoryResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class GetAssetCategoryResponseBodySubCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>sea</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubTotal")
        public Long subTotal;

        public static GetAssetCategoryResponseBodySubCategories build(java.util.Map<String, ?> map) throws Exception {
            GetAssetCategoryResponseBodySubCategories self = new GetAssetCategoryResponseBodySubCategories();
            return TeaModel.build(map, self);
        }

        public GetAssetCategoryResponseBodySubCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetAssetCategoryResponseBodySubCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetAssetCategoryResponseBodySubCategories setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetAssetCategoryResponseBodySubCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetAssetCategoryResponseBodySubCategories setSubTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }
        public Long getSubTotal() {
            return this.subTotal;
        }

    }

}
