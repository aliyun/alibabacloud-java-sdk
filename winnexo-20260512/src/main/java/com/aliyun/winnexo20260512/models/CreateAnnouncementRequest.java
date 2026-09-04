// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateAnnouncementRequest extends TeaModel {
    /**
     * <p>The content of the notice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The system will undergo maintenance tonight</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The display page. Valid values: ALL, FRONTEND, and BACKEND.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("displayPage")
    public String displayPage;

    /**
     * <p>The display type and group label.</p>
     * 
     * <strong>example:</strong>
     * <p>LIST</p>
     */
    @NameInMap("displayType")
    public String displayType;

    /**
     * <p>The effective end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-21T14:00:00+08:00</p>
     */
    @NameInMap("effectiveEnd")
    public String effectiveEnd;

    /**
     * <p>The effective start time in ISO 8601 format with time zone. If this parameter is not specified, the notice takes effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T14:00:00+08:00</p>
     */
    @NameInMap("effectiveStart")
    public String effectiveStart;

    /**
     * <p>The priority. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GENERAL</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>Specifies whether to publish the notice immediately after creation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("publishNow")
    public Boolean publishNow;

    /**
     * <p>The list of system role codes. This parameter is used when targetRoleMode is set to SPECIFIED.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;SYSTEM_ADMIN&quot;]</p>
     */
    @NameInMap("targetRoleCodes")
    public java.util.List<String> targetRoleCodes;

    /**
     * <p>The target role scope. Valid values: ALL and SPECIFIED.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("targetRoleMode")
    public String targetRoleMode;

    /**
     * <p>The list of target tenant IDs. This parameter is used when targetTenantMode is set to SPECIFIED.</p>
     * 
     * <strong>example:</strong>
     * <p>[10000]</p>
     */
    @NameInMap("targetTenantIds")
    public java.util.List<Long> targetTenantIds;

    /**
     * <p>The target tenant scope. Valid values: ALL and SPECIFIED.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("targetTenantMode")
    public String targetTenantMode;

    /**
     * <p>The ID of the tenant for which the notice takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The title of the notice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>System Maintenance Notification</p>
     */
    @NameInMap("title")
    public String title;

    public static CreateAnnouncementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnouncementRequest self = new CreateAnnouncementRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnouncementRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAnnouncementRequest setDisplayPage(String displayPage) {
        this.displayPage = displayPage;
        return this;
    }
    public String getDisplayPage() {
        return this.displayPage;
    }

    public CreateAnnouncementRequest setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }
    public String getDisplayType() {
        return this.displayType;
    }

    public CreateAnnouncementRequest setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
        return this;
    }
    public String getEffectiveEnd() {
        return this.effectiveEnd;
    }

    public CreateAnnouncementRequest setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
        return this;
    }
    public String getEffectiveStart() {
        return this.effectiveStart;
    }

    public CreateAnnouncementRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateAnnouncementRequest setPublishNow(Boolean publishNow) {
        this.publishNow = publishNow;
        return this;
    }
    public Boolean getPublishNow() {
        return this.publishNow;
    }

    public CreateAnnouncementRequest setTargetRoleCodes(java.util.List<String> targetRoleCodes) {
        this.targetRoleCodes = targetRoleCodes;
        return this;
    }
    public java.util.List<String> getTargetRoleCodes() {
        return this.targetRoleCodes;
    }

    public CreateAnnouncementRequest setTargetRoleMode(String targetRoleMode) {
        this.targetRoleMode = targetRoleMode;
        return this;
    }
    public String getTargetRoleMode() {
        return this.targetRoleMode;
    }

    public CreateAnnouncementRequest setTargetTenantIds(java.util.List<Long> targetTenantIds) {
        this.targetTenantIds = targetTenantIds;
        return this;
    }
    public java.util.List<Long> getTargetTenantIds() {
        return this.targetTenantIds;
    }

    public CreateAnnouncementRequest setTargetTenantMode(String targetTenantMode) {
        this.targetTenantMode = targetTenantMode;
        return this;
    }
    public String getTargetTenantMode() {
        return this.targetTenantMode;
    }

    public CreateAnnouncementRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAnnouncementRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
