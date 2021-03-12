// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 知识类目集合
    @NameInMap("Categories")
    public java.util.List<ListCategoriesResponseBodyCategories> categories;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCategoriesResponseBody setCategories(java.util.List<ListCategoriesResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<ListCategoriesResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public static class ListCategoriesResponseBodyCategoriesChildren extends TeaModel {
        // 类目id
        @NameInMap("CategoryId")
        public Long categoryId;

        // 父类目id
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        // 类目名称
        @NameInMap("CategoryName")
        public String categoryName;

        public static ListCategoriesResponseBodyCategoriesChildren build(java.util.Map<String, ?> map) throws Exception {
            ListCategoriesResponseBodyCategoriesChildren self = new ListCategoriesResponseBodyCategoriesChildren();
            return TeaModel.build(map, self);
        }

        public ListCategoriesResponseBodyCategoriesChildren setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListCategoriesResponseBodyCategoriesChildren setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public ListCategoriesResponseBodyCategoriesChildren setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

    public static class ListCategoriesResponseBodyCategories extends TeaModel {
        // 类目id
        @NameInMap("CategoryId")
        public Long categoryId;

        // 父类目id
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        // 类目名称
        @NameInMap("CategoryName")
        public String categoryName;

        // 子级类目集合
        @NameInMap("Children")
        public java.util.List<ListCategoriesResponseBodyCategoriesChildren> children;

        public static ListCategoriesResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            ListCategoriesResponseBodyCategories self = new ListCategoriesResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public ListCategoriesResponseBodyCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListCategoriesResponseBodyCategories setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public ListCategoriesResponseBodyCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListCategoriesResponseBodyCategories setChildren(java.util.List<ListCategoriesResponseBodyCategoriesChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<ListCategoriesResponseBodyCategoriesChildren> getChildren() {
            return this.children;
        }

    }

}
