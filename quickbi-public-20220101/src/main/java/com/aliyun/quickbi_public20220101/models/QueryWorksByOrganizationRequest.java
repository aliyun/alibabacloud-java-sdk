// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationRequest extends TeaModel {
    /**
     * <p>Page number.</p>
     * <ul>
     * <li>Default value is 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of items per page.</p>
     * <ul>
     * <li>Default value is 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the work to query. Possible values:</p>
     * <ul>
     * <li>0: Unpublished</li>
     * <li>1: Published</li>
     * <li>2: Modified but not published</li>
     * <li>3: Offline</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Third-party embedding status. Possible values:</p>
     * <ul>
     * <li>0: Embedding not enabled</li>
     * <li>1: Embedding enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    /**
     * <p>The type of work to query. Leave blank to query all types. Possible values:</p>
     * <ul>
     * <li>DATAPRODUCT: Data Portal</li>
     * <li>PAGE: Dashboard</li>
     * <li>REPORT: Spreadsheet</li>
     * <li>dashboardOfflineQuery: Self-service Data Retrieval</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAGE</p>
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
