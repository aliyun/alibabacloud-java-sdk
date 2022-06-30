// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceCountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCountResponseBody self = new GetDeviceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceCountResponseBody setData(GetDeviceCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceCountResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceCountResponseBodyData extends TeaModel {
        @NameInMap("DeviceCount")
        public Long deviceCount;

        public static GetDeviceCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceCountResponseBodyData self = new GetDeviceCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceCountResponseBodyData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

    }

}
