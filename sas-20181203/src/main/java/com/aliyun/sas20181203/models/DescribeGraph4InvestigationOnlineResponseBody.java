// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeGraph4InvestigationOnlineResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGraph4InvestigationOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineResponseBody self = new DescribeGraph4InvestigationOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineResponseBody setData(DescribeGraph4InvestigationOnlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGraph4InvestigationOnlineResponseBodyData getData() {
        return this.data;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList extends TeaModel {
        @NameInMap("EndId")
        public String endId;

        @NameInMap("EndType")
        public String endType;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartId")
        public String startId;

        @NameInMap("StartType")
        public String startType;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setEndType(String endType) {
            this.endType = endType;
            return this;
        }
        public String getEndType() {
            return this.endType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setStartType(String startType) {
            this.startType = startType;
            return this;
        }
        public String getStartType() {
            return this.startType;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList extends TeaModel {
        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayOrder")
        public String displayOrder;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayOrder(String displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public String getDisplayOrder() {
            return this.displayOrder;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList extends TeaModel {
        @NameInMap("Directed")
        public Integer directed;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShowType")
        public String showType;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList self = new DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexList extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> neighborList;

        @NameInMap("Position")
        public String position;

        @NameInMap("PositionId")
        public String positionId;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexList self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setNeighborList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setPositionId(String positionId) {
            this.positionId = positionId;
            return this;
        }
        public String getPositionId() {
            return this.positionId;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataVertexList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyData extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> entityTypeList;

        @NameInMap("RelationTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> vertexList;

        public static DescribeGraph4InvestigationOnlineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyData self = new DescribeGraph4InvestigationOnlineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setEdgeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setEntityTypeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setRelationTypeList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyData setVertexList(java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
