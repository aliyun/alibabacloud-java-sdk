// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAccountResponseBody extends TeaModel {
    @NameInMap("DeviceIds")
    public QueryDevicesByAccountResponseBodyDeviceIds deviceIds;

    /**
     * <strong>example:</strong>
     * <p>A8A24108-2AD0-4F6E-81C7-A8A24C2C2AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDevicesByAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAccountResponseBody self = new QueryDevicesByAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAccountResponseBody setDeviceIds(QueryDevicesByAccountResponseBodyDeviceIds deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public QueryDevicesByAccountResponseBodyDeviceIds getDeviceIds() {
        return this.deviceIds;
    }

    public QueryDevicesByAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDevicesByAccountResponseBodyDeviceIds extends TeaModel {
        @NameInMap("DeviceId")
        public java.util.List<String> deviceId;

        public static QueryDevicesByAccountResponseBodyDeviceIds build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesByAccountResponseBodyDeviceIds self = new QueryDevicesByAccountResponseBodyDeviceIds();
            return TeaModel.build(map, self);
        }

        public QueryDevicesByAccountResponseBodyDeviceIds setDeviceId(java.util.List<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public java.util.List<String> getDeviceId() {
            return this.deviceId;
        }

    }

}
