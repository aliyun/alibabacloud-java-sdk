// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAntiBruteForceRulesRequest extends TeaModel {
    /**
     * <p>Set which page of the returned results to start displaying the query results. The default value is <strong>1</strong>, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the anti-brute force rule.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeAntiBruteForceRules~~">DescribeAntiBruteForceRules</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1141****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the brute force rule.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of data entries displayed per page during a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>121.69.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAntiBruteForceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntiBruteForceRulesRequest self = new DescribeAntiBruteForceRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntiBruteForceRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAntiBruteForceRulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeAntiBruteForceRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAntiBruteForceRulesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAntiBruteForceRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAntiBruteForceRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
