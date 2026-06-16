// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetMem0AccountPasswordResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public ResetMem0AccountPasswordResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetMem0AccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetMem0AccountPasswordResponseBody self = new ResetMem0AccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetMem0AccountPasswordResponseBody setData(ResetMem0AccountPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetMem0AccountPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetMem0AccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetMem0AccountPasswordResponseBodyData extends TeaModel {
        /**
         * <p>API KEY</p>
         * 
         * <strong>example:</strong>
         * <p>aafdf2e7d0988ef***</p>
         */
        @NameInMap("Mem0ApiKey")
        public String mem0ApiKey;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ResetMem0AccountPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetMem0AccountPasswordResponseBodyData self = new ResetMem0AccountPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetMem0AccountPasswordResponseBodyData setMem0ApiKey(String mem0ApiKey) {
            this.mem0ApiKey = mem0ApiKey;
            return this;
        }
        public String getMem0ApiKey() {
            return this.mem0ApiKey;
        }

        public ResetMem0AccountPasswordResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
