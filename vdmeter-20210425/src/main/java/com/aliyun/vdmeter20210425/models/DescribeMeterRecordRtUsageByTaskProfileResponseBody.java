// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordRtUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRecordRtUsageByTaskProfileResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRecordRtUsageByTaskProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRecordRtUsageByTaskProfileResponseBody self = new DescribeMeterRecordRtUsageByTaskProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponseBody setData(java.util.List<DescribeMeterRecordRtUsageByTaskProfileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRecordRtUsageByTaskProfileResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRecordRtUsageByTaskProfileResponseBodyData extends TeaModel {
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

        public static DescribeMeterRecordRtUsageByTaskProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRecordRtUsageByTaskProfileResponseBodyData self = new DescribeMeterRecordRtUsageByTaskProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterRecordRtUsageByTaskProfileResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
