// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowExecutionDAGResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetWorkflowExecutionDAGResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter format error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkflowExecutionDAGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowExecutionDAGResponseBody self = new GetWorkflowExecutionDAGResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowExecutionDAGResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkflowExecutionDAGResponseBody setData(GetWorkflowExecutionDAGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowExecutionDAGResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowExecutionDAGResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowExecutionDAGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowExecutionDAGResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowExecutionDAGResponseBodyDataEdges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Target")
        public String target;

        public static GetWorkflowExecutionDAGResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowExecutionDAGResponseBodyDataEdges self = new GetWorkflowExecutionDAGResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public GetWorkflowExecutionDAGResponseBodyDataEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetWorkflowExecutionDAGResponseBodyDataEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate extends TeaModel {
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

        public static GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate self = new GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate();
            return TeaModel.build(map, self);
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class GetWorkflowExecutionDAGResponseBodyDataNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cua-xxl-job-executor</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Coordinate")
        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate coordinate;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>7491777526619542799</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("JobId")
        public Long jobId;

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
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetWorkflowExecutionDAGResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowExecutionDAGResponseBodyDataNodes self = new GetWorkflowExecutionDAGResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setCoordinate(GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public GetWorkflowExecutionDAGResponseBodyDataNodesCoordinate getCoordinate() {
            return this.coordinate;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowExecutionDAGResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowExecutionDAGResponseBodyData extends TeaModel {
        @NameInMap("Edges")
        public java.util.List<GetWorkflowExecutionDAGResponseBodyDataEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<GetWorkflowExecutionDAGResponseBodyDataNodes> nodes;

        public static GetWorkflowExecutionDAGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowExecutionDAGResponseBodyData self = new GetWorkflowExecutionDAGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowExecutionDAGResponseBodyData setEdges(java.util.List<GetWorkflowExecutionDAGResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetWorkflowExecutionDAGResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public GetWorkflowExecutionDAGResponseBodyData setNodes(java.util.List<GetWorkflowExecutionDAGResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetWorkflowExecutionDAGResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
