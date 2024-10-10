// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetWorksEmbedListRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>page</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    /**
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
