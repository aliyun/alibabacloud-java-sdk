// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateRplInspectionTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateRplInspectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRplInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRplInspectionTaskResponseBody self = new CreateRplInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRplInspectionTaskResponseBody setData(CreateRplInspectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRplInspectionTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateRplInspectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRplInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRplInspectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRplInspectionTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static CreateRplInspectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRplInspectionTaskResponseBodyData self = new CreateRplInspectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRplInspectionTaskResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
