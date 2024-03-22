// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLayersResponseBody extends TeaModel {
    @NameInMap("Layers")
    public java.util.List<ListLayersResponseBodyLayers> layers;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLayersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLayersResponseBody self = new ListLayersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLayersResponseBody setLayers(java.util.List<ListLayersResponseBodyLayers> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<ListLayersResponseBodyLayers> getLayers() {
        return this.layers;
    }

    public ListLayersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLayersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLayersResponseBodyLayers extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("LaboratoryId")
        public String laboratoryId;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResidualFlow")
        public Long residualFlow;

        @NameInMap("SceneId")
        public String sceneId;

        public static ListLayersResponseBodyLayers build(java.util.Map<String, ?> map) throws Exception {
            ListLayersResponseBodyLayers self = new ListLayersResponseBodyLayers();
            return TeaModel.build(map, self);
        }

        public ListLayersResponseBodyLayers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLayersResponseBodyLayers setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListLayersResponseBodyLayers setLaboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        public ListLayersResponseBodyLayers setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListLayersResponseBodyLayers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLayersResponseBodyLayers setResidualFlow(Long residualFlow) {
            this.residualFlow = residualFlow;
            return this;
        }
        public Long getResidualFlow() {
            return this.residualFlow;
        }

        public ListLayersResponseBodyLayers setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
