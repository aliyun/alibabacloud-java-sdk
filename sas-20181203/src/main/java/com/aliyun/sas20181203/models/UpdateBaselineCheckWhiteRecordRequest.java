// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateBaselineCheckWhiteRecordRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to obtain the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason for adding the whitelist entry.</p>
     * 
     * <strong>example:</strong>
     * <p>Manually processed.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The ID of the whitelist record.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The list of asset UUIDs for which container names are to be removed from the whitelist.</p>
     */
    @NameInMap("RemoveContainerUuids")
    public java.util.List<String> removeContainerUuids;

    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: host</li>
     * <li><strong>agentless</strong>: agentless.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the target on which the whitelist takes effect. Valid values:</p>
     * <ul>
     * <li><strong>all_instance</strong>: all servers</li>
     * <li><strong>instance</strong>: specific servers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all_instance</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static UpdateBaselineCheckWhiteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineCheckWhiteRecordRequest self = new UpdateBaselineCheckWhiteRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineCheckWhiteRecordRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public UpdateBaselineCheckWhiteRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateBaselineCheckWhiteRecordRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateBaselineCheckWhiteRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateBaselineCheckWhiteRecordRequest setRemoveContainerUuids(java.util.List<String> removeContainerUuids) {
        this.removeContainerUuids = removeContainerUuids;
        return this;
    }
    public java.util.List<String> getRemoveContainerUuids() {
        return this.removeContainerUuids;
    }

    public UpdateBaselineCheckWhiteRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateBaselineCheckWhiteRecordRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
