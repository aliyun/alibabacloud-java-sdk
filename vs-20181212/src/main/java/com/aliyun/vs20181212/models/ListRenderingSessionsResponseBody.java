// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingSessionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<ListRenderingSessionsResponseBodySessions> sessions;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingSessionsResponseBody self = new ListRenderingSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingSessionsResponseBody setSessions(java.util.List<ListRenderingSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<ListRenderingSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public ListRenderingSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingSessionsResponseBodySessions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cap-4e1a6a425495458ba78693b8ac6600ea</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>fd6b2134-7954-4754-8915-5fb8b0469622</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("RenderingInstanceId")
        public String renderingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>session-i205217481741918129226</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>2024-07-04T01:23:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListRenderingSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingSessionsResponseBodySessions self = new ListRenderingSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public ListRenderingSessionsResponseBodySessions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRenderingSessionsResponseBodySessions setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListRenderingSessionsResponseBodySessions setRenderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public ListRenderingSessionsResponseBodySessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListRenderingSessionsResponseBodySessions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
