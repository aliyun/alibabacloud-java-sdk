// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyParametersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The modification results.</p>
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
         * <p>The cause of the modification failure.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the parameter has been modified. Valid values:   </p>
         * <p>true: The modification is successful. </p>
         * <p>false: The modification failed.</p>
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
