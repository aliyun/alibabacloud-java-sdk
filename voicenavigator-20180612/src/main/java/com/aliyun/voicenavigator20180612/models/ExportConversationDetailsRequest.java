// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportConversationDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582266750353</p>
     */
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    /**
     * <strong>example:</strong>
     * <p>1640793599000</p>
     */
    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    /**
     * <strong>example:</strong>
     * <p>13581588**</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c01a99f-1b72-4f75-a8bd-3875766bd19d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Options")
    public java.util.List<String> options;

    @NameInMap("Result")
    public Integer result;

    @NameInMap("RoundsLeftRange")
    public Integer roundsLeftRange;

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
