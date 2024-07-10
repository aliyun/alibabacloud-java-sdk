// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeGeneralStructureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LLMTimeout</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeGeneralStructureResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Large language model timeout, please try again with fewer keys.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2F86F9B6-CF68-1574-860C-7CC5E46F14BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeGeneralStructureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeGeneralStructureResponseBody self = new RecognizeGeneralStructureResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeGeneralStructureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeGeneralStructureResponseBody setData(RecognizeGeneralStructureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeGeneralStructureResponseBodyData getData() {
        return this.data;
    }

    public RecognizeGeneralStructureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeGeneralStructureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo extends TeaModel {
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("KvCount")
        public Integer kvCount;

        public static RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo build(java.util.Map<String, ?> map) throws Exception {
            RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo self = new RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo();
            return TeaModel.build(map, self);
        }

        public RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo setKvCount(Integer kvCount) {
            this.kvCount = kvCount;
            return this;
        }
        public Integer getKvCount() {
            return this.kvCount;
        }

    }

    public static class RecognizeGeneralStructureResponseBodyDataSubImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public Integer angle;

        @NameInMap("KvInfo")
        public RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo kvInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubImageId")
        public Integer subImageId;

        public static RecognizeGeneralStructureResponseBodyDataSubImages build(java.util.Map<String, ?> map) throws Exception {
            RecognizeGeneralStructureResponseBodyDataSubImages self = new RecognizeGeneralStructureResponseBodyDataSubImages();
            return TeaModel.build(map, self);
        }

        public RecognizeGeneralStructureResponseBodyDataSubImages setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeGeneralStructureResponseBodyDataSubImages setKvInfo(RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo kvInfo) {
            this.kvInfo = kvInfo;
            return this;
        }
        public RecognizeGeneralStructureResponseBodyDataSubImagesKvInfo getKvInfo() {
            return this.kvInfo;
        }

        public RecognizeGeneralStructureResponseBodyDataSubImages setSubImageId(Integer subImageId) {
            this.subImageId = subImageId;
            return this;
        }
        public Integer getSubImageId() {
            return this.subImageId;
        }

    }

    public static class RecognizeGeneralStructureResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubImageCount")
        public Integer subImageCount;

        @NameInMap("SubImages")
        public java.util.List<RecognizeGeneralStructureResponseBodyDataSubImages> subImages;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeGeneralStructureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeGeneralStructureResponseBodyData self = new RecognizeGeneralStructureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeGeneralStructureResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeGeneralStructureResponseBodyData setSubImageCount(Integer subImageCount) {
            this.subImageCount = subImageCount;
            return this;
        }
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        public RecognizeGeneralStructureResponseBodyData setSubImages(java.util.List<RecognizeGeneralStructureResponseBodyDataSubImages> subImages) {
            this.subImages = subImages;
            return this;
        }
        public java.util.List<RecognizeGeneralStructureResponseBodyDataSubImages> getSubImages() {
            return this.subImages;
        }

        public RecognizeGeneralStructureResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
