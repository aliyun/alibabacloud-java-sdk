// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallHotfixResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public InstallHotfixResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If code == Success, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which can be used for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InstallHotfixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallHotfixResponseBody self = new InstallHotfixResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallHotfixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallHotfixResponseBody setData(InstallHotfixResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallHotfixResponseBodyData getData() {
        return this.data;
    }

    public InstallHotfixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallHotfixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstallHotfixResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hotfix-da3dcc0b-5019-4b59-b12f-2e500da9083c</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static InstallHotfixResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallHotfixResponseBodyData self = new InstallHotfixResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallHotfixResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
