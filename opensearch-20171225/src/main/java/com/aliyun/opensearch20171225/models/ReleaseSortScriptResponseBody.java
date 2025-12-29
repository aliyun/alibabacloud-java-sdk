// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ReleaseSortScriptResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ReleaseSortScriptResponseBodyResult result;

    public static ReleaseSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSortScriptResponseBody self = new ReleaseSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseSortScriptResponseBody setResult(ReleaseSortScriptResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReleaseSortScriptResponseBodyResult getResult() {
        return this.result;
    }

    public static class ReleaseSortScriptResponseBodyResult extends TeaModel {
        @NameInMap("version")
        public Long version;

        public static ReleaseSortScriptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReleaseSortScriptResponseBodyResult self = new ReleaseSortScriptResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReleaseSortScriptResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
