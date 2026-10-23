// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchOperateWorkItemsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The results for each item. The order of the results matches the order of the items in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<BatchOperateWorkItemsResponseBodyItems> items;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of skipped or failed operations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("skipped")
    public Long skipped;

    /**
     * <p>The number of successful operations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("succeeded")
    public Long succeeded;

    public static BatchOperateWorkItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateWorkItemsResponseBody self = new BatchOperateWorkItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchOperateWorkItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchOperateWorkItemsResponseBody setItems(java.util.List<BatchOperateWorkItemsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BatchOperateWorkItemsResponseBodyItems> getItems() {
        return this.items;
    }

    public BatchOperateWorkItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchOperateWorkItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchOperateWorkItemsResponseBody setSkipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }
    public Long getSkipped() {
        return this.skipped;
    }

    public BatchOperateWorkItemsResponseBody setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
        return this;
    }
    public Long getSucceeded() {
        return this.succeeded;
    }

    public static class BatchOperateWorkItemsResponseBodyItems extends TeaModel {
        /**
         * <p>The reason for skipping or failure.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>Indicates whether the execution was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The ID of the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("workItemId")
        public String workItemId;

        public static BatchOperateWorkItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            BatchOperateWorkItemsResponseBodyItems self = new BatchOperateWorkItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public BatchOperateWorkItemsResponseBodyItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public BatchOperateWorkItemsResponseBodyItems setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchOperateWorkItemsResponseBodyItems setWorkItemId(String workItemId) {
            this.workItemId = workItemId;
            return this;
        }
        public String getWorkItemId() {
            return this.workItemId;
        }

    }

}
