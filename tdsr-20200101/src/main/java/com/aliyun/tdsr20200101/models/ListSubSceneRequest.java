// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneRequest extends TeaModel {
    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    // 页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 页长
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneRequest self = new ListSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public ListSubSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
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

}
