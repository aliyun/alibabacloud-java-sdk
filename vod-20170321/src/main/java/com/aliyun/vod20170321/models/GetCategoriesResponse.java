// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubTotal")
    @Validation(required = true)
    public Long subTotal;

    @NameInMap("SubCategories")
    @Validation(required = true)
    public GetCategoriesResponseSubCategories subCategories;

    @NameInMap("Category")
    @Validation(required = true)
    public GetCategoriesResponseCategory category;

    public static GetCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesResponse self = new GetCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCategoriesResponseSubCategoriesCategory extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Level")
        @Validation(required = true)
        public Long level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("SubTotal")
        @Validation(required = true)
        public Long subTotal;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GetCategoriesResponseSubCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseSubCategoriesCategory self = new GetCategoriesResponseSubCategoriesCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCategoriesResponseSubCategories extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<GetCategoriesResponseSubCategoriesCategory> category;

        public static GetCategoriesResponseSubCategories build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseSubCategories self = new GetCategoriesResponseSubCategories();
            return TeaModel.build(map, self);
        }

    }

    public static class GetCategoriesResponseCategory extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Level")
        @Validation(required = true)
        public Long level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GetCategoriesResponseCategory build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesResponseCategory self = new GetCategoriesResponseCategory();
            return TeaModel.build(map, self);
        }

    }

}
