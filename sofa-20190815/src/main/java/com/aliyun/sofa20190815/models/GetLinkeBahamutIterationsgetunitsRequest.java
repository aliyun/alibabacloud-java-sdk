// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetunitsRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Id")
    public String id;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("WithDeleted")
    public String withDeleted;

    public static GetLinkeBahamutIterationsgetunitsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetunitsRequest self = new GetLinkeBahamutIterationsgetunitsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetunitsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public GetLinkeBahamutIterationsgetunitsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeBahamutIterationsgetunitsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationsgetunitsRequest setWithDeleted(String withDeleted) {
        this.withDeleted = withDeleted;
        return this;
    }
    public String getWithDeleted() {
        return this.withDeleted;
    }

}
