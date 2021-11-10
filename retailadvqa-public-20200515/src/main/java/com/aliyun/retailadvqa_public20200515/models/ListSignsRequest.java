// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListSignsRequest extends TeaModel {
    // oemcode
    @NameInMap("AccessId")
    public String accessId;

    // 页码
    @NameInMap("PageNum")
    public Long pageNum;

    // 页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 平台ID
    @NameInMap("PlatformId")
    public String platformId;

    // 签名名称
    @NameInMap("SignName")
    public String signName;

    // 签名状态
    @NameInMap("SignStatus")
    public String signStatus;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListSignsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSignsRequest self = new ListSignsRequest();
        return TeaModel.build(map, self);
    }

    public ListSignsRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListSignsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSignsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSignsRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public ListSignsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ListSignsRequest setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public ListSignsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListSignsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
