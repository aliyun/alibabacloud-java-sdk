// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListRequest extends TeaModel {
    // The number of the page to return. Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The language of the content within the request and the response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page. Default value: 20.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The string that allows you to search for servers in fuzzy match mode. You can enter a server name or IP address.
    @NameInMap("Remark")
    public String remark;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The protection status of the server that you want to query. Valid values:
    // 
    // *   **on**: protected
    // *   **off**: unprotected
    @NameInMap("Status")
    public String status;

    public static DescribeWebLockBindListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockBindListRequest self = new DescribeWebLockBindListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockBindListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebLockBindListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebLockBindListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebLockBindListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeWebLockBindListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWebLockBindListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
