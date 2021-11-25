// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCorpGroupMetricsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCorpGroupMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupMetricsResponseBody self = new ListCorpGroupMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpGroupMetricsResponseBody setData(java.util.List<ListCorpGroupMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCorpGroupMetricsResponseBodyData> getData() {
        return this.data;
    }

    public ListCorpGroupMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpGroupMetricsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCorpGroupMetricsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCorpGroupMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpGroupMetricsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListCorpGroupMetricsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCorpGroupMetricsResponseBodyData extends TeaModel {
        @NameInMap("CorpGroupId")
        public String corpGroupId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DateId")
        public String dateId;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("PersonID")
        public String personID;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagMetrics")
        public String tagMetrics;

        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListCorpGroupMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpGroupMetricsResponseBodyData self = new ListCorpGroupMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCorpGroupMetricsResponseBodyData setCorpGroupId(String corpGroupId) {
            this.corpGroupId = corpGroupId;
            return this;
        }
        public String getCorpGroupId() {
            return this.corpGroupId;
        }

        public ListCorpGroupMetricsResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpGroupMetricsResponseBodyData setDateId(String dateId) {
            this.dateId = dateId;
            return this;
        }
        public String getDateId() {
            return this.dateId;
        }

        public ListCorpGroupMetricsResponseBodyData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListCorpGroupMetricsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListCorpGroupMetricsResponseBodyData setPersonID(String personID) {
            this.personID = personID;
            return this;
        }
        public String getPersonID() {
            return this.personID;
        }

        public ListCorpGroupMetricsResponseBodyData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListCorpGroupMetricsResponseBodyData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public ListCorpGroupMetricsResponseBodyData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListCorpGroupMetricsResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
