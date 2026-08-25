// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetCustomResourceStatsResponseBody extends TeaModel {
    /**
     * <p>The status code. 200 is returned if the call is successful. An error code is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The custom resource statistics information.</p>
     */
    @NameInMap("Data")
    public GetCustomResourceStatsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. This parameter is empty if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>parameter error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomResourceStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResourceStatsResponseBody self = new GetCustomResourceStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomResourceStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomResourceStatsResponseBody setData(GetCustomResourceStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomResourceStatsResponseBodyData getData() {
        return this.data;
    }

    public GetCustomResourceStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomResourceStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomResourceStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomResourceStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomResourceStatsResponseBodyData extends TeaModel {
        /**
         * <p>The number of terminals with custom resources configured.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CustomResourceCount")
        public Long customResourceCount;

        /**
         * <p>The number of terminals on which custom resources have taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("EffectiveCount")
        public Long effectiveCount;

        /**
         * <p>The number of terminals without custom resources configured.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("NoCustomResourceCount")
        public Long noCustomResourceCount;

        /**
         * <p>The number of terminals on which custom resources have not taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnEffectiveCount")
        public Long unEffectiveCount;

        public static GetCustomResourceStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomResourceStatsResponseBodyData self = new GetCustomResourceStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomResourceStatsResponseBodyData setCustomResourceCount(Long customResourceCount) {
            this.customResourceCount = customResourceCount;
            return this;
        }
        public Long getCustomResourceCount() {
            return this.customResourceCount;
        }

        public GetCustomResourceStatsResponseBodyData setEffectiveCount(Long effectiveCount) {
            this.effectiveCount = effectiveCount;
            return this;
        }
        public Long getEffectiveCount() {
            return this.effectiveCount;
        }

        public GetCustomResourceStatsResponseBodyData setNoCustomResourceCount(Long noCustomResourceCount) {
            this.noCustomResourceCount = noCustomResourceCount;
            return this;
        }
        public Long getNoCustomResourceCount() {
            return this.noCustomResourceCount;
        }

        public GetCustomResourceStatsResponseBodyData setUnEffectiveCount(Long unEffectiveCount) {
            this.unEffectiveCount = unEffectiveCount;
            return this;
        }
        public Long getUnEffectiveCount() {
            return this.unEffectiveCount;
        }

    }

}
