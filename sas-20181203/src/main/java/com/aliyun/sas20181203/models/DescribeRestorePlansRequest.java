// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestorePlansRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>sql-test-001</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the restoration task. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: initializing</li>
     * <li><strong>created</strong>: creating</li>
     * <li><strong>running</strong>: running</li>
     * <li><strong>completed</strong>: complete</li>
     * <li><strong>error</strong>: failed</li>
     * <li><strong>restoring</strong>: restoring</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
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
