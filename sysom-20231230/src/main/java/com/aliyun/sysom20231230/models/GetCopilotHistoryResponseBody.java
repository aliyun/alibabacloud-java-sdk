// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCopilotHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.InvalidParameter</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetCopilotHistoryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCopilotHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotHistoryResponseBody self = new GetCopilotHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopilotHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCopilotHistoryResponseBody setData(java.util.List<GetCopilotHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCopilotHistoryResponseBodyData> getData() {
        return this.data;
    }

    public GetCopilotHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCopilotHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCopilotHistoryResponseBodyData extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-09-02 10:02:39</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>user
         * copilot</p>
         */
        @NameInMap("user")
        public String user;

        public static GetCopilotHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopilotHistoryResponseBodyData self = new GetCopilotHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopilotHistoryResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetCopilotHistoryResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetCopilotHistoryResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
