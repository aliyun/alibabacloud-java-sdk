// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchOperateWorkItemsResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>逐项结果，顺序与请求一致</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<BatchOperateWorkItemsResponseBodyItems> items;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>跳过或失败数量</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("skipped")
    public Long skipped;

    /**
     * <p>成功数量</p>
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
         * <p>跳过或失败原因</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>是否执行成功</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>工作项ID</p>
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
