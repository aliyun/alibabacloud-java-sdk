// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceListRequest extends TeaModel {
    /**
     * <p>Data service name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Number of items per page in a paginated query:</p>
     * <ul>
     * <li>Default value: 10</li>
     * <li>Maximum value: 1000</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dasdfdsa-csddf-dsadsa</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryDataServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceListRequest self = new QueryDataServiceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDataServiceListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryDataServiceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDataServiceListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
