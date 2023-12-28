// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class AuditPublicTemplateRegistrationRequest extends TeaModel {
    @NameInMap("AuditAction")
    public String auditAction;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegistrationId")
    public String registrationId;

    public static AuditPublicTemplateRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditPublicTemplateRegistrationRequest self = new AuditPublicTemplateRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public AuditPublicTemplateRegistrationRequest setAuditAction(String auditAction) {
        this.auditAction = auditAction;
        return this;
    }
    public String getAuditAction() {
        return this.auditAction;
    }

    public AuditPublicTemplateRegistrationRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AuditPublicTemplateRegistrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuditPublicTemplateRegistrationRequest setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

}
