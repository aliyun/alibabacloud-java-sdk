// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListSupportResourceTypesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Support")
        public Boolean support;

        @NameInMap("SupportCode")
        public String supportCode;

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

    }

    public static class ListSupportResourceTypesResponseBodySupportResourceTypes extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SupportItems")
        public java.util.List<ListSupportResourceTypesResponseBodySupportResourceTypesSupportItems> supportItems;

        public static ListSupportResourceTypesResponseBodySupportResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListSupportResourceTypesResponseBodySupportResourceTypes self = new ListSupportResourceTypesResponseBodySupportResourceTypes();
            return TeaModel.build(map, self);
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
