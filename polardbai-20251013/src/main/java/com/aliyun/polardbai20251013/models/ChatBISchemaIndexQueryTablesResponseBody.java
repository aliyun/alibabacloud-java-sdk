// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBISchemaIndexQueryTablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;tableName&quot;: &quot;schema_index_1&quot;，&quot;tablesIncluded&quot;: &quot;&quot;, &quot;columnsExcluded&quot;: &quot;&quot;, &quot;toSample&quot;: 0, &quot;tableStatus&quot;: 0},
     * {&quot;tableName&quot;: &quot;schema_index_2&quot;，&quot;tablesIncluded&quot;: &quot;&quot;, &quot;columnsExcluded&quot;: &quot;&quot;, &quot;toSample&quot;: 0, &quot;tableStatus&quot;: 1},
     * {&quot;tableName&quot;: &quot;schema_index_3&quot;，&quot;tablesIncluded&quot;: &quot;&quot;, &quot;columnsExcluded&quot;: &quot;&quot;, &quot;toSample&quot;: 0, &quot;tableStatus&quot;: 2}]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>FC388CBF-F12C-57E8-832F-61A18131B106</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChatBISchemaIndexQueryTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatBISchemaIndexQueryTablesResponseBody self = new ChatBISchemaIndexQueryTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatBISchemaIndexQueryTablesResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ChatBISchemaIndexQueryTablesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ChatBISchemaIndexQueryTablesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ChatBISchemaIndexQueryTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatBISchemaIndexQueryTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
