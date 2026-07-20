// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacUserRolesRequest extends TeaModel {
    @NameInMap("ApplicationUserId")
    public String applicationUserId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrderColumn")
    public String orderColumn;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRbacUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacUserRolesRequest self = new QueryRbacUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbacUserRolesRequest setApplicationUserId(String applicationUserId) {
        this.applicationUserId = applicationUserId;
        return this;
    }
    public String getApplicationUserId() {
        return this.applicationUserId;
    }

    public QueryRbacUserRolesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryRbacUserRolesRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryRbacUserRolesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryRbacUserRolesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRbacUserRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
