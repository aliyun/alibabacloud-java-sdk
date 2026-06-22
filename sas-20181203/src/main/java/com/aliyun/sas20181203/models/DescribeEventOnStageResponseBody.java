// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventOnStageResponseBody extends TeaModel {
    /**
     * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E332241XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The platforms supported by threat detection.</p>
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
         * <p>The platforms supported by threat detection.</p>
         * <ul>
         * <li><strong>container</strong>: container</li>
         * <li><strong>linux</strong>: linux</li>
         * <li><strong>windows</strong>: windows.</li>
         * </ul>
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
