// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetunitsbyexternalldRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("WithDeleted")
    public String withDeleted;

    public static GetLinkeBahamutIterationgetunitsbyexternalldRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetunitsbyexternalldRequest self = new GetLinkeBahamutIterationgetunitsbyexternalldRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldRequest setWithDeleted(String withDeleted) {
        this.withDeleted = withDeleted;
        return this;
    }
    public String getWithDeleted() {
        return this.withDeleted;
    }

}
