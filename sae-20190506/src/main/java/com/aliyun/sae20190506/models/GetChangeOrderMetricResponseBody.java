// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetChangeOrderMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetChangeOrderMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetChangeOrderMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderMetricResponseBody self = new GetChangeOrderMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChangeOrderMetricResponseBody setData(java.util.List<GetChangeOrderMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChangeOrderMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetChangeOrderMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChangeOrderMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeOrderMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChangeOrderMetricResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Error")
        public Long error;

        @NameInMap("ErrorPercent")
        public Float errorPercent;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Total")
        public Long total;

        public static GetChangeOrderMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderMetricResponseBodyData self = new GetChangeOrderMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetChangeOrderMetricResponseBodyData setError(Long error) {
            this.error = error;
            return this;
        }
        public Long getError() {
            return this.error;
        }

        public GetChangeOrderMetricResponseBodyData setErrorPercent(Float errorPercent) {
            this.errorPercent = errorPercent;
            return this;
        }
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        public GetChangeOrderMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChangeOrderMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetChangeOrderMetricResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
