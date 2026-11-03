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
     * <li><strong>0</strong>: preparing</li>
     * <li><strong>1</strong>: executing</li>
     * <li><strong>2</strong>: executed successfully</li>
     * <li><strong>3</strong>: execution failed</li>
     * <li><strong>6</strong>: terminated</li>
     * <li><strong>8</strong>: waiting for manual batch confirmation</li>
     * <li><strong>9</strong>: waiting for automatic batch confirmation</li>
     * <li><strong>10</strong>: execution failed due to a system exception</li>
     * <li><strong>11</strong>: waiting for approval</li>
     * <li><strong>12</strong>: approved and waiting for execution</li>
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
     * <li><strong>CoBindSlb</strong>: bind an SLB instance</li>
     * <li><strong>CoUnbindSlb</strong>: unbind an SLB instance</li>
     * <li><strong>CoCreateApp</strong>: create an application</li>
     * <li><strong>CoDeleteApp</strong>: delete an application</li>
     * <li><strong>CoDeploy</strong>: deploy an application</li>
     * <li><strong>CoRestartApplication</strong>: restart an application</li>
     * <li><strong>CoRollback</strong>: roll back an application</li>
     * <li><strong>CoScaleIn</strong>: scale in an application</li>
     * <li><strong>CoScaleOut</strong>: scale out an application</li>
     * <li><strong>CoStartApplication</strong>: start an application</li>
     * <li><strong>CoStopApplication</strong>: stop an application</li>
     * <li><strong>CoRescaleApplicationVertically</strong>: change instance specifications</li>
     * <li><strong>CoDeployHistroy</strong>: roll back to a historical version</li>
     * <li><strong>CoBindNas</strong>: bind a NAS file system</li>
     * <li><strong>CoUnbindNas</strong>: unbind a NAS file system</li>
     * <li><strong>CoBatchStartApplication</strong>: start applications in batches</li>
     * <li><strong>CoBatchStopApplication</strong>: stop applications in batches</li>
     * <li><strong>CoRestartInstances</strong>: restart instances</li>
     * <li><strong>CoDeleteInstances</strong>: delete instances</li>
     * <li><strong>CoScaleInAppWithInstances</strong>: scale in specified instances</li>
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
     * <p>The keyword used for fuzzy match of the change order description. Change orders whose descriptions contain the keyword are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The sorting condition.</p>
     * 
     * <strong>example:</strong>
     * <p>create_time</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to sort the results in ascending order based on the field specified by the <strong>OrderBy</strong> parameter. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sort in ascending order</li>
     * <li><strong>false</strong>: sort in descending order</li>
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
