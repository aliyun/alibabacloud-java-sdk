// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetArmsTopNMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetArmsTopNMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetArmsTopNMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArmsTopNMetricResponseBody self = new GetArmsTopNMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArmsTopNMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArmsTopNMetricResponseBody setData(java.util.List<GetArmsTopNMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetArmsTopNMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetArmsTopNMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetArmsTopNMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArmsTopNMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetArmsTopNMetricResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Error")
        public Long error;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Rt")
        public Long rt;

        public static GetArmsTopNMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetArmsTopNMetricResponseBodyData self = new GetArmsTopNMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetArmsTopNMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetArmsTopNMetricResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetArmsTopNMetricResponseBodyData setError(Long error) {
            this.error = error;
            return this;
        }
        public Long getError() {
            return this.error;
        }

        public GetArmsTopNMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetArmsTopNMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetArmsTopNMetricResponseBodyData setRt(Long rt) {
            this.rt = rt;
            return this;
        }
        public Long getRt() {
            return this.rt;
        }

    }

}
