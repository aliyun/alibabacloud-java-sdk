// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAliasesResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List</p>
     */
    @NameInMap("result")
    public java.util.List<ListAliasesResponseBodyResult> result;

    public static ListAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponseBody self = new ListAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAliasesResponseBody setResult(java.util.List<ListAliasesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAliasesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAliasesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>index</p>
         */
        @NameInMap("index")
        public String index;

        public static ListAliasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseBodyResult self = new ListAliasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAliasesResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListAliasesResponseBodyResult setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

    }

}
