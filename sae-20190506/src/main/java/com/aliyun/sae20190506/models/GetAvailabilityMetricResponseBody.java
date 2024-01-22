// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetAvailabilityMetricResponseBodyData> data;

    /**
     * <p>The additional information that is returned. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of applications was obtained. The following limits are imposed on the ID:</p>
     * <br>
     * <p>*   **true**: The namespaces were obtained.</p>
     * <p>*   **false**: no</p>
     */
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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether an auto scaling policy is enabled. The following limits are imposed on the ID:</p>
         * <br>
         * <p>*   **1**: An auto scaling policy is enabled.</p>
         * <p>*   **0**: No auto scaling policy is enabled.</p>
         */
        @NameInMap("EnableAutoscale")
        public Long enableAutoscale;

        /**
         * <p>The number of abnormal instances.</p>
         */
        @NameInMap("ErrorInstances")
        public Long errorInstances;

        /**
         * <p>The expected number of instances.</p>
         */
        @NameInMap("Instances")
        public Long instances;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The current number of instances.</p>
         */
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
