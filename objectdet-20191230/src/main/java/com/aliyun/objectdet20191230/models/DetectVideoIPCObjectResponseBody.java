// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectResponseBody extends TeaModel {
    // JobId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectVideoIPCObjectResponseBodyData data;

    public static DetectVideoIPCObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectResponseBody self = new DetectVideoIPCObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectVideoIPCObjectResponseBody setData(DetectVideoIPCObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVideoIPCObjectResponseBodyData getData() {
        return this.data;
    }

    public static class DetectVideoIPCObjectResponseBodyDataFramesElements extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Score")
        public Float score;

        public static DetectVideoIPCObjectResponseBodyDataFramesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyDataFramesElements self = new DetectVideoIPCObjectResponseBodyDataFramesElements();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyDataFramesElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public DetectVideoIPCObjectResponseBodyDataFramesElements setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
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

    }

    public static class DetectVideoIPCObjectResponseBodyDataFrames extends TeaModel {
        // 视频帧时间，startTimestamp+视频帧的相对时间的值，单位毫秒，如果startTimestamp为空，则是相对时间
        @NameInMap("Time")
        public Long time;

        @NameInMap("Elements")
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> elements;

        public static DetectVideoIPCObjectResponseBodyDataFrames build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyDataFrames self = new DetectVideoIPCObjectResponseBodyDataFrames();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyDataFrames setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DetectVideoIPCObjectResponseBodyDataFrames setElements(java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFramesElements> getElements() {
            return this.elements;
        }

    }

    public static class DetectVideoIPCObjectResponseBodyData extends TeaModel {
        // 视频文件的分辨率(像素)
        @NameInMap("Width")
        public Long width;

        // 视频文件的分辨率(像素)
        @NameInMap("Height")
        public Long height;

        // 视频帧的集合，未检测到目标的帧不列出
        @NameInMap("Frames")
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> frames;

        // 输入文件信息
        @NameInMap("InputFile")
        public String inputFile;

        public static DetectVideoIPCObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoIPCObjectResponseBodyData self = new DetectVideoIPCObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVideoIPCObjectResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DetectVideoIPCObjectResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectVideoIPCObjectResponseBodyData setFrames(java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<DetectVideoIPCObjectResponseBodyDataFrames> getFrames() {
            return this.frames;
        }

        public DetectVideoIPCObjectResponseBodyData setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

    }

}
