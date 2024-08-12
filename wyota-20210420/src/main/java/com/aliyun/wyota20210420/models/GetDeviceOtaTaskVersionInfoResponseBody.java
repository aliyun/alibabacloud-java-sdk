// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaTaskVersionInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceOtaTaskVersionInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceOtaTaskVersionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaTaskVersionInfoResponseBody self = new GetDeviceOtaTaskVersionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaTaskVersionInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceOtaTaskVersionInfoResponseBody setData(GetDeviceOtaTaskVersionInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceOtaTaskVersionInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceOtaTaskVersionInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceOtaTaskVersionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceOtaTaskVersionInfoResponseBodyData extends TeaModel {
        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Version")
        public String version;

        public static GetDeviceOtaTaskVersionInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceOtaTaskVersionInfoResponseBodyData self = new GetDeviceOtaTaskVersionInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceOtaTaskVersionInfoResponseBodyData setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public GetDeviceOtaTaskVersionInfoResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDeviceOtaTaskVersionInfoResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
