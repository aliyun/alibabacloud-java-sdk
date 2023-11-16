// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TracingDetail")
    public QueryIncidentTracingDetailResponseBodyTracingDetail tracingDetail;

    public static QueryIncidentTracingDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingDetailResponseBody self = new QueryIncidentTracingDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentTracingDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncidentTracingDetailResponseBody setTracingDetail(QueryIncidentTracingDetailResponseBodyTracingDetail tracingDetail) {
        this.tracingDetail = tracingDetail;
        return this;
    }
    public QueryIncidentTracingDetailResponseBodyTracingDetail getTracingDetail() {
        return this.tracingDetail;
    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList extends TeaModel {
        /**
         * <p>AliUid</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("EndId")
        public String endId;

        @NameInMap("EndType")
        public String endType;

        @NameInMap("Name")
        public String name;

        /**
         * <p>Origin</p>
         */
        @NameInMap("Origin")
        public String origin;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ShowType")
        public String showType;

        @NameInMap("StartId")
        public String startId;

        @NameInMap("StartType")
        public String startType;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>UUID</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList self = new QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        @NameInMap("Name")
        public String name;

        /**
         * <p>namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>SyncId</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        @NameInMap("TraceSuccessFlag")
        public Integer traceSuccessFlag;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList self = new QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setIsVirtualNode(Integer isVirtualNode) {
            this.isVirtualNode = isVirtualNode;
            return this;
        }
        public Integer getIsVirtualNode() {
            return this.isVirtualNode;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList setTraceSuccessFlag(Integer traceSuccessFlag) {
            this.traceSuccessFlag = traceSuccessFlag;
            return this;
        }
        public Integer getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        @NameInMap("Directed")
        public Integer directed;

        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>ICON</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>SyncID</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList self = new QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo self = new QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList self = new QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetailVertexList extends TeaModel {
        /**
         * <p>aliuid</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList> neighborList;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Time")
        public String time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>UUID</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static QueryIncidentTracingDetailResponseBodyTracingDetailVertexList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetailVertexList self = new QueryIncidentTracingDetailResponseBodyTracingDetailVertexList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setDisplayInfo(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setNeighborList(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetailVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryIncidentTracingDetailResponseBodyTracingDetail extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList> entityTypeList;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("RelationTypeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexList> vertexList;

        public static QueryIncidentTracingDetailResponseBodyTracingDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentTracingDetailResponseBodyTracingDetail self = new QueryIncidentTracingDetailResponseBodyTracingDetail();
            return TeaModel.build(map, self);
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetail setEdgeList(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetail setEntityTypeList(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetail setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetail setRelationTypeList(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public QueryIncidentTracingDetailResponseBodyTracingDetail setVertexList(java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
