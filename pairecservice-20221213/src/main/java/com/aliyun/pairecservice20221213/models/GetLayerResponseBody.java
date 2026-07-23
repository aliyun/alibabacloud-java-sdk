// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLayerResponseBody extends TeaModel {
    /**
     * <p>The description of the layer.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the experiment layer was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-13 17:34:52.0</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The ID of the laboratory.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LaboratoryId")
    public String laboratoryId;

    /**
     * <p>The name of the layer.</p>
     * 
     * <strong>example:</strong>
     * <p>layer1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE97D06A-2AA0-5AD9-B6CF-8A267924D691</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The residual traffic in the experiment layer.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ResidualFlow")
    public Long residualFlow;

    /**
     * <p>The ID of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
