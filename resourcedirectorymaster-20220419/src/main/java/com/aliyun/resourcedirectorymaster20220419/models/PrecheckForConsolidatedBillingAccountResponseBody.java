// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class PrecheckForConsolidatedBillingAccountResponseBody extends TeaModel {
    /**
     * <p>The cause of the check failure.</p>
     */
    @NameInMap("Reasons")
    public java.util.List<PrecheckForConsolidatedBillingAccountResponseBodyReasons> reasons;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the check was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static PrecheckForConsolidatedBillingAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckForConsolidatedBillingAccountResponseBody self = new PrecheckForConsolidatedBillingAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckForConsolidatedBillingAccountResponseBody setReasons(java.util.List<PrecheckForConsolidatedBillingAccountResponseBodyReasons> reasons) {
        this.reasons = reasons;
        return this;
    }
    public java.util.List<PrecheckForConsolidatedBillingAccountResponseBodyReasons> getReasons() {
        return this.reasons;
    }

    public PrecheckForConsolidatedBillingAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrecheckForConsolidatedBillingAccountResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public static class PrecheckForConsolidatedBillingAccountResponseBodyReasons extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Message")
        public String message;

        public static PrecheckForConsolidatedBillingAccountResponseBodyReasons build(java.util.Map<String, ?> map) throws Exception {
            PrecheckForConsolidatedBillingAccountResponseBodyReasons self = new PrecheckForConsolidatedBillingAccountResponseBodyReasons();
            return TeaModel.build(map, self);
        }

        public PrecheckForConsolidatedBillingAccountResponseBodyReasons setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PrecheckForConsolidatedBillingAccountResponseBodyReasons setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
