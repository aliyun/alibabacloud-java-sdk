// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetWorkFlowResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data of the workflow.</p>
     */
    @NameInMap("Data")
    public GetWorkFlowResponseBodyData data;

    /**
     * <p>The error message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the API call.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkFlowResponseBody self = new GetWorkFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkFlowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkFlowResponseBody setData(GetWorkFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkFlowResponseBodyData getData() {
        return this.data;
    }

    public GetWorkFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkFlowResponseBodyDataWorkFlowInfo extends TeaModel {
        /**
         * <p>The description of the workflow.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the workflow.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time expression of the workflow.</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The time type of the workflow.</p>
         */
        @NameInMap("TimeType")
        public String timeType;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetWorkFlowResponseBodyDataWorkFlowInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWorkFlowResponseBodyDataWorkFlowInfo self = new GetWorkFlowResponseBodyDataWorkFlowInfo();
            return TeaModel.build(map, self);
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public GetWorkFlowResponseBodyDataWorkFlowInfo setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges extends TeaModel {
        /**
         * <p>The ID of the source job.</p>
         */
        @NameInMap("Source")
        public Long source;

        /**
         * <p>The ID of the target job.</p>
         */
        @NameInMap("Target")
        public Long target;

        public static GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges build(java.util.Map<String, ?> map) throws Exception {
            GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges self = new GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges();
            return TeaModel.build(map, self);
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes extends TeaModel {
        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the job.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The status of the job.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes self = new GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes();
            return TeaModel.build(map, self);
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetWorkFlowResponseBodyDataWorkFlowNodeInfo extends TeaModel {
        /**
         * <p>The workflow edges.</p>
         */
        @NameInMap("Edges")
        public java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges> edges;

        /**
         * <p>The list of workflow nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes> nodes;

        public static GetWorkFlowResponseBodyDataWorkFlowNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWorkFlowResponseBodyDataWorkFlowNodeInfo self = new GetWorkFlowResponseBodyDataWorkFlowNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfo setEdges(java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoEdges> getEdges() {
            return this.edges;
        }

        public GetWorkFlowResponseBodyDataWorkFlowNodeInfo setNodes(java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetWorkFlowResponseBodyDataWorkFlowNodeInfoNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class GetWorkFlowResponseBodyData extends TeaModel {
        /**
         * <p>The basic information of the workflow.</p>
         */
        @NameInMap("WorkFlowInfo")
        public GetWorkFlowResponseBodyDataWorkFlowInfo workFlowInfo;

        /**
         * <p>The node information of the workflow.</p>
         */
        @NameInMap("WorkFlowNodeInfo")
        public GetWorkFlowResponseBodyDataWorkFlowNodeInfo workFlowNodeInfo;

        public static GetWorkFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkFlowResponseBodyData self = new GetWorkFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkFlowResponseBodyData setWorkFlowInfo(GetWorkFlowResponseBodyDataWorkFlowInfo workFlowInfo) {
            this.workFlowInfo = workFlowInfo;
            return this;
        }
        public GetWorkFlowResponseBodyDataWorkFlowInfo getWorkFlowInfo() {
            return this.workFlowInfo;
        }

        public GetWorkFlowResponseBodyData setWorkFlowNodeInfo(GetWorkFlowResponseBodyDataWorkFlowNodeInfo workFlowNodeInfo) {
            this.workFlowNodeInfo = workFlowNodeInfo;
            return this;
        }
        public GetWorkFlowResponseBodyDataWorkFlowNodeInfo getWorkFlowNodeInfo() {
            return this.workFlowNodeInfo;
        }

    }

}
