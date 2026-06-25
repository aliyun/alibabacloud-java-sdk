// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145341c-9708-4967-b3ec-24933767****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The status of the change order. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Preparing.</p>
     * </li>
     * <li><p><strong>1</strong>: In progress.</p>
     * </li>
     * <li><p><strong>2</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>3</strong>: Failed.</p>
     * </li>
     * <li><p><strong>6</strong>: Stopped.</p>
     * </li>
     * <li><p><strong>8</strong>: Paused for manual confirmation.</p>
     * </li>
     * <li><p><strong>9</strong>: Paused for automatic confirmation.</p>
     * </li>
     * <li><p><strong>10</strong>: Failed due to a system exception.</p>
     * </li>
     * <li><p><strong>11</strong>: Pending approval.</p>
     * </li>
     * <li><p><strong>12</strong>: Approved and pending execution.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CoStatus")
    public String coStatus;

    /**
     * <p>The type of the change order. Valid values:</p>
     * <ul>
     * <li><p><strong>CoBindSlb</strong>: Attach an SLB instance.</p>
     * </li>
     * <li><p><strong>CoUnbindSlb</strong>: Detach an SLB instance.</p>
     * </li>
     * <li><p><strong>CoCreateApp</strong>: Create an application.</p>
     * </li>
     * <li><p><strong>CoDeleteApp</strong>: Delete an application.</p>
     * </li>
     * <li><p><strong>CoDeploy</strong>: Deploy an application.</p>
     * </li>
     * <li><p><strong>CoRestartApplication</strong>: Restart an application.</p>
     * </li>
     * <li><p><strong>CoRollback</strong>: Roll back an application.</p>
     * </li>
     * <li><p><strong>CoScaleIn</strong>: Scale in an application.</p>
     * </li>
     * <li><p><strong>CoScaleOut</strong>: Scale out an application.</p>
     * </li>
     * <li><p><strong>CoStartApplication</strong>: Start an application.</p>
     * </li>
     * <li><p><strong>CoStopApplication</strong>: Stop an application.</p>
     * </li>
     * <li><p><strong>CoRescaleApplicationVertically</strong>: Change the instance type.</p>
     * </li>
     * <li><p><strong>CoDeployHistroy</strong>: Roll back to a previous version.</p>
     * </li>
     * <li><p><strong>CoBindNas</strong>: Attach a NAS file system.</p>
     * </li>
     * <li><p><strong>CoUnbindNas</strong>: Detach a NAS file system.</p>
     * </li>
     * <li><p><strong>CoBatchStartApplication</strong>: Batch start applications.</p>
     * </li>
     * <li><p><strong>CoBatchStopApplication</strong>: Batch stop applications.</p>
     * </li>
     * <li><p><strong>CoRestartInstances</strong>: Restart instances.</p>
     * </li>
     * <li><p><strong>CoDeleteInstances</strong>: Delete instances.</p>
     * </li>
     * <li><p><strong>CoScaleInAppWithInstances</strong>: Scale in an application by specifying instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoCreateApp</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword for a fuzzy search of change order descriptions. The operation returns only the change orders whose descriptions contain the <strong>keyword</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The field by which to sort the results.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order for the field specified by the <strong>OrderBy</strong> parameter. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The results are sorted in ascending order.</p>
     * </li>
     * <li><p><strong>false</strong>: The results are sorted in descending order.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    public static ListChangeOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeOrdersRequest self = new ListChangeOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeOrdersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListChangeOrdersRequest setCoStatus(String coStatus) {
        this.coStatus = coStatus;
        return this;
    }
    public String getCoStatus() {
        return this.coStatus;
    }

    public ListChangeOrdersRequest setCoType(String coType) {
        this.coType = coType;
        return this;
    }
    public String getCoType() {
        return this.coType;
    }

    public ListChangeOrdersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListChangeOrdersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListChangeOrdersRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListChangeOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChangeOrdersRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
