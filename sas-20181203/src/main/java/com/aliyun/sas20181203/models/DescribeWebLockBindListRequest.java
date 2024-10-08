// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The string that allows you to search for servers in fuzzy match mode. You can enter a server name or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>116.30.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The protection status of the server that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: protected</li>
     * <li><strong>off</strong>: unprotected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the asset that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7151f27e-1d51-4e98-a540-8936a****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

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

    public DescribeWebLockBindListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
