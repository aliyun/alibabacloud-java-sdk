// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListNodeOutputsResponseBody extends TeaModel {
    @NameInMap("Outputs")
    public java.util.List<ListNodeOutputsResponseBodyOutputs> outputs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeOutputsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeOutputsResponseBody self = new ListNodeOutputsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeOutputsResponseBody setOutputs(java.util.List<ListNodeOutputsResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ListNodeOutputsResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public ListNodeOutputsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeOutputsResponseBodyOutputs extends TeaModel {
        @NameInMap("AlgoName")
        public String algoName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("LocationType")
        public String locationType;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("OutputId")
        public String outputId;

        @NameInMap("OutputIndex")
        public String outputIndex;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.Map<String, ?> value;

        public static ListNodeOutputsResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeOutputsResponseBodyOutputs self = new ListNodeOutputsResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodeOutputsResponseBodyOutputs setAlgoName(String algoName) {
            this.algoName = algoName;
            return this;
        }
        public String getAlgoName() {
            return this.algoName;
        }

        public ListNodeOutputsResponseBodyOutputs setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListNodeOutputsResponseBodyOutputs setLocationType(String locationType) {
            this.locationType = locationType;
            return this;
        }
        public String getLocationType() {
            return this.locationType;
        }

        public ListNodeOutputsResponseBodyOutputs setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodeOutputsResponseBodyOutputs setOutputId(String outputId) {
            this.outputId = outputId;
            return this;
        }
        public String getOutputId() {
            return this.outputId;
        }

        public ListNodeOutputsResponseBodyOutputs setOutputIndex(String outputIndex) {
            this.outputIndex = outputIndex;
            return this;
        }
        public String getOutputIndex() {
            return this.outputIndex;
        }

        public ListNodeOutputsResponseBodyOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodeOutputsResponseBodyOutputs setValue(java.util.Map<String, ?> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, ?> getValue() {
            return this.value;
        }

    }

}
