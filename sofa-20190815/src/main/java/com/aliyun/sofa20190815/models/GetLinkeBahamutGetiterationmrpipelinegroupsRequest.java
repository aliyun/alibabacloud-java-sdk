// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetiterationmrpipelinegroupsRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutGetiterationmrpipelinegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetiterationmrpipelinegroupsRequest self = new GetLinkeBahamutGetiterationmrpipelinegroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
