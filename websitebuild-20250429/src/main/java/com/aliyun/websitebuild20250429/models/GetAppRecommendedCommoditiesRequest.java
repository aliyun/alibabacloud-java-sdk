// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppRecommendedCommoditiesRequest extends TeaModel {
    /**
     * <p>Application instance business ID (required in scenario 1, used to filter instance versions during query)</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Extend")
    public String extend;

    @NameInMap("ResourceConditions")
    public String resourceConditions;

    /**
     * <p>Scenarios: ai_chat | inspiration</p>
     * 
     * <strong>example:</strong>
     * <p>DataworksManualTask</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static GetAppRecommendedCommoditiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRecommendedCommoditiesRequest self = new GetAppRecommendedCommoditiesRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRecommendedCommoditiesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppRecommendedCommoditiesRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public GetAppRecommendedCommoditiesRequest setResourceConditions(String resourceConditions) {
        this.resourceConditions = resourceConditions;
        return this;
    }
    public String getResourceConditions() {
        return this.resourceConditions;
    }

    public GetAppRecommendedCommoditiesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
