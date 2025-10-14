// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCdcClassResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyCdcClassResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCdcClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdcClassResponseBody self = new ModifyCdcClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdcClassResponseBody setData(ModifyCdcClassResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyCdcClassResponseBodyData getData() {
        return this.data;
    }

    public ModifyCdcClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyCdcClassResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ModifyCdcClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCdcClassResponseBodyData self = new ModifyCdcClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyCdcClassResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
