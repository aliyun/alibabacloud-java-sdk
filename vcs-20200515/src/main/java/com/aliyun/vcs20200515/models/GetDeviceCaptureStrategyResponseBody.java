// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCaptureStrategyResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 响应数据内容
    @NameInMap("Data")
    public GetDeviceCaptureStrategyResponseBodyData data;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceCaptureStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCaptureStrategyResponseBody self = new GetDeviceCaptureStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceCaptureStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceCaptureStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceCaptureStrategyResponseBody setData(GetDeviceCaptureStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceCaptureStrategyResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceCaptureStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceCaptureStrategyResponseBodyData extends TeaModel {
        // 设备类型
        @NameInMap("DeviceType")
        public String deviceType;

        // 设备通道
        @NameInMap("DeviceCode")
        public String deviceCode;

        // 星期一抓取策略
        @NameInMap("MondayCaptureStrategy")
        public String mondayCaptureStrategy;

        // 星期二抓取策略
        @NameInMap("TuesdayCaptureStrategy")
        public String tuesdayCaptureStrategy;

        // 星期三抓取策略
        @NameInMap("WednesdayCaptureStrategy")
        public String wednesdayCaptureStrategy;

        // 星期四抓取策略
        @NameInMap("ThursdayCaptureStrategy")
        public String thursdayCaptureStrategy;

        // 星期五抓取策略
        @NameInMap("FridayCaptureStrategy")
        public String fridayCaptureStrategy;

        // 星期六抓取策略
        @NameInMap("SaturdayCaptureStrategy")
        public String saturdayCaptureStrategy;

        // 星期日抓取策略
        @NameInMap("SundayCaptureStrategy")
        public String sundayCaptureStrategy;

        public static GetDeviceCaptureStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceCaptureStrategyResponseBodyData self = new GetDeviceCaptureStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceCaptureStrategyResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetDeviceCaptureStrategyResponseBodyData setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public GetDeviceCaptureStrategyResponseBodyData setMondayCaptureStrategy(String mondayCaptureStrategy) {
            this.mondayCaptureStrategy = mondayCaptureStrategy;
            return this;
        }
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
            this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
            return this;
        }
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
            this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
            return this;
        }
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
            this.thursdayCaptureStrategy = thursdayCaptureStrategy;
            return this;
        }
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setFridayCaptureStrategy(String fridayCaptureStrategy) {
            this.fridayCaptureStrategy = fridayCaptureStrategy;
            return this;
        }
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
            this.saturdayCaptureStrategy = saturdayCaptureStrategy;
            return this;
        }
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

        public GetDeviceCaptureStrategyResponseBodyData setSundayCaptureStrategy(String sundayCaptureStrategy) {
            this.sundayCaptureStrategy = sundayCaptureStrategy;
            return this;
        }
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

    }

}
