// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeStoryboardJobResponseBody extends TeaModel {
    @NameInMap("JobCredit")
    public GetYikeStoryboardJobResponseBodyJobCredit jobCredit;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobParams")
    public GetYikeStoryboardJobResponseBodyJobParams jobParams;

    @NameInMap("JobResult")
    public GetYikeStoryboardJobResponseBodyJobResult jobResult;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeStoryboardJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeStoryboardJobResponseBody self = new GetYikeStoryboardJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeStoryboardJobResponseBody setJobCredit(GetYikeStoryboardJobResponseBodyJobCredit jobCredit) {
        this.jobCredit = jobCredit;
        return this;
    }
    public GetYikeStoryboardJobResponseBodyJobCredit getJobCredit() {
        return this.jobCredit;
    }

    public GetYikeStoryboardJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeStoryboardJobResponseBody setJobParams(GetYikeStoryboardJobResponseBodyJobParams jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public GetYikeStoryboardJobResponseBodyJobParams getJobParams() {
        return this.jobParams;
    }

    public GetYikeStoryboardJobResponseBody setJobResult(GetYikeStoryboardJobResponseBodyJobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public GetYikeStoryboardJobResponseBodyJobResult getJobResult() {
        return this.jobResult;
    }

    public GetYikeStoryboardJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetYikeStoryboardJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetYikeStoryboardJobResponseBodyJobCredit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("ElementImageGeneration")
        public String elementImageGeneration;

        /**
         * <strong>example:</strong>
         * <p>200.2</p>
         */
        @NameInMap("TotalCreditCost")
        public String totalCreditCost;

        /**
         * <strong>example:</strong>
         * <p>10.2</p>
         */
        @NameInMap("VideoComposition")
        public String videoComposition;

        /**
         * <strong>example:</strong>
         * <p>180.0</p>
         */
        @NameInMap("VideoGeneration")
        public String videoGeneration;

        public static GetYikeStoryboardJobResponseBodyJobCredit build(java.util.Map<String, ?> map) throws Exception {
            GetYikeStoryboardJobResponseBodyJobCredit self = new GetYikeStoryboardJobResponseBodyJobCredit();
            return TeaModel.build(map, self);
        }

        public GetYikeStoryboardJobResponseBodyJobCredit setElementImageGeneration(String elementImageGeneration) {
            this.elementImageGeneration = elementImageGeneration;
            return this;
        }
        public String getElementImageGeneration() {
            return this.elementImageGeneration;
        }

        public GetYikeStoryboardJobResponseBodyJobCredit setTotalCreditCost(String totalCreditCost) {
            this.totalCreditCost = totalCreditCost;
            return this;
        }
        public String getTotalCreditCost() {
            return this.totalCreditCost;
        }

        public GetYikeStoryboardJobResponseBodyJobCredit setVideoComposition(String videoComposition) {
            this.videoComposition = videoComposition;
            return this;
        }
        public String getVideoComposition() {
            return this.videoComposition;
        }

        public GetYikeStoryboardJobResponseBodyJobCredit setVideoGeneration(String videoGeneration) {
            this.videoGeneration = videoGeneration;
            return this;
        }
        public String getVideoGeneration() {
            return this.videoGeneration;
        }

    }

    public static class GetYikeStoryboardJobResponseBodyJobParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("AspectRatio")
        public String aspectRatio;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;AudioEnable&quot;: false
         * }</p>
         */
        @NameInMap("ModelParams")
        public String modelParams;

        /**
         * <strong>example:</strong>
         * <p>sys_YoungGracefulWoman</p>
         */
        @NameInMap("NarrationVoiceId")
        public String narrationVoiceId;

        /**
         * <strong>example:</strong>
         * <p>1K</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <strong>example:</strong>
         * <p>multi</p>
         */
        @NameInMap("ShotPromptMode")
        public String shotPromptMode;

        /**
         * <strong>example:</strong>
         * <p>firstPersonNarration</p>
         */
        @NameInMap("ShotSplitMode")
        public String shotSplitMode;

        /**
         * <strong>example:</strong>
         * <p>Novel</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>RealisticPhotography</p>
         */
        @NameInMap("StyleId")
        public String styleId;

        /**
         * <strong>example:</strong>
         * <p>test-title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>wan2.6-r2v-flash</p>
         */
        @NameInMap("VideoModel")
        public String videoModel;

        public static GetYikeStoryboardJobResponseBodyJobParams build(java.util.Map<String, ?> map) throws Exception {
            GetYikeStoryboardJobResponseBodyJobParams self = new GetYikeStoryboardJobResponseBodyJobParams();
            return TeaModel.build(map, self);
        }

        public GetYikeStoryboardJobResponseBodyJobParams setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setModelParams(String modelParams) {
            this.modelParams = modelParams;
            return this;
        }
        public String getModelParams() {
            return this.modelParams;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setNarrationVoiceId(String narrationVoiceId) {
            this.narrationVoiceId = narrationVoiceId;
            return this;
        }
        public String getNarrationVoiceId() {
            return this.narrationVoiceId;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setShotPromptMode(String shotPromptMode) {
            this.shotPromptMode = shotPromptMode;
            return this;
        }
        public String getShotPromptMode() {
            return this.shotPromptMode;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setShotSplitMode(String shotSplitMode) {
            this.shotSplitMode = shotSplitMode;
            return this;
        }
        public String getShotSplitMode() {
            return this.shotSplitMode;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setStyleId(String styleId) {
            this.styleId = styleId;
            return this;
        }
        public String getStyleId() {
            return this.styleId;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setVideoModel(String videoModel) {
            this.videoModel = videoModel;
            return this;
        }
        public String getVideoModel() {
            return this.videoModel;
        }

    }

    public static class GetYikeStoryboardJobResponseBodyJobResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[\&quot;st_2053348871\&quot;]</p>
         */
        @NameInMap("ExceptionStoryboardIds")
        public String exceptionStoryboardIds;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;errorCode\&quot;:\&quot;NoMediaData\&quot;,\&quot;storyboardId\&quot;:\&quot;st_2118280473\&quot;,\&quot;shotId\&quot;:\&quot;54\&quot;}]</p>
         */
        @NameInMap("FailureShotList")
        public String failureShotList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-shanghai.aliyuncs.com/test/110412818/6bf24c75285142f395464d4b9c2bcf07.srt?Expires=1778220836&OSSAccessKeyId=*******&Signature=">https://bucket.oss-cn-shanghai.aliyuncs.com/test/110412818/6bf24c75285142f395464d4b9c2bcf07.srt?Expires=1778220836&amp;OSSAccessKeyId=*******&amp;Signature=</a>*******</p>
         */
        @NameInMap("SrtFileUrl")
        public String srtFileUrl;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;storyboardId\&quot;:\&quot;st_1541525214\&quot;,\&quot;title\&quot;:\&quot;test_1\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;},{\&quot;storyboardId\&quot;:\&quot;st_1633435355\&quot;,\&quot;title\&quot;:\&quot;test_2\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;}]</p>
         */
        @NameInMap("StoryboardInfoList")
        public String storyboardInfoList;

        /**
         * <strong>example:</strong>
         * <p>st_2118280473, st_2118280471</p>
         */
        @NameInMap("SuccessStoryboardIds")
        public String successStoryboardIds;

        /**
         * <strong>example:</strong>
         * <p>[\&quot;st_2118280473\&quot;]</p>
         */
        @NameInMap("SuccessStoryboardList")
        public String successStoryboardList;

        public static GetYikeStoryboardJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeStoryboardJobResponseBodyJobResult self = new GetYikeStoryboardJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetYikeStoryboardJobResponseBodyJobResult setExceptionStoryboardIds(String exceptionStoryboardIds) {
            this.exceptionStoryboardIds = exceptionStoryboardIds;
            return this;
        }
        public String getExceptionStoryboardIds() {
            return this.exceptionStoryboardIds;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setFailureShotList(String failureShotList) {
            this.failureShotList = failureShotList;
            return this;
        }
        public String getFailureShotList() {
            return this.failureShotList;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setSrtFileUrl(String srtFileUrl) {
            this.srtFileUrl = srtFileUrl;
            return this;
        }
        public String getSrtFileUrl() {
            return this.srtFileUrl;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setStoryboardInfoList(String storyboardInfoList) {
            this.storyboardInfoList = storyboardInfoList;
            return this;
        }
        public String getStoryboardInfoList() {
            return this.storyboardInfoList;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setSuccessStoryboardIds(String successStoryboardIds) {
            this.successStoryboardIds = successStoryboardIds;
            return this;
        }
        public String getSuccessStoryboardIds() {
            return this.successStoryboardIds;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setSuccessStoryboardList(String successStoryboardList) {
            this.successStoryboardList = successStoryboardList;
            return this;
        }
        public String getSuccessStoryboardList() {
            return this.successStoryboardList;
        }

    }

}
