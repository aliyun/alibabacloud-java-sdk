// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclEntrys")
    public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrys> aclEntrys;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("RelatedListeners")
    public java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListeners> relatedListeners;

    @NameInMap("AclName")
    public String aclName;

    public static DescribeAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeResponseBody self = new DescribeAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListAttributeResponseBody setAclEntrys(java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrys> aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrys> getAclEntrys() {
        return this.aclEntrys;
    }

    public DescribeAccessControlListAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessControlListAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAccessControlListAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeAccessControlListAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeAccessControlListAttributeResponseBody setRelatedListeners(java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListeners> relatedListeners) {
        this.relatedListeners = relatedListeners;
        return this;
    }
    public java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListeners> getRelatedListeners() {
        return this.relatedListeners;
    }

    public DescribeAccessControlListAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public static class DescribeAccessControlListAttributeResponseBodyAclEntrys extends TeaModel {
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        @NameInMap("AclEntryIP")
        public String aclEntryIP;

        public static DescribeAccessControlListAttributeResponseBodyAclEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyAclEntrys self = new DescribeAccessControlListAttributeResponseBodyAclEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrys setAclEntryComment(String aclEntryComment) {
            this.aclEntryComment = aclEntryComment;
            return this;
        }
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrys setAclEntryIP(String aclEntryIP) {
            this.aclEntryIP = aclEntryIP;
            return this;
        }
        public String getAclEntryIP() {
            return this.aclEntryIP;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyRelatedListeners extends TeaModel {
        @NameInMap("AclType")
        public String aclType;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeAccessControlListAttributeResponseBodyRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyRelatedListeners self = new DescribeAccessControlListAttributeResponseBodyRelatedListeners();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListeners setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

}
