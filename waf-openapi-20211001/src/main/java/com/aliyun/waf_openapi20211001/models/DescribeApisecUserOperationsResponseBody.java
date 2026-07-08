// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecUserOperationsResponseBody extends TeaModel {
    /**
     * <p>The user operation records for API security.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecUserOperationsResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C9825654-327B-5156-A570-847054B4CF10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecUserOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecUserOperationsResponseBody self = new DescribeApisecUserOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecUserOperationsResponseBody setData(java.util.List<DescribeApisecUserOperationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecUserOperationsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecUserOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApisecUserOperationsResponseBodyData extends TeaModel {
        /**
         * <p>The status of the threat detection or security event before the operation was performed.</p>
         * <p>Valid values for threat detection:</p>
         * <ul>
         * <li><p><strong>toBeConfirmed</strong>: to be confirmed.</p>
         * </li>
         * <li><p><strong>confirmed</strong>: confirmed.</p>
         * </li>
         * <li><p><strong>toBeFixed</strong>: to be fixed.</p>
         * </li>
         * <li><p><strong>fixed</strong>: fixed.</p>
         * </li>
         * <li><p><strong>ignored</strong>: ignored.</p>
         * </li>
         * </ul>
         * <p>Valid values for a security event:</p>
         * <ul>
         * <li><p><strong>toBeConfirmed</strong>: to be confirmed.</p>
         * </li>
         * <li><p><strong>confirmed</strong>: confirmed.</p>
         * </li>
         * <li><p><strong>ignored</strong>: ignored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignored</p>
         */
        @NameInMap("FromStatus")
        public String fromStatus;

        /**
         * <p>The remarks that the user added to the operation record.</p>
         * 
         * <strong>example:</strong>
         * <p>Procesed</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the threat detection or security event associated with the operation record.</p>
         * 
         * <strong>example:</strong>
         * <p>24d997acc48a67a01e09b9c5ad861287</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The source of the operation. Valid values:</p>
         * <ul>
         * <li><p><strong>system</strong>: the operation was automatically performed by the system.</p>
         * </li>
         * <li><p><strong>custom</strong>: the operation was manually performed by a user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("OperationSource")
        public String operationSource;

        /**
         * <p>The time when the operation was performed. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685072214</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The status of the threat detection or security event after the operation was performed.</p>
         * <p>Valid values for threat detection:</p>
         * <ul>
         * <li><p><strong>toBeConfirmed</strong>: to be confirmed.</p>
         * </li>
         * <li><p><strong>confirmed</strong>: confirmed.</p>
         * </li>
         * <li><p><strong>toBeFixed</strong>: to be fixed.</p>
         * </li>
         * <li><p><strong>fixed</strong>: fixed.</p>
         * </li>
         * <li><p><strong>ignored</strong>: ignored.</p>
         * </li>
         * </ul>
         * <p>Valid values for a security event:</p>
         * <ul>
         * <li><p><strong>toBeConfirmed</strong>: to be confirmed.</p>
         * </li>
         * <li><p><strong>confirmed</strong>: confirmed.</p>
         * </li>
         * <li><p><strong>ignored</strong>: ignored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
         */
        @NameInMap("ToStatus")
        public String toStatus;

        /**
         * <p>The type of the operation record. Valid values:</p>
         * <ul>
         * <li><p><strong>abnormal</strong>: threat detection.</p>
         * </li>
         * <li><p><strong>event</strong>: security event.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abnormal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the user who performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1610954****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeApisecUserOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecUserOperationsResponseBodyData self = new DescribeApisecUserOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecUserOperationsResponseBodyData setFromStatus(String fromStatus) {
            this.fromStatus = fromStatus;
            return this;
        }
        public String getFromStatus() {
            return this.fromStatus;
        }

        public DescribeApisecUserOperationsResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeApisecUserOperationsResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public DescribeApisecUserOperationsResponseBodyData setOperationSource(String operationSource) {
            this.operationSource = operationSource;
            return this;
        }
        public String getOperationSource() {
            return this.operationSource;
        }

        public DescribeApisecUserOperationsResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeApisecUserOperationsResponseBodyData setToStatus(String toStatus) {
            this.toStatus = toStatus;
            return this;
        }
        public String getToStatus() {
            return this.toStatus;
        }

        public DescribeApisecUserOperationsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApisecUserOperationsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
