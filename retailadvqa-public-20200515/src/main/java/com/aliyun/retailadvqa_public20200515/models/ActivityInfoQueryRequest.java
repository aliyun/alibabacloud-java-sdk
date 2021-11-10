// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ActivityInfoQueryRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("IsIncludeMainActivity")
    public Boolean isIncludeMainActivity;

    @NameInMap("IsMainActivity")
    public Boolean isMainActivity;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ActivityInfoQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivityInfoQueryRequest self = new ActivityInfoQueryRequest();
        return TeaModel.build(map, self);
    }

    public ActivityInfoQueryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ActivityInfoQueryRequest setIsIncludeMainActivity(Boolean isIncludeMainActivity) {
        this.isIncludeMainActivity = isIncludeMainActivity;
        return this;
    }
    public Boolean getIsIncludeMainActivity() {
        return this.isIncludeMainActivity;
    }

    public ActivityInfoQueryRequest setIsMainActivity(Boolean isMainActivity) {
        this.isMainActivity = isMainActivity;
        return this;
    }
    public Boolean getIsMainActivity() {
        return this.isMainActivity;
    }

    public ActivityInfoQueryRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ActivityInfoQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ActivityInfoQueryRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ActivityInfoQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
