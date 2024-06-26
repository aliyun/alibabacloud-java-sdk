// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyParametersResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>ModifyParameters</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Example 1</p>
     */
    @NameInMap("Results")
    public ModifyParametersResponseBodyResults results;

    public static ModifyParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersResponseBody self = new ModifyParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyParametersResponseBody setResults(ModifyParametersResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public ModifyParametersResponseBodyResults getResults() {
        return this.results;
    }

    public static class ModifyParametersResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>schedule timeout.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ModifyParametersResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyParametersResponseBodyResults self = new ModifyParametersResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ModifyParametersResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyParametersResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
