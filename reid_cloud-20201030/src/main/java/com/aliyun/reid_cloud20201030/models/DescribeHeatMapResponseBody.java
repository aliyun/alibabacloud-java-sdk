// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeHeatMapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("HeatMapPoints")
    public DescribeHeatMapResponseBodyHeatMapPoints heatMapPoints;

    public static DescribeHeatMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeatMapResponseBody self = new DescribeHeatMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHeatMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHeatMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeHeatMapResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeHeatMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHeatMapResponseBody setHeatMapPoints(DescribeHeatMapResponseBodyHeatMapPoints heatMapPoints) {
        this.heatMapPoints = heatMapPoints;
        return this;
    }
    public DescribeHeatMapResponseBodyHeatMapPoints getHeatMapPoints() {
        return this.heatMapPoints;
    }

    public static class DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint extends TeaModel {
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Y")
        public Float y;

        @NameInMap("X")
        public Float x;

        public static DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint self = new DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint();
            return TeaModel.build(map, self);
        }

        public DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DescribeHeatMapResponseBodyHeatMapPoints extends TeaModel {
        @NameInMap("HeatMapPoint")
        public java.util.List<DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint> heatMapPoint;

        public static DescribeHeatMapResponseBodyHeatMapPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeHeatMapResponseBodyHeatMapPoints self = new DescribeHeatMapResponseBodyHeatMapPoints();
            return TeaModel.build(map, self);
        }

        public DescribeHeatMapResponseBodyHeatMapPoints setHeatMapPoint(java.util.List<DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint> heatMapPoint) {
            this.heatMapPoint = heatMapPoint;
            return this;
        }
        public java.util.List<DescribeHeatMapResponseBodyHeatMapPointsHeatMapPoint> getHeatMapPoint() {
            return this.heatMapPoint;
        }

    }

}
