// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MasterSlaveServerGroups")
    public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups> masterSlaveServerGroups;

    public static DescribeMasterSlaveServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupsResponseBody self = new DescribeMasterSlaveServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMasterSlaveServerGroupsResponseBody setMasterSlaveServerGroups(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups> masterSlaveServerGroups) {
        this.masterSlaveServerGroups = masterSlaveServerGroups;
        return this;
    }
    public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups> getMasterSlaveServerGroups() {
        return this.masterSlaveServerGroups;
    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects extends TeaModel {
        @NameInMap("Listeners")
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners> listeners;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects setListeners(java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjectsListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups extends TeaModel {
        @NameInMap("MasterSlaveServerGroupId")
        public String masterSlaveServerGroupId;

        @NameInMap("AssociatedObjects")
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects associatedObjects;

        @NameInMap("MasterSlaveServerGroupName")
        public String masterSlaveServerGroupName;

        public static DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups self = new DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }
        public String getMasterSlaveServerGroupId() {
            return this.masterSlaveServerGroupId;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups setAssociatedObjects(DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects associatedObjects) {
            this.associatedObjects = associatedObjects;
            return this;
        }
        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroupsAssociatedObjects getAssociatedObjects() {
            return this.associatedObjects;
        }

        public DescribeMasterSlaveServerGroupsResponseBodyMasterSlaveServerGroups setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
            this.masterSlaveServerGroupName = masterSlaveServerGroupName;
            return this;
        }
        public String getMasterSlaveServerGroupName() {
            return this.masterSlaveServerGroupName;
        }

    }

}
