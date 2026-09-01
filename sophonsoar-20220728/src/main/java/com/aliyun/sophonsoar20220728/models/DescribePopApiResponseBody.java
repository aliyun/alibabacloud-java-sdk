// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiResponseBody extends TeaModel {
    /**
     * <p>The name of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>AddAssetCleanConfig</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>List of API information.</p>
     */
    @NameInMap("OpenApiMetaList")
    public java.util.List<DescribePopApiResponseBodyOpenApiMetaList> openApiMetaList;

    /**
     * <p>The POP code of the Alibaba Cloud product API.</p>
     * 
     * <strong>example:</strong>
     * <p>Sas</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <p>The ID of the request. Alibaba Cloud generates this unique ID for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1A01B0BA-<strong><strong>-5813-</strong></strong>-A5DA15FA95AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10</p>
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
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>demo parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>12.xx.xx.xx</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribePopApi</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the parameter is required.</p>
         * <ul>
         * <li><p><strong>true</strong>: required.</p>
         * </li>
         * <li><p><strong>false</strong>: not required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The serialization method for an array parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>repeatList</strong>: An array is serialized in the XXX.N format. Example: Instance.1=i-instance1&amp;\&amp;Instance.2=i-instance2.</p>
         * </li>
         * <li><p><strong>simple</strong>: An array is serialized as a comma-separated string. Example: i-instance1,i-instance2.</p>
         * </li>
         * <li><p><strong>spaceDelimited</strong>: An array is serialized as a space-separated string. Example: i-instance1 i-instance2.</p>
         * </li>
         * <li><p><strong>pipeDelimited</strong>: An array is serialized as a pipe-separated string. Example: i-instance1|i-instance2.</p>
         * </li>
         * <li><p><strong>json</strong>: An array is serialized in JSON format. Example: [&quot;i-instance1&quot;,&quot;i-instance2&quot;].</p>
         * </li>
         * <li><p><strong>flat</strong>: An array is serialized in the XXX.N format. Example: Instance.1=i-instance1\&amp;Instance.2=i-instance2.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>json</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>The data type of the parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>string</strong>: a string.</p>
         * </li>
         * <li><p><strong>boolean</strong>: a Boolean value.</p>
         * </li>
         * <li><p><strong>integer</strong>: an integer.</p>
         * </li>
         * <li><p><strong>long</strong>: a long integer.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
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

        public DescribePopApiResponseBodyOpenApiMetaList setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
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
