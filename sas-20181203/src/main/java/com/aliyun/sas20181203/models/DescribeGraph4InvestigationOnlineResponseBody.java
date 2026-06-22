// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeGraph4InvestigationOnlineResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeGraph4InvestigationOnlineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineResponseBody self = new DescribeGraph4InvestigationOnlineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setData(DescribeGraph4InvestigationOnlineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeGraph4InvestigationOnlineResponseBodyData getData() {
        return this.data;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGraph4InvestigationOnlineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList extends TeaModel {
        /**
         * <p>The ID of the end vertex of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>f944c2362c7e111dee16f0e70ad2xxxx</p>
         */
        @NameInMap("EndId")
        public String endId;

        /**
         * <p>The type of the end vertex of the edge. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong>: process</li>
         * <li><strong>file</strong>: file</li>
         * <li><strong>alert</strong>: alert</li>
         * <li><strong>ip</strong>: IP address</li>
         * <li><strong>domain</strong>: domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>process</p>
         */
        @NameInMap("EndType")
        public String endType;

        /**
         * <p>The name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>bash-&gt;apt-get</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the start vertex of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>f944c2362c7e111dee16f0e70ad2xxxx</p>
         */
        @NameInMap("StartId")
        public String startId;

        /**
         * <p>The type of the start vertex of the edge. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong>: process</li>
         * <li><strong>file</strong>: file</li>
         * <li><strong>alert</strong>: alert</li>
         * <li><strong>ip</strong>: IP address</li>
         * <li><strong>domain</strong>: domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("StartType")
        public String startType;

        /**
         * <p>The time when the edge was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-01 15:25:46</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>process_spawn_process</p>
         */
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
        /**
         * <p>The rendering color of the vertex.</p>
         * 
         * <strong>example:</strong>
         * <p>#fff</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon of the vertex.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/tfs/TB176P5OgDqK1RjSZSyXXaxEVXa-49-48.png">https://img.alicdn.com/tfs/TB176P5OgDqK1RjSZSyXXaxEVXa-49-48.png</a></p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The display order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisplayOrder")
        public Integer displayOrder;

        /**
         * <p>The ID of the node type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vertex.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
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

        public DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Integer getDisplayOrder() {
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
        /**
         * <p>The direction of the edge. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: forward</li>
         * <li><strong>0</strong>: reverse.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Directed")
        public Integer directed;

        /**
         * <p>The rendering color of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>#fff</p>
         */
        @NameInMap("DisplayColor")
        public String displayColor;

        /**
         * <p>The icon style of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!6000000007180-55-tps-12-12.svg">https://img.alicdn.com/imgextra/i4/O1CN01ft6rvQ22uUX2JsTmv_!!6000000007180-55-tps-12-12.svg</a></p>
         */
        @NameInMap("DisplayIcon")
        public String displayIcon;

        /**
         * <p>The name of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>spawn process</p>
         */
        @NameInMap("Name")
        public String name;

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

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDisplayColor(String displayColor) {
            this.displayColor = displayColor;
            return this;
        }
        public String getDisplayColor() {
            return this.displayColor;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setDisplayIcon(String displayIcon) {
            this.displayIcon = displayIcon;
            return this;
        }
        public String getDisplayIcon() {
            return this.displayIcon;
        }

        public DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList extends TeaModel {
        /**
         * <p>The number of adjacent nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Indicates whether more adjacent vertices exist.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The type of the neighbor node.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
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
        /**
         * <p>The name of the vertex.</p>
         * 
         * <strong>example:</strong>
         * <p>1a79b3a10ad5e6cad090dd697a7axxxxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of vertices adjacent to the current vertex.</p>
         */
        @NameInMap("NeighborList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataVertexListNeighborList> neighborList;

        /**
         * <p>The properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;DomainName\&quot;: {\&quot;SupportScratchDetection\&quot;: False, \&quot;Description\&quot;: \&quot;The name of the domain.\&quot;, \&quot;Required\&quot;: True, \&quot;UpdateAllowed\&quot;: False, \&quot;Type\&quot;: \&quot;string\&quot;, \&quot;Immutable\&quot;: False}}</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-02 16:14:01</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the vertex.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>5c081b02-f66a-47a4-bd2f-79ee3eafxxxx</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeGraph4InvestigationOnlineResponseBodyDataVertexList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4InvestigationOnlineResponseBodyDataVertexList self = new DescribeGraph4InvestigationOnlineResponseBodyDataVertexList();
            return TeaModel.build(map, self);
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
        /**
         * <p>The list of edges.</p>
         */
        @NameInMap("EdgeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEdgeList> edgeList;

        /**
         * <p>The list of vertex types.</p>
         */
        @NameInMap("EntityTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataEntityTypeList> entityTypeList;

        /**
         * <p>The list of edge types.</p>
         */
        @NameInMap("RelationTypeList")
        public java.util.List<DescribeGraph4InvestigationOnlineResponseBodyDataRelationTypeList> relationTypeList;

        /**
         * <p>The list of vertices.</p>
         */
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
