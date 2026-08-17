// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateCampaignShrinkRequest extends TeaModel {
    /**
     * <p>The call execution order. Default value: MIN_ATTEMPT_FIRST. Valid values:</p>
     * <ul>
     * <li>PRIORITY_FIRST: priority first.</li>
     * <li>MIN_ATTEMPT_FIRST: minimum attempt count first.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MIN_ATTEMPT_FIRST</p>
     */
    @NameInMap("AttemptOrder")
    public String attemptOrder;

    /**
     * <p>The callable time range for the task. The value is a JSON object that contains two properties: beginTime and EndTime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;18:00:00&quot; }]。</p>
     */
    @NameInMap("CallableTime")
    public String callableTime;

    /**
     * <p>The task contact list, which is an OSS object key obtained through the GenerateFileUploadParams operation. You can also leave this parameter empty and append contacts later through the AppendCases operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cases/customer.csv</p>
     */
    @NameInMap("CaseFileKey")
    public String caseFileKey;

    /**
     * <p>The contact list. You can also leave this parameter empty and append contacts later through the AppendCases operation.</p>
     */
    @NameInMap("Cases")
    public String casesShrink;

    /**
     * <p>The dialing timeout period, in seconds. Default value: 25.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("DialingTimeoutSeconds")
    public Integer dialingTimeoutSeconds;

    /**
     * <p>The task end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1579965079000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The minimum concurrency for the task. A value of 0 indicates no guaranteed minimum, and resources are allocated by weight.</p>
     * <p>If multiple tasks have a minimum concurrency configured:</p>
     * <ul>
     * <li><p>If the total concurrency is less than the instance total concurrency, the minimum concurrency of each task is satisfied first, and the remaining resources are allocated proportionally by weight.</p>
     * </li>
     * <li><p>If the total concurrency exceeds the instance total concurrency, the minimum concurrency no longer serves as a guaranteed minimum but is used as a weight factor in the calculation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FixedQuota")
    public Integer fixedQuota;

    /**
     * <p>The flash SMS parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FlashSmsParameters")
    public String flashSmsParameters;

    /**
     * <p>Specifies whether to prohibit outbound calls on holidays.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HolidayRestricted")
    public Boolean holidayRestricted;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of attempts. This specifies the maximum number of times a number is called when the call fails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxAttemptCount")
    public Integer maxAttemptCount;

    /**
     * <p>The interval between attempts.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MinAttemptInterval")
    public Integer minAttemptInterval;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Updated_task_group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of caller numbers for the outbound task.</p>
     */
    @NameInMap("Numbers")
    public String numbersShrink;

    /**
     * <p>The list of redial restriction conditions. If this parameter is not specified, no restrictions are applied. Valid values:</p>
     * <ul>
     * <li>CALLEE_NOT_EXISTS: Do not call nonexistent numbers.</li>
     * <li>OUT_OF_SERVICE: Do not call numbers that are out of service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("RedialRestrictions")
    public String redialRestrictions;

    /**
     * <p>Specifies whether to keep the scheduling state until the task end time after all contacts are called. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: The task remains in the scheduling state, and you can continue to append contacts.</li>
     * <li>false: The task changes to completed, and you cannot append contacts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RunUntilEndTime")
    public Boolean runUntilEndTime;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The task start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1578965079000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The weight. The value is an integer in the range of 0 to 100. A larger value indicates more concurrency allocated during scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static CreateCampaignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignShrinkRequest self = new CreateCampaignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCampaignShrinkRequest setAttemptOrder(String attemptOrder) {
        this.attemptOrder = attemptOrder;
        return this;
    }
    public String getAttemptOrder() {
        return this.attemptOrder;
    }

    public CreateCampaignShrinkRequest setCallableTime(String callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public String getCallableTime() {
        return this.callableTime;
    }

    public CreateCampaignShrinkRequest setCaseFileKey(String caseFileKey) {
        this.caseFileKey = caseFileKey;
        return this;
    }
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    public CreateCampaignShrinkRequest setCasesShrink(String casesShrink) {
        this.casesShrink = casesShrink;
        return this;
    }
    public String getCasesShrink() {
        return this.casesShrink;
    }

    public CreateCampaignShrinkRequest setDialingTimeoutSeconds(Integer dialingTimeoutSeconds) {
        this.dialingTimeoutSeconds = dialingTimeoutSeconds;
        return this;
    }
    public Integer getDialingTimeoutSeconds() {
        return this.dialingTimeoutSeconds;
    }

    public CreateCampaignShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateCampaignShrinkRequest setFixedQuota(Integer fixedQuota) {
        this.fixedQuota = fixedQuota;
        return this;
    }
    public Integer getFixedQuota() {
        return this.fixedQuota;
    }

    public CreateCampaignShrinkRequest setFlashSmsParameters(String flashSmsParameters) {
        this.flashSmsParameters = flashSmsParameters;
        return this;
    }
    public String getFlashSmsParameters() {
        return this.flashSmsParameters;
    }

    public CreateCampaignShrinkRequest setHolidayRestricted(Boolean holidayRestricted) {
        this.holidayRestricted = holidayRestricted;
        return this;
    }
    public Boolean getHolidayRestricted() {
        return this.holidayRestricted;
    }

    public CreateCampaignShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCampaignShrinkRequest setMaxAttemptCount(Integer maxAttemptCount) {
        this.maxAttemptCount = maxAttemptCount;
        return this;
    }
    public Integer getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public CreateCampaignShrinkRequest setMinAttemptInterval(Integer minAttemptInterval) {
        this.minAttemptInterval = minAttemptInterval;
        return this;
    }
    public Integer getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    public CreateCampaignShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCampaignShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public CreateCampaignShrinkRequest setRedialRestrictions(String redialRestrictions) {
        this.redialRestrictions = redialRestrictions;
        return this;
    }
    public String getRedialRestrictions() {
        return this.redialRestrictions;
    }

    public CreateCampaignShrinkRequest setRunUntilEndTime(Boolean runUntilEndTime) {
        this.runUntilEndTime = runUntilEndTime;
        return this;
    }
    public Boolean getRunUntilEndTime() {
        return this.runUntilEndTime;
    }

    public CreateCampaignShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateCampaignShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateCampaignShrinkRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
