// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzko7fsuj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the application. You can specify the status of the applications that you want to query. After an application is created, it enters the <strong>Normal</strong> state. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoRequest self = new ListAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAppInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInfoRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAppInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
