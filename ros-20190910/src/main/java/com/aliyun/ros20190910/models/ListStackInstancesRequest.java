// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>*   Pages start from page 1.</p>
     * <p>*   Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Valid values: 1 to 50.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\\</p>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the destination account to which the stack belongs.</p>
     * <br>
     * <p>*   If the stack group is granted self-managed permissions, the stack belongs to an Alibaba Cloud account.</p>
     * <p>*   If the stack group is granted service-managed permissions, the stack belongs to a member in a resource directory.</p>
     * <br>
     * <p>> For more information about the destination account, see [Overview](https://help.aliyun.com/document_detail/154578.html).</p>
     */
    @NameInMap("StackInstanceAccountId")
    public String stackInstanceAccountId;

    /**
     * <p>The region ID of the stack.</p>
     */
    @NameInMap("StackInstanceRegionId")
    public String stackInstanceRegionId;

    public static ListStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesRequest self = new ListStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStackInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public ListStackInstancesRequest setStackInstanceAccountId(String stackInstanceAccountId) {
        this.stackInstanceAccountId = stackInstanceAccountId;
        return this;
    }
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    public ListStackInstancesRequest setStackInstanceRegionId(String stackInstanceRegionId) {
        this.stackInstanceRegionId = stackInstanceRegionId;
        return this;
    }
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

}
