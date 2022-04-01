// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RenewClusterParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // nodeGroupIdList
    @NameInMap("nodeGroupIdList")
    public java.util.List<String> nodeGroupIdList;

    // nodeList
    @NameInMap("nodeList")
    public java.util.List<NodeList> nodeList;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // period
    @NameInMap("period")
    public Long period;

    // periodUnit
    @NameInMap("periodUnit")
    public String periodUnit;

    // promotionOption
    @NameInMap("promotionOption")
    public PromotionOption promotionOption;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scope
    @NameInMap("scope")
    public String scope;

    // token
    @NameInMap("token")
    public String token;

    public static RenewClusterParam build(java.util.Map<String, ?> map) throws Exception {
        RenewClusterParam self = new RenewClusterParam();
        return TeaModel.build(map, self);
    }

    public RenewClusterParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RenewClusterParam setNodeGroupIdList(java.util.List<String> nodeGroupIdList) {
        this.nodeGroupIdList = nodeGroupIdList;
        return this;
    }
    public java.util.List<String> getNodeGroupIdList() {
        return this.nodeGroupIdList;
    }

    public RenewClusterParam setNodeList(java.util.List<NodeList> nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public java.util.List<NodeList> getNodeList() {
        return this.nodeList;
    }

    public RenewClusterParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public RenewClusterParam setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public RenewClusterParam setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewClusterParam setPromotionOption(PromotionOption promotionOption) {
        this.promotionOption = promotionOption;
        return this;
    }
    public PromotionOption getPromotionOption() {
        return this.promotionOption;
    }

    public RenewClusterParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public RenewClusterParam setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public RenewClusterParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class NodeList extends TeaModel {
        // instanceId
        @NameInMap("instanceId")
        public String instanceId;

        // period
        @NameInMap("period")
        public Long period;

        // periodUnit
        @NameInMap("periodUnit")
        public String periodUnit;

        public static NodeList build(java.util.Map<String, ?> map) throws Exception {
            NodeList self = new NodeList();
            return TeaModel.build(map, self);
        }

        public NodeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public NodeList setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public NodeList setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

    }

}
