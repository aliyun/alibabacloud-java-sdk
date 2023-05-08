// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListRequest extends TeaModel {
    /**
     * <p>on</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The error code for web tamper proofing. Valid values:</p>
     * <br>
     * <p>*   **2001**: The Security Center agent is offline.</p>
     * <p>*   **9999**: The connection timed out.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The error message for web tamper proofing. Valid values:</p>
     * <br>
     * <p>*   **client offline**: The Security Center agent is offline.</p>
     * <p>*   **timeout**: The connection timed out.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The name of the server.</p>
     */
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
