// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class DetectCardScreenshotResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectCardScreenshotResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectCardScreenshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectCardScreenshotResponseBody self = new DetectCardScreenshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectCardScreenshotResponseBody setData(DetectCardScreenshotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectCardScreenshotResponseBodyData getData() {
        return this.data;
    }

    public DetectCardScreenshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectCardScreenshotResponseBodyDataSpoofResultResultMap extends TeaModel {
        @NameInMap("ScreenScore")
        public Float screenScore;

        @NameInMap("ScreenThreshold")
        public Float screenThreshold;

        public static DetectCardScreenshotResponseBodyDataSpoofResultResultMap build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseBodyDataSpoofResultResultMap self = new DetectCardScreenshotResponseBodyDataSpoofResultResultMap();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseBodyDataSpoofResultResultMap setScreenScore(Float screenScore) {
            this.screenScore = screenScore;
            return this;
        }
        public Float getScreenScore() {
            return this.screenScore;
        }

        public DetectCardScreenshotResponseBodyDataSpoofResultResultMap setScreenThreshold(Float screenThreshold) {
            this.screenThreshold = screenThreshold;
            return this;
        }
        public Float getScreenThreshold() {
            return this.screenThreshold;
        }

    }

    public static class DetectCardScreenshotResponseBodyDataSpoofResult extends TeaModel {
        @NameInMap("IsSpoof")
        public Boolean isSpoof;

        @NameInMap("ResultMap")
        public DetectCardScreenshotResponseBodyDataSpoofResultResultMap resultMap;

        public static DetectCardScreenshotResponseBodyDataSpoofResult build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseBodyDataSpoofResult self = new DetectCardScreenshotResponseBodyDataSpoofResult();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseBodyDataSpoofResult setIsSpoof(Boolean isSpoof) {
            this.isSpoof = isSpoof;
            return this;
        }
        public Boolean getIsSpoof() {
            return this.isSpoof;
        }

        public DetectCardScreenshotResponseBodyDataSpoofResult setResultMap(DetectCardScreenshotResponseBodyDataSpoofResultResultMap resultMap) {
            this.resultMap = resultMap;
            return this;
        }
        public DetectCardScreenshotResponseBodyDataSpoofResultResultMap getResultMap() {
            return this.resultMap;
        }

    }

    public static class DetectCardScreenshotResponseBodyData extends TeaModel {
        @NameInMap("IsBlur")
        public Boolean isBlur;

        @NameInMap("IsCard")
        public Boolean isCard;

        @NameInMap("SpoofResult")
        public DetectCardScreenshotResponseBodyDataSpoofResult spoofResult;

        public static DetectCardScreenshotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseBodyData self = new DetectCardScreenshotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseBodyData setIsBlur(Boolean isBlur) {
            this.isBlur = isBlur;
            return this;
        }
        public Boolean getIsBlur() {
            return this.isBlur;
        }

        public DetectCardScreenshotResponseBodyData setIsCard(Boolean isCard) {
            this.isCard = isCard;
            return this;
        }
        public Boolean getIsCard() {
            return this.isCard;
        }

        public DetectCardScreenshotResponseBodyData setSpoofResult(DetectCardScreenshotResponseBodyDataSpoofResult spoofResult) {
            this.spoofResult = spoofResult;
            return this;
        }
        public DetectCardScreenshotResponseBodyDataSpoofResult getSpoofResult() {
            return this.spoofResult;
        }

    }

}
