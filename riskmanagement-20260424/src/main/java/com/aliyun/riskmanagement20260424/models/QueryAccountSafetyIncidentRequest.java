// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryAccountSafetyIncidentRequest extends TeaModel {
    /**
     * <p>The language. Default value: zh.</p>
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

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The end time of the control action.</p>
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
     * <p>The start time of the control action.</p>
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

    public static QueryAccountSafetyIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSafetyIncidentRequest self = new QueryAccountSafetyIncidentRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountSafetyIncidentRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public QueryAccountSafetyIncidentRequest setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public QueryAccountSafetyIncidentRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public QueryAccountSafetyIncidentRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryAccountSafetyIncidentRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryAccountSafetyIncidentRequest setPunishEndTime(String punishEndTime) {
        this.punishEndTime = punishEndTime;
        return this;
    }
    public String getPunishEndTime() {
        return this.punishEndTime;
    }

    public QueryAccountSafetyIncidentRequest setPunishStartTime(String punishStartTime) {
        this.punishStartTime = punishStartTime;
        return this;
    }
    public String getPunishStartTime() {
        return this.punishStartTime;
    }

    public QueryAccountSafetyIncidentRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryAccountSafetyIncidentRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
