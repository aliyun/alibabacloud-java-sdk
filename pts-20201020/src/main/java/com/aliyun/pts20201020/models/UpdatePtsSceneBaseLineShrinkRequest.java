// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class UpdatePtsSceneBaseLineShrinkRequest extends TeaModel {
    /**
     * <p>null null</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:182381,&quot;id&quot;:362447,&quot;maxRt&quot;:3051,&quot;minRt&quot;:0,&quot;name&quot;:&quot;1-1&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:3,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0,&quot;timingConnAvg&quot;:0},{&quot;avgRt&quot;:1.06,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:0,&quot;failCountReq&quot;:151143,&quot;id&quot;:362446,&quot;maxRt&quot;:3068,&quot;minRt&quot;:0,&quot;name&quot;:&quot;dd&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0}]</p>
     */
    @NameInMap("ApiBaselines")
    public String apiBaselinesShrink;

    /**
     * <p>null null</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:0.5,&quot;successRateReq&quot;:1}</p>
     */
    @NameInMap("SceneBaseline")
    public String sceneBaselineShrink;

    /**
     * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NB54CV</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static UpdatePtsSceneBaseLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePtsSceneBaseLineShrinkRequest self = new UpdatePtsSceneBaseLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePtsSceneBaseLineShrinkRequest setApiBaselinesShrink(String apiBaselinesShrink) {
        this.apiBaselinesShrink = apiBaselinesShrink;
        return this;
    }
    public String getApiBaselinesShrink() {
        return this.apiBaselinesShrink;
    }

    public UpdatePtsSceneBaseLineShrinkRequest setSceneBaselineShrink(String sceneBaselineShrink) {
        this.sceneBaselineShrink = sceneBaselineShrink;
        return this;
    }
    public String getSceneBaselineShrink() {
        return this.sceneBaselineShrink;
    }

    public UpdatePtsSceneBaseLineShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
