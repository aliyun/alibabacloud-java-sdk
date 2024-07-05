// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaDNAResultResponseBody extends TeaModel {
    /**
     * <p>The media fingerprinting results.</p>
     */
    @NameInMap("DNAResult")
    public GetMediaDNAResultResponseBodyDNAResult DNAResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>63FC4896-E956-4B*****7D-134FF1BC597A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaDNAResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaDNAResultResponseBody self = new GetMediaDNAResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaDNAResultResponseBody setDNAResult(GetMediaDNAResultResponseBodyDNAResult DNAResult) {
        this.DNAResult = DNAResult;
        return this;
    }
    public GetMediaDNAResultResponseBodyDNAResult getDNAResult() {
        return this.DNAResult;
    }

    public GetMediaDNAResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication extends TeaModel {
        /**
         * <p>The duration of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start time of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Start")
        public String start;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput extends TeaModel {
        /**
         * <p>The duration of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start time of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Start")
        public String start;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetail extends TeaModel {
        /**
         * <p>The start time and duration of the matched video.</p>
         */
        @NameInMap("Duplication")
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication duplication;

        /**
         * <p>The start time and duration of the input video.</p>
         */
        @NameInMap("Input")
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput input;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetail self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetail();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetail setDuplication(GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication duplication) {
            this.duplication = duplication;
            return this;
        }
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication getDuplication() {
            return this.duplication;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetail setInput(GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput input) {
            this.input = input;
            return this;
        }
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput getInput() {
            return this.input;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNA extends TeaModel {
        /**
         * <p>The details of the matched video. Information such as the location and duration of the video is returned.</p>
         */
        @NameInMap("Detail")
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> detail;

        /**
         * <p>The ID of the video that has a similar fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>6ad8987da46f4b*****490ce2873745</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The similarity between the fingerprints of the input video and the matched video. 1 indicates that the fingerprints of the two videos are the same.</p>
         * 
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("Similarity")
        public String similarity;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNA build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNA self = new GetMediaDNAResultResponseBodyDNAResultVideoDNA();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setDetail(java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> getDetail() {
            return this.detail;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResult extends TeaModel {
        /**
         * <p>The video fingerprint recognition result.</p>
         */
        @NameInMap("VideoDNA")
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> videoDNA;

        public static GetMediaDNAResultResponseBodyDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResult self = new GetMediaDNAResultResponseBodyDNAResult();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResult setVideoDNA(java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> videoDNA) {
            this.videoDNA = videoDNA;
            return this;
        }
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> getVideoDNA() {
            return this.videoDNA;
        }

    }

}
