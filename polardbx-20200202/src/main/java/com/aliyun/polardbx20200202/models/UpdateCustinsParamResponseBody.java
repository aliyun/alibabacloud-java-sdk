// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateCustinsParamResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateCustinsParamResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>73559800-3c8c-****-bd40-99cfcff3fe1e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustinsParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustinsParamResponseBody self = new UpdateCustinsParamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustinsParamResponseBody setData(UpdateCustinsParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCustinsParamResponseBodyData getData() {
        return this.data;
    }

    public UpdateCustinsParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateCustinsParamResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static UpdateCustinsParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustinsParamResponseBodyData self = new UpdateCustinsParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCustinsParamResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
