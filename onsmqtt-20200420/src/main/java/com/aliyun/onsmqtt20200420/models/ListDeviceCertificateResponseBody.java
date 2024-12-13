// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateResponseBody extends TeaModel {
    /**
     * <p>Query result.</p>
     */
    @NameInMap("Data")
    public ListDeviceCertificateResponseBodyData data;

    /**
     * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
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
        /**
         * <p>The SN serial number of the CA certificate to which the device certificate belongs, used to uniquely identify a CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>00f26900ba87******</p>
         */
        @NameInMap("CaSn")
        public String caSn;

        /**
         * <p>Content of the device certificate.</p>
         * <p> represents a new line.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN DEVICECERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END DEVICECERTIFICATE-----</p>
         */
        @NameInMap("DeviceContent")
        public String deviceContent;

        /**
         * <p>Name of the device certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt_device</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The SN serial number of the device certificate, used to uniquely identify a device certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>356217374433******</p>
         */
        @NameInMap("DeviceSn")
        public String deviceSn;

        /**
         * <p>The status of the device certificate. The values are as follows:</p>
         * <ul>
         * <li>0: indicates that the certificate is in an inactive state. - 1: indicates that the certificate is in an active state.
         * After the device certificate is registered, it defaults to the active state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The start time when the device certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1654137303000</p>
         */
        @NameInMap("ValidBegin")
        public String validBegin;

        /**
         * <p>The end time when the device certificate becomes effective. Formatted as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1969497303000</p>
         */
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
        /**
         * <p>Details of the device certificate.</p>
         */
        @NameInMap("DeviceCertificateVOS")
        public java.util.List<ListDeviceCertificateResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS;

        /**
         * <p>The current page number of the returned query records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The maximum number of results to display per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Maximum number of pages in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
