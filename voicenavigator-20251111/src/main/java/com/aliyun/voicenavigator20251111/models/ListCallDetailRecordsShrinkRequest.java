// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsShrinkRequest extends TeaModel {
    /**
     * <p>The channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33606503-c22c-4547-a51c-dda5e8d87962</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <p>The channel type.</p>
     * 
     * <strong>example:</strong>
     * <p>PSTN</p>
     */
    @NameInMap("AccessChannelType")
    public String accessChannelType;

    /**
     * <p>The callee\&quot;s number.</p>
     * 
     * <strong>example:</strong>
     * <p>18104560087</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>The caller\&quot;s number.</p>
     * 
     * <strong>example:</strong>
     * <p>09876543210,</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The disposition codes.</p>
     */
    @NameInMap("DispositionCodes")
    public String dispositionCodesShrink;

    /**
     * <p>The disposition reasons.</p>
     */
    @NameInMap("DispositionReasons")
    public String dispositionReasonsShrink;

    /**
     * <p>Specifies whether to query a draft.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DraftVersion")
    public Boolean draftVersion;

    /**
     * <p>The end of the time range to query. This value is a Unix timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the issue was resolved.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IssueResolved")
    public Boolean issueResolved;

    /**
     * <p>The maximum number of conversational turns.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxTalkTurns")
    public Integer maxTalkTurns;

    /**
     * <p>The minimum number of conversational turns.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinTalkTurns")
    public Integer minTalkTurns;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The session IDs.</p>
     * <blockquote>
     * <p>The value is a JSON array of strings. Example: <code>[&quot;session-id-1&quot;,&quot;session-id-2&quot;]</code>.</p>
     * </blockquote>
     */
    @NameInMap("SessionIds")
    public String sessionIdsShrink;

    /**
     * <p>The beginning of the time range to query. This value is a Unix timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1774858849987</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListCallDetailRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsShrinkRequest self = new ListCallDetailRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsShrinkRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public ListCallDetailRecordsShrinkRequest setAccessChannelType(String accessChannelType) {
        this.accessChannelType = accessChannelType;
        return this;
    }
    public String getAccessChannelType() {
        return this.accessChannelType;
    }

    public ListCallDetailRecordsShrinkRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public ListCallDetailRecordsShrinkRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListCallDetailRecordsShrinkRequest setDispositionCodesShrink(String dispositionCodesShrink) {
        this.dispositionCodesShrink = dispositionCodesShrink;
        return this;
    }
    public String getDispositionCodesShrink() {
        return this.dispositionCodesShrink;
    }

    public ListCallDetailRecordsShrinkRequest setDispositionReasonsShrink(String dispositionReasonsShrink) {
        this.dispositionReasonsShrink = dispositionReasonsShrink;
        return this;
    }
    public String getDispositionReasonsShrink() {
        return this.dispositionReasonsShrink;
    }

    public ListCallDetailRecordsShrinkRequest setDraftVersion(Boolean draftVersion) {
        this.draftVersion = draftVersion;
        return this;
    }
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    public ListCallDetailRecordsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCallDetailRecordsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCallDetailRecordsShrinkRequest setIssueResolved(Boolean issueResolved) {
        this.issueResolved = issueResolved;
        return this;
    }
    public Boolean getIssueResolved() {
        return this.issueResolved;
    }

    public ListCallDetailRecordsShrinkRequest setMaxTalkTurns(Integer maxTalkTurns) {
        this.maxTalkTurns = maxTalkTurns;
        return this;
    }
    public Integer getMaxTalkTurns() {
        return this.maxTalkTurns;
    }

    public ListCallDetailRecordsShrinkRequest setMinTalkTurns(Integer minTalkTurns) {
        this.minTalkTurns = minTalkTurns;
        return this;
    }
    public Integer getMinTalkTurns() {
        return this.minTalkTurns;
    }

    public ListCallDetailRecordsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallDetailRecordsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallDetailRecordsShrinkRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ListCallDetailRecordsShrinkRequest setSessionIdsShrink(String sessionIdsShrink) {
        this.sessionIdsShrink = sessionIdsShrink;
        return this;
    }
    public String getSessionIdsShrink() {
        return this.sessionIdsShrink;
    }

    public ListCallDetailRecordsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
