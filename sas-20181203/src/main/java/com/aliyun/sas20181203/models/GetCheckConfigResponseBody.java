// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigResponseBody extends TeaModel {
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Standards")
    public java.util.List<GetCheckConfigResponseBodyStandards> standards;

    @NameInMap("StartTime")
    public Integer startTime;

    public static GetCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigResponseBody self = new GetCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigResponseBody setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public GetCheckConfigResponseBody setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckConfigResponseBody setStandards(java.util.List<GetCheckConfigResponseBodyStandards> standards) {
        this.standards = standards;
        return this;
    }
    public java.util.List<GetCheckConfigResponseBodyStandards> getStandards() {
        return this.standards;
    }

    public GetCheckConfigResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public static class GetCheckConfigResponseBodyStandards extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static GetCheckConfigResponseBodyStandards build(java.util.Map<String, ?> map) throws Exception {
            GetCheckConfigResponseBodyStandards self = new GetCheckConfigResponseBodyStandards();
            return TeaModel.build(map, self);
        }

        public GetCheckConfigResponseBodyStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckConfigResponseBodyStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetCheckConfigResponseBodyStandards setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCheckConfigResponseBodyStandards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
