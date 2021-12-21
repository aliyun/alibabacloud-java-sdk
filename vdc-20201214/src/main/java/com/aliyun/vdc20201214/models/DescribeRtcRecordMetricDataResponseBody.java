// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcRecordMetricDataResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 录制用量查询数据
    @NameInMap("RtcRecordMetricData")
    public java.util.List<DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData> rtcRecordMetricData;

    public static DescribeRtcRecordMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRecordMetricDataResponseBody self = new DescribeRtcRecordMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRecordMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcRecordMetricDataResponseBody setRtcRecordMetricData(java.util.List<DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData> rtcRecordMetricData) {
        this.rtcRecordMetricData = rtcRecordMetricData;
        return this;
    }
    public java.util.List<DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData> getRtcRecordMetricData() {
        return this.rtcRecordMetricData;
    }

    public static class DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData extends TeaModel {
        // 时长分钟
        @NameInMap("Duration")
        public Long duration;

        // 分辨率
        @NameInMap("Ratio")
        public String ratio;

        // 服务区域
        @NameInMap("ServiceArea")
        public String serviceArea;

        // 规格
        @NameInMap("TaskProfile")
        public String taskProfile;

        // 日期，UTC格式
        @NameInMap("TimeStamp")
        public String timeStamp;

        // 输入路数
        @NameInMap("Type")
        public String type;

        public static DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData self = new DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData();
            return TeaModel.build(map, self);
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeRtcRecordMetricDataResponseBodyRtcRecordMetricData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
