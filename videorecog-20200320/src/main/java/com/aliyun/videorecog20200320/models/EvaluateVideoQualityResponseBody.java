// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class EvaluateVideoQualityResponseBody extends TeaModel {
    @NameInMap("Data")
    public EvaluateVideoQualityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1d33e538-c949-4fcd-83f6-4d57e4b31527</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EvaluateVideoQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EvaluateVideoQualityResponseBody self = new EvaluateVideoQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public EvaluateVideoQualityResponseBody setData(EvaluateVideoQualityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EvaluateVideoQualityResponseBodyData getData() {
        return this.data;
    }

    public EvaluateVideoQualityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EvaluateVideoQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EvaluateVideoQualityResponseBodyDataVideoQualityInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.15</p>
         */
        @NameInMap("Blurriness")
        public Float blurriness;

        /**
         * <strong>example:</strong>
         * <p>0.55</p>
         */
        @NameInMap("ColorContrast")
        public Float colorContrast;

        /**
         * <strong>example:</strong>
         * <p>0.17</p>
         */
        @NameInMap("ColorSaturation")
        public Float colorSaturation;

        /**
         * <strong>example:</strong>
         * <p>0.48</p>
         */
        @NameInMap("Colorfulness")
        public Float colorfulness;

        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("CompressiveStrength")
        public Float compressiveStrength;

        /**
         * <strong>example:</strong>
         * <p>0.51</p>
         */
        @NameInMap("Luminance")
        public Float luminance;

        /**
         * <strong>example:</strong>
         * <p>0.7048</p>
         */
        @NameInMap("MosScore")
        public Float mosScore;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("NoiseIntensity")
        public Float noiseIntensity;

        public static EvaluateVideoQualityResponseBodyDataVideoQualityInfo build(java.util.Map<String, ?> map) throws Exception {
            EvaluateVideoQualityResponseBodyDataVideoQualityInfo self = new EvaluateVideoQualityResponseBodyDataVideoQualityInfo();
            return TeaModel.build(map, self);
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setBlurriness(Float blurriness) {
            this.blurriness = blurriness;
            return this;
        }
        public Float getBlurriness() {
            return this.blurriness;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setColorContrast(Float colorContrast) {
            this.colorContrast = colorContrast;
            return this;
        }
        public Float getColorContrast() {
            return this.colorContrast;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setColorSaturation(Float colorSaturation) {
            this.colorSaturation = colorSaturation;
            return this;
        }
        public Float getColorSaturation() {
            return this.colorSaturation;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setColorfulness(Float colorfulness) {
            this.colorfulness = colorfulness;
            return this;
        }
        public Float getColorfulness() {
            return this.colorfulness;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setCompressiveStrength(Float compressiveStrength) {
            this.compressiveStrength = compressiveStrength;
            return this;
        }
        public Float getCompressiveStrength() {
            return this.compressiveStrength;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setLuminance(Float luminance) {
            this.luminance = luminance;
            return this;
        }
        public Float getLuminance() {
            return this.luminance;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setMosScore(Float mosScore) {
            this.mosScore = mosScore;
            return this;
        }
        public Float getMosScore() {
            return this.mosScore;
        }

        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo setNoiseIntensity(Float noiseIntensity) {
            this.noiseIntensity = noiseIntensity;
            return this;
        }
        public Float getNoiseIntensity() {
            return this.noiseIntensity;
        }

    }

    public static class EvaluateVideoQualityResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/eas-video-quality-assessment/2023-01-13-10/31%3A08-cVeN9ZQlzIPfGqsa.json?Expires=1673578869&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=AiSsOsZ7rYfhf9w3Mxn%2Fq4GKKy">http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/eas-video-quality-assessment/2023-01-13-10/31%3A08-cVeN9ZQlzIPfGqsa.json?Expires=1673578869&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=AiSsOsZ7rYfhf9w3Mxn%2Fq4GKKy</a>****</p>
         */
        @NameInMap("JsonUrl")
        public String jsonUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/eas-video-quality-assessment/2023-01-13-10/31%3A08-cVeN9ZQlzIPfGqsa.pdf?Expires=1673578869&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=xULlZzVuhoYWAXRbp9A4EzzZcS">http://vibktprfx-prod-prod-damo-eas-cn-shanghai.oss-cn-shanghai.aliyuncs.com/eas-video-quality-assessment/2023-01-13-10/31%3A08-cVeN9ZQlzIPfGqsa.pdf?Expires=1673578869&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=xULlZzVuhoYWAXRbp9A4EzzZcS</a>****</p>
         */
        @NameInMap("PdfUrl")
        public String pdfUrl;

        @NameInMap("VideoQualityInfo")
        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo videoQualityInfo;

        public static EvaluateVideoQualityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EvaluateVideoQualityResponseBodyData self = new EvaluateVideoQualityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EvaluateVideoQualityResponseBodyData setJsonUrl(String jsonUrl) {
            this.jsonUrl = jsonUrl;
            return this;
        }
        public String getJsonUrl() {
            return this.jsonUrl;
        }

        public EvaluateVideoQualityResponseBodyData setPdfUrl(String pdfUrl) {
            this.pdfUrl = pdfUrl;
            return this;
        }
        public String getPdfUrl() {
            return this.pdfUrl;
        }

        public EvaluateVideoQualityResponseBodyData setVideoQualityInfo(EvaluateVideoQualityResponseBodyDataVideoQualityInfo videoQualityInfo) {
            this.videoQualityInfo = videoQualityInfo;
            return this;
        }
        public EvaluateVideoQualityResponseBodyDataVideoQualityInfo getVideoQualityInfo() {
            return this.videoQualityInfo;
        }

    }

}
