// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SubAccountName")
    public String subAccountName;

    public static DescribeInstallCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCodesRequest self = new DescribeInstallCodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCodesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstallCodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstallCodesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeInstallCodesRequest setSubAccountName(String subAccountName) {
        this.subAccountName = subAccountName;
        return this;
    }
    public String getSubAccountName() {
        return this.subAccountName;
    }

}
