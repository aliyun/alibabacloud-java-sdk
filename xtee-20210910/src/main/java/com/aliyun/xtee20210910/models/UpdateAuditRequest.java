// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAuditRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Approval comments</p>
     * 
     * <strong>example:</strong>
     * <p>同意</p>
     */
    @NameInMap("auditMsg")
    public String auditMsg;

    /**
     * <p>Associated type</p>
     * 
     * <strong>example:</strong>
     * <p>RULE</p>
     */
    @NameInMap("auditRelationType")
    public String auditRelationType;

    /**
     * <p>Status</p>
     * 
     * <strong>example:</strong>
     * <p>AGREE</p>
     */
    @NameInMap("auditStatus")
    public String auditStatus;

    /**
     * <p>The ID of the approval to be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>376773</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
