// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSortScriptResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the script</p>
     */
    @NameInMap("result")
    public GetSortScriptResponseBodyResult result;

    public static GetSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSortScriptResponseBody self = new GetSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSortScriptResponseBody setResult(GetSortScriptResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSortScriptResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetSortScriptResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the script was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the script was last modified.</p>
         */
        @NameInMap("modifyTime")
        public String modifyTime;

        /**
         * <p>The sort phase to which the script applies.</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The status of the script. For more information, see the Script status table.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the script.</p>
         */
        @NameInMap("type")
        public String type;

        public static GetSortScriptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSortScriptResponseBodyResult self = new GetSortScriptResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSortScriptResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSortScriptResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetSortScriptResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSortScriptResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSortScriptResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
