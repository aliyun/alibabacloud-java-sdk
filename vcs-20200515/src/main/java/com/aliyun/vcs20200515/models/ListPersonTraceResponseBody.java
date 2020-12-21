// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<ListPersonTraceResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static ListPersonTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceResponseBody self = new ListPersonTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPersonTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTraceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceResponseBody setData(java.util.List<ListPersonTraceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTraceResponseBodyData> getData() {
        return this.data;
    }

    public ListPersonTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonTraceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListPersonTraceResponseBodyData extends TeaModel {
        @NameInMap("EndTargetImage")
        public String endTargetImage;

        @NameInMap("LastTime")
        public String lastTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EndSourceImage")
        public String endSourceImage;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("StartSourceImage")
        public String startSourceImage;

        @NameInMap("Date")
        public String date;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("StartTargetImage")
        public String startTargetImage;

        public static ListPersonTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTraceResponseBodyData self = new ListPersonTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonTraceResponseBodyData setEndTargetImage(String endTargetImage) {
            this.endTargetImage = endTargetImage;
            return this;
        }
        public String getEndTargetImage() {
            return this.endTargetImage;
        }

        public ListPersonTraceResponseBodyData setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public ListPersonTraceResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPersonTraceResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListPersonTraceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPersonTraceResponseBodyData setEndSourceImage(String endSourceImage) {
            this.endSourceImage = endSourceImage;
            return this;
        }
        public String getEndSourceImage() {
            return this.endSourceImage;
        }

        public ListPersonTraceResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTraceResponseBodyData setStartSourceImage(String startSourceImage) {
            this.startSourceImage = startSourceImage;
            return this;
        }
        public String getStartSourceImage() {
            return this.startSourceImage;
        }

        public ListPersonTraceResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListPersonTraceResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonTraceResponseBodyData setStartTargetImage(String startTargetImage) {
            this.startTargetImage = startTargetImage;
            return this;
        }
        public String getStartTargetImage() {
            return this.startTargetImage;
        }

    }

}
