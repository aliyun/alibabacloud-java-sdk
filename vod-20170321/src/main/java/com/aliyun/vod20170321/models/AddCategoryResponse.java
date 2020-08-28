// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Category")
    @Validation(required = true)
    public AddCategoryResponseCategory category;

    public static AddCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponse self = new AddCategoryResponse();
        return TeaModel.build(map, self);
    }

    public static class AddCategoryResponseCategory extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("Level")
        @Validation(required = true)
        public Long level;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static AddCategoryResponseCategory build(java.util.Map<String, ?> map) throws Exception {
            AddCategoryResponseCategory self = new AddCategoryResponseCategory();
            return TeaModel.build(map, self);
        }

    }

}
