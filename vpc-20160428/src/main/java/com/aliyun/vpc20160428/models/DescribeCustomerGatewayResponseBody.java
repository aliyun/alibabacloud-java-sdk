// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewayResponseBody extends TeaModel {
    @NameInMap("Asn")
    public Long asn;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    @NameInMap("Description")
    public String description;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeCustomerGatewayResponseBody setTags(DescribeCustomerGatewayResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeCustomerGatewayResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeCustomerGatewayResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
