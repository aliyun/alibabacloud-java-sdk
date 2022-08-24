// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateByCaSnResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDeviceCertificateByCaSnResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceCertificateByCaSnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceCertificateByCaSnResponseBody self = new ListDeviceCertificateByCaSnResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceCertificateByCaSnResponseBody setData(ListDeviceCertificateByCaSnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceCertificateByCaSnResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceCertificateByCaSnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS extends TeaModel {
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

        public static ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS self = new ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS();
            return TeaModel.build(map, self);
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setCaSn(String caSn) {
            this.caSn = caSn;
            return this;
        }
        public String getCaSn() {
            return this.caSn;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setDeviceContent(String deviceContent) {
            this.deviceContent = deviceContent;
            return this;
        }
        public String getDeviceContent() {
            return this.deviceContent;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setValidBegin(String validBegin) {
            this.validBegin = validBegin;
            return this;
        }
        public String getValidBegin() {
            return this.validBegin;
        }

        public ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS setValidEnd(String validEnd) {
            this.validEnd = validEnd;
            return this;
        }
        public String getValidEnd() {
            return this.validEnd;
        }

    }

    public static class ListDeviceCertificateByCaSnResponseBodyData extends TeaModel {
        @NameInMap("DeviceCertificateVOS")
        public java.util.List<ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListDeviceCertificateByCaSnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceCertificateByCaSnResponseBodyData self = new ListDeviceCertificateByCaSnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceCertificateByCaSnResponseBodyData setDeviceCertificateVOS(java.util.List<ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS) {
            this.deviceCertificateVOS = deviceCertificateVOS;
            return this;
        }
        public java.util.List<ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS> getDeviceCertificateVOS() {
            return this.deviceCertificateVOS;
        }

        public ListDeviceCertificateByCaSnResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDeviceCertificateByCaSnResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDeviceCertificateByCaSnResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
