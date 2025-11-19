// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribePackageOrdersShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DesktopIdList")
    public String desktopIdListShrink;

    @NameInMap("OrderIdList")
    public String orderIdListShrink;

    @NameInMap("OrderStatusList")
    public String orderStatusListShrink;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductTypeList")
    public String productTypeListShrink;

    @NameInMap("ResourceIdList")
    public String resourceIdListShrink;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribePackageOrdersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageOrdersShrinkRequest self = new DescribePackageOrdersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageOrdersShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribePackageOrdersShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePackageOrdersShrinkRequest setDesktopIdListShrink(String desktopIdListShrink) {
        this.desktopIdListShrink = desktopIdListShrink;
        return this;
    }
    public String getDesktopIdListShrink() {
        return this.desktopIdListShrink;
    }

    public DescribePackageOrdersShrinkRequest setOrderIdListShrink(String orderIdListShrink) {
        this.orderIdListShrink = orderIdListShrink;
        return this;
    }
    public String getOrderIdListShrink() {
        return this.orderIdListShrink;
    }

    public DescribePackageOrdersShrinkRequest setOrderStatusListShrink(String orderStatusListShrink) {
        this.orderStatusListShrink = orderStatusListShrink;
        return this;
    }
    public String getOrderStatusListShrink() {
        return this.orderStatusListShrink;
    }

    public DescribePackageOrdersShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePackageOrdersShrinkRequest setProductTypeListShrink(String productTypeListShrink) {
        this.productTypeListShrink = productTypeListShrink;
        return this;
    }
    public String getProductTypeListShrink() {
        return this.productTypeListShrink;
    }

    public DescribePackageOrdersShrinkRequest setResourceIdListShrink(String resourceIdListShrink) {
        this.resourceIdListShrink = resourceIdListShrink;
        return this;
    }
    public String getResourceIdListShrink() {
        return this.resourceIdListShrink;
    }

    public DescribePackageOrdersShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
