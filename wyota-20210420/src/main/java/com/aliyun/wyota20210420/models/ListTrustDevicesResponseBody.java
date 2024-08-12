// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTrustDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTrustDevicesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTrustDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrustDevicesResponseBody self = new ListTrustDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrustDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTrustDevicesResponseBody setData(java.util.List<ListTrustDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTrustDevicesResponseBodyData> getData() {
        return this.data;
    }

    public ListTrustDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTrustDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrustDevicesResponseBodyData extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Uuid")
        public String uuid;

        public static ListTrustDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTrustDevicesResponseBodyData self = new ListTrustDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTrustDevicesResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListTrustDevicesResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListTrustDevicesResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListTrustDevicesResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
