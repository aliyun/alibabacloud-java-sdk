// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpMetricsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListCorpMetricsResponseData> data;

    public static ListCorpMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpMetricsResponse self = new ListCorpMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpMetricsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpMetricsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpMetricsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCorpMetricsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCorpMetricsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpMetricsResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListCorpMetricsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCorpMetricsResponse setData(java.util.List<ListCorpMetricsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCorpMetricsResponseData> getData() {
        return this.data;
    }

    public static class ListCorpMetricsResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagMetrics")
        @Validation(required = true)
        public String tagMetrics;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("DateId")
        @Validation(required = true)
        public String dateId;

        public static ListCorpMetricsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpMetricsResponseData self = new ListCorpMetricsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCorpMetricsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpMetricsResponseData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListCorpMetricsResponseData setTagMetrics(String tagMetrics) {
            this.tagMetrics = tagMetrics;
            return this;
        }
        public String getTagMetrics() {
            return this.tagMetrics;
        }

        public ListCorpMetricsResponseData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListCorpMetricsResponseData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListCorpMetricsResponseData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListCorpMetricsResponseData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public ListCorpMetricsResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListCorpMetricsResponseData setDateId(String dateId) {
            this.dateId = dateId;
            return this;
        }
        public String getDateId() {
            return this.dateId;
        }

    }

}
