// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReportSampleConsistencyJobResponseBody extends TeaModel {
    @NameInMap("FeaturesDifference")
    public java.util.List<ReportSampleConsistencyJobResponseBodyFeaturesDifference> featuresDifference;

    @NameInMap("ReplyTableFeatures")
    public Long replyTableFeatures;

    @NameInMap("ReplyTableLostFeatures")
    public Long replyTableLostFeatures;

    @NameInMap("RequestId")
    public Long requestId;

    @NameInMap("SampleTableFeatures")
    public Long sampleTableFeatures;

    @NameInMap("SampleTableLostFeatures")
    public Long sampleTableLostFeatures;

    public static ReportSampleConsistencyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportSampleConsistencyJobResponseBody self = new ReportSampleConsistencyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportSampleConsistencyJobResponseBody setFeaturesDifference(java.util.List<ReportSampleConsistencyJobResponseBodyFeaturesDifference> featuresDifference) {
        this.featuresDifference = featuresDifference;
        return this;
    }
    public java.util.List<ReportSampleConsistencyJobResponseBodyFeaturesDifference> getFeaturesDifference() {
        return this.featuresDifference;
    }

    public ReportSampleConsistencyJobResponseBody setReplyTableFeatures(Long replyTableFeatures) {
        this.replyTableFeatures = replyTableFeatures;
        return this;
    }
    public Long getReplyTableFeatures() {
        return this.replyTableFeatures;
    }

    public ReportSampleConsistencyJobResponseBody setReplyTableLostFeatures(Long replyTableLostFeatures) {
        this.replyTableLostFeatures = replyTableLostFeatures;
        return this;
    }
    public Long getReplyTableLostFeatures() {
        return this.replyTableLostFeatures;
    }

    public ReportSampleConsistencyJobResponseBody setRequestId(Long requestId) {
        this.requestId = requestId;
        return this;
    }
    public Long getRequestId() {
        return this.requestId;
    }

    public ReportSampleConsistencyJobResponseBody setSampleTableFeatures(Long sampleTableFeatures) {
        this.sampleTableFeatures = sampleTableFeatures;
        return this;
    }
    public Long getSampleTableFeatures() {
        return this.sampleTableFeatures;
    }

    public ReportSampleConsistencyJobResponseBody setSampleTableLostFeatures(Long sampleTableLostFeatures) {
        this.sampleTableLostFeatures = sampleTableLostFeatures;
        return this;
    }
    public Long getSampleTableLostFeatures() {
        return this.sampleTableLostFeatures;
    }

    public static class ReportSampleConsistencyJobResponseBodyFeaturesDifference extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("FeatureName")
        public String featureName;

        @NameInMap("FeatureType")
        public String featureType;

        @NameInMap("Ratio")
        public String ratio;

        public static ReportSampleConsistencyJobResponseBodyFeaturesDifference build(java.util.Map<String, ?> map) throws Exception {
            ReportSampleConsistencyJobResponseBodyFeaturesDifference self = new ReportSampleConsistencyJobResponseBodyFeaturesDifference();
            return TeaModel.build(map, self);
        }

        public ReportSampleConsistencyJobResponseBodyFeaturesDifference setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ReportSampleConsistencyJobResponseBodyFeaturesDifference setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public ReportSampleConsistencyJobResponseBodyFeaturesDifference setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public ReportSampleConsistencyJobResponseBodyFeaturesDifference setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

}
