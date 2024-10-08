// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockInstancesRequest extends TeaModel {
    /**
     * <p>The IP address that you want to specify in the rule.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomBlockRecords~~">DescribeCustomBlockRecords</a> operation to obtain the IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.92.33.1xx</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that you want to specify in the custom rule. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound</li>
     * <li><strong>out</strong>: outbound</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Bound")
    public String bound;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the rule is enabled for the server.</p>
     * <ul>
     * <li><strong>2</strong>: enabling failed</li>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCustomBlockInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockInstancesRequest self = new DescribeCustomBlockInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockInstancesRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DescribeCustomBlockInstancesRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public DescribeCustomBlockInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCustomBlockInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomBlockInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCustomBlockInstancesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
