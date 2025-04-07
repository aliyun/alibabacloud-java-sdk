// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersRequest extends TeaModel {
    /**
     * <p>1</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145341c-9708-4967-b3ec-24933767****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CoStatus")
    public String coStatus;

    /**
     * <p>The type of the change order. Valid values:</p>
     * <ul>
     * <li><strong>CoBindSlb</strong>: associates the Server Load Balancer (SLB) instance with the application.</li>
     * <li><strong>CoUnbindSlb</strong>: disassociates an SLB instance from the application.</li>
     * <li><strong>CoCreateApp</strong>: creates the application.</li>
     * <li><strong>CoDeleteApp</strong>: deletes the application.</li>
     * <li><strong>CoDeploy</strong>: deploys the application.</li>
     * <li><strong>CoRestartApplication</strong>: restarts the application.</li>
     * <li><strong>CoRollback</strong>: rolls back the application.</li>
     * <li><strong>CoScaleIn</strong>: scales in the application.</li>
     * <li><strong>CoScaleOut</strong>: scales out the application.</li>
     * <li><strong>CoStartApplication</strong>: starts the application.</li>
     * <li><strong>CoStopApplication</strong>: stops the application.</li>
     * <li><strong>CoRescaleApplicationVertically</strong>: modifies the instance type.</li>
     * <li><strong>CoDeployHistroy</strong>: rolls back the application to an earlier version.</li>
     * <li><strong>CoBindNas</strong>: associates a network-attached storage (NAS) file system with the application.</li>
     * <li><strong>CoUnbindNas</strong>: disassociates a NAS file system from the application.</li>
     * <li><strong>CoBatchStartApplication</strong>: starts multiple applications concurrently.</li>
     * <li><strong>CoBatchStopApplication</strong>: stops multiple applications concurrently.</li>
     * <li><strong>CoRestartInstances</strong>: restarts the instance.</li>
     * <li><strong>CoDeleteInstances</strong>: deletes the instance.</li>
     * <li><strong>CoScaleInAppWithInstances</strong>: reduces the specified number of application instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoCreateApp</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>20</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>CoCreateApp</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>test</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
