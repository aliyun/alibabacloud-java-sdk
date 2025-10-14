// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDataImportTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDataImportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportTaskResponseBody self = new CreateDataImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataImportTaskResponseBody setData(CreateDataImportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataImportTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateDataImportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDataImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataImportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataImportTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static CreateDataImportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataImportTaskResponseBodyData self = new CreateDataImportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataImportTaskResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
