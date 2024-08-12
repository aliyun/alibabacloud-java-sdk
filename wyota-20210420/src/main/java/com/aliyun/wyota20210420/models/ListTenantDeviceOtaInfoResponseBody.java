// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTenantDeviceOtaInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTenantDeviceOtaInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTenantDeviceOtaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantDeviceOtaInfoResponseBody self = new ListTenantDeviceOtaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantDeviceOtaInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantDeviceOtaInfoResponseBody setData(ListTenantDeviceOtaInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTenantDeviceOtaInfoResponseBodyData getData() {
        return this.data;
    }

    public ListTenantDeviceOtaInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantDeviceOtaInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantDeviceOtaInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantDeviceOtaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantDeviceOtaInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos extends TeaModel {
        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Model")
        public String model;

        public static ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos build(java.util.Map<String, ?> map) throws Exception {
            ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos self = new ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos();
            return TeaModel.build(map, self);
        }

        public ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class ListTenantDeviceOtaInfoResponseBodyData extends TeaModel {
        @NameInMap("TenantDeviceOtaInfos")
        public java.util.List<ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos> tenantDeviceOtaInfos;

        public static ListTenantDeviceOtaInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTenantDeviceOtaInfoResponseBodyData self = new ListTenantDeviceOtaInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTenantDeviceOtaInfoResponseBodyData setTenantDeviceOtaInfos(java.util.List<ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos> tenantDeviceOtaInfos) {
            this.tenantDeviceOtaInfos = tenantDeviceOtaInfos;
            return this;
        }
        public java.util.List<ListTenantDeviceOtaInfoResponseBodyDataTenantDeviceOtaInfos> getTenantDeviceOtaInfos() {
            return this.tenantDeviceOtaInfos;
        }

    }

}
