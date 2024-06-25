// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListScenesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B8987BF7-6028-5B17-80E0-251B7BD67BBA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenes")
    public java.util.List<ListScenesResponseBodyScenes> scenes;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponseBody self = new ListScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenesResponseBody setScenes(java.util.List<ListScenesResponseBodyScenes> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<ListScenesResponseBodyScenes> getScenes() {
        return this.scenes;
    }

    public ListScenesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListScenesResponseBodyScenesFlows extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>liuliang1</p>
         */
        @NameInMap("FlowCode")
        public String flowCode;

        /**
         * <strong>example:</strong>
         * <p>流量1</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        public static ListScenesResponseBodyScenesFlows build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseBodyScenesFlows self = new ListScenesResponseBodyScenesFlows();
            return TeaModel.build(map, self);
        }

        public ListScenesResponseBodyScenesFlows setFlowCode(String flowCode) {
            this.flowCode = flowCode;
            return this;
        }
        public String getFlowCode() {
            return this.flowCode;
        }

        public ListScenesResponseBodyScenesFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

    public static class ListScenesResponseBodyScenes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Flows")
        public java.util.List<ListScenesResponseBodyScenesFlows> flows;

        /**
         * <strong>example:</strong>
         * <p>scene1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        public static ListScenesResponseBodyScenes build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseBodyScenes self = new ListScenesResponseBodyScenes();
            return TeaModel.build(map, self);
        }

        public ListScenesResponseBodyScenes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenesResponseBodyScenes setFlows(java.util.List<ListScenesResponseBodyScenesFlows> flows) {
            this.flows = flows;
            return this;
        }
        public java.util.List<ListScenesResponseBodyScenesFlows> getFlows() {
            return this.flows;
        }

        public ListScenesResponseBodyScenes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenesResponseBodyScenes setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
