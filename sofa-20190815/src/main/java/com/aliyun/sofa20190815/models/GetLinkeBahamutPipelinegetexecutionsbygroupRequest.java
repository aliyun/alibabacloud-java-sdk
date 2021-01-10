// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinegetexecutionsbygroupRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetLinkeBahamutPipelinegetexecutionsbygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinegetexecutionsbygroupRequest self = new GetLinkeBahamutPipelinegetexecutionsbygroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinegetexecutionsbygroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeBahamutPipelinegetexecutionsbygroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public GetLinkeBahamutPipelinegetexecutionsbygroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
