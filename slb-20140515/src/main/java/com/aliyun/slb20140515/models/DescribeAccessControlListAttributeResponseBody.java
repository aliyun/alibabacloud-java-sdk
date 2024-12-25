// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    /**
     * <p>The information about the access control policy.</p>
     */
    @NameInMap("AclEntrys")
    public DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys;

    /**
     * <p>The ACL ID.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-bp1ut10zzvh1y8dfs****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ACL name.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The time when the ACL was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-31T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The listeners with which the ACL is associated.</p>
     */
    @NameInMap("RelatedListeners")
    public DescribeAccessControlListAttributeResponseBodyRelatedListeners relatedListeners;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C9906A1D-86F7-4C9C-A369-54DA42EF206A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmz3jksig****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags added to the ACL.</p>
     */
    @NameInMap("Tags")
    public DescribeAccessControlListAttributeResponseBodyTags tags;

    /**
     * <p>The total number of ACL entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * <p>The remarks of the ACL entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        /**
         * <p>The IP entry in the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
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
         * <ul>
         * <li><strong>black</strong></li>
         * <li><strong>white</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The frontend port of the listener with which the ACL is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The CLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1qpzldlm38bnexl****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The type of protocol that the associated listener uses.</p>
         * 
         * <strong>example:</strong>
         * <p>https</p>
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
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
