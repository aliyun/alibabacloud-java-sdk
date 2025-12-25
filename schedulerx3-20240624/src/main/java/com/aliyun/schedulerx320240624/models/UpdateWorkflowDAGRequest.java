// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDAGRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-a1804a3226d</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dag")
    public UpdateWorkflowDAGRequestDag dag;

    /**
     * <strong>example:</strong>
     * <p>1137005</p>
     */
    @NameInMap("DagVersion")
    public String dagVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static UpdateWorkflowDAGRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDAGRequest self = new UpdateWorkflowDAGRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDAGRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateWorkflowDAGRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateWorkflowDAGRequest setDag(UpdateWorkflowDAGRequestDag dag) {
        this.dag = dag;
        return this;
    }
    public UpdateWorkflowDAGRequestDag getDag() {
        return this.dag;
    }

    public UpdateWorkflowDAGRequest setDagVersion(String dagVersion) {
        this.dagVersion = dagVersion;
        return this;
    }
    public String getDagVersion() {
        return this.dagVersion;
    }

    public UpdateWorkflowDAGRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static class UpdateWorkflowDAGRequestDagEdges extends TeaModel {
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

        public static UpdateWorkflowDAGRequestDagEdges build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowDAGRequestDagEdges self = new UpdateWorkflowDAGRequestDagEdges();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowDAGRequestDagEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public UpdateWorkflowDAGRequestDagEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class UpdateWorkflowDAGRequestDagNodesCoordinate extends TeaModel {
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

        public static UpdateWorkflowDAGRequestDagNodesCoordinate build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowDAGRequestDagNodesCoordinate self = new UpdateWorkflowDAGRequestDagNodesCoordinate();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowDAGRequestDagNodesCoordinate setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateWorkflowDAGRequestDagNodesCoordinate setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateWorkflowDAGRequestDagNodesCoordinate setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateWorkflowDAGRequestDagNodesCoordinate setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class UpdateWorkflowDAGRequestDagNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;logicType&quot;: &quot;status_branch&quot;,
         *     &quot;conditionResult&quot;: {
         *         &quot;successList&quot;: [
         *             {
         *                 &quot;jobName&quot;: &quot;status-job4&quot;,
         *                 &quot;jobId&quot;: &quot;269&quot;
         *             }
         *         ],
         *         &quot;failedList&quot;: [
         *             {
         *                 &quot;jobName&quot;: &quot;status-job5&quot;,
         *                 &quot;jobId&quot;: &quot;270&quot;
         *             }
         *         ]
         *     },
         *     &quot;dependence&quot;: {
         *         &quot;relation&quot;: &quot;AND&quot;,
         *         &quot;dependList&quot;: [
         *             {
         *                 &quot;relation&quot;: &quot;AND&quot;,
         *                 &quot;dependItemList&quot;: [
         *                     {
         *                         &quot;jobName&quot;: &quot;status-job1&quot;,
         *                         &quot;jobId&quot;: 265,
         *                         &quot;status&quot;: [
         *                             4
         *                         ]
         *                     },
         *                     {
         *                         &quot;jobName&quot;: &quot;status-job2&quot;,
         *                         &quot;jobId&quot;: 266,
         *                         &quot;status&quot;: [
         *                             5
         *                         ]
         *                     }
         *                 ]
         *             },
         *             {
         *                 &quot;relation&quot;: &quot;AND&quot;,
         *                 &quot;dependItemList&quot;: [
         *                     {
         *                         &quot;jobName&quot;: &quot;status-job3&quot;,
         *                         &quot;jobId&quot;: 267,
         *                         &quot;status&quot;: [
         *                             4
         *                         ]
         *                     }
         *                 ]
         *             }
         *         ]
         *     }
         * }</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Coordinate")
        public UpdateWorkflowDAGRequestDagNodesCoordinate coordinate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        public static UpdateWorkflowDAGRequestDagNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowDAGRequestDagNodes self = new UpdateWorkflowDAGRequestDagNodes();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowDAGRequestDagNodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateWorkflowDAGRequestDagNodes setCoordinate(UpdateWorkflowDAGRequestDagNodesCoordinate coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public UpdateWorkflowDAGRequestDagNodesCoordinate getCoordinate() {
            return this.coordinate;
        }

        public UpdateWorkflowDAGRequestDagNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateWorkflowDAGRequestDag extends TeaModel {
        @NameInMap("Edges")
        public java.util.List<UpdateWorkflowDAGRequestDagEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<UpdateWorkflowDAGRequestDagNodes> nodes;

        public static UpdateWorkflowDAGRequestDag build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowDAGRequestDag self = new UpdateWorkflowDAGRequestDag();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowDAGRequestDag setEdges(java.util.List<UpdateWorkflowDAGRequestDagEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<UpdateWorkflowDAGRequestDagEdges> getEdges() {
            return this.edges;
        }

        public UpdateWorkflowDAGRequestDag setNodes(java.util.List<UpdateWorkflowDAGRequestDagNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<UpdateWorkflowDAGRequestDagNodes> getNodes() {
            return this.nodes;
        }

    }

}
