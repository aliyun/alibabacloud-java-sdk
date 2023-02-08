// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAvailabilityMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAvailabilityMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvailabilityMetricResponseBody self = new GetAvailabilityMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvailabilityMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAvailabilityMetricResponseBody setData(java.util.List<GetAvailabilityMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAvailabilityMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetAvailabilityMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAvailabilityMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvailabilityMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAvailabilityMetricResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnableAutoscale")
        public Long enableAutoscale;

        @NameInMap("ErrorInstances")
        public Long errorInstances;

        @NameInMap("Instances")
        public Long instances;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Runnings")
        public Long runnings;

        public static GetAvailabilityMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvailabilityMetricResponseBodyData self = new GetAvailabilityMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvailabilityMetricResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAvailabilityMetricResponseBodyData setEnableAutoscale(Long enableAutoscale) {
            this.enableAutoscale = enableAutoscale;
            return this;
        }
        public Long getEnableAutoscale() {
            return this.enableAutoscale;
        }

        public GetAvailabilityMetricResponseBodyData setErrorInstances(Long errorInstances) {
            this.errorInstances = errorInstances;
            return this;
        }
        public Long getErrorInstances() {
            return this.errorInstances;
        }

        public GetAvailabilityMetricResponseBodyData setInstances(Long instances) {
            this.instances = instances;
            return this;
        }
        public Long getInstances() {
            return this.instances;
        }

        public GetAvailabilityMetricResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAvailabilityMetricResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAvailabilityMetricResponseBodyData setRunnings(Long runnings) {
            this.runnings = runnings;
            return this;
        }
        public Long getRunnings() {
            return this.runnings;
        }

    }

}
