// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetAvailabilityMetricResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The following limits are imposed on the ID:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <ul>
     * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
     * <li>An error code: If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3A92C4EA-4C53-5A1C-8AEB-F2DB11982D5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of applications was obtained. The following limits are imposed on the ID:</p>
     * <ul>
     * <li><strong>true</strong>: The namespaces were obtained.</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Indicates whether an auto scaling policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: An auto scaling policy is enabled.</li>
         * <li><strong>0</strong>: No auto scaling policy is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableAutoscale")
        public Long enableAutoscale;

        /**
         * <p>The number of abnormal instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorInstances")
        public Long errorInstances;

        /**
         * <p>The expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Instances")
        public Long instances;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The current number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
