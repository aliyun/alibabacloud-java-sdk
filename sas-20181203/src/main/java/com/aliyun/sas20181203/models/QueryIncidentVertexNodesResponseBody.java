// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ACF97412-FD09-4D1F-994F-34DF12BREF20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>20973951</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The ID of the end node for the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>64002</p>
         */
        @NameInMap("EndId")
        public String endId;

        /**
         * <p>The type of the end node for the edge. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>alert</strong></li>
         * <li><strong>ip</strong></li>
         * <li><strong>domain</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("EndType")
        public String endType;

        /**
         * <p>The name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>jdk</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The original name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>distribution</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The properties of the edge. The value is in the text format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;bandWidth\&quot;:\&quot;7810048\&quot;,\&quot;internetIp\&quot;:\&quot;47.57.13.255\&quot;,\&quot;changeReason\&quot;:\&quot;MODIFY_SPEC\&quot;,\&quot;bindInstanceId\&quot;:\&quot;i-j6chvo01tle7qfnhewr3\&quot;,\&quot;bindType\&quot;:\&quot;EIP_ECS\&quot;}</p>
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
         * 
         * <strong>example:</strong>
         * <p>368</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The display type of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The ID of the start node for the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>52003</p>
         */
        @NameInMap("StartId")
        public String startId;

        /**
         * <p>The type of the start node for the edge. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>alert</strong></li>
         * <li><strong>ip</strong></li>
         * <li><strong>domain</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>process</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <p>The time when the edge was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-06 11:00:00</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The time when the edge was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1645168444</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The type name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        /**
         * <p>The time when the edge was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-16T07:20:33.000Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>549237d6-86d1-47f6-9ffa-3f97da9e6b10</p>
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
         * 
         * <strong>example:</strong>
         * <p>993</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The display color of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display icon of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.22222.com">http://img.22222.com</a></p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display order of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The display template of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the entity was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-23T10:50Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the entity was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1623317089000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>33926</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the entity is a virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVirtualNode")
        public Integer isVirtualNode;

        /**
         * <p>The name of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-test-policy-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The synchronization ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>3212024a-1816-46d5-b286-e5d5780fd778</p>
         */
        @NameInMap("SyncId")
        public Integer syncId;

        /**
         * <p>Indicates whether the entity is traced. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The entity is traced.</li>
         * <li><strong>0</strong>: The entity fails to be traced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1487</p>
         */
        @NameInMap("CurrentVersionId")
        public String currentVersionId;

        /**
         * <p>The display icon of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.33.com">http://img.33.com</a></p>
         */
        @NameInMap("DIsplayIcon")
        public String DIsplayIcon;

        /**
         * <p>The direction of the relationship. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: forward.</li>
         * <li><strong>0</strong>: reverse.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Directed")
        public Integer directed;

        /**
         * <p>The display color of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>red</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The display template of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        /**
         * <p>The time when the relationship was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02T10:20Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the relationship was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1637556498000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>9350</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>mongod</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The display type of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>type1</p>
         */
        @NameInMap("ShowType")
        public String showType;

        /**
         * <p>The synchronization ID of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>a45185c7-b1b8-4a49-b04a-d6bfa051ef0e</p>
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
         * 
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display value of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-nacos</p>
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
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicates whether more neighboring nodes exist. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The type of the neighboring node. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>alert</strong></li>
         * <li><strong>ip</strong></li>
         * <li><strong>domain</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>elf</p>
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
         * 
         * <strong>example:</strong>
         * <p>20973951</p>
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
         * 
         * <strong>example:</strong>
         * <p>225</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The display language of the neighboring node. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>zabbix</p>
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
         * 
         * <strong>example:</strong>
         * <p>{\&quot;bandWidth\&quot;:\&quot;5120\&quot;,\&quot;internetIp\&quot;:\&quot;47.242.191.206\&quot;,\&quot;changeReason\&quot;:\&quot;EIP_BIND\&quot;,\&quot;bindInstanceId\&quot;:\&quot;eci-j6ci7lvci50rore7dkv8\&quot;,\&quot;bindType\&quot;:\&quot;EIP_ECS\&quot;}</p>
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
         * 
         * <strong>example:</strong>
         * <p>171</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1636081135</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The time when the node was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1645179073</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The type of the node. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>alert</strong></li>
         * <li><strong>ip</strong></li>
         * <li><strong>domain</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sys</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the node was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-16T07:20:33.000Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UUID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>02ca8614-ecdb-44d3-b3d0-158655080e4f</p>
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
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
