// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest self = new GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutPipelinesgetpipelineexecutionsbygroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
