// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class MergeInstanceDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public MergeInstanceDataResponseBodyResults results;

    public static MergeInstanceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeInstanceDataResponseBody self = new MergeInstanceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeInstanceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeInstanceDataResponseBody setResults(MergeInstanceDataResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public MergeInstanceDataResponseBodyResults getResults() {
        return this.results;
    }

    public static class MergeInstanceDataResponseBodyResults extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static MergeInstanceDataResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            MergeInstanceDataResponseBodyResults self = new MergeInstanceDataResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public MergeInstanceDataResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MergeInstanceDataResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
