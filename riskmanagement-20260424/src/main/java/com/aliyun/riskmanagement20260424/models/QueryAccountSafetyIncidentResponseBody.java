// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryAccountSafetyIncidentResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>200: The request was successful. Other values (such as 500 or 400): An error occurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryAccountSafetyIncidentResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountSafetyIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSafetyIncidentResponseBody self = new QueryAccountSafetyIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountSafetyIncidentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountSafetyIncidentResponseBody setData(QueryAccountSafetyIncidentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountSafetyIncidentResponseBodyData getData() {
        return this.data;
    }

    public QueryAccountSafetyIncidentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountSafetyIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountSafetyIncidentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountSafetyIncidentResponseBodyDataListDateExtras extends TeaModel {
        /**
         * <p>The time when the alert ended.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertEndTime")
        public String alertEndTime;

        /**
         * <p>The time when the first alert was triggered.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AlertStartTime")
        public String alertStartTime;

        /**
         * <p>The time of the latest detection.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        public static QueryAccountSafetyIncidentResponseBodyDataListDateExtras build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountSafetyIncidentResponseBodyDataListDateExtras self = new QueryAccountSafetyIncidentResponseBodyDataListDateExtras();
            return TeaModel.build(map, self);
        }

        public QueryAccountSafetyIncidentResponseBodyDataListDateExtras setAlertEndTime(String alertEndTime) {
            this.alertEndTime = alertEndTime;
            return this;
        }
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        public QueryAccountSafetyIncidentResponseBodyDataListDateExtras setAlertStartTime(String alertStartTime) {
            this.alertStartTime = alertStartTime;
            return this;
        }
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        public QueryAccountSafetyIncidentResponseBodyDataListDateExtras setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

    }

    public static class QueryAccountSafetyIncidentResponseBodyDataList extends TeaModel {
        /**
         * <p>The control action name code.</p>
         * 
         * <strong>example:</strong>
         * <p>success_service</p>
         */
        @NameInMap("ActionCode")
        public String actionCode;

        /**
         * <p>The control action name.</p>
         * 
         * <strong>example:</strong>
         * <p>Penalty executed successfully.</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <p>The time when the control action was removed.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("AntiPunishTime")
        public String antiPunishTime;

        /**
         * <p>The control action time information.</p>
         */
        @NameInMap("DateExtras")
        public QueryAccountSafetyIncidentResponseBodyDataListDateExtras dateExtras;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ba4065e0b2206c05f86d5eaa00ae520</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event impact.</p>
         * 
         * <strong>example:</strong>
         * <p>ak leak.</p>
         */
        @NameInMap("EventImpact")
        public String eventImpact;

        /**
         * <p>The control event name.</p>
         * 
         * <strong>example:</strong>
         * <p>ak leak.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The event reason.</p>
         * 
         * <strong>example:</strong>
         * <p>ak leak.</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <p>The start time of the control action.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        @NameInMap("PunishTime")
        public String punishTime;

        /**
         * <p>The hardening suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>suggestion</p>
         */
        @NameInMap("Reinforcement")
        public String reinforcement;

        /**
         * <p>The cloud resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zeanc2b2vgfpbvp60cs</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The control object type.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

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

        /**
         * <p>The handling suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>suggestion</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>The help topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>help</p>
         */
        @NameInMap("UserGuideName")
        public String userGuideName;

        /**
         * <p>The help topic URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyun.com/">https://xxx.aliyun.com/</a></p>
         */
        @NameInMap("UserGuideUrl")
        public String userGuideUrl;

        public static QueryAccountSafetyIncidentResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountSafetyIncidentResponseBodyDataList self = new QueryAccountSafetyIncidentResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setAntiPunishTime(String antiPunishTime) {
            this.antiPunishTime = antiPunishTime;
            return this;
        }
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setDateExtras(QueryAccountSafetyIncidentResponseBodyDataListDateExtras dateExtras) {
            this.dateExtras = dateExtras;
            return this;
        }
        public QueryAccountSafetyIncidentResponseBodyDataListDateExtras getDateExtras() {
            return this.dateExtras;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setEventImpact(String eventImpact) {
            this.eventImpact = eventImpact;
            return this;
        }
        public String getEventImpact() {
            return this.eventImpact;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setPunishTime(String punishTime) {
            this.punishTime = punishTime;
            return this;
        }
        public String getPunishTime() {
            return this.punishTime;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setReinforcement(String reinforcement) {
            this.reinforcement = reinforcement;
            return this;
        }
        public String getReinforcement() {
            return this.reinforcement;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setUserGuideName(String userGuideName) {
            this.userGuideName = userGuideName;
            return this;
        }
        public String getUserGuideName() {
            return this.userGuideName;
        }

        public QueryAccountSafetyIncidentResponseBodyDataList setUserGuideUrl(String userGuideUrl) {
            this.userGuideUrl = userGuideUrl;
            return this;
        }
        public String getUserGuideUrl() {
            return this.userGuideUrl;
        }

    }

    public static class QueryAccountSafetyIncidentResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>The number of assets displayed per page when you perform a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public String total;

        public static QueryAccountSafetyIncidentResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountSafetyIncidentResponseBodyDataPageInfo self = new QueryAccountSafetyIncidentResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountSafetyIncidentResponseBodyDataPageInfo setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public QueryAccountSafetyIncidentResponseBodyDataPageInfo setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryAccountSafetyIncidentResponseBodyDataPageInfo setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

    public static class QueryAccountSafetyIncidentResponseBodyData extends TeaModel {
        /**
         * <p>The event data.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryAccountSafetyIncidentResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public QueryAccountSafetyIncidentResponseBodyDataPageInfo pageInfo;

        public static QueryAccountSafetyIncidentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountSafetyIncidentResponseBodyData self = new QueryAccountSafetyIncidentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountSafetyIncidentResponseBodyData setList(java.util.List<QueryAccountSafetyIncidentResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAccountSafetyIncidentResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryAccountSafetyIncidentResponseBodyData setPageInfo(QueryAccountSafetyIncidentResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public QueryAccountSafetyIncidentResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
