// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RestartNodesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Information about compute group nodes to restart.</p>
     */
    @NameInMap("RestartNodeGroups")
    public java.util.List<RestartNodesRequestRestartNodeGroups> restartNodeGroups;

    public static RestartNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartNodesRequest self = new RestartNodesRequest();
        return TeaModel.build(map, self);
    }

    public RestartNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartNodesRequest setRestartNodeGroups(java.util.List<RestartNodesRequestRestartNodeGroups> restartNodeGroups) {
        this.restartNodeGroups = restartNodeGroups;
        return this;
    }
    public java.util.List<RestartNodesRequestRestartNodeGroups> getRestartNodeGroups() {
        return this.restartNodeGroups;
    }

    public static class RestartNodesRequestRestartNodeGroups extends TeaModel {
        /**
         * <p>Whether to use fast restart mode. Default is false.</p>
         * <ul>
         * <li><p>true: Restart compute nodes in fast mode. Nodes restart in multiple batches. Within each batch, nodes restart in parallel. Batches execute sequentially.</p>
         * </li>
         * <li><p>false: Restart compute nodes using rolling restart.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FastMode")
        public Boolean fastMode;

        /**
         * <p>The compute group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-dcc7450e06a271b9</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>List of node IDs.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<String> nodeIds;

        public static RestartNodesRequestRestartNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            RestartNodesRequestRestartNodeGroups self = new RestartNodesRequestRestartNodeGroups();
            return TeaModel.build(map, self);
        }

        public RestartNodesRequestRestartNodeGroups setFastMode(Boolean fastMode) {
            this.fastMode = fastMode;
            return this;
        }
        public Boolean getFastMode() {
            return this.fastMode;
        }

        public RestartNodesRequestRestartNodeGroups setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public RestartNodesRequestRestartNodeGroups setNodeIds(java.util.List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

    }

}
