// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class DataSubImagesKvInfoKvDetailsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;address&quot;</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("KeyConfidence")
    public Integer keyConfidence;

    @NameInMap("Value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>98</p>
     */
    @NameInMap("ValueConfidence")
    public Integer valueConfidence;

    @NameInMap("ValuePoints")
    public java.util.List<DataSubImagesKvInfoKvDetailsValueValuePoints> valuePoints;

    @NameInMap("ValueRect")
    public DataSubImagesKvInfoKvDetailsValueValueRect valueRect;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ValueAngle")
    public Integer valueAngle;

    public static DataSubImagesKvInfoKvDetailsValue build(java.util.Map<String, ?> map) throws Exception {
        DataSubImagesKvInfoKvDetailsValue self = new DataSubImagesKvInfoKvDetailsValue();
        return TeaModel.build(map, self);
    }

    public DataSubImagesKvInfoKvDetailsValue setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public DataSubImagesKvInfoKvDetailsValue setKeyConfidence(Integer keyConfidence) {
        this.keyConfidence = keyConfidence;
        return this;
    }
    public Integer getKeyConfidence() {
        return this.keyConfidence;
    }

    public DataSubImagesKvInfoKvDetailsValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DataSubImagesKvInfoKvDetailsValue setValueConfidence(Integer valueConfidence) {
        this.valueConfidence = valueConfidence;
        return this;
    }
    public Integer getValueConfidence() {
        return this.valueConfidence;
    }

    public DataSubImagesKvInfoKvDetailsValue setValuePoints(java.util.List<DataSubImagesKvInfoKvDetailsValueValuePoints> valuePoints) {
        this.valuePoints = valuePoints;
        return this;
    }
    public java.util.List<DataSubImagesKvInfoKvDetailsValueValuePoints> getValuePoints() {
        return this.valuePoints;
    }

    public DataSubImagesKvInfoKvDetailsValue setValueRect(DataSubImagesKvInfoKvDetailsValueValueRect valueRect) {
        this.valueRect = valueRect;
        return this;
    }
    public DataSubImagesKvInfoKvDetailsValueValueRect getValueRect() {
        return this.valueRect;
    }

    public DataSubImagesKvInfoKvDetailsValue setValueAngle(Integer valueAngle) {
        this.valueAngle = valueAngle;
        return this;
    }
    public Integer getValueAngle() {
        return this.valueAngle;
    }

    public static class DataSubImagesKvInfoKvDetailsValueValuePoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static DataSubImagesKvInfoKvDetailsValueValuePoints build(java.util.Map<String, ?> map) throws Exception {
            DataSubImagesKvInfoKvDetailsValueValuePoints self = new DataSubImagesKvInfoKvDetailsValueValuePoints();
            return TeaModel.build(map, self);
        }

        public DataSubImagesKvInfoKvDetailsValueValuePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DataSubImagesKvInfoKvDetailsValueValuePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DataSubImagesKvInfoKvDetailsValueValueRect extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CenterX")
        public Integer centerX;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CenterY")
        public Integer centerY;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Height")
        public Integer height;

        public static DataSubImagesKvInfoKvDetailsValueValueRect build(java.util.Map<String, ?> map) throws Exception {
            DataSubImagesKvInfoKvDetailsValueValueRect self = new DataSubImagesKvInfoKvDetailsValueValueRect();
            return TeaModel.build(map, self);
        }

        public DataSubImagesKvInfoKvDetailsValueValueRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public DataSubImagesKvInfoKvDetailsValueValueRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public DataSubImagesKvInfoKvDetailsValueValueRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DataSubImagesKvInfoKvDetailsValueValueRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

}
