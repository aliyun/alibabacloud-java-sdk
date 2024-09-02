// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSortScriptResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("result")
    public CreateSortScriptResponseBodyResult result;

    public static CreateSortScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSortScriptResponseBody self = new CreateSortScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSortScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSortScriptResponseBody setResult(CreateSortScriptResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSortScriptResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateSortScriptResponseBodyResult extends TeaModel {
        /**
         * <p>The sort phase to which the script applies.</p>
         * 
         * <strong>example:</strong>
         * <p>second_rank</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>rank_cava_20230606_v7</p>
         */
        @NameInMap("scriptName")
        public String scriptName;

        /**
         * <p>The script type.</p>
         * 
         * <strong>example:</strong>
         * <p>cava_script</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateSortScriptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSortScriptResponseBodyResult self = new CreateSortScriptResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSortScriptResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateSortScriptResponseBodyResult setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public CreateSortScriptResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
