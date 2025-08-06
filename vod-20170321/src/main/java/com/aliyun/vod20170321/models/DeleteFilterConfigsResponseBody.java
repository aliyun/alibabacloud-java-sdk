// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteFilterConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteFilterConfigsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFilterConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterConfigsResponseBody self = new DeleteFilterConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilterConfigsResponseBody setData(DeleteFilterConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteFilterConfigsResponseBodyData getData() {
        return this.data;
    }

    public DeleteFilterConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteFilterConfigsResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteFilterConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilterConfigsResponseBodyData self = new DeleteFilterConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteFilterConfigsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteFilterConfigsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
