// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>33606503-c22c-4547-a51c-dda5e8d87962</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <strong>example:</strong>
     * <p>PSTN</p>
     */
    @NameInMap("AccessChannelType")
    public String accessChannelType;

    /**
     * <strong>example:</strong>
     * <p>18104560087</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <strong>example:</strong>
     * <p>09876543210,</p>
     */
    @NameInMap("Caller")
    public String caller;

    @NameInMap("DispositionCodes")
    public java.util.List<String> dispositionCodes;

    @NameInMap("DispositionReasons")
    public java.util.List<String> dispositionReasons;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DraftVersion")
    public Boolean draftVersion;

    /**
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IssueResolved")
    public Boolean issueResolved;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxTalkTurns")
    public Integer maxTalkTurns;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinTalkTurns")
    public Integer minTalkTurns;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("SessionIds")
    public java.util.List<String> sessionIds;

    /**
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
