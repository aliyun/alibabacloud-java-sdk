// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLayerResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("LaboratoryId")
    public String laboratoryId;

    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResidualFlow")
    public Long residualFlow;

    @NameInMap("SceneId")
    public String sceneId;

    public static GetLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLayerResponseBody self = new GetLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLayerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLayerResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetLayerResponseBody setLaboratoryId(String laboratoryId) {
        this.laboratoryId = laboratoryId;
        return this;
    }
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public GetLayerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLayerResponseBody setResidualFlow(Long residualFlow) {
        this.residualFlow = residualFlow;
        return this;
    }
    public Long getResidualFlow() {
        return this.residualFlow;
    }

    public GetLayerResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
