// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The path type of the web directory. Valid values:</p>
     * <br>
     * <p>*   **def**: automatically identified</p>
     * <p>*   **customize**: manually added</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The path to the web directory.</p>
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
