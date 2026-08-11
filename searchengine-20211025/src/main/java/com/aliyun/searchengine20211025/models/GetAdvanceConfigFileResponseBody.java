// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
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
        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;url\&quot;:\&quot;<a href="http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar%5C%5C%22%7D">http://xxxxxx.aliyuncs.com/outnet_hz/packages/xxxxx/opensearch_offline_plugins_xxxxx.tar\\&quot;}</a></p>
         */
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
