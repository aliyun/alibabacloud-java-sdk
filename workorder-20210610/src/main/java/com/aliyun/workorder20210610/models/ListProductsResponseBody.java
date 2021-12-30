// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListProductsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ProductId")
        public Long productId;

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
        @NameInMap("DirectoryId")
        public Long directoryId;

        @NameInMap("DirectoryName")
        public String directoryName;

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
