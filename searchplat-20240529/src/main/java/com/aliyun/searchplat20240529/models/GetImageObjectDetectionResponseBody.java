// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageObjectDetectionResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetImageObjectDetectionResponseBodyResult result;

    @NameInMap("usage")
    public GetImageObjectDetectionResponseBodyUsage usage;

    public static GetImageObjectDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageObjectDetectionResponseBody self = new GetImageObjectDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageObjectDetectionResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetImageObjectDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageObjectDetectionResponseBody setResult(GetImageObjectDetectionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetImageObjectDetectionResponseBodyResult getResult() {
        return this.result;
    }

    public GetImageObjectDetectionResponseBody setUsage(GetImageObjectDetectionResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetImageObjectDetectionResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetImageObjectDetectionResponseBodyResultObjectsLocation extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("height")
        public Integer height;

        @NameInMap("width")
        public Integer width;

        public static GetImageObjectDetectionResponseBodyResultObjectsLocation build(java.util.Map<String, ?> map) throws Exception {
            GetImageObjectDetectionResponseBodyResultObjectsLocation self = new GetImageObjectDetectionResponseBodyResultObjectsLocation();
            return TeaModel.build(map, self);
        }

        public GetImageObjectDetectionResponseBodyResultObjectsLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public GetImageObjectDetectionResponseBodyResultObjectsLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public GetImageObjectDetectionResponseBodyResultObjectsLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageObjectDetectionResponseBodyResultObjectsLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetImageObjectDetectionResponseBodyResultObjects extends TeaModel {
        @NameInMap("confidence")
        public String confidence;

        @NameInMap("location")
        public GetImageObjectDetectionResponseBodyResultObjectsLocation location;

        public static GetImageObjectDetectionResponseBodyResultObjects build(java.util.Map<String, ?> map) throws Exception {
            GetImageObjectDetectionResponseBodyResultObjects self = new GetImageObjectDetectionResponseBodyResultObjects();
            return TeaModel.build(map, self);
        }

        public GetImageObjectDetectionResponseBodyResultObjects setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public GetImageObjectDetectionResponseBodyResultObjects setLocation(GetImageObjectDetectionResponseBodyResultObjectsLocation location) {
            this.location = location;
            return this;
        }
        public GetImageObjectDetectionResponseBodyResultObjectsLocation getLocation() {
            return this.location;
        }

    }

    public static class GetImageObjectDetectionResponseBodyResult extends TeaModel {
        @NameInMap("objects")
        public java.util.List<GetImageObjectDetectionResponseBodyResultObjects> objects;

        public static GetImageObjectDetectionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetImageObjectDetectionResponseBodyResult self = new GetImageObjectDetectionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetImageObjectDetectionResponseBodyResult setObjects(java.util.List<GetImageObjectDetectionResponseBodyResultObjects> objects) {
            this.objects = objects;
            return this;
        }
        public java.util.List<GetImageObjectDetectionResponseBodyResultObjects> getObjects() {
            return this.objects;
        }

    }

    public static class GetImageObjectDetectionResponseBodyUsage extends TeaModel {
        @NameInMap("image")
        public Long image;

        public static GetImageObjectDetectionResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetImageObjectDetectionResponseBodyUsage self = new GetImageObjectDetectionResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetImageObjectDetectionResponseBodyUsage setImage(Long image) {
            this.image = image;
            return this;
        }
        public Long getImage() {
            return this.image;
        }

    }

}
