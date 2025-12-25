// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value, which is a list of question categories</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCategoriesResponseBodyData> data;

    /**
     * <p>The error message. If success is set to false, the message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CA6204AC-6AA9-4CFA-9310-7DFD20C19EBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: The value true indicates a success. The value false indicates a failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCategoriesResponseBody setData(java.util.List<ListCategoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCategoriesResponseBodyData> getData() {
        return this.data;
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

    public static class ListCategoriesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the ticket issue category.</p>
         * 
         * <strong>example:</strong>
         * <p>7161</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The name of the ticket issue category.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        public static ListCategoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCategoriesResponseBodyData self = new ListCategoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCategoriesResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListCategoriesResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
