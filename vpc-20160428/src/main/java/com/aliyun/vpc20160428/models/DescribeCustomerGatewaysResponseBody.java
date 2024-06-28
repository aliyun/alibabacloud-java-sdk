// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysResponseBody extends TeaModel {
    /**
     * <p>The information about customer gateways.</p>
     */
    @NameInMap("CustomerGateways")
    public DescribeCustomerGatewaysResponseBodyCustomerGateways customerGateways;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E82612A9-CB90-4D7E-B394-1DB7F6509B29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCustomerGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewaysResponseBody self = new DescribeCustomerGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewaysResponseBody setCustomerGateways(DescribeCustomerGatewaysResponseBodyCustomerGateways customerGateways) {
        this.customerGateways = customerGateways;
        return this;
    }
    public DescribeCustomerGatewaysResponseBodyCustomerGateways getCustomerGateways() {
        return this.customerGateways;
    }

    public DescribeCustomerGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomerGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomerGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag self = new DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag> tag;

        public static DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags self = new DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags setTag(java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway extends TeaModel {
        /**
         * <p>The autonomous system number (ASN) of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>65530</p>
         */
        @NameInMap("Asn")
        public Long asn;

        /**
         * <p>The authentication key that is used to connect to the gateway device in the data center by using Border Gateway Protocol (BGP).</p>
         * 
         * <strong>example:</strong>
         * <p>AuthKey****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The time when the customer gateway was created. Unit: millisecond.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1492747187000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The customer gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-bp1pvpl9r9adju6l5****</p>
         */
        @NameInMap("CustomerGatewayId")
        public String customerGatewayId;

        /**
         * <p>The description of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IP address of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>139.32.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The name of the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group to which the customer gateway belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags that are added to the customer gateway.</p>
         */
        @NameInMap("Tags")
        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags tags;

        public static DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway self = new DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setAsn(Long asn) {
            this.asn = asn;
            return this;
        }
        public Long getAsn() {
            return this.asn;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setCustomerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway setTags(DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGatewayTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeCustomerGatewaysResponseBodyCustomerGateways extends TeaModel {
        @NameInMap("CustomerGateway")
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> customerGateway;

        public static DescribeCustomerGatewaysResponseBodyCustomerGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewaysResponseBodyCustomerGateways self = new DescribeCustomerGatewaysResponseBodyCustomerGateways();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewaysResponseBodyCustomerGateways setCustomerGateway(java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> customerGateway) {
            this.customerGateway = customerGateway;
            return this;
        }
        public java.util.List<DescribeCustomerGatewaysResponseBodyCustomerGatewaysCustomerGateway> getCustomerGateway() {
            return this.customerGateway;
        }

    }

}
