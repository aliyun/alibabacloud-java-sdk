// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateBaselineCheckWhiteRecordRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to query the IDs of check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason why the check item is added to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>AutoRun</p>
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
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: server</li>
     * <li><strong>agentless</strong>: agentless detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
     * <ul>
     * <li><strong>all_instance</strong>: all servers</li>
     * <li><strong>instance</strong>: specific servers</li>
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
