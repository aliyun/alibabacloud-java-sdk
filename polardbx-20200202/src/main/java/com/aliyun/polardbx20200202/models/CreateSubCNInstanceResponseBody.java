// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSubCNInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateSubCNInstanceResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSubCNInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCNInstanceResponseBody self = new CreateSubCNInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubCNInstanceResponseBody setData(CreateSubCNInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSubCNInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateSubCNInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSubCNInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateSubCNInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSubCNInstanceResponseBodyData self = new CreateSubCNInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSubCNInstanceResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
