// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutIterationsfixnnitswithnonestageRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Id")
    public String id;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("WithDeleted")
    public String withDeleted;

    public static SetLinkeBahamutIterationsfixnnitswithnonestageRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutIterationsfixnnitswithnonestageRequest self = new SetLinkeBahamutIterationsfixnnitswithnonestageRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SetLinkeBahamutIterationsfixnnitswithnonestageRequest setWithDeleted(String withDeleted) {
        this.withDeleted = withDeleted;
        return this;
    }
    public String getWithDeleted() {
        return this.withDeleted;
    }

}
