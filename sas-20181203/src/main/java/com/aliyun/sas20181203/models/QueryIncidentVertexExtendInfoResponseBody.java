// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexExtendInfoResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned extended information about the node.</p>
     */
    @NameInMap("VertexExtendInfo")
    public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo> vertexExtendInfo;

    public static QueryIncidentVertexExtendInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexExtendInfoResponseBody self = new QueryIncidentVertexExtendInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexExtendInfoResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public QueryIncidentVertexExtendInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentVertexExtendInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncidentVertexExtendInfoResponseBody setVertexExtendInfo(java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo> vertexExtendInfo) {
        this.vertexExtendInfo = vertexExtendInfo;
        return this;
    }
    public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo> getVertexExtendInfo() {
        return this.vertexExtendInfo;
    }

    public static class QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo extends TeaModel {
        /**
         * <p>The display name of the property.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display value of the property.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo self = new QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicates whether more neighboring nodes exist. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The node type. Valid values include but are not limited to:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList self = new QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty extends TeaModel {
        /**
         * <p>The alert description.</p>
         */
        @NameInMap("AlertDesc")
        public String alertDesc;

        /**
         * <p>The details of the alert.</p>
         */
        @NameInMap("AlertDetail")
        public String alertDetail;

        /**
         * <p>The alert level. Valid values:</p>
         * <br>
         * <p>*   **serious**</p>
         * <p>*   **suspicious**</p>
         * <p>*   **remind**</p>
         */
        @NameInMap("AlertLevel")
        public String alertLevel;

        /**
         * <p>The alert name.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The code of the alert name.</p>
         */
        @NameInMap("AlertNameCode")
        public String alertNameCode;

        /**
         * <p>The alert name. The value is in English.</p>
         */
        @NameInMap("AlertNameEn")
        public String alertNameEn;

        /**
         * <p>The service that generates the alert.</p>
         */
        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        /**
         * <p>The module of the service that generates the alert.</p>
         */
        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        /**
         * <p>The alert title.</p>
         */
        @NameInMap("AlertTitle")
        public String alertTitle;

        /**
         * <p>The alert type.</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The code of the alert type.</p>
         */
        @NameInMap("AlertTypeCode")
        public String alertTypeCode;

        /**
         * <p>The alert type. The value is in English.</p>
         */
        @NameInMap("AlertTypeEn")
        public String alertTypeEn;

        /**
         * <p>The alert ID.</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The assets.</p>
         */
        @NameInMap("AssetList")
        public String assetList;

        /**
         * <p>ATT\\&CK</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>The code of the cloud service provider.</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The instance.</p>
         */
        @NameInMap("EntityList")
        public String entityList;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The time when the log was generated.</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The log ID.</p>
         */
        @NameInMap("LogUuid")
        public String logUuid;

        /**
         * <p>The ID of the master account.</p>
         */
        @NameInMap("MainUserId")
        public String mainUserId;

        /**
         * <p>The time when the alert was generated.</p>
         */
        @NameInMap("OccurTime")
        public String occurTime;

        /**
         * <p>The ID of the sub-account.</p>
         */
        @NameInMap("SubUserId")
        public String subUserId;

        public static QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty self = new QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertNameCode(String alertNameCode) {
            this.alertNameCode = alertNameCode;
            return this;
        }
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertNameEn(String alertNameEn) {
            this.alertNameEn = alertNameEn;
            return this;
        }
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertTypeCode(String alertTypeCode) {
            this.alertTypeCode = alertTypeCode;
            return this;
        }
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertTypeEn(String alertTypeEn) {
            this.alertTypeEn = alertTypeEn;
            return this;
        }
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAssetList(String assetList) {
            this.assetList = assetList;
            return this;
        }
        public String getAssetList() {
            return this.assetList;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setEntityList(String entityList) {
            this.entityList = entityList;
            return this;
        }
        public String getEntityList() {
            return this.entityList;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setLogUuid(String logUuid) {
            this.logUuid = logUuid;
            return this;
        }
        public String getLogUuid() {
            return this.logUuid;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setMainUserId(String mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public String getMainUserId() {
            return this.mainUserId;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setOccurTime(String occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public String getOccurTime() {
            return this.occurTime;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

    }

    public static class QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The display information.</p>
         */
        @NameInMap("DisplayInfo")
        public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo> displayInfo;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The node name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The neighboring nodes.</p>
         */
        @NameInMap("NeighborList")
        public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList> neighborList;

        /**
         * <p>The node properties. The value is in the text format.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The node property.</p>
         */
        @NameInMap("Property")
        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty property;

        /**
         * <p>The ID of the rule for which the node was created.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The time when the node was created.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The UNIX timestamp when the node was created. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The node type. Valid values include but are not limited to:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The node UUID.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo self = new QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setDisplayInfo(java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setNeighborList(java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setProperty(QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty property) {
            this.property = property;
            return this;
        }
        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfoProperty getProperty() {
            return this.property;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryIncidentVertexExtendInfoResponseBodyVertexExtendInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
