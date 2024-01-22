// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetArmsTopNMetricResponseBody extends TeaModel {
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
     * <p>The details of applications.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetArmsTopNMetricResponseBodyData> data;

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
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The number of errors.</p>
         */
        @NameInMap("Error")
        public Long error;

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
         * <p>The average response time. Unit: milliseconds.</p>
         */
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
