// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceInfoDetail")
    public DescribeTraceInfoDetailResponseBodyTraceInfoDetail traceInfoDetail;

    public static DescribeTraceInfoDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoDetailResponseBody self = new DescribeTraceInfoDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTraceInfoDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTraceInfoDetailResponseBody setTraceInfoDetail(DescribeTraceInfoDetailResponseBodyTraceInfoDetail traceInfoDetail) {
        this.traceInfoDetail = traceInfoDetail;
        return this;
    }
    public DescribeTraceInfoDetailResponseBodyTraceInfoDetail getTraceInfoDetail() {
        return this.traceInfoDetail;
    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("EndId")
        public String endId;

        @NameInMap("StartId")
        public String startId;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList setEndId(String endId) {
            this.endId = endId;
            return this;
        }
        public String getEndId() {
            return this.endId;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList setStartId(String startId) {
            this.startId = startId;
            return this;
        }
        public String getStartId() {
            return this.startId;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList extends TeaModel {
        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("DisplayIcon")
        public String displayIcon;

        @NameInMap("DisplayTemplate")
        public String displayTemplate;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Offset")
        public Integer offset;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setDisplayTemplate(String displayTemplate) {
            this.displayTemplate = displayTemplate;
            return this;
        }
        public String getDisplayTemplate() {
            return this.displayTemplate;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList extends TeaModel {
        @NameInMap("Directed")
        public Integer directed;

        @NameInMap("DisplayColor")
        public String displayColor;

        @NameInMap("Name")
        public String name;

        @NameInMap("RelationTypeId")
        public String relationTypeId;

        @NameInMap("ShowType")
        public String showType;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList setDirected(Integer directed) {
            this.directed = directed;
            return this;
        }
        public Integer getDirected() {
            return this.directed;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList setRelationTypeId(String relationTypeId) {
            this.relationTypeId = relationTypeId;
            return this;
        }
        public String getRelationTypeId() {
            return this.relationTypeId;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList setShowType(String showType) {
            this.showType = showType;
            return this;
        }
        public String getShowType() {
            return this.showType;
        }

    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Type")
        public String type;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeighborList")
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList> neighborList;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setNeighborList(java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList> neighborList) {
            this.neighborList = neighborList;
            return this;
        }
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexListNeighborList> getNeighborList() {
            return this.neighborList;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTraceInfoDetailResponseBodyTraceInfoDetail extends TeaModel {
        @NameInMap("EdgeList")
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList> edgeList;

        @NameInMap("EntityTypeList")
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList> entityTypeList;

        @NameInMap("RelationTypeList")
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList> relationTypeList;

        @NameInMap("VertexList")
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList> vertexList;

        public static DescribeTraceInfoDetailResponseBodyTraceInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceInfoDetailResponseBodyTraceInfoDetail self = new DescribeTraceInfoDetailResponseBodyTraceInfoDetail();
            return TeaModel.build(map, self);
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetail setEdgeList(java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList> edgeList) {
            this.edgeList = edgeList;
            return this;
        }
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEdgeList> getEdgeList() {
            return this.edgeList;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetail setEntityTypeList(java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList> entityTypeList) {
            this.entityTypeList = entityTypeList;
            return this;
        }
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailEntityTypeList> getEntityTypeList() {
            return this.entityTypeList;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetail setRelationTypeList(java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList> relationTypeList) {
            this.relationTypeList = relationTypeList;
            return this;
        }
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailRelationTypeList> getRelationTypeList() {
            return this.relationTypeList;
        }

        public DescribeTraceInfoDetailResponseBodyTraceInfoDetail setVertexList(java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList> vertexList) {
            this.vertexList = vertexList;
            return this;
        }
        public java.util.List<DescribeTraceInfoDetailResponseBodyTraceInfoDetailVertexList> getVertexList() {
            return this.vertexList;
        }

    }

}
