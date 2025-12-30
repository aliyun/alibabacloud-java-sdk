// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIPatternIndexQueryTablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;tableName&quot;: &quot;pattern_index_1&quot;，&quot;patternTableName&quot;: &quot;polar4ai_nl2sql_pattern_1&quot;, &quot;tableStatus&quot;: 0},
     * {&quot;tableName&quot;: &quot;pattern_index_2&quot;，&quot;patternTableName&quot;: &quot;polar4ai_nl2sql_pattern_2&quot;, &quot;tableStatus&quot;: 1},
     * {&quot;tableName&quot;: &quot;pattern_index_3&quot;，&quot;patternTableName&quot;: &quot;polar4ai_nl2sql_pattern_3, &quot;tableStatus&quot;: 2}]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>983863E2-****-1D15-A4AE-3468CD75383D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChatBIPatternIndexQueryTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatBIPatternIndexQueryTablesResponseBody self = new ChatBIPatternIndexQueryTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatBIPatternIndexQueryTablesResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ChatBIPatternIndexQueryTablesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ChatBIPatternIndexQueryTablesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ChatBIPatternIndexQueryTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatBIPatternIndexQueryTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
