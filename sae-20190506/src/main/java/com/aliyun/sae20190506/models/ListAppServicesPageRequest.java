// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6dcc8c9e-d3da-478a-a066-86dcf820****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 0 to 9999.</p>
     * 
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>dubbo</strong></li>
     * <li><strong>springCloud</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ListAppServicesPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesPageRequest self = new ListAppServicesPageRequest();
        return TeaModel.build(map, self);
    }

    public ListAppServicesPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppServicesPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppServicesPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppServicesPageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
