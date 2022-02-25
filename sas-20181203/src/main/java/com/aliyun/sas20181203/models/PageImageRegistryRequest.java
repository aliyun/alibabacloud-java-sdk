// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PageImageRegistryRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 镜像仓名称
    @NameInMap("RegistryNameLike")
    public String registryNameLike;

    // 镜像仓类型in
    @NameInMap("RegistryTypeInList")
    public java.util.List<String> registryTypeInList;

    // 镜像仓类型not in
    @NameInMap("RegistryTypeNotInList")
    public java.util.List<String> registryTypeNotInList;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static PageImageRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        PageImageRegistryRequest self = new PageImageRegistryRequest();
        return TeaModel.build(map, self);
    }

    public PageImageRegistryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageImageRegistryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageImageRegistryRequest setRegistryNameLike(String registryNameLike) {
        this.registryNameLike = registryNameLike;
        return this;
    }
    public String getRegistryNameLike() {
        return this.registryNameLike;
    }

    public PageImageRegistryRequest setRegistryTypeInList(java.util.List<String> registryTypeInList) {
        this.registryTypeInList = registryTypeInList;
        return this;
    }
    public java.util.List<String> getRegistryTypeInList() {
        return this.registryTypeInList;
    }

    public PageImageRegistryRequest setRegistryTypeNotInList(java.util.List<String> registryTypeNotInList) {
        this.registryTypeNotInList = registryTypeNotInList;
        return this;
    }
    public java.util.List<String> getRegistryTypeNotInList() {
        return this.registryTypeNotInList;
    }

    public PageImageRegistryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
