// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAuditRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("auditMsg")
    public String auditMsg;

    @NameInMap("auditRelationType")
    public String auditRelationType;

    @NameInMap("auditStatus")
    public String auditStatus;

    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    public static UpdateAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRequest self = new UpdateAuditRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAuditRequest setAuditMsg(String auditMsg) {
        this.auditMsg = auditMsg;
        return this;
    }
    public String getAuditMsg() {
        return this.auditMsg;
    }

    public UpdateAuditRequest setAuditRelationType(String auditRelationType) {
        this.auditRelationType = auditRelationType;
        return this;
    }
    public String getAuditRelationType() {
        return this.auditRelationType;
    }

    public UpdateAuditRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public UpdateAuditRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAuditRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
