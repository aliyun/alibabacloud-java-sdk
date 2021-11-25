// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonVisitCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPersonVisitCountResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListPersonVisitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonVisitCountResponseBody self = new ListPersonVisitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonVisitCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonVisitCountResponseBody setData(java.util.List<ListPersonVisitCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPersonVisitCountResponseBodyData> getData() {
        return this.data;
    }

    public ListPersonVisitCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonVisitCountResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListPersonVisitCountResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListPersonVisitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonVisitCountResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListPersonVisitCountResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersonVisitCountResponseBodyData extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DayId")
        public String dayId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HourId")
        public String hourId;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagMetrics")
        public String tagMetrics;

        public static ListPersonVisitCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonVisitCountResponseBodyData self = new ListPersonVisitCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonVisitCountResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListPersonVisitCountResponseBodyData setDayId(String dayId) {
            this.dayId = dayId;
            return this;
        }
        public String getDayId() {
            return this.dayId;
        }

        public ListPersonVisitCountResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPersonVisitCountResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
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

        public ListPersonVisitCountResponseBodyData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListPersonVisitCountResponseBodyData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

    }

}
