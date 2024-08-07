// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetScaleAppMetricResponseBody extends TeaModel {
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
     * <p>The details of applications.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetScaleAppMetricResponseBodyData> data;

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
     * <p>3B763F98-0BA2-5C23-B6B8-558568D2C1C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the microservice list was obtained. The following limits are imposed on the ID:</p>
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxReplicas")
        public Long maxReplicas;

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
         * <p>10</p>
         */
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
