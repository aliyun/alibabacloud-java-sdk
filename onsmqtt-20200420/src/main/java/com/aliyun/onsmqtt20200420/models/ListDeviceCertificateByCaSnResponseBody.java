// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListDeviceCertificateByCaSnResponseBody extends TeaModel {
    /**
     * <p>Query result.</p>
     */
    @NameInMap("Data")
    public ListDeviceCertificateByCaSnResponseBodyData data;

    /**
     * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
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
         * <li>0: indicates that the certificate is in an inactive state. </li>
         * <li>1: indicates that the certificate is in an active state.</li>
         * </ul>
         * <p>After the device certificate is registered, it is in an active state by default.</p>
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
         * <p>The end time when the device certificate becomes effective. The format is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1969497303000</p>
         */
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
        /**
         * <p>Details of the device certificate.</p>
         */
        @NameInMap("DeviceCertificateVOS")
        public java.util.List<ListDeviceCertificateByCaSnResponseBodyDataDeviceCertificateVOS> deviceCertificateVOS;

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
         * <p>Total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
