// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageRequest extends TeaModel {
    /**
     * <p>The number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The CVE ID of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2022-44702</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>The maximum number of entries to display per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether runtime application self-protection (RASP) is supported. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not supported.</li>
     * <li><strong>1</strong>: Supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RaspDefend")
    public Integer raspDefend;

    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>Remote code execute vulnerability</p>
     */
    @NameInMap("VulNameLike")
    public String vulNameLike;

    /**
     * <p>The type of vulnerability to query. Valid values:</p>
     * <ul>
     * <li>cve: Linux software vulnerability</li>
     * <li>sys: Windows system vulnerability</li>
     * <li>app: application vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("VulType")
    public String vulType;

    public static DescribeVulListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageRequest self = new DescribeVulListPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListPageRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeVulListPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListPageRequest setRaspDefend(Integer raspDefend) {
        this.raspDefend = raspDefend;
        return this;
    }
    public Integer getRaspDefend() {
        return this.raspDefend;
    }

    public DescribeVulListPageRequest setVulNameLike(String vulNameLike) {
        this.vulNameLike = vulNameLike;
        return this;
    }
    public String getVulNameLike() {
        return this.vulNameLike;
    }

    public DescribeVulListPageRequest setVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }
    public String getVulType() {
        return this.vulType;
    }

}
