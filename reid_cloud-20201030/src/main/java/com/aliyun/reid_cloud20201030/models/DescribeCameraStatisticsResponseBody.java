// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCameraStatisticsResponseBody extends TeaModel {
    @NameInMap("PvStatisticResults")
    public DescribeCameraStatisticsResponseBodyPvStatisticResults pvStatisticResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCameraStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraStatisticsResponseBody self = new DescribeCameraStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCameraStatisticsResponseBody setPvStatisticResults(DescribeCameraStatisticsResponseBodyPvStatisticResults pvStatisticResults) {
        this.pvStatisticResults = pvStatisticResults;
        return this;
    }
    public DescribeCameraStatisticsResponseBodyPvStatisticResults getPvStatisticResults() {
        return this.pvStatisticResults;
    }

    public DescribeCameraStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCameraStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCameraStatisticsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeCameraStatisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCameraStatisticsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeCameraStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeCameraStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCameraStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect extends TeaModel {
        @NameInMap("Right")
        public Float right;

        @NameInMap("Top")
        public Float top;

        @NameInMap("Left")
        public Float left;

        @NameInMap("Bottom")
        public Float bottom;

        public static DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect self = new DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect();
            return TeaModel.build(map, self);
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

    }

    public static class DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects extends TeaModel {
        @NameInMap("Rect")
        public java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect> rect;

        public static DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects self = new DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects();
            return TeaModel.build(map, self);
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects setRect(java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect> rect) {
            this.rect = rect;
            return this;
        }
        public java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRectsRect> getRect() {
            return this.rect;
        }

    }

    public static class DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult extends TeaModel {
        @NameInMap("ProcessCursor")
        public Long processCursor;

        @NameInMap("IpcId")
        public Long ipcId;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("PvType")
        public String pvType;

        @NameInMap("MaxDataTime")
        public Long maxDataTime;

        @NameInMap("PvCount")
        public Long pvCount;

        @NameInMap("PvRects")
        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects pvRects;

        public static DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult self = new DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult();
            return TeaModel.build(map, self);
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setProcessCursor(Long processCursor) {
            this.processCursor = processCursor;
            return this;
        }
        public Long getProcessCursor() {
            return this.processCursor;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setIpcId(Long ipcId) {
            this.ipcId = ipcId;
            return this;
        }
        public Long getIpcId() {
            return this.ipcId;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setPvType(String pvType) {
            this.pvType = pvType;
            return this;
        }
        public String getPvType() {
            return this.pvType;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setMaxDataTime(Long maxDataTime) {
            this.maxDataTime = maxDataTime;
            return this;
        }
        public Long getMaxDataTime() {
            return this.maxDataTime;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setPvCount(Long pvCount) {
            this.pvCount = pvCount;
            return this;
        }
        public Long getPvCount() {
            return this.pvCount;
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult setPvRects(DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects pvRects) {
            this.pvRects = pvRects;
            return this;
        }
        public DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResultPvRects getPvRects() {
            return this.pvRects;
        }

    }

    public static class DescribeCameraStatisticsResponseBodyPvStatisticResults extends TeaModel {
        @NameInMap("PvStatisticResult")
        public java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult> pvStatisticResult;

        public static DescribeCameraStatisticsResponseBodyPvStatisticResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeCameraStatisticsResponseBodyPvStatisticResults self = new DescribeCameraStatisticsResponseBodyPvStatisticResults();
            return TeaModel.build(map, self);
        }

        public DescribeCameraStatisticsResponseBodyPvStatisticResults setPvStatisticResult(java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult> pvStatisticResult) {
            this.pvStatisticResult = pvStatisticResult;
            return this;
        }
        public java.util.List<DescribeCameraStatisticsResponseBodyPvStatisticResultsPvStatisticResult> getPvStatisticResult() {
            return this.pvStatisticResult;
        }

    }

}
