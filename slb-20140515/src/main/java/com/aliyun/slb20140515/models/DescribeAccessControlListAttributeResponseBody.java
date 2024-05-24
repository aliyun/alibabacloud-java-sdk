// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    /**
     * <p>The IP entries that you want to remove from the network ACL. Valid values:</p>
     * <br>
     * <p>*   **entry**: the IP address or CIDR block that you want to remove from the network ACL. Separate multiple IP addresses or CIDR blocks with commas (,).</p>
     * <p>*   **comment**: the description of the network ACL.</p>
     */
    @NameInMap("AclEntrys")
    public DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys;

    /**
     * <p>The ID of the network ACL.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ACL name. The name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), hyphens (-), forward slashes (/), and underscores (_). The name of each ACL must be unique within a region. Fuzzy match is supported.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP version. Valid values: **ipv4** and **ipv6**.</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The time when the ACL was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The listeners that are associated with the network ACL.</p>
     */
    @NameInMap("RelatedListeners")
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public DescribeAccessControlListAttributeResponseBodyTags tags;

    /**
     * <p>The total number of access control entries.</p>
     */
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
        /**
         * <p>The description of the ACL entry.</p>
         */
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        /**
         * <p>The IP address specified in the ACL entry.</p>
         */
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
        /**
         * <p>The type of ACL. Valid values:</p>
         * <br>
         * <p>*   **black**</p>
         * <p>*   **white**</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The frontend port of the listener with which the ACL is associated.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The CLB instance ID.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The type of protocol that the associated listener uses.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
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
