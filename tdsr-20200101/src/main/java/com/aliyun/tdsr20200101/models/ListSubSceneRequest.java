// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneRequest extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("ShowLayoutData")
    public Boolean showLayoutData;

    @NameInMap("SortField")
    public String sortField;

    public static ListSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneRequest self = new ListSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public ListSubSceneRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSubSceneRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSubSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListSubSceneRequest setShowLayoutData(Boolean showLayoutData) {
        this.showLayoutData = showLayoutData;
        return this;
    }
    public Boolean getShowLayoutData() {
        return this.showLayoutData;
    }

    public ListSubSceneRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

}
