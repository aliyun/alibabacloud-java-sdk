// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowDAGResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetWorkflowDAGResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkflowDAGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDAGResponseBody self = new GetWorkflowDAGResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDAGResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkflowDAGResponseBody setData(GetWorkflowDAGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowDAGResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowDAGResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowDAGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowDAGResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowDAGResponseBodyDataEdges extends TeaModel {
        /**
         * <p>The task ID of the source node of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Source")
        public Long source;

        /**
         * <p>The task ID of the target node of the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Target")
        public Long target;

        public static GetWorkflowDAGResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGResponseBodyDataEdges self = new GetWorkflowDAGResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGResponseBodyDataEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public GetWorkflowDAGResponseBodyDataEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class GetWorkflowDAGResponseBodyDataNodesCoordinate extends TeaModel {
        /**
         * <p>The height of the node. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The width of the node. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-axis coordinate of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-axis coordinate of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Y")
        public Float y;

        public static GetWorkflowDAGResponseBodyDataNodesCoordinate build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGResponseBodyDataNodesCoordinate self = new GetWorkflowDAGResponseBodyDataNodesCoordinate();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGResponseBodyDataNodesCoordinate setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetWorkflowDAGResponseBodyDataNodesCoordinate setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public GetWorkflowDAGResponseBodyDataNodesCoordinate setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetWorkflowDAGResponseBodyDataNodesCoordinate setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class GetWorkflowDAGResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>oak-payment-async-job</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The coordinate information of the node.</p>
         */
        @NameInMap("Coordinate")
        public GetWorkflowDAGResponseBodyDataNodesCoordinate coordinate;

        /**
         * <p>The dependency policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DependentStrategy")
        public Integer dependentStrategy;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>script_shell</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>job1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetWorkflowDAGResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGResponseBodyDataNodes self = new GetWorkflowDAGResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGResponseBodyDataNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetWorkflowDAGResponseBodyDataNodes setCoordinate(GetWorkflowDAGResponseBodyDataNodesCoordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public GetWorkflowDAGResponseBodyDataNodesCoordinate getCoordinate() {
            return this.coordinate;
        }

        public GetWorkflowDAGResponseBodyDataNodes setDependentStrategy(Integer dependentStrategy) {
            this.dependentStrategy = dependentStrategy;
            return this;
        }
        public Integer getDependentStrategy() {
            return this.dependentStrategy;
        }

        public GetWorkflowDAGResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowDAGResponseBodyDataNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetWorkflowDAGResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowDAGResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowDAGResponseBodyData extends TeaModel {
        /**
         * <p>The list of workflow edges.</p>
         */
        @NameInMap("Edges")
        public java.util.List<GetWorkflowDAGResponseBodyDataEdges> edges;

        /**
         * <p>The returned data type.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetWorkflowDAGResponseBodyDataNodes> nodes;

        public static GetWorkflowDAGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGResponseBodyData self = new GetWorkflowDAGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGResponseBodyData setEdges(java.util.List<GetWorkflowDAGResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetWorkflowDAGResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public GetWorkflowDAGResponseBodyData setNodes(java.util.List<GetWorkflowDAGResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetWorkflowDAGResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
