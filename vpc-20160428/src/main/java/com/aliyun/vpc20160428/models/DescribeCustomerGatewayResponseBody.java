// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewayResponseBody extends TeaModel {
    /**
     * <p>The autonomous system number (ASN) of the gateway device in the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>65535</p>
     */
    @NameInMap("Asn")
    public Long asn;

    /**
     * <p>The authentication key of the Border Gateway Protocol (BGP) routing protocol for the gateway device in the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>AuthKey****</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The timestamp generated when the customer gateway was created. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1492747187000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the customer gateway.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0457BC9-6C0F-4437-AB9D-FB2EABC1D6A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>The list of tags added to the customer gateway.</p>
     */
    @NameInMap("Tags")
    public DescribeCustomerGatewayResponseBodyTags tags;

    public static DescribeCustomerGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewayResponseBody self = new DescribeCustomerGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewayResponseBody setAsn(Long asn) {
        this.asn = asn;
        return this;
    }
    public Long getAsn() {
        return this.asn;
    }

    public DescribeCustomerGatewayResponseBody setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public DescribeCustomerGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeCustomerGatewayResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public DescribeCustomerGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCustomerGatewayResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeCustomerGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomerGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerGatewayResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCustomerGatewayResponseBody setTags(DescribeCustomerGatewayResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeCustomerGatewayResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeCustomerGatewayResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCustomerGatewayResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewayResponseBodyTagsTag self = new DescribeCustomerGatewayResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewayResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCustomerGatewayResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCustomerGatewayResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCustomerGatewayResponseBodyTagsTag> tag;

        public static DescribeCustomerGatewayResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerGatewayResponseBodyTags self = new DescribeCustomerGatewayResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerGatewayResponseBodyTags setTag(java.util.List<DescribeCustomerGatewayResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCustomerGatewayResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
