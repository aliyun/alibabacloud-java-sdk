// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonVisitCountResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNo")
    @Validation(required = true)
    public String pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListPersonVisitCountResponseData> data;

    public static ListPersonVisitCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonVisitCountResponse self = new ListPersonVisitCountResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonVisitCountResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonVisitCountResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonVisitCountResponse setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListPersonVisitCountResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListPersonVisitCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonVisitCountResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListPersonVisitCountResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListPersonVisitCountResponse setData(java.util.List<ListPersonVisitCountResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonVisitCountResponseData> getData() {
        return this.data;
    }

    public static class ListPersonVisitCountResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagMetrics")
        @Validation(required = true)
        public String tagMetrics;

        @NameInMap("HourId")
        @Validation(required = true)
        public String hourId;

        @NameInMap("DayId")
        @Validation(required = true)
        public String dayId;

        public static ListPersonVisitCountResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonVisitCountResponseData self = new ListPersonVisitCountResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonVisitCountResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonVisitCountResponseData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPersonVisitCountResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListPersonVisitCountResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonVisitCountResponseData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListPersonVisitCountResponseData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public ListPersonVisitCountResponseData setHourId(String hourId) {
            this.hourId = hourId;
            return this;
        }
        public String getHourId() {
            return this.hourId;
        }

        public ListPersonVisitCountResponseData setDayId(String dayId) {
            this.dayId = dayId;
            return this;
        }
        public String getDayId() {
            return this.dayId;
        }

    }

}
