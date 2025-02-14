// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationCheckResponseBody extends TeaModel {
    @NameInMap("OperationTaskInstanceDetails")
    public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetails> operationTaskInstanceDetails;

    /**
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOperationCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationCheckResponseBody self = new ListOperationCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationCheckResponseBody setOperationTaskInstanceDetails(java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetails> operationTaskInstanceDetails) {
        this.operationTaskInstanceDetails = operationTaskInstanceDetails;
        return this;
    }
    public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetails> getOperationTaskInstanceDetails() {
        return this.operationTaskInstanceDetails;
    }

    public ListOperationCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cd7c4d34c1034de08308535d6cee***</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <strong>example:</strong>
         * <p>IpList</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>IP List</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;STRING\&quot;,\&quot;range\&quot;:[0,64]}</p>
         */
        @NameInMap("TypeDefine")
        public String typeDefine;

        /**
         * <strong>example:</strong>
         * <p>192.168.1XX.1XX</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs self = new ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs();
            return TeaModel.build(map, self);
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1719923175000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("RepairConfigs")
        public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs> repairConfigs;

        /**
         * <strong>example:</strong>
         * <p>REPAIR_SUCCESS_VERIFIED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>repair success verified</p>
         */
        @NameInMap("StatusShowName")
        public String statusShowName;

        /**
         * <strong>example:</strong>
         * <p>6a829841e335b0fb6e0014463284****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair build(java.util.Map<String, ?> map) throws Exception {
            ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair self = new ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair();
            return TeaModel.build(map, self);
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair setRepairConfigs(java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs> repairConfigs) {
            this.repairConfigs = repairConfigs;
            return this;
        }
        public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepairRepairConfigs> getRepairConfigs() {
            return this.repairConfigs;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair setStatusShowName(String statusShowName) {
            this.statusShowName = statusShowName;
            return this;
        }
        public String getStatusShowName() {
            return this.statusShowName;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListOperationCheckResponseBodyOperationTaskInstanceDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <strong>example:</strong>
         * <p>lb-2zefdwrre8ey8ewr0****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Repair")
        public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair> repair;

        /**
         * <strong>example:</strong>
         * <p>REPAIR</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListOperationCheckResponseBodyOperationTaskInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            ListOperationCheckResponseBodyOperationTaskInstanceDetails self = new ListOperationCheckResponseBodyOperationTaskInstanceDetails();
            return TeaModel.build(map, self);
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetails setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetails setRepair(java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair> repair) {
            this.repair = repair;
            return this;
        }
        public java.util.List<ListOperationCheckResponseBodyOperationTaskInstanceDetailsRepair> getRepair() {
            return this.repair;
        }

        public ListOperationCheckResponseBodyOperationTaskInstanceDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
