// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustPtsSceneSpeedRequest extends TeaModel {
    /**
     * <p>The stress testing speed in the PTS scenario.</p>
     */
    @NameInMap("ApiSpeedList")
    public java.util.List<AdjustPtsSceneSpeedRequestApiSpeedList> apiSpeedList;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DYXXX12H</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static AdjustPtsSceneSpeedRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustPtsSceneSpeedRequest self = new AdjustPtsSceneSpeedRequest();
        return TeaModel.build(map, self);
    }

    public AdjustPtsSceneSpeedRequest setApiSpeedList(java.util.List<AdjustPtsSceneSpeedRequestApiSpeedList> apiSpeedList) {
        this.apiSpeedList = apiSpeedList;
        return this;
    }
    public java.util.List<AdjustPtsSceneSpeedRequestApiSpeedList> getApiSpeedList() {
        return this.apiSpeedList;
    }

    public AdjustPtsSceneSpeedRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public static class AdjustPtsSceneSpeedRequestApiSpeedList extends TeaModel {
        /**
         * <p>The API ID. You can find the information of the API corresponding to the ID in the Relation response parameter of the GetPtsSceneRunningData operation based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DYXXX12H</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The new stress. In concurrency mode, the new stress is the concurrency. In RPS mode, the new stress is the RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Speed")
        public Long speed;

        public static AdjustPtsSceneSpeedRequestApiSpeedList build(java.util.Map<String, ?> map) throws Exception {
            AdjustPtsSceneSpeedRequestApiSpeedList self = new AdjustPtsSceneSpeedRequestApiSpeedList();
            return TeaModel.build(map, self);
        }

        public AdjustPtsSceneSpeedRequestApiSpeedList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public AdjustPtsSceneSpeedRequestApiSpeedList setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

    }

}
