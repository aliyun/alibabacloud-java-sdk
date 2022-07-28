// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<ListCategoriesResponseBodyCategories> categories;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setCategories(java.util.List<ListCategoriesResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<ListCategoriesResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public ListCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCategoriesResponseBodyCategoriesChildren extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

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

        public ListCategoriesResponseBodyCategoriesChildren setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListCategoriesResponseBodyCategoriesChildren setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

    public static class ListCategoriesResponseBodyCategories extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Children")
        public java.util.List<ListCategoriesResponseBodyCategoriesChildren> children;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

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

        public ListCategoriesResponseBodyCategories setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

}
