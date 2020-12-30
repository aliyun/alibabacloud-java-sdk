// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobRequest extends TeaModel {
    @NameInMap("VcName")
    public String vcName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobRequest self = new ListSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

    public ListSparkJobRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
