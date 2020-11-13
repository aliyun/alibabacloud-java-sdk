// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class DetectCardScreenshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectCardScreenshotResponseData data;

    public static DetectCardScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCardScreenshotResponse self = new DetectCardScreenshotResponse();
        return TeaModel.build(map, self);
    }

    public DetectCardScreenshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectCardScreenshotResponse setData(DetectCardScreenshotResponseData data) {
        this.data = data;
        return this;
    }
    public DetectCardScreenshotResponseData getData() {
        return this.data;
    }

    public static class DetectCardScreenshotResponseDataSpoofResultResultMap extends TeaModel {
        @NameInMap("ScreenScore")
        @Validation(required = true)
        public Float screenScore;

        @NameInMap("ScreenThreshold")
        @Validation(required = true)
        public Float screenThreshold;

        public static DetectCardScreenshotResponseDataSpoofResultResultMap build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseDataSpoofResultResultMap self = new DetectCardScreenshotResponseDataSpoofResultResultMap();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseDataSpoofResultResultMap setScreenScore(Float screenScore) {
            this.screenScore = screenScore;
            return this;
        }
        public Float getScreenScore() {
            return this.screenScore;
        }

        public DetectCardScreenshotResponseDataSpoofResultResultMap setScreenThreshold(Float screenThreshold) {
            this.screenThreshold = screenThreshold;
            return this;
        }
        public Float getScreenThreshold() {
            return this.screenThreshold;
        }

    }

    public static class DetectCardScreenshotResponseDataSpoofResult extends TeaModel {
        @NameInMap("IsSpoof")
        @Validation(required = true)
        public Boolean isSpoof;

        @NameInMap("ResultMap")
        @Validation(required = true)
        public DetectCardScreenshotResponseDataSpoofResultResultMap resultMap;

        public static DetectCardScreenshotResponseDataSpoofResult build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseDataSpoofResult self = new DetectCardScreenshotResponseDataSpoofResult();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseDataSpoofResult setIsSpoof(Boolean isSpoof) {
            this.isSpoof = isSpoof;
            return this;
        }
        public Boolean getIsSpoof() {
            return this.isSpoof;
        }

        public DetectCardScreenshotResponseDataSpoofResult setResultMap(DetectCardScreenshotResponseDataSpoofResultResultMap resultMap) {
            this.resultMap = resultMap;
            return this;
        }
        public DetectCardScreenshotResponseDataSpoofResultResultMap getResultMap() {
            return this.resultMap;
        }

    }

    public static class DetectCardScreenshotResponseData extends TeaModel {
        @NameInMap("IsCard")
        @Validation(required = true)
        public Boolean isCard;

        @NameInMap("IsBlur")
        @Validation(required = true)
        public Boolean isBlur;

        @NameInMap("SpoofResult")
        @Validation(required = true)
        public DetectCardScreenshotResponseDataSpoofResult spoofResult;

        public static DetectCardScreenshotResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectCardScreenshotResponseData self = new DetectCardScreenshotResponseData();
            return TeaModel.build(map, self);
        }

        public DetectCardScreenshotResponseData setIsCard(Boolean isCard) {
            this.isCard = isCard;
            return this;
        }
        public Boolean getIsCard() {
            return this.isCard;
        }

        public DetectCardScreenshotResponseData setIsBlur(Boolean isBlur) {
            this.isBlur = isBlur;
            return this;
        }
        public Boolean getIsBlur() {
            return this.isBlur;
        }

        public DetectCardScreenshotResponseData setSpoofResult(DetectCardScreenshotResponseDataSpoofResult spoofResult) {
            this.spoofResult = spoofResult;
            return this;
        }
        public DetectCardScreenshotResponseDataSpoofResult getSpoofResult() {
            return this.spoofResult;
        }

    }

}
