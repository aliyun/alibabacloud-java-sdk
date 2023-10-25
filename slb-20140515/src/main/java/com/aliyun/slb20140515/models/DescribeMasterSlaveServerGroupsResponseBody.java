// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of backend servers in the primary/secondary server group.</p>
     */
    @NameInMap("MasterSlaveServerGroups")
    public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups masterSlaveServerGroups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMasterSlaveServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsResponseBody self = new DescribeMasterSlaveServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsResponseBody setMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups masterSlaveServerGroups) {
        this.masterSlaveServerGroups = masterSlaveServerGroups;
        return this;
    }
    public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups getMasterSlaveServerGroups() {
        return this.masterSlaveServerGroups;
    }

    public DescribeMasterSlaveServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener extends TeaModel {
        /**
         * <p>The listening port.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The listening protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> listener;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners setListener(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListenersListener> getListener() {
            return this.listener;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects extends TeaModel {
        /**
         * <p>The list of listeners.</p>
         */
        @NameInMap("Listeners")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners listeners;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects setListeners(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners listeners) {
            this.listeners = listeners;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjectsListeners getListeners() {
            return this.listeners;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag> tag;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags setTag(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup extends TeaModel {
        /**
         * <p>The associated resources.</p>
         */
        @NameInMap("AssociatedObjects")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects associatedObjects;

        /**
         * <p>The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the primary/secondary server group.</p>
         */
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        /**
         * <p>The name of the primary/secondary server group.</p>
         */
        @NameInMap("MasterSlaveServerGroupName")
        public String masterSlaveServerGroupName;

        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Tags")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags tags;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setAssociatedObjects(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects associatedObjects) {
            this.associatedObjects = associatedObjects;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupAssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
            return this;
        }
        public String getMasterSlaveServerGroupName() {
            return this.masterSlaveServerGroupName;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup setTags(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroupTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups extends TeaModel {
        @NameInMap("MasterSlaveServerGroup")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> masterSlaveServerGroup;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups setMasterSlaveServerGroup(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> masterSlaveServerGroup) {
            this.masterSlaveServerGroup = masterSlaveServerGroup;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsMasterSlaveServerGroup> getMasterSlaveServerGroup() {
            return this.masterSlaveServerGroup;
        }

    }

}
