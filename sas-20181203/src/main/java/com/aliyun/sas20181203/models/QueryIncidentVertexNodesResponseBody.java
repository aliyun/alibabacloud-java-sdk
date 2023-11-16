// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VertexNodes")
    public QueryIncidentVertexNodesResponseBodyVertexNodes vertexNodes;

    public static QueryIncidentVertexNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexNodesResponseBody self = new QueryIncidentVertexNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIncidentVertexNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIncidentVertexNodesResponseBody setVertexNodes(QueryIncidentVertexNodesResponseBodyVertexNodes vertexNodes) {
        this.vertexNodes = vertexNodes;
        return this;
    }
    public QueryIncidentVertexNodesResponseBodyVertexNodes getVertexNodes() {
        return this.vertexNodes;
    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList extends TeaModel {
        /**
         * <p>Aliuid</p>
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

        public static QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList self = new QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList extends TeaModel {
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

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>SyncId</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        @NameInMap("TraceSuccessFlag")
        public Integer traceSuccessFlag;

        public static QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList self = new QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setIsVirtualNode(Integer isVirtualNode) {
            this.isVirtualNode = isVirtualNode;
            return this;
        }
        public Integer getIsVirtualNode() {
            return this.isVirtualNode;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList setTraceSuccessFlag(Integer traceSuccessFlag) {
            this.traceSuccessFlag = traceSuccessFlag;
            return this;
        }
        public Integer getTraceSuccessFlag() {
            return this.traceSuccessFlag;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList extends TeaModel {
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>ICON</p>
         */
        @NameInMap("DIsplayIcon")
        public String DIsplayIcon;

        @NameInMap("Directed")
        public Integer directed;

        @NameInMap("DisplayColor")
        public String displayColor;

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
         * <p>SyncId</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        public static QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList self = new QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setCurrentVersionId(String currentVersionId) {
            this.currentVersionId = currentVersionId;
            return this;
        }
        public String getCurrentVersionId() {
            return this.currentVersionId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setDIsplayIcon(String DIsplayIcon) {
            this.DIsplayIcon = DIsplayIcon;
            return this;
        }
        public String getDIsplayIcon() {
            return this.DIsplayIcon;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList setSyncId(Integer syncId) {
            this.syncId = syncId;
            return this;
        }
        public Integer getSyncId() {
            return this.syncId;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo self = new QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList self = new QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodesVertexList extends TeaModel {
        /**
         * <p>AliUid</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("DisplayInfo")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo> displayInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList> neighborList;

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

        public static QueryIncidentVertexNodesResponseBodyVertexNodesVertexList build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodesVertexList self = new QueryIncidentVertexNodesResponseBodyVertexNodesVertexList();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setDisplayInfo(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo> displayInfo) {
            this.displayInfo = displayInfo;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setNeighborList(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setProperty(java.util.Map<String, ?> property) {
            this.property = property;
            return this;
        }
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodesVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryIncidentVertexNodesResponseBodyVertexNodes extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList> entityTypeList;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("RelationTypeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexList> vertexList;

        public static QueryIncidentVertexNodesResponseBodyVertexNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryIncidentVertexNodesResponseBodyVertexNodes self = new QueryIncidentVertexNodesResponseBodyVertexNodes();
            return TeaModel.build(map, self);
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodes setEdgeList(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodes setEntityTypeList(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodes setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodes setRelationTypeList(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public QueryIncidentVertexNodesResponseBodyVertexNodes setVertexList(java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
