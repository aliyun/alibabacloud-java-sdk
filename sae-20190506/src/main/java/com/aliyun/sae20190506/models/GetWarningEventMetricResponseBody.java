// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWarningEventMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetWarningEventMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWarningEventMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWarningEventMetricResponseBody self = new GetWarningEventMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWarningEventMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWarningEventMetricResponseBody setData(java.util.List<GetWarningEventMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetWarningEventMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetWarningEventMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWarningEventMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWarningEventMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWarningEventMetricResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("WarningCount")
        public Long warningCount;

        public static GetWarningEventMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWarningEventMetricResponseBodyData self = new GetWarningEventMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWarningEventMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetWarningEventMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWarningEventMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWarningEventMetricResponseBodyData setWarningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Long getWarningCount() {
            return this.warningCount;
        }

    }

}
