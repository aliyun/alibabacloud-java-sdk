// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedAssetsRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Levels")
    public String levels;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeAffectedAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedAssetsRequest self = new DescribeAffectedAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedAssetsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public DescribeAffectedAssetsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeAffectedAssetsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
