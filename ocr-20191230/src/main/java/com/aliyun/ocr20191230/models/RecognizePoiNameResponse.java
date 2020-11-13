// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePoiNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizePoiNameResponseData data;

    public static RecognizePoiNameResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePoiNameResponse self = new RecognizePoiNameResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePoiNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizePoiNameResponse setData(RecognizePoiNameResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizePoiNameResponseData getData() {
        return this.data;
    }

    public static class RecognizePoiNameResponseDataSignboardsTexts extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Points")
        @Validation(required = true)
        public java.util.List<Integer> points;

        public static RecognizePoiNameResponseDataSignboardsTexts build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseDataSignboardsTexts self = new RecognizePoiNameResponseDataSignboardsTexts();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseDataSignboardsTexts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizePoiNameResponseDataSignboardsTexts setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizePoiNameResponseDataSignboardsTexts setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RecognizePoiNameResponseDataSignboardsTexts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RecognizePoiNameResponseDataSignboardsTexts setPoints(java.util.List<Integer> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Integer> getPoints() {
            return this.points;
        }

    }

    public static class RecognizePoiNameResponseDataSignboards extends TeaModel {
        @NameInMap("Texts")
        @Validation(required = true)
        public java.util.List<RecognizePoiNameResponseDataSignboardsTexts> texts;

        public static RecognizePoiNameResponseDataSignboards build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseDataSignboards self = new RecognizePoiNameResponseDataSignboards();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseDataSignboards setTexts(java.util.List<RecognizePoiNameResponseDataSignboardsTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<RecognizePoiNameResponseDataSignboardsTexts> getTexts() {
            return this.texts;
        }

    }

    public static class RecognizePoiNameResponseDataSummary extends TeaModel {
        @NameInMap("Brand")
        @Validation(required = true)
        public String brand;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static RecognizePoiNameResponseDataSummary build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseDataSummary self = new RecognizePoiNameResponseDataSummary();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseDataSummary setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public RecognizePoiNameResponseDataSummary setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class RecognizePoiNameResponseData extends TeaModel {
        @NameInMap("Signboards")
        @Validation(required = true)
        public java.util.List<RecognizePoiNameResponseDataSignboards> signboards;

        @NameInMap("Summary")
        @Validation(required = true)
        public RecognizePoiNameResponseDataSummary summary;

        public static RecognizePoiNameResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseData self = new RecognizePoiNameResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseData setSignboards(java.util.List<RecognizePoiNameResponseDataSignboards> signboards) {
            this.signboards = signboards;
            return this;
        }
        public java.util.List<RecognizePoiNameResponseDataSignboards> getSignboards() {
            return this.signboards;
        }

        public RecognizePoiNameResponseData setSummary(RecognizePoiNameResponseDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public RecognizePoiNameResponseDataSummary getSummary() {
            return this.summary;
        }

    }

}
