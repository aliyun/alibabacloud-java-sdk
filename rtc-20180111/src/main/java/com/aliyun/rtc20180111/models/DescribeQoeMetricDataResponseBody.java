// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQoeMetricDataResponseBody extends TeaModel {
    @NameInMap("AudioData")
    public java.util.List<DescribeQoeMetricDataResponseBodyAudioData> audioData;

    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoData")
    public java.util.List<DescribeQoeMetricDataResponseBodyVideoData> videoData;

    public static DescribeQoeMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQoeMetricDataResponseBody self = new DescribeQoeMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQoeMetricDataResponseBody setAudioData(java.util.List<DescribeQoeMetricDataResponseBodyAudioData> audioData) {
        this.audioData = audioData;
        return this;
    }
    public java.util.List<DescribeQoeMetricDataResponseBodyAudioData> getAudioData() {
        return this.audioData;
    }

    public DescribeQoeMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQoeMetricDataResponseBody setVideoData(java.util.List<DescribeQoeMetricDataResponseBodyVideoData> videoData) {
        this.videoData = videoData;
        return this;
    }
    public java.util.List<DescribeQoeMetricDataResponseBodyVideoData> getVideoData() {
        return this.videoData;
    }

    public static class DescribeQoeMetricDataResponseBodyAudioDataNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1548670256</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeQoeMetricDataResponseBodyAudioDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeQoeMetricDataResponseBodyAudioDataNodes self = new DescribeQoeMetricDataResponseBodyAudioDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeQoeMetricDataResponseBodyAudioDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeQoeMetricDataResponseBodyAudioDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeQoeMetricDataResponseBodyAudioData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeQoeMetricDataResponseBodyAudioDataNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>AUDIO</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeQoeMetricDataResponseBodyAudioData build(java.util.Map<String, ?> map) throws Exception {
            DescribeQoeMetricDataResponseBodyAudioData self = new DescribeQoeMetricDataResponseBodyAudioData();
            return TeaModel.build(map, self);
        }

        public DescribeQoeMetricDataResponseBodyAudioData setNodes(java.util.List<DescribeQoeMetricDataResponseBodyAudioDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeQoeMetricDataResponseBodyAudioDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeQoeMetricDataResponseBodyAudioData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeQoeMetricDataResponseBodyAudioData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeQoeMetricDataResponseBodyVideoDataNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1548670256</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeQoeMetricDataResponseBodyVideoDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeQoeMetricDataResponseBodyVideoDataNodes self = new DescribeQoeMetricDataResponseBodyVideoDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeQoeMetricDataResponseBodyVideoDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeQoeMetricDataResponseBodyVideoDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeQoeMetricDataResponseBodyVideoData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeQoeMetricDataResponseBodyVideoDataNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>VIDEO_CAMERA</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeQoeMetricDataResponseBodyVideoData build(java.util.Map<String, ?> map) throws Exception {
            DescribeQoeMetricDataResponseBodyVideoData self = new DescribeQoeMetricDataResponseBodyVideoData();
            return TeaModel.build(map, self);
        }

        public DescribeQoeMetricDataResponseBodyVideoData setNodes(java.util.List<DescribeQoeMetricDataResponseBodyVideoDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeQoeMetricDataResponseBodyVideoDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeQoeMetricDataResponseBodyVideoData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeQoeMetricDataResponseBodyVideoData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
