// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class InvestigationInfo extends TeaModel {
    /**
     * <p>The status of the review.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: The review is not performed.</li>
     * <li>1: The review is not supported.</li>
     * <li>2: The review fails.</li>
     * <li>3: The review is in progress.</li>
     * <li>4: The review is complete.</li>
     * <li>5: Penalty methods are applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>The recommended operation provided by the review.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>pass: The review is passed..</li>
     * <li>block: The review is not passed. It is recommended to limit the use of the image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("suggestion")
    public String suggestion;

    /**
     * <p>Video review information</p>
     */
    @NameInMap("video_detail")
    public InvestigationInfoVideoDetail videoDetail;

    public static InvestigationInfo build(java.util.Map<String, ?> map) throws Exception {
        InvestigationInfo self = new InvestigationInfo();
        return TeaModel.build(map, self);
    }

    public InvestigationInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public InvestigationInfo setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public InvestigationInfo setVideoDetail(InvestigationInfoVideoDetail videoDetail) {
        this.videoDetail = videoDetail;
        return this;
    }
    public InvestigationInfoVideoDetail getVideoDetail() {
        return this.videoDetail;
    }

    public static class InvestigationInfoVideoDetailBlockFrames extends TeaModel {
        /**
         * <p>Category of review results</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>Time (in seconds)</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("offset")
        public Long offset;

        /**
         * <p>The confidence level. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>99.1</p>
         */
        @NameInMap("rate")
        public Double rate;

        public static InvestigationInfoVideoDetailBlockFrames build(java.util.Map<String, ?> map) throws Exception {
            InvestigationInfoVideoDetailBlockFrames self = new InvestigationInfoVideoDetailBlockFrames();
            return TeaModel.build(map, self);
        }

        public InvestigationInfoVideoDetailBlockFrames setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public InvestigationInfoVideoDetailBlockFrames setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public InvestigationInfoVideoDetailBlockFrames setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

    }

    public static class InvestigationInfoVideoDetail extends TeaModel {
        /**
         * <p>Violation frame information</p>
         */
        @NameInMap("block_frames")
        public java.util.List<InvestigationInfoVideoDetailBlockFrames> blockFrames;

        public static InvestigationInfoVideoDetail build(java.util.Map<String, ?> map) throws Exception {
            InvestigationInfoVideoDetail self = new InvestigationInfoVideoDetail();
            return TeaModel.build(map, self);
        }

        public InvestigationInfoVideoDetail setBlockFrames(java.util.List<InvestigationInfoVideoDetailBlockFrames> blockFrames) {
            this.blockFrames = blockFrames;
            return this;
        }
        public java.util.List<InvestigationInfoVideoDetailBlockFrames> getBlockFrames() {
            return this.blockFrames;
        }

    }

}
