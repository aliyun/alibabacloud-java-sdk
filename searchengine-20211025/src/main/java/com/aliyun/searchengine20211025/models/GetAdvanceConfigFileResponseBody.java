// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetAdvanceConfigFileResponseBodyResult result;

    public static GetAdvanceConfigFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigFileResponseBody self = new GetAdvanceConfigFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvanceConfigFileResponseBody setResult(GetAdvanceConfigFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAdvanceConfigFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAdvanceConfigFileResponseBodyResult extends TeaModel {
        @NameInMap("content")
        public String content;

        public static GetAdvanceConfigFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigFileResponseBodyResult self = new GetAdvanceConfigFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigFileResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
