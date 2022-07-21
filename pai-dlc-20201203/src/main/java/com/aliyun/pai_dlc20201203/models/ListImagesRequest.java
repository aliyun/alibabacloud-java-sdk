// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    // 加速器类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 镜像包含的框架类型
    @NameInMap("Framework")
    public String framework;

    // 镜像类型
    @NameInMap("ImageProviderType")
    public String imageProviderType;

    // 排序顺序
    @NameInMap("Order")
    public String order;

    // 按返回字段排序
    @NameInMap("SortBy")
    public String sortBy;

    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListImagesRequest setFramework(String framework) {
        this.framework = framework;
        return this;
    }
    public String getFramework() {
        return this.framework;
    }

    public ListImagesRequest setImageProviderType(String imageProviderType) {
        this.imageProviderType = imageProviderType;
        return this;
    }
    public String getImageProviderType() {
        return this.imageProviderType;
    }

    public ListImagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListImagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListImagesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
