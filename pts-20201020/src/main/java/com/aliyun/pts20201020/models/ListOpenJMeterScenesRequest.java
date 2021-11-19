// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListOpenJMeterScenesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 场景id
    @NameInMap("SceneId")
    public String sceneId;

    // 场景名
    @NameInMap("SceneName")
    public String sceneName;

    public static ListOpenJMeterScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenJMeterScenesRequest self = new ListOpenJMeterScenesRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenJMeterScenesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOpenJMeterScenesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOpenJMeterScenesRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListOpenJMeterScenesRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

}
