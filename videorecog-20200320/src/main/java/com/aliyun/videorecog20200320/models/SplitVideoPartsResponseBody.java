// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class SplitVideoPartsResponseBody extends TeaModel {
    @NameInMap("Data")
    public SplitVideoPartsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SplitVideoPartsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SplitVideoPartsResponseBody self = new SplitVideoPartsResponseBody();
        return TeaModel.build(map, self);
    }

    public SplitVideoPartsResponseBody setData(SplitVideoPartsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SplitVideoPartsResponseBodyData getData() {
        return this.data;
    }

    public SplitVideoPartsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SplitVideoPartsResponseBodyDataElements extends TeaModel {
        @NameInMap("BeginTime")
        public Float beginTime;

        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("Index")
        public Long index;

        public static SplitVideoPartsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SplitVideoPartsResponseBodyDataElements self = new SplitVideoPartsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SplitVideoPartsResponseBodyDataElements setBeginTime(Float beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Float getBeginTime() {
            return this.beginTime;
        }

        public SplitVideoPartsResponseBodyDataElements setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public SplitVideoPartsResponseBodyDataElements setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

    public static class SplitVideoPartsResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SplitVideoPartsResponseBodyDataElements> elements;

        public static SplitVideoPartsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SplitVideoPartsResponseBodyData self = new SplitVideoPartsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SplitVideoPartsResponseBodyData setElements(java.util.List<SplitVideoPartsResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SplitVideoPartsResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
