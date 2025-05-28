// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetWorksEmbedListRequest extends TeaModel {
    /**
     * <p>Report name (fuzzy match)</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Page number (defaults to 1 if empty)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Number of items per page (defaults to 10 if empty)</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Report type</p>
     * <ul>
     * <li>page, Dashboard</li>
     * <li>screen, Data Screen</li>
     * <li>report, Spreadsheet</li>
     * <li>ANALYSIS, Ad-hoc Analysis</li>
     * <li>dashboardOfflineQuery, Self-service Data Retrieval</li>
     * <li>dataForm, Data Entry Form</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>page</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>919818-<em><strong>-</strong></em>**-wdasd</p>
     */
    @NameInMap("WsId")
    public String wsId;

    public static GetWorksEmbedListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorksEmbedListRequest self = new GetWorksEmbedListRequest();
        return TeaModel.build(map, self);
    }

    public GetWorksEmbedListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetWorksEmbedListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetWorksEmbedListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetWorksEmbedListRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

    public GetWorksEmbedListRequest setWsId(String wsId) {
        this.wsId = wsId;
        return this;
    }
    public String getWsId() {
        return this.wsId;
    }

}
