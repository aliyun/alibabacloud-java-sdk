// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAliasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceIds")
    public QueryDevicesByAliasResponseBodyDeviceIds deviceIds;

    public static QueryDevicesByAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAliasResponseBody self = new QueryDevicesByAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicesByAliasResponseBody setDeviceIds(QueryDevicesByAliasResponseBodyDeviceIds deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public QueryDevicesByAliasResponseBodyDeviceIds getDeviceIds() {
        return this.deviceIds;
    }

    public static class QueryDevicesByAliasResponseBodyDeviceIds extends TeaModel {
        @NameInMap("DeviceId")
        public java.util.List<String> deviceId;

        public static QueryDevicesByAliasResponseBodyDeviceIds build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesByAliasResponseBodyDeviceIds self = new QueryDevicesByAliasResponseBodyDeviceIds();
            return TeaModel.build(map, self);
        }

        public QueryDevicesByAliasResponseBodyDeviceIds setDeviceId(java.util.List<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public java.util.List<String> getDeviceId() {
            return this.deviceId;
        }

    }

}
