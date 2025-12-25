// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowDAGPreviewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetWorkflowDAGPreviewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B8733786-C045-59F1-8D79-99A52863F62D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkflowDAGPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowDAGPreviewResponseBody self = new GetWorkflowDAGPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowDAGPreviewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkflowDAGPreviewResponseBody setData(GetWorkflowDAGPreviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowDAGPreviewResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowDAGPreviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowDAGPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowDAGPreviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowDAGPreviewResponseBodyDataEdges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Source")
        public Long source;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Target")
        public Long target;

        public static GetWorkflowDAGPreviewResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGPreviewResponseBodyDataEdges self = new GetWorkflowDAGPreviewResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGPreviewResponseBodyDataEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public GetWorkflowDAGPreviewResponseBodyDataEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Y")
        public Float y;

        public static GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate self = new GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class GetWorkflowDAGPreviewResponseBodyDataNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>settle-job</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Coordinate")
        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate coordinate;

        /**
         * <strong>example:</strong>
         * <p>all_success</p>
         */
        @NameInMap("DependentStrategy")
        public Integer dependentStrategy;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>script_shell</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>job1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetWorkflowDAGPreviewResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGPreviewResponseBodyDataNodes self = new GetWorkflowDAGPreviewResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setCoordinate(GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public GetWorkflowDAGPreviewResponseBodyDataNodesCoordinate getCoordinate() {
            return this.coordinate;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setDependentStrategy(Integer dependentStrategy) {
            this.dependentStrategy = dependentStrategy;
            return this;
        }
        public Integer getDependentStrategy() {
            return this.dependentStrategy;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowDAGPreviewResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowDAGPreviewResponseBodyData extends TeaModel {
        @NameInMap("Edges")
        public java.util.List<GetWorkflowDAGPreviewResponseBodyDataEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<GetWorkflowDAGPreviewResponseBodyDataNodes> nodes;

        public static GetWorkflowDAGPreviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowDAGPreviewResponseBodyData self = new GetWorkflowDAGPreviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowDAGPreviewResponseBodyData setEdges(java.util.List<GetWorkflowDAGPreviewResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetWorkflowDAGPreviewResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public GetWorkflowDAGPreviewResponseBodyData setNodes(java.util.List<GetWorkflowDAGPreviewResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetWorkflowDAGPreviewResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
