// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclEntrys")
    public DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclName")
    public String aclName;

    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("RelatedListeners")
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public DescribeAccessControlListAttributeResponseBodyTags tags;

    @NameInMap("TotalAclEntry")
    public Integer totalAclEntry;

    public static DescribeAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeResponseBody self = new DescribeAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListAttributeResponseBody setAclEntrys(DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyAclEntrys getAclEntrys() {
        return this.aclEntrys;
    }

    public DescribeAccessControlListAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeAccessControlListAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public DescribeAccessControlListAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeAccessControlListAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAccessControlListAttributeResponseBody setRelatedListeners(DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners) {
        this.relatedListeners = relatedListeners;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners getRelatedListeners() {
        return this.relatedListeners;
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

    public DescribeAccessControlListAttributeResponseBody setTags(DescribeAccessControlListAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeAccessControlListAttributeResponseBody setTotalAclEntry(Integer totalAclEntry) {
        this.totalAclEntry = totalAclEntry;
        return this;
    }
    public Integer getTotalAclEntry() {
        return this.totalAclEntry;
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
        @NameInMap("AclType")
        public String aclType;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener self = new DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeAccessControlListAttributeResponseBodyRelatedListenersRelatedListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
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

    public static class DescribeAccessControlListAttributeResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAccessControlListAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyTagsTag self = new DescribeAccessControlListAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAccessControlListAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAccessControlListAttributeResponseBodyTagsTag> tag;

        public static DescribeAccessControlListAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyTags self = new DescribeAccessControlListAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyTags setTag(java.util.List<DescribeAccessControlListAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAccessControlListAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
