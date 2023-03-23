// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageRequest extends TeaModel {
    /**
     * <p>6dcc8c9e-d3da-478a-a066-86dcf820\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>9999</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
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
