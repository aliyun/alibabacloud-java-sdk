// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTaskWaitingQueueResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 0 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The waiting queue information.</p>
     */
    @NameInMap("TaskWaitingQueue")
    public DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue taskWaitingQueue;

    public static DescribeComfyTaskWaitingQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTaskWaitingQueueResponseBody self = new DescribeComfyTaskWaitingQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTaskWaitingQueueResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyTaskWaitingQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyTaskWaitingQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyTaskWaitingQueueResponseBody setTaskWaitingQueue(DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue taskWaitingQueue) {
        this.taskWaitingQueue = taskWaitingQueue;
        return this;
    }
    public DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue getTaskWaitingQueue() {
        return this.taskWaitingQueue;
    }

    public static class DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue extends TeaModel {
        /**
         * <p>The number of waiting tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WaitingCount")
        public Long waitingCount;

        public static DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue build(java.util.Map<String, ?> map) throws Exception {
            DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue self = new DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue();
            return TeaModel.build(map, self);
        }

        public DescribeComfyTaskWaitingQueueResponseBodyTaskWaitingQueue setWaitingCount(Long waitingCount) {
            this.waitingCount = waitingCount;
            return this;
        }
        public Long getWaitingCount() {
            return this.waitingCount;
        }

    }

}
