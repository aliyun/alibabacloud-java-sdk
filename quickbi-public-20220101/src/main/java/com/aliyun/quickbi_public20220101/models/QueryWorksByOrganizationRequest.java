// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <ul>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of rows per page.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the works to query. Valid values:</p>
     * <ul>
     * <li>0: Unpublished.</li>
     * <li>1: Published.</li>
     * <li>2: Modified but not published.</li>
     * <li>3: Offline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The third-party embedding status. Valid values:</p>
     * <ul>
     * <li>0: Embedding is not enabled.</li>
     * <li>1: Embedding is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    /**
     * <p>The type of works to query. Leave this parameter empty to query all types. Valid values:</p>
     * <ul>
     * <li>DATAPRODUCT: data portal</li>
     * <li>PAGE: dashboard</li>
     * <li>REPORT: workbook</li>
     * <li>dashboardOfflineQuery: custom query</li>
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
