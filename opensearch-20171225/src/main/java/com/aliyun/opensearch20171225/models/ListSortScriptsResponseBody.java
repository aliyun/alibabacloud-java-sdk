// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortScriptsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListSortScriptsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static ListSortScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSortScriptsResponseBody self = new ListSortScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSortScriptsResponseBody setResult(java.util.List<ListSortScriptsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSortScriptsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSortScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSortScriptsResponseBodyResult extends TeaModel {
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

        @NameInMap("scriptName")
        public String scriptName;

        public static ListSortScriptsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSortScriptsResponseBodyResult self = new ListSortScriptsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSortScriptsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSortScriptsResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSortScriptsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSortScriptsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSortScriptsResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSortScriptsResponseBodyResult setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

    }

}
