// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateRecordRemarkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("Remark")
    public String remark;

    public static UpdateRecordRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordRemarkRequest self = new UpdateRecordRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecordRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateRecordRemarkRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateRecordRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
