// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class TemplateRecord extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250915163734000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The replication status.</p>
     */
    @NameInMap("CopyStatus")
    public String copyStatus;

    /**
     * <p>The creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-21T08:27:03Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The modification time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-08-28T02:25:41Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9953352</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>de10bf7d782392a70f293a3b1f7bb8fc</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The user ID.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static TemplateRecord build(java.util.Map<String, ?> map) throws Exception {
        TemplateRecord self = new TemplateRecord();
        return TeaModel.build(map, self);
    }

    public TemplateRecord setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TemplateRecord setCopyStatus(String copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }
    public String getCopyStatus() {
        return this.copyStatus;
    }

    public TemplateRecord setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TemplateRecord setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TemplateRecord setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TemplateRecord setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TemplateRecord setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
