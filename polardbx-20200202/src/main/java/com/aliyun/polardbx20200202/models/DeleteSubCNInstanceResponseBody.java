// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteSubCNInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteSubCNInstanceResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A586DCB-39A6-4050-81CC-C7BD4CCDB49F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSubCNInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubCNInstanceResponseBody self = new DeleteSubCNInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubCNInstanceResponseBody setData(DeleteSubCNInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSubCNInstanceResponseBodyData getData() {
        return this.data;
    }

    public DeleteSubCNInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteSubCNInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DeleteSubCNInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSubCNInstanceResponseBodyData self = new DeleteSubCNInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSubCNInstanceResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
