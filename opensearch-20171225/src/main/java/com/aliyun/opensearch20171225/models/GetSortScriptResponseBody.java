// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptResponseBody extends TeaModel {
    @NameInMap("result")
    public GetSortScriptResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static GetSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptResponseBody self = new GetSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSortScriptResponseBody setResult(GetSortScriptResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSortScriptResponseBodyResult getResult() {
        return this.result;
    }

    public GetSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSortScriptResponseBodyResult extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("scope")
        public String scope;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("status")
        public String status;

        @NameInMap("modifyTime")
        public String modifyTime;

        public static GetSortScriptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSortScriptResponseBodyResult self = new GetSortScriptResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSortScriptResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSortScriptResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSortScriptResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSortScriptResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSortScriptResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
