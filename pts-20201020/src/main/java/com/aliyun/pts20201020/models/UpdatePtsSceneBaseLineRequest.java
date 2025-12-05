// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class UpdatePtsSceneBaseLineRequest extends TeaModel {
    /**
     * <p>null null</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:182381,&quot;id&quot;:362447,&quot;maxRt&quot;:3051,&quot;minRt&quot;:0,&quot;name&quot;:&quot;1-1&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:3,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0,&quot;timingConnAvg&quot;:0},{&quot;avgRt&quot;:1.06,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:0,&quot;failCountReq&quot;:151143,&quot;id&quot;:362446,&quot;maxRt&quot;:3068,&quot;minRt&quot;:0,&quot;name&quot;:&quot;dd&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0}]</p>
     */
    @NameInMap("ApiBaselines")
    public java.util.Map<String, ?> apiBaselines;

    /**
     * <p>null null</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:0.5,&quot;successRateReq&quot;:1}</p>
     */
    @NameInMap("SceneBaseline")
    public java.util.Map<String, ?> sceneBaseline;

    /**
     * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NB54CV</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static UpdatePtsSceneBaseLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePtsSceneBaseLineRequest self = new UpdatePtsSceneBaseLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePtsSceneBaseLineRequest setApiBaselines(java.util.Map<String, ?> apiBaselines) {
        this.apiBaselines = apiBaselines;
        return this;
    }
    public java.util.Map<String, ?> getApiBaselines() {
        return this.apiBaselines;
    }

    public UpdatePtsSceneBaseLineRequest setSceneBaseline(java.util.Map<String, ?> sceneBaseline) {
        this.sceneBaseline = sceneBaseline;
        return this;
    }
    public java.util.Map<String, ?> getSceneBaseline() {
        return this.sceneBaseline;
    }

    public UpdatePtsSceneBaseLineRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
