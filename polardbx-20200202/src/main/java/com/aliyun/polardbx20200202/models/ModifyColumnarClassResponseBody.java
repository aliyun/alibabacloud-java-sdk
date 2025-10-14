// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyColumnarClassResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyColumnarClassResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyColumnarClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyColumnarClassResponseBody self = new ModifyColumnarClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyColumnarClassResponseBody setData(ModifyColumnarClassResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyColumnarClassResponseBodyData getData() {
        return this.data;
    }

    public ModifyColumnarClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyColumnarClassResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ModifyColumnarClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyColumnarClassResponseBodyData self = new ModifyColumnarClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyColumnarClassResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
