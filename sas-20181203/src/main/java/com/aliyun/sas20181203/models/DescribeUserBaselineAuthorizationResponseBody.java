// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserBaselineAuthorizationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0AF20EB0-EBBC-4B94-9B84-F3BAFAC53EDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about whether Security Center is authorized to run configuration checks on cloud services.</p>
     */
    @NameInMap("UserBaselineAuthorization")
    public DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization userBaselineAuthorization;

    public static DescribeUserBaselineAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBaselineAuthorizationResponseBody self = new DescribeUserBaselineAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBaselineAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBaselineAuthorizationResponseBody setUserBaselineAuthorization(DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization userBaselineAuthorization) {
        this.userBaselineAuthorization = userBaselineAuthorization;
        return this;
    }
    public DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization getUserBaselineAuthorization() {
        return this.userBaselineAuthorization;
    }

    public static class DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization extends TeaModel {
        /**
         * <p>Indicates whether Security Center is authorized to run configuration checks on cloud services.</p>
         * <ul>
         * <li><strong>0</strong>: no. Security Center is not authorized to run configuration checks on cloud services.</li>
         * <li><strong>1</strong>: yes. Security Center is authorized to run configuration checks on cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization self = new DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization();
            return TeaModel.build(map, self);
        }

        public DescribeUserBaselineAuthorizationResponseBodyUserBaselineAuthorization setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
