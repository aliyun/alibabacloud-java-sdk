// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathRequest extends TeaModel {
    /**
     * <p>The page number of the current page to display in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries to display on each page in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the web path. Valid values:</p>
     * <ul>
     * <li><strong>def</strong>: automatically identified by the system</li>
     * <li><strong>customize</strong>: manually added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>def</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The web path.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/www****</p>
     */
    @NameInMap("WebPath")
    public String webPath;

    public static ListUuidsByWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByWebPathRequest self = new ListUuidsByWebPathRequest();
        return TeaModel.build(map, self);
    }

    public ListUuidsByWebPathRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUuidsByWebPathRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUuidsByWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUuidsByWebPathRequest setWebPath(String webPath) {
        this.webPath = webPath;
        return this;
    }
    public String getWebPath() {
        return this.webPath;
    }

}
