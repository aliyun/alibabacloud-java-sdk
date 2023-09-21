// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientAlertModeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListClientAlertModeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClientAlertModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientAlertModeResponseBody self = new ListClientAlertModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientAlertModeResponseBody setData(ListClientAlertModeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListClientAlertModeResponseBodyData getData() {
        return this.data;
    }

    public ListClientAlertModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClientAlertModeResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Uuids")
        public java.util.List<String> uuids;

        public static ListClientAlertModeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClientAlertModeResponseBodyData self = new ListClientAlertModeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClientAlertModeResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClientAlertModeResponseBodyData setUuids(java.util.List<String> uuids) {
            this.uuids = uuids;
            return this;
        }
        public java.util.List<String> getUuids() {
            return this.uuids;
        }

    }

}
