// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("RecordUsageVoList")
    public java.util.List<DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList> recordUsageVoList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRecordUsageByTaskProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRecordUsageByTaskProfileResponseBody self = new DescribeMeterRecordUsageByTaskProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRecordUsageByTaskProfileResponseBody setRecordUsageVoList(java.util.List<DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList> recordUsageVoList) {
        this.recordUsageVoList = recordUsageVoList;
        return this;
    }
    public java.util.List<DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList> getRecordUsageVoList() {
        return this.recordUsageVoList;
    }

    public DescribeMeterRecordUsageByTaskProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ServiceArea")
        public String serviceArea;

        @NameInMap("TaskProfile")
        public String taskProfile;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        @NameInMap("Type")
        public String type;

        public static DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList self = new DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeMeterRecordUsageByTaskProfileResponseBodyRecordUsageVoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
