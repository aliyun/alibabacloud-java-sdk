// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QuerySampleConsistencyJobDifferenceResponseBody extends TeaModel {
    @NameInMap("DifferenceHistogram")
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram> differenceHistogram;

    @NameInMap("NumberFeatureDifferences")
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences> numberFeatureDifferences;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StringFeatureDifferences")
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences> stringFeatureDifferences;

    public static QuerySampleConsistencyJobDifferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySampleConsistencyJobDifferenceResponseBody self = new QuerySampleConsistencyJobDifferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySampleConsistencyJobDifferenceResponseBody setDifferenceHistogram(java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram> differenceHistogram) {
        this.differenceHistogram = differenceHistogram;
        return this;
    }
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram> getDifferenceHistogram() {
        return this.differenceHistogram;
    }

    public QuerySampleConsistencyJobDifferenceResponseBody setNumberFeatureDifferences(java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences> numberFeatureDifferences) {
        this.numberFeatureDifferences = numberFeatureDifferences;
        return this;
    }
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences> getNumberFeatureDifferences() {
        return this.numberFeatureDifferences;
    }

    public QuerySampleConsistencyJobDifferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySampleConsistencyJobDifferenceResponseBody setStringFeatureDifferences(java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences> stringFeatureDifferences) {
        this.stringFeatureDifferences = stringFeatureDifferences;
        return this;
    }
    public java.util.List<QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences> getStringFeatureDifferences() {
        return this.stringFeatureDifferences;
    }

    public static class QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram extends TeaModel {
        @NameInMap("Abscissa")
        public String abscissa;

        @NameInMap("Value")
        public Long value;

        public static QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram build(java.util.Map<String, ?> map) throws Exception {
            QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram self = new QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram();
            return TeaModel.build(map, self);
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram setAbscissa(String abscissa) {
            this.abscissa = abscissa;
            return this;
        }
        public String getAbscissa() {
            return this.abscissa;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyDifferenceHistogram setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences extends TeaModel {
        @NameInMap("DiffValue")
        public Double diffValue;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ReplyTableFeatureValue")
        public Double replyTableFeatureValue;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SampleTableFeatureValue")
        public Double sampleTableFeatureValue;

        @NameInMap("UserId")
        public String userId;

        public static QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences build(java.util.Map<String, ?> map) throws Exception {
            QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences self = new QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences();
            return TeaModel.build(map, self);
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setDiffValue(Double diffValue) {
            this.diffValue = diffValue;
            return this;
        }
        public Double getDiffValue() {
            return this.diffValue;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setReplyTableFeatureValue(Double replyTableFeatureValue) {
            this.replyTableFeatureValue = replyTableFeatureValue;
            return this;
        }
        public Double getReplyTableFeatureValue() {
            return this.replyTableFeatureValue;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setSampleTableFeatureValue(Double sampleTableFeatureValue) {
            this.sampleTableFeatureValue = sampleTableFeatureValue;
            return this;
        }
        public Double getSampleTableFeatureValue() {
            return this.sampleTableFeatureValue;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyNumberFeatureDifferences setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ReplyTableFeatureValue")
        public String replyTableFeatureValue;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SampleTableFeatureValue")
        public String sampleTableFeatureValue;

        @NameInMap("UserId")
        public String userId;

        public static QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences build(java.util.Map<String, ?> map) throws Exception {
            QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences self = new QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences();
            return TeaModel.build(map, self);
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences setReplyTableFeatureValue(String replyTableFeatureValue) {
            this.replyTableFeatureValue = replyTableFeatureValue;
            return this;
        }
        public String getReplyTableFeatureValue() {
            return this.replyTableFeatureValue;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences setSampleTableFeatureValue(String sampleTableFeatureValue) {
            this.sampleTableFeatureValue = sampleTableFeatureValue;
            return this;
        }
        public String getSampleTableFeatureValue() {
            return this.sampleTableFeatureValue;
        }

        public QuerySampleConsistencyJobDifferenceResponseBodyStringFeatureDifferences setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
