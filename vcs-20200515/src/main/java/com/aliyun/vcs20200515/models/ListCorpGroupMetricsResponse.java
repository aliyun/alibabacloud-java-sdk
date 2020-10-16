// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpGroupMetricsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListCorpGroupMetricsResponseData> data;

    public static ListCorpGroupMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpGroupMetricsResponse self = new ListCorpGroupMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpGroupMetricsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpGroupMetricsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpGroupMetricsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpGroupMetricsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCorpGroupMetricsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCorpGroupMetricsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCorpGroupMetricsResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListCorpGroupMetricsResponse setData(java.util.List<ListCorpGroupMetricsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCorpGroupMetricsResponseData> getData() {
        return this.data;
    }

    public static class ListCorpGroupMetricsResponseData extends TeaModel {
        @NameInMap("DateId")
        @Validation(required = true)
        public String dateId;

        @NameInMap("TagMetrics")
        @Validation(required = true)
        public String tagMetrics;

        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("CorpGroupId")
        @Validation(required = true)
        public String corpGroupId;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("PersonID")
        @Validation(required = true)
        public String personID;

        public static ListCorpGroupMetricsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpGroupMetricsResponseData self = new ListCorpGroupMetricsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCorpGroupMetricsResponseData setDateId(String dateId) {
            this.dateId = dateId;
            return this;
        }
        public String getDateId() {
            return this.dateId;
        }

        public ListCorpGroupMetricsResponseData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public ListCorpGroupMetricsResponseData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListCorpGroupMetricsResponseData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListCorpGroupMetricsResponseData setCorpGroupId(String corpGroupId) {
            this.corpGroupId = corpGroupId;
            return this;
        }
        public String getCorpGroupId() {
            return this.corpGroupId;
        }

        public ListCorpGroupMetricsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpGroupMetricsResponseData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListCorpGroupMetricsResponseData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListCorpGroupMetricsResponseData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListCorpGroupMetricsResponseData setPersonID(String personID) {
            this.personID = personID;
            return this;
        }
        public String getPersonID() {
            return this.personID;
        }

    }

}
