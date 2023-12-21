// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingDetailResponseBody extends TeaModel {
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
     * <p>The information about the provenance graph.</p>
     */
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
         * <p>The ID of the Alibaba Cloud account to which the current edge belongs.</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The ID of the end node for the current edge.</p>
         */
        @NameInMap("EndId")
        public String endId;

        /**
         * <p>The type of the end node for the current edge. Valid values include the following values:</p>
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
         * <p>The name of the current edge.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The origin vertex ID of the current edge.</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The text that contains the properties of the current edge.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The property of the current edge.</p>
         */
        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <p>The ID of the rule based on which the current edge is generated.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The display type of the current edge.</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The ID of the start node for the current edge.</p>
         */
        @NameInMap("StartId")
        public String startId;

        /**
         * <p>The type of the start node for the current edge. Valid values include the following values:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**:</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <p>The time when the current edge was created.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The UNIX timestamp when the current edge was created. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the current edge. Valid values include the following values:</p>
         * <br>
         * <p>*   **process_exec_file**: The relationship indicates an executable file that is run by a process.</p>
         * <p>*   **process_connect_ip**: The relationship indicates an IP address that is connected by a process.</p>
         * <p>*   **domain_trgger_alert**: The relationship indicates an alert that is triggered for a domain name.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The type of the current edge.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The time when the current edge was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the current edge. The SIEM system generates UUIDs for nodes and edges in the provenance graph to help you locate the nodes or edges.</p>
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
        /**
         * <p>The version ID of the current entity.</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The display color of the current entity.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display icon of the current entity.</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display sequence of the current entity.</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The display template of the current entity.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the current entity was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the current entity was updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the current entity.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the entity is a virtual node. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        /**
         * <p>The type of the current entity. Valid values include the following values:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the current entity.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The synchronization ID of the current entity.</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        /**
         * <p>The tag that indicates whether tracing was successful. Valid values:</p>
         * <br>
         * <p>*   **1**: successful</p>
         * <p>*   **0**: failed</p>
         */
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
        /**
         * <p>The version ID of the current relationship.</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The direction of the current relationship. Valid values:</p>
         * <br>
         * <p>*   **1**: forward</p>
         * <p>*   **0**: reverse</p>
         */
        @NameInMap("Directed")
        public Integer directed;

        /**
         * <p>The display color of the current relationship.</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display icon of the current relationship.</p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display template of the current relationship.</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the current relationship was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the current relationship was updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the current relationship.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the current relationship. Valid values include the following values:</p>
         * <br>
         * <p>*   **process_exec_file**: The relationship indicates an executable file that is run by a process.</p>
         * <p>*   **process_connect_ip**: The relationship indicates an IP address that is connected by a process.</p>
         * <p>*   **domain_trgger_alert**: The relationship indicates an alert that is triggered for a domain name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the current relationship.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The display type of the current relationship.</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The synchronization ID of the current relationship.</p>
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
        /**
         * <p>The name of the property that needs to be displayed for the current node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the property that needs to be displayed for the current node.</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicates whether more nodes are adjacent to the current node. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The type of the node. Valid values include the following values:</p>
         * <br>
         * <p>*   **process**</p>
         * <p>*   **file**</p>
         * <p>*   **alert**</p>
         * <p>*   **ip**</p>
         * <p>*   **domain**</p>
         */
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
         * <p>The ID of the Alibaba Cloud account to which the current node belongs.</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The display information of the current node.</p>
         */
        @NameInMap("DisplayInfo")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListDisplayInfo> displayInfo;

        /**
         * <p>The ID of the current node.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The rendering language of the current node.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The name of the current node.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The nodes that are adjacent to the current node.</p>
         */
        @NameInMap("NeighborList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailVertexListNeighborList> neighborList;

        /**
         * <p>The text that contains the properties of the current node.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The property of the current node.</p>
         */
        @NameInMap("Property")
        public java.util.Map<String, ?> property;

        /**
         * <p>The ID of the rule based on which the current node is generated.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The time when the current node was created.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The UNIX timestamp when the current node was created. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the current node. Valid values include the following values:</p>
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
         * <p>The time when the current node was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the current node. The security information and event management (SIEM) system generates UUIDs for nodes and edges in the provenance graph to help you locate the nodes or edges.</p>
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
        /**
         * <p>The edges.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEdgeList> edgeList;

        /**
         * <p>The entities.</p>
         */
        @NameInMap("EntityTypeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailEntityTypeList> entityTypeList;

        /**
         * <p>The rendering language of the returned result. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The relationships.</p>
         */
        @NameInMap("RelationTypeList")
        public java.util.List<QueryIncidentTracingDetailResponseBodyTracingDetailRelationTypeList> relationTypeList;

        /**
         * <p>The nodes.</p>
         */
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
