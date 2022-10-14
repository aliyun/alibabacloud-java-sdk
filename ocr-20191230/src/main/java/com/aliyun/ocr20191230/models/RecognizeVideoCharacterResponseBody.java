// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVideoCharacterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVideoCharacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCharacterResponseBody self = new RecognizeVideoCharacterResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCharacterResponseBody setData(RecognizeVideoCharacterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVideoCharacterResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVideoCharacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Width")
        public Long width;

        public static RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles self = new RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class RecognizeVideoCharacterResponseBodyDataFramesElements extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        @NameInMap("TextRectangles")
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles> textRectangles;

        public static RecognizeVideoCharacterResponseBodyDataFramesElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCharacterResponseBodyDataFramesElements self = new RecognizeVideoCharacterResponseBodyDataFramesElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElements setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeVideoCharacterResponseBodyDataFramesElements setTextRectangles(java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles> textRectangles) {
            this.textRectangles = textRectangles;
            return this;
        }
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElementsTextRectangles> getTextRectangles() {
            return this.textRectangles;
        }

    }

    public static class RecognizeVideoCharacterResponseBodyDataFrames extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElements> elements;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static RecognizeVideoCharacterResponseBodyDataFrames build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCharacterResponseBodyDataFrames self = new RecognizeVideoCharacterResponseBodyDataFrames();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCharacterResponseBodyDataFrames setElements(java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFramesElements> getElements() {
            return this.elements;
        }

        public RecognizeVideoCharacterResponseBodyDataFrames setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class RecognizeVideoCharacterResponseBodyData extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFrames> frames;

        @NameInMap("Height")
        public Long height;

        @NameInMap("InputFile")
        public String inputFile;

        @NameInMap("Width")
        public Long width;

        public static RecognizeVideoCharacterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCharacterResponseBodyData self = new RecognizeVideoCharacterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCharacterResponseBodyData setFrames(java.util.List<RecognizeVideoCharacterResponseBodyDataFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<RecognizeVideoCharacterResponseBodyDataFrames> getFrames() {
            return this.frames;
        }

        public RecognizeVideoCharacterResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public RecognizeVideoCharacterResponseBodyData setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

        public RecognizeVideoCharacterResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
