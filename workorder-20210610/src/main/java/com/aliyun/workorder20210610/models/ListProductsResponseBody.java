// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    /**
     * <p>The return code of the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Return value, that is, product list</p>
     */
    @NameInMap("Data")
    public java.util.List<ListProductsResponseBodyData> data;

    /**
     * <p>The error message. If success is set to false, the message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the API request. The requestID is unique for each call.</p>
     * 
     * <strong>example:</strong>
     * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListProductsResponseBody setData(java.util.List<ListProductsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProductsResponseBodyData> getData() {
        return this.data;
    }

    public ListProductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductsResponseBodyDataProductList extends TeaModel {
        /**
         * <p>Alibaba Cloud product ID</p>
         * 
         * <strong>example:</strong>
         * <p>7160</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>Alibaba Cloud product name</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static ListProductsResponseBodyDataProductList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataProductList self = new ListProductsResponseBodyDataProductList();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataProductList setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListProductsResponseBodyDataProductList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListProductsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the product catalog, which represents the product category, such as elastic computing</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DirectoryId")
        public Long directoryId;

        /**
         * <p>The name of the product catalog, which represents the product category, such as elastic computing</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>List of Alibaba Cloud products</p>
         */
        @NameInMap("ProductList")
        public java.util.List<ListProductsResponseBodyDataProductList> productList;

        public static ListProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyData self = new ListProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyData setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public ListProductsResponseBodyData setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListProductsResponseBodyData setProductList(java.util.List<ListProductsResponseBodyDataProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataProductList> getProductList() {
            return this.productList;
        }

    }

}
