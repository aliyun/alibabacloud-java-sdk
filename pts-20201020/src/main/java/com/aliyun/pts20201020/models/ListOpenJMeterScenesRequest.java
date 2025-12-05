// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListOpenJMeterScenesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of scenarios to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DYYPZIH</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
