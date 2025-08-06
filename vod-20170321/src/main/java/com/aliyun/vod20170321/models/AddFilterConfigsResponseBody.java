// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFilterConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AddFilterConfigsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddFilterConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFilterConfigsResponseBody self = new AddFilterConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFilterConfigsResponseBody setData(java.util.List<AddFilterConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddFilterConfigsResponseBodyData> getData() {
        return this.data;
    }

    public AddFilterConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFilterConfigsResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Uuid")
        public String uuid;

        public static AddFilterConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFilterConfigsResponseBodyData self = new AddFilterConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFilterConfigsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddFilterConfigsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddFilterConfigsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
