// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSortScriptsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The scripts.</p>
     */
    @NameInMap("result")
    public java.util.List<ListSortScriptsResponseBodyResult> result;

    public static ListSortScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSortScriptsResponseBody self = new ListSortScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSortScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSortScriptsResponseBody setResult(java.util.List<ListSortScriptsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSortScriptsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListSortScriptsResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the script was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-02 20:21:14</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the script was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-02 21:21:14</p>
         */
        @NameInMap("modifyTime")
        public String modifyTime;

        /**
         * <p>The sort phase to which the script applies.</p>
         * 
         * <strong>example:</strong>
         * <p>second_rank</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The name of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("scriptName")
        public String scriptName;

        /**
         * <p>The status of the script. Valid values:</p>
         * <ul>
         * <li>configurable: The script is created, but no script files are uploaded.</li>
         * <li>not compiled: The script is not compiled.</li>
         * <li>compile failed: The compilation of the script failed.</li>
         * <li>compile successful: The script is compiled.</li>
         * <li>released: The script is published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>released</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>cava_script</p>
         */
        @NameInMap("type")
        public String type;

        public static ListSortScriptsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSortScriptsResponseBodyResult self = new ListSortScriptsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSortScriptsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSortScriptsResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSortScriptsResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSortScriptsResponseBodyResult setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ListSortScriptsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSortScriptsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
