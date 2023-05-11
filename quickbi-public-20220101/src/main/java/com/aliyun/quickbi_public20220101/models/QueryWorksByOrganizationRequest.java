// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of rows per page set when the interface is requested.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Returns a list of all works in the organization that meet the requested criteria.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("WorksType")
    public String worksType;

    public static QueryWorksByOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByOrganizationRequest self = new QueryWorksByOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksByOrganizationRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryWorksByOrganizationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryWorksByOrganizationRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryWorksByOrganizationRequest setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
        this.thirdPartAuthFlag = thirdPartAuthFlag;
        return this;
    }
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    public QueryWorksByOrganizationRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

}
