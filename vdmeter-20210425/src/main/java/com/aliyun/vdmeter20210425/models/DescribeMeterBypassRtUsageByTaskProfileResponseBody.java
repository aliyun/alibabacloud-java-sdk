// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterBypassRtUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterBypassRtUsageByTaskProfileResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterBypassRtUsageByTaskProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterBypassRtUsageByTaskProfileResponseBody self = new DescribeMeterBypassRtUsageByTaskProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponseBody setData(java.util.List<DescribeMeterBypassRtUsageByTaskProfileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterBypassRtUsageByTaskProfileResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterBypassRtUsageByTaskProfileResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ServiceArea")
        public String serviceArea;

        @NameInMap("TaskProfile")
        public String taskProfile;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        public static DescribeMeterBypassRtUsageByTaskProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterBypassRtUsageByTaskProfileResponseBodyData self = new DescribeMeterBypassRtUsageByTaskProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterBypassRtUsageByTaskProfileResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
