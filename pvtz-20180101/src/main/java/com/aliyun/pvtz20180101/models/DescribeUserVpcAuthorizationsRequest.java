// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserVpcAuthorizationsRequest extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("AuthorizedUserId")
    public Long authorizedUserId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeUserVpcAuthorizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVpcAuthorizationsRequest self = new DescribeUserVpcAuthorizationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserVpcAuthorizationsRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeUserVpcAuthorizationsRequest setAuthorizedUserId(Long authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public DescribeUserVpcAuthorizationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserVpcAuthorizationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
