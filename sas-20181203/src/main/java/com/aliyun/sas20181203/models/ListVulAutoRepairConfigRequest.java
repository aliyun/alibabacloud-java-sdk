// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulAutoRepairConfigRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2022:0274-Important: polkit pkexec Local Privilege Escalation Vulnerability(CVE-2021-4034)</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListVulAutoRepairConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulAutoRepairConfigRequest self = new ListVulAutoRepairConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListVulAutoRepairConfigRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public ListVulAutoRepairConfigRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVulAutoRepairConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVulAutoRepairConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVulAutoRepairConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
