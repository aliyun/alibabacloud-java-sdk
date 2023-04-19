// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustPtsSceneSpeedRequest extends TeaModel {
    @NameInMap("ApiSpeedList")
    public java.util.List<AdjustPtsSceneSpeedRequestApiSpeedList> apiSpeedList;

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
        @NameInMap("ApiId")
        public String apiId;

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
