// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterBypassUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterBypassUsageByTaskProfileResponseBodyData> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterBypassUsageByTaskProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterBypassUsageByTaskProfileResponseBody self = new DescribeMeterBypassUsageByTaskProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterBypassUsageByTaskProfileResponseBody setData(java.util.List<DescribeMeterBypassUsageByTaskProfileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterBypassUsageByTaskProfileResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterBypassUsageByTaskProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterBypassUsageByTaskProfileResponseBodyData extends TeaModel {
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

        public static DescribeMeterBypassUsageByTaskProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterBypassUsageByTaskProfileResponseBodyData self = new DescribeMeterBypassUsageByTaskProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMeterBypassUsageByTaskProfileResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
