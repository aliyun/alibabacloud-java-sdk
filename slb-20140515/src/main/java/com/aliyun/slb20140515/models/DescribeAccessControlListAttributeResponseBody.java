// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("AclName")
    public String aclName;

    @NameInMap("AclEntrys")
    public DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys;

    @NameInMap("RelatedListeners")
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners;

    public static DescribeAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeResponseBody self = new DescribeAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAccessControlListAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public DescribeAccessControlListAttributeResponseBody setAclEntrys(DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyAclEntrys getAclEntrys() {
        return this.aclEntrys;
    }

    public DescribeAccessControlListAttributeResponseBody setRelatedListeners(DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners) {
        this.relatedListeners = relatedListeners;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners getRelatedListeners() {
        return this.relatedListeners;
    }

    public static class DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry extends TeaModel {
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        @NameInMap("AclEntryIP")
        public String aclEntryIP;

        public static DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry self = new DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry setAclEntryComment(String aclEntryComment) {
            this.aclEntryComment = aclEntryComment;
            return this;
        }
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry setAclEntryIP(String aclEntryIP) {
            this.aclEntryIP = aclEntryIP;
            return this;
        }
        public String getAclEntryIP() {
            return this.aclEntryIP;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyAclEntrys extends TeaModel {
        @NameInMap("AclEntry")
        public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> aclEntry;

        public static DescribeAccessControlListAttributeResponseBodyAclEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyAclEntrys self = new DescribeAccessControlListAttributeResponseBodyAclEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrys setAclEntry(java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> aclEntry) {
            this.aclEntry = aclEntry;
            return this;
        }
        public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> getAclEntry() {
            return this.aclEntry;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener extends TeaModel {
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("AclType")
        public String aclType;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener self = new DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyRelatedListeners extends TeaModel {
        @NameInMap("RelatedListener")
        public java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener> relatedListener;

        public static DescribeAccessControlListAttributeResponseBodyRelatedListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyRelatedListeners self = new DescribeAccessControlListAttributeResponseBodyRelatedListeners();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListeners setRelatedListener(java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener> relatedListener) {
            this.relatedListener = relatedListener;
            return this;
        }
        public java.util.List<DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener> getRelatedListener() {
            return this.relatedListener;
        }

    }

}
