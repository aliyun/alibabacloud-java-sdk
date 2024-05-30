// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesResponseBody extends TeaModel {
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
     * <p>The results that are returned.</p>
     */
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
         * <p>The ID of the Alibaba Cloud account to which the edge belongs.</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The ID of the end node for the edge.</p>
         */
        @NameInMap("EndId")
        public String endId;

        /**
         * <p>The type of the end node for the edge. Valid values include but are not limited to:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("EndType")
        public String endType;

        /**
         * <p>The name of the edge.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The original name of the edge.</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The properties of the edge. The value is in the text format.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The property of the edge.</p>
         */
        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <p>The ID of the rule based on which the edge was created.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The display type of the edge.</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The ID of the start node for the edge.</p>
         */
        @NameInMap("StartId")
        public String startId;

        /**
         * <p>The type of the start node for the edge. Valid values include but are not limited to:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <p>The time when the edge was created.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The time when the edge was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the edge.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The type name of the edge.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The time when the edge was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the edge.</p>
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
        /**
         * <p>The version of the entity.</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The display color of the entity.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display icon of the entity.</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display order of the entity.</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The display template of the entity.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the entity was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the entity was updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the entity.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the entity is a virtual node.</p>
         */
        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        /**
         * <p>The name of the entity.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the entity.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The synchronization ID of the entity.</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        /**
         * <p>Indicates whether the entity is traced. Valid values:</p>
         * <br>
         * <p>*   **1**: The entity is traced.</p>
         * <p>*   **0**: The entity fails to be traced.</p>
         */
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
        /**
         * <p>The version of the relationship.</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The display icon of the relationship.</p>
         */
        @NameInMap("DIsplayIcon")
        public String DIsplayIcon;

        /**
         * <p>The direction of the relationship. Valid values:</p>
         * <br>
         * <p>*   **1**: forward.</p>
         * <p>*   **0**: reverse.</p>
         */
        @NameInMap("Directed")
        public Integer directed;

        /**
         * <p>The display color of the relationship.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display template of the relationship.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the relationship was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the relationship was updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the relationship.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the relationship.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the relationship.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The display type of the relationship.</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The synchronization ID of the relationship.</p>
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
        /**
         * <p>The number of neighboring nodes.</p>
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
         * <p>The type of the neighboring node. Valid values include but are not limited to:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
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
         * <p>The ID of the Alibaba Cloud account to which the node belongs.</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The display information of the node.</p>
         */
        @NameInMap("DisplayInfo")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListDisplayInfo> displayInfo;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display language of the neighboring node. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese.</p>
         * <p>*   **en**: English.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The neighboring nodes of the node.</p>
         */
        @NameInMap("NeighborList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesVertexListNeighborList> neighborList;

        /**
         * <p>The properties of the node. The value is in the text format.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The property of the node.</p>
         */
        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <p>The ID of the rule based on which the node was created.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The time when the node was created.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The time when the node was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the node. Valid values include but are not limited to:</p>
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
         * <p>The time when the node was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the node.</p>
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
        /**
         * <p>The edges that are returned.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEdgeList> edgeList;

        /**
         * <p>The entities that are returned.</p>
         */
        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesEntityTypeList> entityTypeList;

        /**
         * <p>The language of the content within the request. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The relationships that are returned.</p>
         */
        @NameInMap("RelationTypeList")
        public java.util.List<QueryIncidentVertexNodesResponseBodyVertexNodesRelationTypeList> relationTypeList;

        /**
         * <p>The information about the node.</p>
         */
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
