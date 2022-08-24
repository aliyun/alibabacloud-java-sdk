// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDeviceCertificateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCertificateResponseBody self = new ListDeviceCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceCertificateResponseBody setData(ListDeviceCertificateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceCertificateResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceCertificateResponseBodyDataDeviceCertificateVOS extends TeaModel {
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

        public static ListDeviceCertificateResponseBodyDataDeviceCertificateVOS build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceCertificateResponseBodyDataDeviceCertificateVOS self = new ListDeviceCertificateResponseBodyDataDeviceCertificateVOS();
            return TeaModel.build(map, self);
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setCaSn(String caSn) {
            this.caSn = caSn;
            return this;
        }
        public String getCaSn() {
            return this.caSn;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setDeviceContent(String deviceContent) {
            this.deviceContent = deviceContent;
            return this;
        }
        public String getDeviceContent() {
            return this.deviceContent;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setValidBegin(String validBegin) {
            this.validBegin = validBegin;
            return this;
        }
        public String getValidBegin() {
            return this.validBegin;
        }

        public ListDeviceCertificateResponseBodyDataDeviceCertificateVOS setValidEnd(String validEnd) {
            this.validEnd = validEnd;
            return this;
        }
        public String getValidEnd() {
            return this.validEnd;
        }

    }

    public static class ListDeviceCertificateResponseBodyData extends TeaModel {
        @NameInMap("DeviceCertificateVOS")
        public java.util.List<ListDeviceCertificateResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListDeviceCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceCertificateResponseBodyData self = new ListDeviceCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceCertificateResponseBodyData setDeviceCertificateVOS(java.util.List<ListDeviceCertificateResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS) {
            this.deviceCertificateVOS = deviceCertificateVOS;
            return this;
        }
        public java.util.List<ListDeviceCertificateResponseBodyDataDeviceCertificateVOS> getDeviceCertificateVOS() {
            return this.deviceCertificateVOS;
        }

        public ListDeviceCertificateResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDeviceCertificateResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDeviceCertificateResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
