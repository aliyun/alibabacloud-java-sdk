// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("products")
    public java.util.List<ListProductsResponseBodyProducts> products;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setProducts(java.util.List<ListProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductsResponseBodyProducts extends TeaModel {
        @NameInMap("category2Name")
        public String category2Name;

        @NameInMap("categoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("defaultVersion")
        public String defaultVersion;

        @NameInMap("description")
        public String description;

        @NameInMap("group")
        public String group;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("shortName")
        public String shortName;

        /**
         * <strong>example:</strong>
         * <p>RPC</p>
         */
        @NameInMap("style")
        public String style;

        @NameInMap("versions")
        public java.util.List<String> versions;

        public static ListProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProducts self = new ListProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProducts setCategory2Name(String category2Name) {
            this.category2Name = category2Name;
            return this;
        }
        public String getCategory2Name() {
            return this.category2Name;
        }

        public ListProductsResponseBodyProducts setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListProductsResponseBodyProducts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProductsResponseBodyProducts setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListProductsResponseBodyProducts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyProducts setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListProductsResponseBodyProducts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyProducts setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public ListProductsResponseBodyProducts setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public ListProductsResponseBodyProducts setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
