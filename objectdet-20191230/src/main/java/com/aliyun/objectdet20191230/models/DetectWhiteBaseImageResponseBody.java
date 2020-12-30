// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectWhiteBaseImageResponseBodyData data;

    public static DetectWhiteBaseImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageResponseBody self = new DetectWhiteBaseImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectWhiteBaseImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectWhiteBaseImageResponseBody setData(DetectWhiteBaseImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectWhiteBaseImageResponseBodyData getData() {
        return this.data;
    }

    public static class DetectWhiteBaseImageResponseBodyDataElements extends TeaModel {
        @NameInMap("WhiteBase")
        public Integer whiteBase;

        public static DetectWhiteBaseImageResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectWhiteBaseImageResponseBodyDataElements self = new DetectWhiteBaseImageResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectWhiteBaseImageResponseBodyDataElements setWhiteBase(Integer whiteBase) {
            this.whiteBase = whiteBase;
            return this;
        }
        public Integer getWhiteBase() {
            return this.whiteBase;
        }

    }

    public static class DetectWhiteBaseImageResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectWhiteBaseImageResponseBodyDataElements> elements;

        public static DetectWhiteBaseImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectWhiteBaseImageResponseBodyData self = new DetectWhiteBaseImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectWhiteBaseImageResponseBodyData setElements(java.util.List<DetectWhiteBaseImageResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectWhiteBaseImageResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
