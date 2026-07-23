// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ShoppingAssistantResponseBody extends TeaModel {
    /**
     * <p>The citation information.</p>
     */
    @NameInMap("Citation")
    public ShoppingAssistantResponseBodyCitation citation;

    /**
     * <p>The returned content.</p>
     * 
     * <strong>example:</strong>
     * <p>Here are some light-colored long-sleeve shirts I picked for you:\n.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The event.</p>
     * 
     * <strong>example:</strong>
     * <p>analyze_requirement</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result details.</p>
     */
    @NameInMap("Result")
    public ShoppingAssistantResponseBodyResult result;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The stop reason.</p>
     * 
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("StopReason")
    public String stopReason;

    public static ShoppingAssistantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShoppingAssistantResponseBody self = new ShoppingAssistantResponseBody();
        return TeaModel.build(map, self);
    }

    public ShoppingAssistantResponseBody setCitation(ShoppingAssistantResponseBodyCitation citation) {
        this.citation = citation;
        return this;
    }
    public ShoppingAssistantResponseBodyCitation getCitation() {
        return this.citation;
    }

    public ShoppingAssistantResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ShoppingAssistantResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ShoppingAssistantResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ShoppingAssistantResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ShoppingAssistantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShoppingAssistantResponseBody setResult(ShoppingAssistantResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ShoppingAssistantResponseBodyResult getResult() {
        return this.result;
    }

    public ShoppingAssistantResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ShoppingAssistantResponseBody setStopReason(String stopReason) {
        this.stopReason = stopReason;
        return this;
    }
    public String getStopReason() {
        return this.stopReason;
    }

    public static class ShoppingAssistantResponseBodyCitation extends TeaModel {
        /**
         * <p>The ID of the <code>item</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0005</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The reference data type. Fixed value: <code>item</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("Type")
        public String type;

        public static ShoppingAssistantResponseBodyCitation build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantResponseBodyCitation self = new ShoppingAssistantResponseBodyCitation();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantResponseBodyCitation setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ShoppingAssistantResponseBodyCitation setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ShoppingAssistantResponseBodyResultCitation extends TeaModel {
        /**
         * <p>The ID of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The reference data type. Fixed value: item.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("Type")
        public String type;

        public static ShoppingAssistantResponseBodyResultCitation build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantResponseBodyResultCitation self = new ShoppingAssistantResponseBodyResultCitation();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantResponseBodyResultCitation setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ShoppingAssistantResponseBodyResultCitation setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ShoppingAssistantResponseBodyResultStepInfo extends TeaModel {
        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>analyze_requirement</p>
         */
        @NameInMap("Step")
        public String step;

        public static ShoppingAssistantResponseBodyResultStepInfo build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantResponseBodyResultStepInfo self = new ShoppingAssistantResponseBodyResultStepInfo();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantResponseBodyResultStepInfo setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

    }

    public static class ShoppingAssistantResponseBodyResult extends TeaModel {
        /**
         * <p>The citation information.</p>
         */
        @NameInMap("Citation")
        public ShoppingAssistantResponseBodyResultCitation citation;

        /**
         * <p>The returned content.</p>
         * 
         * <strong>example:</strong>
         * <p>Here are some light-colored long-sleeve shirts I picked for you:\\n.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The step information.</p>
         */
        @NameInMap("StepInfo")
        public ShoppingAssistantResponseBodyResultStepInfo stepInfo;

        /**
         * <p>The stop reason.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("StopReason")
        public String stopReason;

        public static ShoppingAssistantResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantResponseBodyResult self = new ShoppingAssistantResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantResponseBodyResult setCitation(ShoppingAssistantResponseBodyResultCitation citation) {
            this.citation = citation;
            return this;
        }
        public ShoppingAssistantResponseBodyResultCitation getCitation() {
            return this.citation;
        }

        public ShoppingAssistantResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ShoppingAssistantResponseBodyResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ShoppingAssistantResponseBodyResult setStepInfo(ShoppingAssistantResponseBodyResultStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public ShoppingAssistantResponseBodyResultStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public ShoppingAssistantResponseBodyResult setStopReason(String stopReason) {
            this.stopReason = stopReason;
            return this;
        }
        public String getStopReason() {
            return this.stopReason;
        }

    }

}
