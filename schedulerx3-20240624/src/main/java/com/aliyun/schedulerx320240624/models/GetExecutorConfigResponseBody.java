// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetExecutorConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetExecutorConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetExecutorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutorConfigResponseBody self = new GetExecutorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutorConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExecutorConfigResponseBody setData(GetExecutorConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExecutorConfigResponseBodyData getData() {
        return this.data;
    }

    public GetExecutorConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExecutorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecutorConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExecutorConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;c2c619b5129e0400fa3df263b249622aa&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;service&quot;:&quot;xxljob-http-demo1-svc&quot;}]</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("ExecutorType")
        public String executorType;

        public static GetExecutorConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExecutorConfigResponseBodyData self = new GetExecutorConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExecutorConfigResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetExecutorConfigResponseBodyData setExecutorType(String executorType) {
            this.executorType = executorType;
            return this;
        }
        public String getExecutorType() {
            return this.executorType;
        }

    }

}
