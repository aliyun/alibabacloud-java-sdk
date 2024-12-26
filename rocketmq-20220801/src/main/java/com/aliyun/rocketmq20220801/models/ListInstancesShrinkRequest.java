// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The filter condition that is used to query instances. If you do not configure this parameter, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-7e22ody****</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The page number.</p>
     * <p>Valid values: 1 to 100000000.</p>
     * <p>If you set this parameter to a value smaller than 1, the system uses 1 as the value. If you set this parameter to a value greater than 100000000, the system uses 100000000 as the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Value values: 10 to 200.</p>
     * <p>If you set this parameter to a value smaller than 10, the system uses 10 as the value. If you set this parameter to a value greater than 200, the system uses 200 as the value.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx7caj******</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The primary edition of the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard: Standard Edition</li>
     * <li>ultimate: Enterprise Platinum Edition</li>
     * <li>professional: Professional Edition</li>
     * </ul>
     */
    @NameInMap("seriesCodes")
    public String seriesCodesShrink;

    /**
     * <p>The storage encryption key.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("storageSecretKey")
    public String storageSecretKey;

    /**
     * <p>The tags that are used to filter instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;rmq-test&quot;, &quot;value&quot;: &quot;test&quot;}]</p>
     */
    @NameInMap("tags")
    public String tags;

    public static ListInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesShrinkRequest self = new ListInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesShrinkRequest setSeriesCodesShrink(String seriesCodesShrink) {
        this.seriesCodesShrink = seriesCodesShrink;
        return this;
    }
    public String getSeriesCodesShrink() {
        return this.seriesCodesShrink;
    }

    public ListInstancesShrinkRequest setStorageSecretKey(String storageSecretKey) {
        this.storageSecretKey = storageSecretKey;
        return this;
    }
    public String getStorageSecretKey() {
        return this.storageSecretKey;
    }

    public ListInstancesShrinkRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
