// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddBaselineCheckWhiteRecordRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to obtain the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The reason for adding the item to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The data source. If this parameter is left empty, servers are queried by default. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: server</li>
     * <li><strong>agentless</strong>: agentless</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the target to which the whitelist applies. Valid values:</p>
     * <ul>
     * <li><strong>all_instance</strong>: all servers</li>
     * <li><strong>instance</strong>: specified servers</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static AddBaselineCheckWhiteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBaselineCheckWhiteRecordRequest self = new AddBaselineCheckWhiteRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddBaselineCheckWhiteRecordRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public AddBaselineCheckWhiteRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddBaselineCheckWhiteRecordRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AddBaselineCheckWhiteRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddBaselineCheckWhiteRecordRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
