// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class InvestigationInfo extends TeaModel {
    @NameInMap("status")
    public Long status;

    @NameInMap("suggestion")
    public String suggestion;

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
        @NameInMap("label")
        public String label;

        @NameInMap("offset")
        public Long offset;

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
