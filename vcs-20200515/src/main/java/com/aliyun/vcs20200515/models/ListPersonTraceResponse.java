// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonTraceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListPersonTraceResponseData> data;

    public static ListPersonTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonTraceResponse self = new ListPersonTraceResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonTraceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonTraceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonTraceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonTraceResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListPersonTraceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPersonTraceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersonTraceResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersonTraceResponse setData(java.util.List<ListPersonTraceResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonTraceResponseData> getData() {
        return this.data;
    }

    public static class ListPersonTraceResponseData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("LastTime")
        @Validation(required = true)
        public String lastTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndSourceImage")
        @Validation(required = true)
        public String endSourceImage;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("StartTargetImage")
        @Validation(required = true)
        public String startTargetImage;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("StartSourceImage")
        @Validation(required = true)
        public String startSourceImage;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("EndTargetImage")
        @Validation(required = true)
        public String endTargetImage;

        public static ListPersonTraceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonTraceResponseData self = new ListPersonTraceResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonTraceResponseData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListPersonTraceResponseData setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public ListPersonTraceResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListPersonTraceResponseData setEndSourceImage(String endSourceImage) {
            this.endSourceImage = endSourceImage;
            return this;
        }
        public String getEndSourceImage() {
            return this.endSourceImage;
        }

        public ListPersonTraceResponseData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPersonTraceResponseData setStartTargetImage(String startTargetImage) {
            this.startTargetImage = startTargetImage;
            return this;
        }
        public String getStartTargetImage() {
            return this.startTargetImage;
        }

        public ListPersonTraceResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListPersonTraceResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonTraceResponseData setStartSourceImage(String startSourceImage) {
            this.startSourceImage = startSourceImage;
            return this;
        }
        public String getStartSourceImage() {
            return this.startSourceImage;
        }

        public ListPersonTraceResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonTraceResponseData setEndTargetImage(String endTargetImage) {
            this.endTargetImage = endTargetImage;
            return this;
        }
        public String getEndTargetImage() {
            return this.endTargetImage;
        }

    }

}
