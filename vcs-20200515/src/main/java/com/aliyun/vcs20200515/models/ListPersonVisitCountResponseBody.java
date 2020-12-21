// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonVisitCountResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("Data")
    public java.util.List<ListPersonVisitCountResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static ListPersonVisitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonVisitCountResponseBody self = new ListPersonVisitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonVisitCountResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListPersonVisitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonVisitCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonVisitCountResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListPersonVisitCountResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListPersonVisitCountResponseBody setData(java.util.List<ListPersonVisitCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonVisitCountResponseBodyData> getData() {
        return this.data;
    }

    public ListPersonVisitCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonVisitCountResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListPersonVisitCountResponseBodyData extends TeaModel {
        @NameInMap("DayId")
        public String dayId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("TagMetrics")
        public String tagMetrics;

        @NameInMap("HourId")
        public String hourId;

        @NameInMap("PersonId")
        public String personId;

        public static ListPersonVisitCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonVisitCountResponseBodyData self = new ListPersonVisitCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonVisitCountResponseBodyData setDayId(String dayId) {
            this.dayId = dayId;
            return this;
        }
        public String getDayId() {
            return this.dayId;
        }

        public ListPersonVisitCountResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListPersonVisitCountResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPersonVisitCountResponseBodyData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListPersonVisitCountResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonVisitCountResponseBodyData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public ListPersonVisitCountResponseBodyData setHourId(String hourId) {
            this.hourId = hourId;
            return this;
        }
        public String getHourId() {
            return this.hourId;
        }

        public ListPersonVisitCountResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

}
