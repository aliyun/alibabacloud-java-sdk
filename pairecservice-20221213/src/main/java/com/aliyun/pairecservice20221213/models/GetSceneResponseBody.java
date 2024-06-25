// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSceneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Flows")
    public java.util.List<GetSceneResponseBodyFlows> flows;

    /**
     * <strong>example:</strong>
     * <p>scene1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B8987BF7-6028-5B17-80E0-251B7BD67BBA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneResponseBody self = new GetSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSceneResponseBody setFlows(java.util.List<GetSceneResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<GetSceneResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public GetSceneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSceneResponseBodyFlows extends TeaModel {
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

        public static GetSceneResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            GetSceneResponseBodyFlows self = new GetSceneResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public GetSceneResponseBodyFlows setFlowCode(String flowCode) {
            this.flowCode = flowCode;
            return this;
        }
        public String getFlowCode() {
            return this.flowCode;
        }

        public GetSceneResponseBodyFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}
