// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582266750353</p>
     */
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1640793599000</p>
     */
    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    /**
     * <p>The calling number.</p>
     * 
     * <strong>example:</strong>
     * <p>13581588**</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("DebugConversation")
    public Integer debugConversation;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c01a99f-1b72-4f75-a8bd-3875766bd19d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>An array of optional parameters.</p>
     */
    @NameInMap("Options")
    public java.util.List<String> options;

    /**
     * <p>The result of the conversation.</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>The minimum number of conversation turns.</p>
     */
    @NameInMap("RoundsLeftRange")
    public Integer roundsLeftRange;

    /**
     * <p>The maximum number of conversation turns.</p>
     */
    @NameInMap("RoundsRightRange")
    public Integer roundsRightRange;

    public static ExportConversationDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportConversationDetailsRequest self = new ExportConversationDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ExportConversationDetailsRequest setBeginTimeLeftRange(Long beginTimeLeftRange) {
        this.beginTimeLeftRange = beginTimeLeftRange;
        return this;
    }
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    public ExportConversationDetailsRequest setBeginTimeRightRange(Long beginTimeRightRange) {
        this.beginTimeRightRange = beginTimeRightRange;
        return this;
    }
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    public ExportConversationDetailsRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ExportConversationDetailsRequest setDebugConversation(Integer debugConversation) {
        this.debugConversation = debugConversation;
        return this;
    }
    public Integer getDebugConversation() {
        return this.debugConversation;
    }

    public ExportConversationDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportConversationDetailsRequest setOptions(java.util.List<String> options) {
        this.options = options;
        return this;
    }
    public java.util.List<String> getOptions() {
        return this.options;
    }

    public ExportConversationDetailsRequest setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public ExportConversationDetailsRequest setRoundsLeftRange(Integer roundsLeftRange) {
        this.roundsLeftRange = roundsLeftRange;
        return this;
    }
    public Integer getRoundsLeftRange() {
        return this.roundsLeftRange;
    }

    public ExportConversationDetailsRequest setRoundsRightRange(Integer roundsRightRange) {
        this.roundsRightRange = roundsRightRange;
        return this;
    }
    public Integer getRoundsRightRange() {
        return this.roundsRightRange;
    }

}
