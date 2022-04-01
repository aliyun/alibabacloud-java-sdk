// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingPoliciesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListAutoScalingPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingPoliciesResponseBody self = new ListAutoScalingPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingPoliciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingPoliciesResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListAutoScalingPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        // 集群Id
        @NameInMap("clusterId")
        public String clusterId;

        // 解冻时间
        @NameInMap("defrostTime")
        public Long defrostTime;

        // 拒绝原因
        @NameInMap("frostReason")
        public String frostReason;

        // 节点组Id
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // 伸缩策略Id
        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        // INACTIVE/ACTIVE
        @NameInMap("scalingPolicyStatus")
        public String scalingPolicyStatus;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Items setDefrostTime(Long defrostTime) {
            this.defrostTime = defrostTime;
            return this;
        }
        public Long getDefrostTime() {
            return this.defrostTime;
        }

        public Items setFrostReason(String frostReason) {
            this.frostReason = frostReason;
            return this;
        }
        public String getFrostReason() {
            return this.frostReason;
        }

        public Items setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Items setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Items setScalingPolicyStatus(String scalingPolicyStatus) {
            this.scalingPolicyStatus = scalingPolicyStatus;
            return this;
        }
        public String getScalingPolicyStatus() {
            return this.scalingPolicyStatus;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
