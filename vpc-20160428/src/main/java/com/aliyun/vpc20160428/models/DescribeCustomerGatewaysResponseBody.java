// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysResponseBody extends TeaModel {
    @NameInMap("CustomerGateways")
    public DescribeCustomerGatewaysResponseBodyCustomerGateways customerGateways;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
