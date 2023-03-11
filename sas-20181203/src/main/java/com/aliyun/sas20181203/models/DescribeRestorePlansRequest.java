// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestorePlansRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the server.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the restoration task. Valid values:</p>
     * <br>
     * <p>*   **init**: initializing</p>
     * <p>*   **created**: creating</p>
     * <p>*   **running**: running</p>
     * <p>*   **completed**: complete</p>
     * <p>*   **error**: failed</p>
     * <p>*   **restoring**: restoring</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeRestorePlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorePlansRequest self = new DescribeRestorePlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestorePlansRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRestorePlansRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRestorePlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestorePlansRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
