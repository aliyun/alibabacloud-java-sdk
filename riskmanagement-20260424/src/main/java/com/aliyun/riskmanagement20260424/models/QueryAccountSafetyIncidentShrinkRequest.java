// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryAccountSafetyIncidentShrinkRequest extends TeaModel {
    /**
     * <p>The list of control action codes.</p>
     */
    @NameInMap("ActionCodes")
    public String actionCodesShrink;

    /**
     * <p>The internationalization language. Default value: zh. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The event name code.</p>
     * 
     * <strong>example:</strong>
     * <p>RISKCONTROL_IMS_IMS_BAN_SUBUSER</p>
     */
    @NameInMap("CaseCode")
    public String caseCode;

    /**
     * <p>The list of event name codes.</p>
     */
    @NameInMap("CaseCodes")
    public String caseCodesShrink;

    /**
     * <p>The current page number. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public String current;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2PTOHhN3YUeaPWzq9FLmpdZ9EOW</p>
     */
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventIds")
    public String eventIdsShrink;

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The control end time.</p>
     * <blockquote>
     * <p>Format: yyyy-MM-dd HH:mm:ss</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishEndTime")
    public String punishEndTime;

    /**
     * <p>The control start time.</p>
     * <blockquote>
     * <p>Format: yyyy-MM-dd HH:mm:ss</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishStartTime")
    public String punishStartTime;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>RES001</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>Executing</strong>: In progress.</li>
     * <li><strong>Removed</strong>: Removed.</li>
     * <li><strong>Alerting</strong>: Alerting.</li>
     * <li><strong>Ended</strong>: Ended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Statuses")
    public String statusesShrink;

    public static QueryAccountSafetyIncidentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSafetyIncidentShrinkRequest self = new QueryAccountSafetyIncidentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountSafetyIncidentShrinkRequest setActionCodesShrink(String actionCodesShrink) {
        this.actionCodesShrink = actionCodesShrink;
        return this;
    }
    public String getActionCodesShrink() {
        return this.actionCodesShrink;
    }

    public QueryAccountSafetyIncidentShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public QueryAccountSafetyIncidentShrinkRequest setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public QueryAccountSafetyIncidentShrinkRequest setCaseCodesShrink(String caseCodesShrink) {
        this.caseCodesShrink = caseCodesShrink;
        return this;
    }
    public String getCaseCodesShrink() {
        return this.caseCodesShrink;
    }

    public QueryAccountSafetyIncidentShrinkRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public QueryAccountSafetyIncidentShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryAccountSafetyIncidentShrinkRequest setEventIdsShrink(String eventIdsShrink) {
        this.eventIdsShrink = eventIdsShrink;
        return this;
    }
    public String getEventIdsShrink() {
        return this.eventIdsShrink;
    }

    public QueryAccountSafetyIncidentShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryAccountSafetyIncidentShrinkRequest setPunishEndTime(String punishEndTime) {
        this.punishEndTime = punishEndTime;
        return this;
    }
    public String getPunishEndTime() {
        return this.punishEndTime;
    }

    public QueryAccountSafetyIncidentShrinkRequest setPunishStartTime(String punishStartTime) {
        this.punishStartTime = punishStartTime;
        return this;
    }
    public String getPunishStartTime() {
        return this.punishStartTime;
    }

    public QueryAccountSafetyIncidentShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryAccountSafetyIncidentShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAccountSafetyIncidentShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
