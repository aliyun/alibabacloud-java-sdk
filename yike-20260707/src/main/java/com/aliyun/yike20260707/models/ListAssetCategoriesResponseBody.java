// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListAssetCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<ListAssetCategoriesResponseBodyCategories> categories;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Total")
    public String total;

    public static ListAssetCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCategoriesResponseBody self = new ListAssetCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetCategoriesResponseBody setCategories(java.util.List<ListAssetCategoriesResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<ListAssetCategoriesResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public ListAssetCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssetCategoriesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListAssetCategoriesResponseBodyCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>45</p>
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
        public String level;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static ListAssetCategoriesResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            ListAssetCategoriesResponseBodyCategories self = new ListAssetCategoriesResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public ListAssetCategoriesResponseBodyCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListAssetCategoriesResponseBodyCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListAssetCategoriesResponseBodyCategories setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAssetCategoriesResponseBodyCategories setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
