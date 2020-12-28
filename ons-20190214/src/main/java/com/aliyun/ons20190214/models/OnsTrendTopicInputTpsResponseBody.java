// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTrendTopicInputTpsResponseBodyData data;

    public static OnsTrendTopicInputTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsResponseBody self = new OnsTrendTopicInputTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTrendTopicInputTpsResponseBody setData(OnsTrendTopicInputTpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTrendTopicInputTpsResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTrendTopicInputTpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Long x;

        public static OnsTrendTopicInputTpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyDataRecords self = new OnsTrendTopicInputTpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecords setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public OnsTrendTopicInputTpsResponseBodyDataRecords setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

    }

    public static class OnsTrendTopicInputTpsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecords> records;

        @NameInMap("XUnit")
        public String XUnit;

        @NameInMap("YUnit")
        public String YUnit;

        @NameInMap("Title")
        public String title;

        public static OnsTrendTopicInputTpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTrendTopicInputTpsResponseBodyData self = new OnsTrendTopicInputTpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTrendTopicInputTpsResponseBodyData setRecords(java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<OnsTrendTopicInputTpsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public OnsTrendTopicInputTpsResponseBodyData setXUnit(String XUnit) {
            this.XUnit = XUnit;
            return this;
        }
        public String getXUnit() {
            return this.XUnit;
        }

        public OnsTrendTopicInputTpsResponseBodyData setYUnit(String YUnit) {
            this.YUnit = YUnit;
            return this;
        }
        public String getYUnit() {
            return this.YUnit;
        }

        public OnsTrendTopicInputTpsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
