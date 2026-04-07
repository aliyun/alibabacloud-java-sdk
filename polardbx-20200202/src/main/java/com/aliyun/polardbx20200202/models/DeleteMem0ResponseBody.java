// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteMem0ResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteMem0ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMem0ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMem0ResponseBody self = new DeleteMem0ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMem0ResponseBody setData(DeleteMem0ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteMem0ResponseBodyData getData() {
        return this.data;
    }

    public DeleteMem0ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteMem0ResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DeleteMem0ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMem0ResponseBodyData self = new DeleteMem0ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteMem0ResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
