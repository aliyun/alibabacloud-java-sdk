// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMqttQueryMsgTransTrendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsMqttQueryMsgTransTrendResponseBodyData data;

    public static OnsMqttQueryMsgTransTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMqttQueryMsgTransTrendResponseBody self = new OnsMqttQueryMsgTransTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMqttQueryMsgTransTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMqttQueryMsgTransTrendResponseBody setData(OnsMqttQueryMsgTransTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsMqttQueryMsgTransTrendResponseBodyData getData() {
        return this.data;
    }

    public static class OnsMqttQueryMsgTransTrendResponseBodyDataRecords extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsMqttQueryMsgTransTrendResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryMsgTransTrendResponseBodyDataRecords self = new OnsMqttQueryMsgTransTrendResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryMsgTransTrendResponseBodyDataRecords setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsMqttQueryMsgTransTrendResponseBodyDataRecords setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsMqttQueryMsgTransTrendResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<OnsMqttQueryMsgTransTrendResponseBodyDataRecords> records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsMqttQueryMsgTransTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsMqttQueryMsgTransTrendResponseBodyData self = new OnsMqttQueryMsgTransTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsMqttQueryMsgTransTrendResponseBodyData setRecords(java.util.List<OnsMqttQueryMsgTransTrendResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<OnsMqttQueryMsgTransTrendResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public OnsMqttQueryMsgTransTrendResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsMqttQueryMsgTransTrendResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsMqttQueryMsgTransTrendResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
