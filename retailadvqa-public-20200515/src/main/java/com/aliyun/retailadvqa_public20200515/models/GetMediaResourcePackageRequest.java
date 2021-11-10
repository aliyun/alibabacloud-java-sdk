// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetMediaResourcePackageRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("Template")
    public String template;

    public static GetMediaResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourcePackageRequest self = new GetMediaResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaResourcePackageRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetMediaResourcePackageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetMediaResourcePackageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMediaResourcePackageRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetMediaResourcePackageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetMediaResourcePackageRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
