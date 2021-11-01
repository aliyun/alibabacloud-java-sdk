// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSceneRequest extends TeaModel {
    // 主场景名称
    @NameInMap("Name")
    public String name;

    // 当前页
    @NameInMap("PageNum")
    public Long pageNum;

    // 页长
    @NameInMap("PageSize")
    public Long pageSize;

    // 所有项目Id
    @NameInMap("ProjectId")
    public String projectId;

    public static ListSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSceneRequest self = new ListSceneRequest();
        return TeaModel.build(map, self);
    }

    public ListSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSceneRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSceneRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSceneRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
