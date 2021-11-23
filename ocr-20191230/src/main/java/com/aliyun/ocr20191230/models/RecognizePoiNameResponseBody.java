// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePoiNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizePoiNameResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizePoiNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePoiNameResponseBody self = new RecognizePoiNameResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePoiNameResponseBody setData(RecognizePoiNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizePoiNameResponseBodyData getData() {
        return this.data;
    }

    public RecognizePoiNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizePoiNameResponseBodyDataSignboardsTexts extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Points")
        public java.util.List<Integer> points;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public String type;

        public static RecognizePoiNameResponseBodyDataSignboardsTexts build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseBodyDataSignboardsTexts self = new RecognizePoiNameResponseBodyDataSignboardsTexts();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseBodyDataSignboardsTexts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizePoiNameResponseBodyDataSignboardsTexts setPoints(java.util.List<Integer> points) {
            this.points = points;
            return this;
        }
        public java.util.List<Integer> getPoints() {
            return this.points;
        }

        public RecognizePoiNameResponseBodyDataSignboardsTexts setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizePoiNameResponseBodyDataSignboardsTexts setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RecognizePoiNameResponseBodyDataSignboardsTexts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecognizePoiNameResponseBodyDataSignboards extends TeaModel {
        @NameInMap("Texts")
        public java.util.List<RecognizePoiNameResponseBodyDataSignboardsTexts> texts;

        public static RecognizePoiNameResponseBodyDataSignboards build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseBodyDataSignboards self = new RecognizePoiNameResponseBodyDataSignboards();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseBodyDataSignboards setTexts(java.util.List<RecognizePoiNameResponseBodyDataSignboardsTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<RecognizePoiNameResponseBodyDataSignboardsTexts> getTexts() {
            return this.texts;
        }

    }

    public static class RecognizePoiNameResponseBodyDataSummary extends TeaModel {
        @NameInMap("Brand")
        public String brand;

        @NameInMap("Score")
        public Float score;

        public static RecognizePoiNameResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseBodyDataSummary self = new RecognizePoiNameResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseBodyDataSummary setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public RecognizePoiNameResponseBodyDataSummary setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class RecognizePoiNameResponseBodyData extends TeaModel {
        @NameInMap("Signboards")
        public java.util.List<RecognizePoiNameResponseBodyDataSignboards> signboards;

        @NameInMap("Summary")
        public RecognizePoiNameResponseBodyDataSummary summary;

        public static RecognizePoiNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePoiNameResponseBodyData self = new RecognizePoiNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizePoiNameResponseBodyData setSignboards(java.util.List<RecognizePoiNameResponseBodyDataSignboards> signboards) {
            this.signboards = signboards;
            return this;
        }
        public java.util.List<RecognizePoiNameResponseBodyDataSignboards> getSignboards() {
            return this.signboards;
        }

        public RecognizePoiNameResponseBodyData setSummary(RecognizePoiNameResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public RecognizePoiNameResponseBodyDataSummary getSummary() {
            return this.summary;
        }

    }

}
