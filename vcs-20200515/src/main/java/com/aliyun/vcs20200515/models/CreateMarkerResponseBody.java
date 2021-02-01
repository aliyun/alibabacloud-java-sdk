// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateMarkerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public CreateMarkerResponseBodyData data;

    public static CreateMarkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMarkerResponseBody self = new CreateMarkerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMarkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMarkerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMarkerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMarkerResponseBody setData(CreateMarkerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMarkerResponseBodyData getData() {
        return this.data;
    }

    public static class CreateMarkerResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateMarkerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMarkerResponseBodyData self = new CreateMarkerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMarkerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
