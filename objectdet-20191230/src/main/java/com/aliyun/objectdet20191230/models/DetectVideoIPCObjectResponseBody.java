// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectVideoIPCObjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35B11E1B-800C-4598-B5AA-577E3BDBD917</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectVideoIPCObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectResponseBody self = new DetectVideoIPCObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectResponseBody setData(DetectVideoIPCObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVideoIPCObjectResponseBodyData getData() {
        return this.data;
    }

    public DetectVideoIPCObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectVideoIPCObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectVideoIPCObjectResponseBodyDataFramesElements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>156</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>0.7812</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>PERSON</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Long width;

        /**
         * <strong>example:</strong>
         * <p>289</p>
         */
        @NameInMap("X")
        public Long x;

        /**
         * <strong>example:</strong>
         * <p>271</p>
         */
        @NameInMap("Y")
        public Long y;

        public static DetectVideoIPCObjectResponseBodyDataFramesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyDataFramesElements self = new DetectVideoIPCObjectResponseBodyDataFramesElements();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class DetectVideoIPCObjectResponseBodyDataFrames extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> elements;

        /**
         * <strong>example:</strong>
         * <p>6124533574</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DetectVideoIPCObjectResponseBodyDataFrames build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyDataFrames self = new DetectVideoIPCObjectResponseBodyDataFrames();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyDataFrames setElements(java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> getElements() {
            return this.elements;
        }

        public DetectVideoIPCObjectResponseBodyDataFrames setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DetectVideoIPCObjectResponseBodyData extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> frames;

        /**
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>oss://viapi-test/viapi-3.0domepic/objectdet/DetectVideoIPCObject/DetectVideoIPCObject4.mp4</p>
         */
        @NameInMap("InputFile")
        public String inputFile;

        /**
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Long width;

        public static DetectVideoIPCObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyData self = new DetectVideoIPCObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyData setFrames(java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> getFrames() {
            return this.frames;
        }

        public DetectVideoIPCObjectResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectVideoIPCObjectResponseBodyData setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

        public DetectVideoIPCObjectResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
