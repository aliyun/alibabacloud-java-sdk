// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesResponseBody extends TeaModel {
    @NameInMap("Category")
    public GetCategoriesResponseBodyCategory category;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCategories")
    public GetCategoriesResponseBodySubCategories subCategories;

    @NameInMap("SubTotal")
    public Long subTotal;

    public static GetCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesResponseBody self = new GetCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoriesResponseBody setCategory(GetCategoriesResponseBodyCategory category) {
        this.category = category;
        return this;
    }
    public GetCategoriesResponseBodyCategory getCategory() {
        return this.category;
    }

    public GetCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoriesResponseBody setSubCategories(GetCategoriesResponseBodySubCategories subCategories) {
        this.subCategories = subCategories;
        return this;
    }
    public GetCategoriesResponseBodySubCategories getSubCategories() {
        return this.subCategories;
    }

    public GetCategoriesResponseBody setSubTotal(Long subTotal) {
        this.subTotal = subTotal;
        return this;
    }
    public Long getSubTotal() {
        return this.subTotal;
    }

    public static class GetCategoriesResponseBodyCategory extends TeaModel {
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Level")
        public Long level;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Type")
        public String type;

        public static GetCategoriesResponseBodyCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodyCategory self = new GetCategoriesResponseBodyCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodyCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetCategoriesResponseBodyCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetCategoriesResponseBodyCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetCategoriesResponseBodyCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetCategoriesResponseBodyCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCategoriesResponseBodySubCategoriesCategory extends TeaModel {
        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Level")
        public Long level;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("SubTotal")
        public Long subTotal;

        @NameInMap("Type")
        public String type;

        public static GetCategoriesResponseBodySubCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodySubCategoriesCategory self = new GetCategoriesResponseBodySubCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodySubCategoriesCategory setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setSubTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }
        public Long getSubTotal() {
            return this.subTotal;
        }

        public GetCategoriesResponseBodySubCategoriesCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCategoriesResponseBodySubCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<GetCategoriesResponseBodySubCategoriesCategory> category;

        public static GetCategoriesResponseBodySubCategories build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseBodySubCategories self = new GetCategoriesResponseBodySubCategories();
            return TeaModel.build(map, self);
        }

        public GetCategoriesResponseBodySubCategories setCategory(java.util.List<GetCategoriesResponseBodySubCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetCategoriesResponseBodySubCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}
