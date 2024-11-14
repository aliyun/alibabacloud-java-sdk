// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAbnormalTypeResponseBody extends TeaModel {
    /**
     * <p>The types and statistics of risks.</p>
     */
    @NameInMap("Abnormal")
    public java.util.List<DescribeUserAbnormalTypeResponseBodyAbnormal> abnormal;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E1CB966-1407-5988-9432-7***D784</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserAbnormalTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAbnormalTypeResponseBody self = new DescribeUserAbnormalTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAbnormalTypeResponseBody setAbnormal(java.util.List<DescribeUserAbnormalTypeResponseBodyAbnormal> abnormal) {
        this.abnormal = abnormal;
        return this;
    }
    public java.util.List<DescribeUserAbnormalTypeResponseBodyAbnormal> getAbnormal() {
        return this.abnormal;
    }

    public DescribeUserAbnormalTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserAbnormalTypeResponseBodyAbnormal extends TeaModel {
        /**
         * <p>The code of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Risk_InternalWeakPasswd</p>
         */
        @NameInMap("AbnormalCode")
        public String abnormalCode;

        /**
         * <p>The number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AbnormalCount")
        public Long abnormalCount;

        /**
         * <p>The parent type of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>RiskType_Account</p>
         */
        @NameInMap("AbnormalParentType")
        public String abnormalParentType;

        /**
         * <p>The type of the risk.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of risks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LackOfSpeedLimit</p>
         */
        @NameInMap("AbnormalType")
        public String abnormalType;

        public static DescribeUserAbnormalTypeResponseBodyAbnormal build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAbnormalTypeResponseBodyAbnormal self = new DescribeUserAbnormalTypeResponseBodyAbnormal();
            return TeaModel.build(map, self);
        }

        public DescribeUserAbnormalTypeResponseBodyAbnormal setAbnormalCode(String abnormalCode) {
            this.abnormalCode = abnormalCode;
            return this;
        }
        public String getAbnormalCode() {
            return this.abnormalCode;
        }

        public DescribeUserAbnormalTypeResponseBodyAbnormal setAbnormalCount(Long abnormalCount) {
            this.abnormalCount = abnormalCount;
            return this;
        }
        public Long getAbnormalCount() {
            return this.abnormalCount;
        }

        public DescribeUserAbnormalTypeResponseBodyAbnormal setAbnormalParentType(String abnormalParentType) {
            this.abnormalParentType = abnormalParentType;
            return this;
        }
        public String getAbnormalParentType() {
            return this.abnormalParentType;
        }

        public DescribeUserAbnormalTypeResponseBodyAbnormal setAbnormalType(String abnormalType) {
            this.abnormalType = abnormalType;
            return this;
        }
        public String getAbnormalType() {
            return this.abnormalType;
        }

    }

}
