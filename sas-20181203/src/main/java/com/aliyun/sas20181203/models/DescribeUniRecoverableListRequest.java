// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniRecoverableListRequest extends TeaModel {
    /**
     * <p>The number of the page from which query results start to be displayed. Default value: <strong>1</strong>. This value indicates that the results start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>msdb</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The maximum number of entries to display per page in a paged query. The default number of entries per page is 20. If PageSize is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Set PageSize to a non-empty value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the anti-ransomware backup policy for the database.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static DescribeUniRecoverableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniRecoverableListRequest self = new DescribeUniRecoverableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUniRecoverableListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUniRecoverableListRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeUniRecoverableListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUniRecoverableListRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
