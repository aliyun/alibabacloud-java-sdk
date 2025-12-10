// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeOutputResponseBody extends TeaModel {
    @NameInMap("AlgoName")
    public String algoName;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>MaxComputeTable</p>
     */
    @NameInMap("LocationType")
    public String locationType;

    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <strong>example:</strong>
     * <p>601FD8B1-78EB-5220-844C-92AC2EDAF7E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Model</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;name&quot;: &quot;model_flow_wayrh3k605s7i51wey_node_7n3tstbuhr36t0ukiz_model&quot;,
     *   &quot;modelType&quot;: &quot;OfflineModel&quot;,
     *   &quot;labelCol&quot;: &quot;_c2&quot;,
     *   &quot;features&quot;: &quot;pm10,so2,co,no2&quot;,
     *   &quot;gmtCreateTime&quot;: &quot;2021-01-21T17:12:35.232Z&quot;,
     *   &quot;gmtModifiedTime&quot;: &quot;2021-01-21T17:12:35.232Z&quot;,
     *   &quot;parameters&quot;: {
     *     &quot;epsilon&quot;: &quot;0.000001&quot;,
     *     &quot;enableSparse&quot;: &quot;false&quot;,
     *     &quot;regularizedLevel&quot;: &quot;1&quot;,
     *     &quot;roleArn&quot;: &quot;true&quot;,
     *     &quot;maxIter&quot;: &quot;100&quot;,
     *     &quot;regularizedType&quot;: &quot;None&quot;,
     *     &quot;generatePmml&quot;: &quot;true&quot;
     *   }
     * }</p>
     */
    @NameInMap("Value")
    public java.util.Map<String, ?> value;

    public static GetNodeOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOutputResponseBody self = new GetNodeOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeOutputResponseBody setAlgoName(String algoName) {
        this.algoName = algoName;
        return this;
    }
    public String getAlgoName() {
        return this.algoName;
    }

    public GetNodeOutputResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetNodeOutputResponseBody setLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }
    public String getLocationType() {
        return this.locationType;
    }

    public GetNodeOutputResponseBody setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public GetNodeOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeOutputResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetNodeOutputResponseBody setValue(java.util.Map<String, ?> value) {
        this.value = value;
        return this;
    }
    public java.util.Map<String, ?> getValue() {
        return this.value;
    }

}
