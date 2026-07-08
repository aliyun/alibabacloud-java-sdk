// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePocFunctionsResponseBody extends TeaModel {
    /**
     * <p>A list of the POC feature details.</p>
     */
    @NameInMap("Functions")
    public java.util.List<DescribePocFunctionsResponseBodyFunctions> functions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1557B42F-B889-460A-B17F-1DE5C5AD7FF2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePocFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePocFunctionsResponseBody self = new DescribePocFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePocFunctionsResponseBody setFunctions(java.util.List<DescribePocFunctionsResponseBodyFunctions> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<DescribePocFunctionsResponseBodyFunctions> getFunctions() {
        return this.functions;
    }

    public DescribePocFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePocFunctionsResponseBodyFunctions extends TeaModel {
        /**
         * <p>The expiration time of the POC feature trial. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1760581677000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The type of the POC feature trial. Valid values:</p>
         * <ul>
         * <li><p><strong>apisec</strong>: API security.</p>
         * </li>
         * <li><p><strong>botWeb</strong>: bot management for websites.</p>
         * </li>
         * <li><p><strong>botApp</strong>: bot management for apps.</p>
         * </li>
         * <li><p><strong>largeLanguageModel</strong>: AI-powered application protection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>botWeb</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePocFunctionsResponseBodyFunctions build(java.util.Map<String, ?> map) throws Exception {
            DescribePocFunctionsResponseBodyFunctions self = new DescribePocFunctionsResponseBodyFunctions();
            return TeaModel.build(map, self);
        }

        public DescribePocFunctionsResponseBodyFunctions setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribePocFunctionsResponseBodyFunctions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
