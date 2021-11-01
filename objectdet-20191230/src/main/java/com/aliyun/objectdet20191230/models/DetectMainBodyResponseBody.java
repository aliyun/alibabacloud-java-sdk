// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectMainBodyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectMainBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyResponseBody self = new DetectMainBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectMainBodyResponseBody setData(DetectMainBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectMainBodyResponseBodyData getData() {
        return this.data;
    }

    public DetectMainBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectMainBodyResponseBodyDataLocation extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static DetectMainBodyResponseBodyDataLocation build(java.util.Map<String, ?> map) throws Exception {
            DetectMainBodyResponseBodyDataLocation self = new DetectMainBodyResponseBodyDataLocation();
            return TeaModel.build(map, self);
        }

        public DetectMainBodyResponseBodyDataLocation setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectMainBodyResponseBodyDataLocation setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectMainBodyResponseBodyDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DetectMainBodyResponseBodyDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DetectMainBodyResponseBodyData extends TeaModel {
        @NameInMap("Location")
        public DetectMainBodyResponseBodyDataLocation location;

        public static DetectMainBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectMainBodyResponseBodyData self = new DetectMainBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectMainBodyResponseBodyData setLocation(DetectMainBodyResponseBodyDataLocation location) {
            this.location = location;
            return this;
        }
        public DetectMainBodyResponseBodyDataLocation getLocation() {
            return this.location;
        }

    }

}
