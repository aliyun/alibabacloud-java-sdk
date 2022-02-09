// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public UpdateParametersResponseBodyResults results;

    public static UpdateParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateParametersResponseBody self = new UpdateParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateParametersResponseBody setResults(UpdateParametersResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public UpdateParametersResponseBodyResults getResults() {
        return this.results;
    }

    public static class UpdateParametersResponseBodyResults extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateParametersResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            UpdateParametersResponseBodyResults self = new UpdateParametersResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public UpdateParametersResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateParametersResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
