// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class DataSubImagesFigureInfoValue extends TeaModel {
    @NameInMap("FigureCount")
    public Integer figureCount;

    @NameInMap("FigureDetails")
    public java.util.List<DataSubImagesFigureInfoValueFigureDetails> figureDetails;

    public static DataSubImagesFigureInfoValue build(java.util.Map<String, ?> map) throws Exception {
        DataSubImagesFigureInfoValue self = new DataSubImagesFigureInfoValue();
        return TeaModel.build(map, self);
    }

    public DataSubImagesFigureInfoValue setFigureCount(Integer figureCount) {
        this.figureCount = figureCount;
        return this;
    }
    public Integer getFigureCount() {
        return this.figureCount;
    }

    public DataSubImagesFigureInfoValue setFigureDetails(java.util.List<DataSubImagesFigureInfoValueFigureDetails> figureDetails) {
        this.figureDetails = figureDetails;
        return this;
    }
    public java.util.List<DataSubImagesFigureInfoValueFigureDetails> getFigureDetails() {
        return this.figureDetails;
    }

    public static class DataSubImagesFigureInfoValueFigureDetailsFigurePoints extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static DataSubImagesFigureInfoValueFigureDetailsFigurePoints build(java.util.Map<String, ?> map) throws Exception {
            DataSubImagesFigureInfoValueFigureDetailsFigurePoints self = new DataSubImagesFigureInfoValueFigureDetailsFigurePoints();
            return TeaModel.build(map, self);
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigurePoints setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigurePoints setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DataSubImagesFigureInfoValueFigureDetailsFigureRect extends TeaModel {
        @NameInMap("CenterX")
        public Integer centerX;

        @NameInMap("CenterY")
        public Integer centerY;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DataSubImagesFigureInfoValueFigureDetailsFigureRect build(java.util.Map<String, ?> map) throws Exception {
            DataSubImagesFigureInfoValueFigureDetailsFigureRect self = new DataSubImagesFigureInfoValueFigureDetailsFigureRect();
            return TeaModel.build(map, self);
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigureRect setCenterX(Integer centerX) {
            this.centerX = centerX;
            return this;
        }
        public Integer getCenterX() {
            return this.centerX;
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigureRect setCenterY(Integer centerY) {
            this.centerY = centerY;
            return this;
        }
        public Integer getCenterY() {
            return this.centerY;
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigureRect setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DataSubImagesFigureInfoValueFigureDetailsFigureRect setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class DataSubImagesFigureInfoValueFigureDetails extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Data")
        public Object data;

        @NameInMap("FigurePoints")
        public java.util.List<DataSubImagesFigureInfoValueFigureDetailsFigurePoints> figurePoints;

        @NameInMap("FigureRect")
        public DataSubImagesFigureInfoValueFigureDetailsFigureRect figureRect;

        @NameInMap("FigureAngle")
        public Integer figureAngle;

        public static DataSubImagesFigureInfoValueFigureDetails build(java.util.Map<String, ?> map) throws Exception {
            DataSubImagesFigureInfoValueFigureDetails self = new DataSubImagesFigureInfoValueFigureDetails();
            return TeaModel.build(map, self);
        }

        public DataSubImagesFigureInfoValueFigureDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DataSubImagesFigureInfoValueFigureDetails setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public DataSubImagesFigureInfoValueFigureDetails setFigurePoints(java.util.List<DataSubImagesFigureInfoValueFigureDetailsFigurePoints> figurePoints) {
            this.figurePoints = figurePoints;
            return this;
        }
        public java.util.List<DataSubImagesFigureInfoValueFigureDetailsFigurePoints> getFigurePoints() {
            return this.figurePoints;
        }

        public DataSubImagesFigureInfoValueFigureDetails setFigureRect(DataSubImagesFigureInfoValueFigureDetailsFigureRect figureRect) {
            this.figureRect = figureRect;
            return this;
        }
        public DataSubImagesFigureInfoValueFigureDetailsFigureRect getFigureRect() {
            return this.figureRect;
        }

        public DataSubImagesFigureInfoValueFigureDetails setFigureAngle(Integer figureAngle) {
            this.figureAngle = figureAngle;
            return this;
        }
        public Integer getFigureAngle() {
            return this.figureAngle;
        }

    }

}
