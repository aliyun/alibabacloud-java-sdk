// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiResponseBody extends TeaModel {
    /**
     * <p>The name of the API.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The information about the API.</p>
     */
    @NameInMap("OpenApiMetaList")
    public java.util.List<DescribePopApiResponseBodyOpenApiMetaList> openApiMetaList;

    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version of the API.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribePopApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiResponseBody self = new DescribePopApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePopApiResponseBody setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePopApiResponseBody setOpenApiMetaList(java.util.List<DescribePopApiResponseBodyOpenApiMetaList> openApiMetaList) {
        this.openApiMetaList = openApiMetaList;
        return this;
    }
    public java.util.List<DescribePopApiResponseBodyOpenApiMetaList> getOpenApiMetaList() {
        return this.openApiMetaList;
    }

    public DescribePopApiResponseBody setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public DescribePopApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePopApiResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribePopApiResponseBodyOpenApiMetaList extends TeaModel {
        /**
         * <p>The parameter description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The example value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The parameter name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The data type of the parameter field. Valid values:</p>
         * <br>
         * <p>*   **string**</p>
         * <p>*   **boolean**</p>
         * <p>*   **integer**</p>
         * <p>*   **long**</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePopApiResponseBodyOpenApiMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribePopApiResponseBodyOpenApiMetaList self = new DescribePopApiResponseBodyOpenApiMetaList();
            return TeaModel.build(map, self);
        }

        public DescribePopApiResponseBodyOpenApiMetaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePopApiResponseBodyOpenApiMetaList setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public DescribePopApiResponseBodyOpenApiMetaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePopApiResponseBodyOpenApiMetaList setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribePopApiResponseBodyOpenApiMetaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
