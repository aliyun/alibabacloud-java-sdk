// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribePackageOrdersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DesktopIdList")
    public java.util.List<String> desktopIdList;

    @NameInMap("OrderIdList")
    public java.util.List<String> orderIdList;

    @NameInMap("OrderStatusList")
    public java.util.List<String> orderStatusList;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductTypeList")
    public java.util.List<String> productTypeList;

    @NameInMap("ResourceIdList")
    public java.util.List<String> resourceIdList;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePackageOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageOrdersRequest self = new DescribePackageOrdersRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageOrdersRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribePackageOrdersRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePackageOrdersRequest setDesktopIdList(java.util.List<String> desktopIdList) {
        this.desktopIdList = desktopIdList;
        return this;
    }
    public java.util.List<String> getDesktopIdList() {
        return this.desktopIdList;
    }

    public DescribePackageOrdersRequest setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

    public DescribePackageOrdersRequest setOrderStatusList(java.util.List<String> orderStatusList) {
        this.orderStatusList = orderStatusList;
        return this;
    }
    public java.util.List<String> getOrderStatusList() {
        return this.orderStatusList;
    }

    public DescribePackageOrdersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePackageOrdersRequest setProductTypeList(java.util.List<String> productTypeList) {
        this.productTypeList = productTypeList;
        return this;
    }
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    public DescribePackageOrdersRequest setResourceIdList(java.util.List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }
    public java.util.List<String> getResourceIdList() {
        return this.resourceIdList;
    }

    public DescribePackageOrdersRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
