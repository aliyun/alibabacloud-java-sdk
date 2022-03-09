// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVideoCastCrewListResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVideoCastCrewListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListResponseBody self = new RecognizeVideoCastCrewListResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListResponseBody setData(RecognizeVideoCastCrewListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVideoCastCrewListResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVideoCastCrewListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVideoCastCrewListResponseBodyDataCastResults extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.Map<String, String> detailInfo;

        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("StartTime")
        public Float startTime;

        public static RecognizeVideoCastCrewListResponseBodyDataCastResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataCastResults self = new RecognizeVideoCastCrewListResponseBodyDataCastResults();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataCastResults setDetailInfo(java.util.Map<String, String> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.Map<String, String> getDetailInfo() {
            return this.detailInfo;
        }

        public RecognizeVideoCastCrewListResponseBodyDataCastResults setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public RecognizeVideoCastCrewListResponseBodyDataCastResults setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition self = new RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("CharProbs")
        public java.util.List<java.util.List<Float>> charProbs;

        @NameInMap("FrameIndex")
        public Long frameIndex;

        @NameInMap("Position")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition> position;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        @NameInMap("TextProb")
        public Float textProb;

        @NameInMap("TimeStamp")
        public Float timeStamp;

        @NameInMap("TrackId")
        public Long trackId;

        public static RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo self = new RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setCharProbs(java.util.List<java.util.List<Float>> charProbs) {
            this.charProbs = charProbs;
            return this;
        }
        public java.util.List<java.util.List<Float>> getCharProbs() {
            return this.charProbs;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setFrameIndex(Long frameIndex) {
            this.frameIndex = frameIndex;
            return this;
        }
        public Long getFrameIndex() {
            return this.frameIndex;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setPosition(java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition> position) {
            this.position = position;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfoPosition> getPosition() {
            return this.position;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setTextProb(Float textProb) {
            this.textProb = textProb;
            return this;
        }
        public Float getTextProb() {
            return this.textProb;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setTimeStamp(Float timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Float getTimeStamp() {
            return this.timeStamp;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo setTrackId(Long trackId) {
            this.trackId = trackId;
            return this;
        }
        public Long getTrackId() {
            return this.trackId;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataOcrResults extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo> detailInfo;

        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("StartTime")
        public Float startTime;

        public static RecognizeVideoCastCrewListResponseBodyDataOcrResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataOcrResults self = new RecognizeVideoCastCrewListResponseBodyDataOcrResults();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResults setDetailInfo(java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResultsDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResults setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public RecognizeVideoCastCrewListResponseBodyDataOcrResults setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults extends TeaModel {
        @NameInMap("SubtitlesAllResults")
        public java.util.Map<String, String> subtitlesAllResults;

        @NameInMap("SubtitlesAllResultsUrl")
        public String subtitlesAllResultsUrl;

        @NameInMap("SubtitlesChineseResults")
        public java.util.Map<String, String> subtitlesChineseResults;

        @NameInMap("SubtitlesChineseResultsUrl")
        public String subtitlesChineseResultsUrl;

        @NameInMap("SubtitlesEnglishResults")
        public java.util.Map<String, ?> subtitlesEnglishResults;

        @NameInMap("SubtitlesEnglishResultsUrl")
        public String subtitlesEnglishResultsUrl;

        public static RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults self = new RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesAllResults(java.util.Map<String, String> subtitlesAllResults) {
            this.subtitlesAllResults = subtitlesAllResults;
            return this;
        }
        public java.util.Map<String, String> getSubtitlesAllResults() {
            return this.subtitlesAllResults;
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesAllResultsUrl(String subtitlesAllResultsUrl) {
            this.subtitlesAllResultsUrl = subtitlesAllResultsUrl;
            return this;
        }
        public String getSubtitlesAllResultsUrl() {
            return this.subtitlesAllResultsUrl;
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesChineseResults(java.util.Map<String, String> subtitlesChineseResults) {
            this.subtitlesChineseResults = subtitlesChineseResults;
            return this;
        }
        public java.util.Map<String, String> getSubtitlesChineseResults() {
            return this.subtitlesChineseResults;
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesChineseResultsUrl(String subtitlesChineseResultsUrl) {
            this.subtitlesChineseResultsUrl = subtitlesChineseResultsUrl;
            return this;
        }
        public String getSubtitlesChineseResultsUrl() {
            return this.subtitlesChineseResultsUrl;
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesEnglishResults(java.util.Map<String, ?> subtitlesEnglishResults) {
            this.subtitlesEnglishResults = subtitlesEnglishResults;
            return this;
        }
        public java.util.Map<String, ?> getSubtitlesEnglishResults() {
            return this.subtitlesEnglishResults;
        }

        public RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults setSubtitlesEnglishResultsUrl(String subtitlesEnglishResultsUrl) {
            this.subtitlesEnglishResultsUrl = subtitlesEnglishResultsUrl;
            return this;
        }
        public String getSubtitlesEnglishResultsUrl() {
            return this.subtitlesEnglishResultsUrl;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition self = new RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Long> boxes;

        @NameInMap("Position")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition> position;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Text")
        public String text;

        @NameInMap("TextType")
        public Long textType;

        public static RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo self = new RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo setBoxes(java.util.List<Long> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Long> getBoxes() {
            return this.boxes;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo setPosition(java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition> position) {
            this.position = position;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfoPosition> getPosition() {
            return this.position;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo setTextType(Long textType) {
            this.textType = textType;
            return this;
        }
        public Long getTextType() {
            return this.textType;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo> detailInfo;

        @NameInMap("EndTime")
        public Float endTime;

        @NameInMap("StartTime")
        public Float startTime;

        public static RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults self = new RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults setDetailInfo(java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResultsDetailInfo> getDetailInfo() {
            return this.detailInfo;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

    }

    public static class RecognizeVideoCastCrewListResponseBodyData extends TeaModel {
        @NameInMap("CastResults")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataCastResults> castResults;

        @NameInMap("OcrResults")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResults> ocrResults;

        @NameInMap("SubtitlesResults")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults> subtitlesResults;

        @NameInMap("VideoOcrResults")
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults> videoOcrResults;

        public static RecognizeVideoCastCrewListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListResponseBodyData self = new RecognizeVideoCastCrewListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListResponseBodyData setCastResults(java.util.List<RecognizeVideoCastCrewListResponseBodyDataCastResults> castResults) {
            this.castResults = castResults;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataCastResults> getCastResults() {
            return this.castResults;
        }

        public RecognizeVideoCastCrewListResponseBodyData setOcrResults(java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResults> ocrResults) {
            this.ocrResults = ocrResults;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataOcrResults> getOcrResults() {
            return this.ocrResults;
        }

        public RecognizeVideoCastCrewListResponseBodyData setSubtitlesResults(java.util.List<RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults> subtitlesResults) {
            this.subtitlesResults = subtitlesResults;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataSubtitlesResults> getSubtitlesResults() {
            return this.subtitlesResults;
        }

        public RecognizeVideoCastCrewListResponseBodyData setVideoOcrResults(java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults> videoOcrResults) {
            this.videoOcrResults = videoOcrResults;
            return this;
        }
        public java.util.List<RecognizeVideoCastCrewListResponseBodyDataVideoOcrResults> getVideoOcrResults() {
            return this.videoOcrResults;
        }

    }

}
