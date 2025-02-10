// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListSupportResourceTypesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the next query is required.</p>
     * <ul>
     * <li>If the value of this parameter is empty, all results are returned, and the next query is not required.</li>
     * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYws9fJ0Ur4MGm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC71772-F3A1-59CA-B811-4A5B0E0B72F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported resource types.</p>
     */
    @NameInMap("SupportResourceTypes")
    public java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypes> supportResourceTypes;

    public static ListSupportResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportResourceTypesResponseBody self = new ListSupportResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportResourceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupportResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupportResourceTypesResponseBody setSupportResourceTypes(java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypes> supportResourceTypes) {
        this.supportResourceTypes = supportResourceTypes;
        return this;
    }
    public java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypes> getSupportResourceTypes() {
        return this.supportResourceTypes;
    }

    public static class ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems extends TeaModel {
        /**
         * <p>Indicates whether the tag-related capability item is supported. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Support")
        public Boolean support;

        /**
         * <p>The code of the tag-related capability item.</p>
         * 
         * <strong>example:</strong>
         * <p>TAG_CONSOLE_SUPPORT</p>
         */
        @NameInMap("SupportCode")
        public String supportCode;

        /**
         * <p>The details of the support for the tag-related capability item.</p>
         */
        @NameInMap("SupportDetails")
        public java.util.List<java.util.Map<String, String>> supportDetails;

        public static ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems build(java.util.Map<String, ?> map) throws Exception {
            ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems self = new ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems();
            return TeaModel.build(map, self);
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems setSupportCode(String supportCode) {
            this.supportCode = supportCode;
            return this;
        }
        public String getSupportCode() {
            return this.supportCode;
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems setSupportDetails(java.util.List<java.util.Map<String, String>> supportDetails) {
            this.supportDetails = supportDetails;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getSupportDetails() {
            return this.supportDetails;
        }

    }

    public static class ListSupportResourceTypesResponseBodySupportResourceTypes extends TeaModel {
        /**
         * <p>The resource ARN template.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:<em>:</em>:instance/${ResourceId}</p>
         */
        @NameInMap("ArnTemplate")
        public String arnTemplate;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The supported tag-related capability items.</p>
         * <blockquote>
         * <p> This parameter is returned only if the <code>ShowItems</code> parameter is set to <code>true</code>.</p>
         * </blockquote>
         */
        @NameInMap("SupportItems")
        public java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems> supportItems;

        public static ListSupportResourceTypesResponseBodySupportResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListSupportResourceTypesResponseBodySupportResourceTypes self = new ListSupportResourceTypesResponseBodySupportResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypes setArnTemplate(String arnTemplate) {
            this.arnTemplate = arnTemplate;
            return this;
        }
        public String getArnTemplate() {
            return this.arnTemplate;
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypes setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSupportResourceTypesResponseBodySupportResourceTypes setSupportItems(java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems> supportItems) {
            this.supportItems = supportItems;
            return this;
        }
        public java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems> getSupportItems() {
            return this.supportItems;
        }

    }

}
