// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
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
    public java.util.List<String> dispositionCodes;

    /**
     * <p>The disposition reasons.</p>
     */
    @NameInMap("DispositionReasons")
    public java.util.List<String> dispositionReasons;

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
    public java.util.List<String> sessionIds;

    /**
     * <p>The beginning of the time range to query. This value is a Unix timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1774858849987</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListCallDetailRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsRequest self = new ListCallDetailRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public ListCallDetailRecordsRequest setAccessChannelType(String accessChannelType) {
        this.accessChannelType = accessChannelType;
        return this;
    }
    public String getAccessChannelType() {
        return this.accessChannelType;
    }

    public ListCallDetailRecordsRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public ListCallDetailRecordsRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListCallDetailRecordsRequest setDispositionCodes(java.util.List<String> dispositionCodes) {
        this.dispositionCodes = dispositionCodes;
        return this;
    }
    public java.util.List<String> getDispositionCodes() {
        return this.dispositionCodes;
    }

    public ListCallDetailRecordsRequest setDispositionReasons(java.util.List<String> dispositionReasons) {
        this.dispositionReasons = dispositionReasons;
        return this;
    }
    public java.util.List<String> getDispositionReasons() {
        return this.dispositionReasons;
    }

    public ListCallDetailRecordsRequest setDraftVersion(Boolean draftVersion) {
        this.draftVersion = draftVersion;
        return this;
    }
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    public ListCallDetailRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCallDetailRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCallDetailRecordsRequest setIssueResolved(Boolean issueResolved) {
        this.issueResolved = issueResolved;
        return this;
    }
    public Boolean getIssueResolved() {
        return this.issueResolved;
    }

    public ListCallDetailRecordsRequest setMaxTalkTurns(Integer maxTalkTurns) {
        this.maxTalkTurns = maxTalkTurns;
        return this;
    }
    public Integer getMaxTalkTurns() {
        return this.maxTalkTurns;
    }

    public ListCallDetailRecordsRequest setMinTalkTurns(Integer minTalkTurns) {
        this.minTalkTurns = minTalkTurns;
        return this;
    }
    public Integer getMinTalkTurns() {
        return this.minTalkTurns;
    }

    public ListCallDetailRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallDetailRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallDetailRecordsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ListCallDetailRecordsRequest setSessionIds(java.util.List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

    public ListCallDetailRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
