// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBaselineCheckWhiteRecordRequest extends TeaModel {
    /**
     * <p>The IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

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
     * <p>The IDs of the whitelist records.</p>
     */
    @NameInMap("RecordIds")
    public java.util.List<Long> recordIds;

    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: host baseline</li>
     * <li><strong>agentless</strong>: agentless detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    public static DeleteBaselineCheckWhiteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineCheckWhiteRecordRequest self = new DeleteBaselineCheckWhiteRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineCheckWhiteRecordRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public DeleteBaselineCheckWhiteRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteBaselineCheckWhiteRecordRequest setRecordIds(java.util.List<Long> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<Long> getRecordIds() {
        return this.recordIds;
    }

    public DeleteBaselineCheckWhiteRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
