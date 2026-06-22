// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedAssetsRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public String current;

    /**
     * <p>The severity level. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li>serious: urgent</li>
     * <li>suspicious: suspicious</li>
     * <li>remind: reminder.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious,suspicious,remind</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The maximum number of entries per page in a paginated query. Default value: 20. If this parameter is left empty, 20 entries are returned.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeAffectedAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedAssetsRequest self = new DescribeAffectedAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedAssetsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public DescribeAffectedAssetsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeAffectedAssetsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
