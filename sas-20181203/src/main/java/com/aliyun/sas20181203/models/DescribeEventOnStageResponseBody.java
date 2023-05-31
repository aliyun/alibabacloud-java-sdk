// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventOnStageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The platforms that are supported by the feature of container threat detection.</p>
     */
    @NameInMap("SecurityEventStageResponse")
    public DescribeEventOnStageResponseBodySecurityEventStageResponse securityEventStageResponse;

    public static DescribeEventOnStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventOnStageResponseBody self = new DescribeEventOnStageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventOnStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventOnStageResponseBody setSecurityEventStageResponse(DescribeEventOnStageResponseBodySecurityEventStageResponse securityEventStageResponse) {
        this.securityEventStageResponse = securityEventStageResponse;
        return this;
    }
    public DescribeEventOnStageResponseBodySecurityEventStageResponse getSecurityEventStageResponse() {
        return this.securityEventStageResponse;
    }

    public static class DescribeEventOnStageResponseBodySecurityEventStageResponse extends TeaModel {
        /**
         * <p>The platform that is supported by the feature of container threat detection. Valid values:</p>
         * <br>
         * <p>*   **container**</p>
         * <p>*   **linux**</p>
         * <p>*   **windows**</p>
         */
        @NameInMap("SecurityEventOnStag")
        public java.util.Map<String, ?> securityEventOnStag;

        public static DescribeEventOnStageResponseBodySecurityEventStageResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventOnStageResponseBodySecurityEventStageResponse self = new DescribeEventOnStageResponseBodySecurityEventStageResponse();
            return TeaModel.build(map, self);
        }

        public DescribeEventOnStageResponseBodySecurityEventStageResponse setSecurityEventOnStag(java.util.Map<String, ?> securityEventOnStag) {
            this.securityEventOnStag = securityEventOnStag;
            return this;
        }
        public java.util.Map<String, ?> getSecurityEventOnStag() {
            return this.securityEventOnStag;
        }

    }

}
