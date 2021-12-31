// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptFileResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetSortScriptFileResponseBodyResult result;

    public static GetSortScriptFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptFileResponseBody self = new GetSortScriptFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSortScriptFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSortScriptFileResponseBody setResult(GetSortScriptFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSortScriptFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetSortScriptFileResponseBodyResult extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("modifyTime")
        public String modifyTime;

        @NameInMap("version")
        public Long version;

        public static GetSortScriptFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSortScriptFileResponseBodyResult self = new GetSortScriptFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSortScriptFileResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSortScriptFileResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSortScriptFileResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetSortScriptFileResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
