// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiResponseBody extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("OpenApiMetaList")
    public java.util.List<DescribePopApiResponseBodyOpenApiMetaList> openApiMetaList;

    @NameInMap("PopCode")
    public String popCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

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
