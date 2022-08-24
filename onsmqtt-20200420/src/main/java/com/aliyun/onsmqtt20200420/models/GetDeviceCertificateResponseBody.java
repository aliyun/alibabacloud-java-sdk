// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDeviceCertificateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCertificateResponseBody self = new GetDeviceCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceCertificateResponseBody setData(GetDeviceCertificateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceCertificateResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceCertificateResponseBodyData extends TeaModel {
        @NameInMap("CaSn")
        public String caSn;

        @NameInMap("DeviceContent")
        public String deviceContent;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("Status")
        public String status;

        @NameInMap("ValidBegin")
        public String validBegin;

        @NameInMap("ValidEnd")
        public String validEnd;

        public static GetDeviceCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceCertificateResponseBodyData self = new GetDeviceCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceCertificateResponseBodyData setCaSn(String caSn) {
            this.caSn = caSn;
            return this;
        }
        public String getCaSn() {
            return this.caSn;
        }

        public GetDeviceCertificateResponseBodyData setDeviceContent(String deviceContent) {
            this.deviceContent = deviceContent;
            return this;
        }
        public String getDeviceContent() {
            return this.deviceContent;
        }

        public GetDeviceCertificateResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDeviceCertificateResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public GetDeviceCertificateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeviceCertificateResponseBodyData setValidBegin(String validBegin) {
            this.validBegin = validBegin;
            return this;
        }
        public String getValidBegin() {
            return this.validBegin;
        }

        public GetDeviceCertificateResponseBodyData setValidEnd(String validEnd) {
            this.validEnd = validEnd;
            return this;
        }
        public String getValidEnd() {
            return this.validEnd;
        }

    }

}
