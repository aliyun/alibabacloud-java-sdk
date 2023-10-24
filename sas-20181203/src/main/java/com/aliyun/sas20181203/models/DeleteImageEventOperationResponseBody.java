// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteImageEventOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteImageEventOperationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteImageEventOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageEventOperationResponseBody self = new DeleteImageEventOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageEventOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteImageEventOperationResponseBody setData(DeleteImageEventOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteImageEventOperationResponseBodyData getData() {
        return this.data;
    }

    public DeleteImageEventOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteImageEventOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteImageEventOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteImageEventOperationResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static DeleteImageEventOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteImageEventOperationResponseBodyData self = new DeleteImageEventOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteImageEventOperationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
