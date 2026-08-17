// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateCampaignRequest extends TeaModel {
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
    public java.util.List<CreateCampaignRequestCases> cases;

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
    public java.util.List<String> numbers;

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

    public static CreateCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignRequest self = new CreateCampaignRequest();
        return TeaModel.build(map, self);
    }

    public CreateCampaignRequest setAttemptOrder(String attemptOrder) {
        this.attemptOrder = attemptOrder;
        return this;
    }
    public String getAttemptOrder() {
        return this.attemptOrder;
    }

    public CreateCampaignRequest setCallableTime(String callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public String getCallableTime() {
        return this.callableTime;
    }

    public CreateCampaignRequest setCaseFileKey(String caseFileKey) {
        this.caseFileKey = caseFileKey;
        return this;
    }
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    public CreateCampaignRequest setCases(java.util.List<CreateCampaignRequestCases> cases) {
        this.cases = cases;
        return this;
    }
    public java.util.List<CreateCampaignRequestCases> getCases() {
        return this.cases;
    }

    public CreateCampaignRequest setDialingTimeoutSeconds(Integer dialingTimeoutSeconds) {
        this.dialingTimeoutSeconds = dialingTimeoutSeconds;
        return this;
    }
    public Integer getDialingTimeoutSeconds() {
        return this.dialingTimeoutSeconds;
    }

    public CreateCampaignRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateCampaignRequest setFixedQuota(Integer fixedQuota) {
        this.fixedQuota = fixedQuota;
        return this;
    }
    public Integer getFixedQuota() {
        return this.fixedQuota;
    }

    public CreateCampaignRequest setFlashSmsParameters(String flashSmsParameters) {
        this.flashSmsParameters = flashSmsParameters;
        return this;
    }
    public String getFlashSmsParameters() {
        return this.flashSmsParameters;
    }

    public CreateCampaignRequest setHolidayRestricted(Boolean holidayRestricted) {
        this.holidayRestricted = holidayRestricted;
        return this;
    }
    public Boolean getHolidayRestricted() {
        return this.holidayRestricted;
    }

    public CreateCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCampaignRequest setMaxAttemptCount(Integer maxAttemptCount) {
        this.maxAttemptCount = maxAttemptCount;
        return this;
    }
    public Integer getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public CreateCampaignRequest setMinAttemptInterval(Integer minAttemptInterval) {
        this.minAttemptInterval = minAttemptInterval;
        return this;
    }
    public Integer getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    public CreateCampaignRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCampaignRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public CreateCampaignRequest setRedialRestrictions(String redialRestrictions) {
        this.redialRestrictions = redialRestrictions;
        return this;
    }
    public String getRedialRestrictions() {
        return this.redialRestrictions;
    }

    public CreateCampaignRequest setRunUntilEndTime(Boolean runUntilEndTime) {
        this.runUntilEndTime = runUntilEndTime;
        return this;
    }
    public Boolean getRunUntilEndTime() {
        return this.runUntilEndTime;
    }

    public CreateCampaignRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public CreateCampaignRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateCampaignRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public static class CreateCampaignRequestCases extends TeaModel {
        /**
         * <p>The custom variables defined by the customer. The value is a JSON object that contains up to 10 properties. The name and value of each property are defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>133********</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The priority of the contact. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The business ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>bizId-1</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static CreateCampaignRequestCases build(java.util.Map<String, ?> map) throws Exception {
            CreateCampaignRequestCases self = new CreateCampaignRequestCases();
            return TeaModel.build(map, self);
        }

        public CreateCampaignRequestCases setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public CreateCampaignRequestCases setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateCampaignRequestCases setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateCampaignRequestCases setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
