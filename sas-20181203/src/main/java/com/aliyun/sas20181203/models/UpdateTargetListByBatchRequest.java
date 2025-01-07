// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateTargetListByBatchRequest extends TeaModel {
    /**
     * <p>The ID of the release batch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52370</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    /**
     * <p>The operations on assets.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationList")
    public java.util.List<UpdateTargetListByBatchRequestOperationList> operationList;

    public static UpdateTargetListByBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTargetListByBatchRequest self = new UpdateTargetListByBatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTargetListByBatchRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public UpdateTargetListByBatchRequest setOperationList(java.util.List<UpdateTargetListByBatchRequestOperationList> operationList) {
        this.operationList = operationList;
        return this;
    }
    public java.util.List<UpdateTargetListByBatchRequestOperationList> getOperationList() {
        return this.operationList;
    }

    public static class UpdateTargetListByBatchRequestOperationList extends TeaModel {
        /**
         * <p>The ID of the server group.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11883086</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: the add operation.</li>
         * <li><strong>del</strong>: the remove operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>de393767-6fe1-4a8d-837d-927a2b******</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ow0rm9t92iza******</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static UpdateTargetListByBatchRequestOperationList build(java.util.Map<String, ?> map) throws Exception {
            UpdateTargetListByBatchRequestOperationList self = new UpdateTargetListByBatchRequestOperationList();
            return TeaModel.build(map, self);
        }

        public UpdateTargetListByBatchRequestOperationList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateTargetListByBatchRequestOperationList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateTargetListByBatchRequestOperationList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public UpdateTargetListByBatchRequestOperationList setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
