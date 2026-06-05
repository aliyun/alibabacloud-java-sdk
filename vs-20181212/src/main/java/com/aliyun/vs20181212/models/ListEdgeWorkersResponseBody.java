// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListEdgeWorkersResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListEdgeWorkersResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEdgeWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeWorkersResponseBody self = new ListEdgeWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeWorkersResponseBody setInstances(java.util.List<ListEdgeWorkersResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListEdgeWorkersResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListEdgeWorkersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeWorkersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeWorkersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeWorkersResponseBodyInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-05-14T15:20:37+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-14T15:20:37+08:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>hive-58mq6jynvgxxmlid3pt39x6gk-0</p>
         */
        @NameInMap("HiveId")
        public String hiveId;

        /**
         * <strong>example:</strong>
         * <p>as-d135ca4425c24b99b79cd0b6c552cac9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>pk-db3394401cc8403f85e4d72d99b52449</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <strong>example:</strong>
         * <p>crs.xic.s1</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>Idle</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEdgeWorkersResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeWorkersResponseBodyInstances self = new ListEdgeWorkersResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListEdgeWorkersResponseBodyInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListEdgeWorkersResponseBodyInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListEdgeWorkersResponseBodyInstances setHiveId(String hiveId) {
            this.hiveId = hiveId;
            return this;
        }
        public String getHiveId() {
            return this.hiveId;
        }

        public ListEdgeWorkersResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEdgeWorkersResponseBodyInstances setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListEdgeWorkersResponseBodyInstances setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListEdgeWorkersResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
