// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetAllTrendCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAllTrendCategoryResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetAllTrendCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllTrendCategoryResponseBody self = new GetAllTrendCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllTrendCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAllTrendCategoryResponseBody setData(java.util.List<GetAllTrendCategoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAllTrendCategoryResponseBodyData> getData() {
        return this.data;
    }

    public GetAllTrendCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllTrendCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllTrendCategoryResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetAllTrendCategoryResponseBodyData extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryLevel")
        public Integer categoryLevel;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ChildCategory")
        public java.util.List<?> childCategory;

        @NameInMap("SuperCategoryName")
        public String superCategoryName;

        public static GetAllTrendCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAllTrendCategoryResponseBodyData self = new GetAllTrendCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAllTrendCategoryResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetAllTrendCategoryResponseBodyData setCategoryLevel(Integer categoryLevel) {
            this.categoryLevel = categoryLevel;
            return this;
        }
        public Integer getCategoryLevel() {
            return this.categoryLevel;
        }

        public GetAllTrendCategoryResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetAllTrendCategoryResponseBodyData setChildCategory(java.util.List<?> childCategory) {
            this.childCategory = childCategory;
            return this;
        }
        public java.util.List<?> getChildCategory() {
            return this.childCategory;
        }

        public GetAllTrendCategoryResponseBodyData setSuperCategoryName(String superCategoryName) {
            this.superCategoryName = superCategoryName;
            return this;
        }
        public String getSuperCategoryName() {
            return this.superCategoryName;
        }

    }

}
