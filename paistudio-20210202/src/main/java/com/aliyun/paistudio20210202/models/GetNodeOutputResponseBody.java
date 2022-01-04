// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeOutputResponseBody extends TeaModel {
    @NameInMap("AlgoName")
    public String algoName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("LocationType")
    public String locationType;

    @NameInMap("NodeName")
    public String nodeName;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

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
