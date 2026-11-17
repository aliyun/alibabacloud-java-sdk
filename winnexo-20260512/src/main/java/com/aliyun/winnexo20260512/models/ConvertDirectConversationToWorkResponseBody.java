// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ConvertDirectConversationToWorkResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The session conversion record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleConversionId</p>
     */
    @NameInMap("conversionId")
    public String conversionId;

    /**
     * <p>The number of converted conversation turns.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("convertedRounds")
    public Integer convertedRounds;

    /**
     * <p>The scope of the converted historical messages.</p>
     * 
     * <strong>example:</strong>
     * <p>direct</p>
     */
    @NameInMap("historyScope")
    public String historyScope;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Specifies whether retries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retryable")
    public Boolean retryable;

    /**
     * <p>The source session version identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sourceEpoch")
    public Long sourceEpoch;

    /**
     * <p>The source session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceSessionId</p>
     */
    @NameInMap("sourceSessionId")
    public String sourceSessionId;

    /**
     * <p>The conversion status.</p>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The target work session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTargetSessionId</p>
     */
    @NameInMap("targetSessionId")
    public String targetSessionId;

    /**
     * <p>The cutoff message sequence number for the conversion.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("throughSequence")
    public Long throughSequence;

    /**
     * <p>The work session mode.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("workMode")
    public String workMode;

    public static ConvertDirectConversationToWorkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertDirectConversationToWorkResponseBody self = new ConvertDirectConversationToWorkResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertDirectConversationToWorkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertDirectConversationToWorkResponseBody setConversionId(String conversionId) {
        this.conversionId = conversionId;
        return this;
    }
    public String getConversionId() {
        return this.conversionId;
    }

    public ConvertDirectConversationToWorkResponseBody setConvertedRounds(Integer convertedRounds) {
        this.convertedRounds = convertedRounds;
        return this;
    }
    public Integer getConvertedRounds() {
        return this.convertedRounds;
    }

    public ConvertDirectConversationToWorkResponseBody setHistoryScope(String historyScope) {
        this.historyScope = historyScope;
        return this;
    }
    public String getHistoryScope() {
        return this.historyScope;
    }

    public ConvertDirectConversationToWorkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConvertDirectConversationToWorkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertDirectConversationToWorkResponseBody setRetryable(Boolean retryable) {
        this.retryable = retryable;
        return this;
    }
    public Boolean getRetryable() {
        return this.retryable;
    }

    public ConvertDirectConversationToWorkResponseBody setSourceEpoch(Long sourceEpoch) {
        this.sourceEpoch = sourceEpoch;
        return this;
    }
    public Long getSourceEpoch() {
        return this.sourceEpoch;
    }

    public ConvertDirectConversationToWorkResponseBody setSourceSessionId(String sourceSessionId) {
        this.sourceSessionId = sourceSessionId;
        return this;
    }
    public String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public ConvertDirectConversationToWorkResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConvertDirectConversationToWorkResponseBody setTargetSessionId(String targetSessionId) {
        this.targetSessionId = targetSessionId;
        return this;
    }
    public String getTargetSessionId() {
        return this.targetSessionId;
    }

    public ConvertDirectConversationToWorkResponseBody setThroughSequence(Long throughSequence) {
        this.throughSequence = throughSequence;
        return this;
    }
    public Long getThroughSequence() {
        return this.throughSequence;
    }

    public ConvertDirectConversationToWorkResponseBody setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
