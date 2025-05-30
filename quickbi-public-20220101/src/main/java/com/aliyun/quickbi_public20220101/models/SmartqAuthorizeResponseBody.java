// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthorizeResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>617277C****************ABA47E31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Array of failed user information.</p>
     */
    @NameInMap("Result")
    public java.util.List<SmartqAuthorizeResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. The value range is as follows:</p>
     * <ul>
     * <li>true: Request succeeded</li>
     * <li>false: Request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SmartqAuthorizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SmartqAuthorizeResponseBody self = new SmartqAuthorizeResponseBody();
        return TeaModel.build(map, self);
    }

    public SmartqAuthorizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SmartqAuthorizeResponseBody setResult(java.util.List<SmartqAuthorizeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SmartqAuthorizeResponseBodyResult> getResult() {
        return this.result;
    }

    public SmartqAuthorizeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SmartqAuthorizeResponseBodyResult extends TeaModel {
        /**
         * <p>Reason for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_FILE_FORMAT</p>
         */
        @NameInMap("DetailMessage")
        public String detailMessage;

        /**
         * <p>Q&amp;A resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>617277C****************ABA47E31</p>
         */
        @NameInMap("LlmCube")
        public String llmCube;

        /**
         * <p>Analysis theme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>617277C****************ABA47E31</p>
         */
        @NameInMap("LlmCubeTheme")
        public String llmCubeTheme;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>617277C****************ABA47E31</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SmartqAuthorizeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SmartqAuthorizeResponseBodyResult self = new SmartqAuthorizeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SmartqAuthorizeResponseBodyResult setDetailMessage(String detailMessage) {
            this.detailMessage = detailMessage;
            return this;
        }
        public String getDetailMessage() {
            return this.detailMessage;
        }

        public SmartqAuthorizeResponseBodyResult setLlmCube(String llmCube) {
            this.llmCube = llmCube;
            return this;
        }
        public String getLlmCube() {
            return this.llmCube;
        }

        public SmartqAuthorizeResponseBodyResult setLlmCubeTheme(String llmCubeTheme) {
            this.llmCubeTheme = llmCubeTheme;
            return this;
        }
        public String getLlmCubeTheme() {
            return this.llmCubeTheme;
        }

        public SmartqAuthorizeResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
