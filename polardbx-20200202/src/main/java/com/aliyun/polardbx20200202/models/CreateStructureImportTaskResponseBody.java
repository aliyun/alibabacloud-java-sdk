// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStructureImportTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateStructureImportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73559800-3c8c-****-bd40-99cfcff3fe1e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStructureImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStructureImportTaskResponseBody self = new CreateStructureImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStructureImportTaskResponseBody setData(CreateStructureImportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStructureImportTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateStructureImportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStructureImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStructureImportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStructureImportTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static CreateStructureImportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStructureImportTaskResponseBodyData self = new CreateStructureImportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStructureImportTaskResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
