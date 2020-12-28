// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTrendGroupOutputTpsResponseBodyData data;

    public static OnsTrendGroupOutputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendGroupOutputTpsResponseBody self = new OnsTrendGroupOutputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendGroupOutputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTrendGroupOutputTpsResponseBody setData(OnsTrendGroupOutputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendGroupOutputTpsResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTrendGroupOutputTpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsTrendGroupOutputTpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyDataRecords self = new OnsTrendGroupOutputTpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecords setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsTrendGroupOutputTpsResponseBodyDataRecords setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsTrendGroupOutputTpsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecords> records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsTrendGroupOutputTpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendGroupOutputTpsResponseBodyData self = new OnsTrendGroupOutputTpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTrendGroupOutputTpsResponseBodyData setRecords(java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<OnsTrendGroupOutputTpsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsTrendGroupOutputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
