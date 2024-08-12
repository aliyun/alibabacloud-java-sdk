// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAppOtaTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppOtaTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaTaskResponseBody self = new CreateAppOtaTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAppOtaTaskResponseBody setData(CreateAppOtaTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppOtaTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateAppOtaTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppOtaTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppOtaTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        public static CreateAppOtaTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppOtaTaskResponseBodyData self = new CreateAppOtaTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppOtaTaskResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

}
