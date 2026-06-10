// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>44841312-7227-55C9-AE03-D59729BFAE38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code:  </p>
     * <ul>
     * <li><code>code == Success</code> indicates that authorization succeeded;  </li>
     * <li>Other status codes indicate that authorization failed. When authorization fails, view the <code>message</code> field to obtain the detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("data")
    public UpdateEventsAttentionResponseBodyData data;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>Instance not belong to current user</p>
     */
    @NameInMap("message")
    public String message;

    public static UpdateEventsAttentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventsAttentionResponseBody self = new UpdateEventsAttentionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventsAttentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEventsAttentionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateEventsAttentionResponseBody setData(UpdateEventsAttentionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEventsAttentionResponseBodyData getData() {
        return this.data;
    }

    public UpdateEventsAttentionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class UpdateEventsAttentionResponseBodyData extends TeaModel {
        /**
         * <p>Updated follow level value</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("mode")
        public Integer mode;

        public static UpdateEventsAttentionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventsAttentionResponseBodyData self = new UpdateEventsAttentionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEventsAttentionResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

    }

}
