// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<CheckParametersResponseBodyResults> results;

    public static CheckParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckParametersResponseBody self = new CheckParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckParametersResponseBody setResults(java.util.List<CheckParametersResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<CheckParametersResponseBodyResults> getResults() {
        return this.results;
    }

    public static class CheckParametersResponseBodyResults extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Success")
        public Boolean success;

        public static CheckParametersResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            CheckParametersResponseBodyResults self = new CheckParametersResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public CheckParametersResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckParametersResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CheckParametersResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
