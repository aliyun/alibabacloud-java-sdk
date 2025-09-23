// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectMainBodyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2E59C333-5480-4231-A8AB-BEE1001EA7FE</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>583</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
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
