// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentUserSessionsResponseBody extends TeaModel {
    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribePolarAgentUserSessionsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarAgentUserSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentUserSessionsResponseBody self = new DescribePolarAgentUserSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentUserSessionsResponseBody setData(java.util.List<DescribePolarAgentUserSessionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePolarAgentUserSessionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribePolarAgentUserSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarAgentUserSessionsResponseBodyData extends TeaModel {
        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01IC17MLISBB98SL345H7B5AES1E8VB1</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The status of the session. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Active</p>
         * </li>
         * <li><p><strong>0</strong>: Closed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SessionStatus")
        public Long sessionStatus;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePolarAgentUserSessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarAgentUserSessionsResponseBodyData self = new DescribePolarAgentUserSessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePolarAgentUserSessionsResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePolarAgentUserSessionsResponseBodyData setSessionStatus(Long sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public Long getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribePolarAgentUserSessionsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
