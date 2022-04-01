// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseDiskParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupDiskResizeInfos
    @NameInMap("nodeGroupDiskResizeInfos")
    public java.util.List<NodeGroupDiskResizeInfos> nodeGroupDiskResizeInfos;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // rollingRestart
    @NameInMap("rollingRestart")
    public Boolean rollingRestart;

    // token
    @NameInMap("token")
    public String token;

    public static IncreaseDiskParam build(java.util.Map<String, ?> map) throws Exception {
        IncreaseDiskParam self = new IncreaseDiskParam();
        return TeaModel.build(map, self);
    }

    public IncreaseDiskParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public IncreaseDiskParam setNodeGroupDiskResizeInfos(java.util.List<NodeGroupDiskResizeInfos> nodeGroupDiskResizeInfos) {
        this.nodeGroupDiskResizeInfos = nodeGroupDiskResizeInfos;
        return this;
    }
    public java.util.List<NodeGroupDiskResizeInfos> getNodeGroupDiskResizeInfos() {
        return this.nodeGroupDiskResizeInfos;
    }

    public IncreaseDiskParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public IncreaseDiskParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public IncreaseDiskParam setRollingRestart(Boolean rollingRestart) {
        this.rollingRestart = rollingRestart;
        return this;
    }
    public Boolean getRollingRestart() {
        return this.rollingRestart;
    }

    public IncreaseDiskParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class NodeGroupDiskResizeInfos extends TeaModel {
        // newDiskSize
        @NameInMap("newDiskSize")
        public String newDiskSize;

        // nodeGroupId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        public static NodeGroupDiskResizeInfos build(java.util.Map<String, ?> map) throws Exception {
            NodeGroupDiskResizeInfos self = new NodeGroupDiskResizeInfos();
            return TeaModel.build(map, self);
        }

        public NodeGroupDiskResizeInfos setNewDiskSize(String newDiskSize) {
            this.newDiskSize = newDiskSize;
            return this;
        }
        public String getNewDiskSize() {
            return this.newDiskSize;
        }

        public NodeGroupDiskResizeInfos setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

    }

}
