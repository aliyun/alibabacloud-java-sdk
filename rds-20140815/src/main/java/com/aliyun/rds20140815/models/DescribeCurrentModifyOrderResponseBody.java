// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCurrentModifyOrderResponseBody extends TeaModel {
    /**
     * <p>The specification change order.</p>
     */
    @NameInMap("ModifyOrder")
    public java.util.List<DescribeCurrentModifyOrderResponseBodyModifyOrder> modifyOrder;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C87415BE-F5AB-55A4-A60E-A0A329EAF2A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCurrentModifyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCurrentModifyOrderResponseBody self = new DescribeCurrentModifyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCurrentModifyOrderResponseBody setModifyOrder(java.util.List<DescribeCurrentModifyOrderResponseBodyModifyOrder> modifyOrder) {
        this.modifyOrder = modifyOrder;
        return this;
    }
    public java.util.List<DescribeCurrentModifyOrderResponseBodyModifyOrder> getModifyOrder() {
        return this.modifyOrder;
    }

    public DescribeCurrentModifyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCurrentModifyOrderResponseBodyModifyOrder extends TeaModel {
        /**
         * <p>The instance family of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-cn-nwy39qeys0003r</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The effective time. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: This is the default value.</li>
         * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see <a href="https://help.aliyun.com/document_detail/610402.html">ModifyDBInstanceMaintainTime</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6MTg2MjEwOTkwLCJzdGFydCI6InNob3BpZnktdXNlci1jb3JlXHUwMDAwIn0</p>
         */
        @NameInMap("Mark")
        public String mark;

        /**
         * <p>The memory capacity that is supported by the instance type. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MemoryClass")
        public String memoryClass;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeed,Scheduled,Running,Cancelling,Canceled,Waiting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Storage")
        public String storage;

        /**
         * <p>The new instance type of the instance. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.x2.medium.2c</p>
         */
        @NameInMap("TargetDBInstanceClass")
        public String targetDBInstanceClass;

        public static DescribeCurrentModifyOrderResponseBodyModifyOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeCurrentModifyOrderResponseBodyModifyOrder self = new DescribeCurrentModifyOrderResponseBodyModifyOrder();
            return TeaModel.build(map, self);
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setClassGroup(String classGroup) {
            this.classGroup = classGroup;
            return this;
        }
        public String getClassGroup() {
            return this.classGroup;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setMark(String mark) {
            this.mark = mark;
            return this;
        }
        public String getMark() {
            return this.mark;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setMemoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        public String getMemoryClass() {
            return this.memoryClass;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

        public DescribeCurrentModifyOrderResponseBodyModifyOrder setTargetDBInstanceClass(String targetDBInstanceClass) {
            this.targetDBInstanceClass = targetDBInstanceClass;
            return this;
        }
        public String getTargetDBInstanceClass() {
            return this.targetDBInstanceClass;
        }

    }

}
