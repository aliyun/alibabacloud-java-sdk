// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateTrainLabelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public CreateTrainLabelResponseBodyData data;

    public static CreateTrainLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainLabelResponseBody self = new CreateTrainLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrainLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrainLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTrainLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTrainLabelResponseBody setData(CreateTrainLabelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTrainLabelResponseBodyData getData() {
        return this.data;
    }

    public static class CreateTrainLabelResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateTrainLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainLabelResponseBodyData self = new CreateTrainLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTrainLabelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
