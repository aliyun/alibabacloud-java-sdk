// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetScaleAppMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetScaleAppMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetScaleAppMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScaleAppMetricResponseBody self = new GetScaleAppMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScaleAppMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScaleAppMetricResponseBody setData(java.util.List<GetScaleAppMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetScaleAppMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetScaleAppMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScaleAppMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScaleAppMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScaleAppMetricResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Runnings")
        public Long runnings;

        public static GetScaleAppMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScaleAppMetricResponseBodyData self = new GetScaleAppMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScaleAppMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetScaleAppMetricResponseBodyData setMaxReplicas(Long maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        public GetScaleAppMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScaleAppMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetScaleAppMetricResponseBodyData setRunnings(Long runnings) {
            this.runnings = runnings;
            return this;
        }
        public Long getRunnings() {
            return this.runnings;
        }

    }

}
