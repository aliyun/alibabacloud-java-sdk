// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectTransparentImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectTransparentImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectTransparentImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectTransparentImageResponseBody self = new DetectTransparentImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectTransparentImageResponseBody setData(DetectTransparentImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectTransparentImageResponseBodyData getData() {
        return this.data;
    }

    public DetectTransparentImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectTransparentImageResponseBodyDataElements extends TeaModel {
        @NameInMap("TransparentImage")
        public Integer transparentImage;

        public static DetectTransparentImageResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectTransparentImageResponseBodyDataElements self = new DetectTransparentImageResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectTransparentImageResponseBodyDataElements setTransparentImage(Integer transparentImage) {
            this.transparentImage = transparentImage;
            return this;
        }
        public Integer getTransparentImage() {
            return this.transparentImage;
        }

    }

    public static class DetectTransparentImageResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectTransparentImageResponseBodyDataElements> elements;

        public static DetectTransparentImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectTransparentImageResponseBodyData self = new DetectTransparentImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectTransparentImageResponseBodyData setElements(java.util.List<DetectTransparentImageResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectTransparentImageResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
