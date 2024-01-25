// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody self = new DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody setData(java.util.List<DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("ServiceArea")
        public String serviceArea;

        @NameInMap("TaskProfile")
        public String taskProfile;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData self = new DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBodyData setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
