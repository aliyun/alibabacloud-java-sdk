// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecUserOperationsResponseBody extends TeaModel {
    /**
     * <p>The operation records.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecUserOperationsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
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
         * <p>The state before the operation.</p>
         * <p>Valid values of the risk state:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>toBeFixed</strong></li>
         * <li><strong>fixed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * <p>Valid values of the event state:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignored</p>
         */
        @NameInMap("FromStatus")
        public String fromStatus;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Handled</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The object ID of the operation record.</p>
         * 
         * <strong>example:</strong>
         * <p>24d997acc48a67a01e09b9c5ad861287</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The time at which the operation was performed. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685072214</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The state after the operation.</p>
         * <p>Valid values of the risk state:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>toBeFixed</strong></li>
         * <li><strong>fixed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * <p>Valid values of the event state:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>ignored</strong></li>
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
         * <li><strong>abnormal</strong>: risk detection</li>
         * <li><strong>event</strong>: security event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abnormal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user ID.</p>
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
