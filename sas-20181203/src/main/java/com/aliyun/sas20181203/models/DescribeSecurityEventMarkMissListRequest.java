// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert event. The value indicates a subtype.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The condition that is used to query alert events by asset. You can enter an IP address, a public IP address, an internal IP address, or an asset name for fuzzy match.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecurityEventMarkMissListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventMarkMissListRequest self = new DescribeSecurityEventMarkMissListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventMarkMissListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSecurityEventMarkMissListRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeSecurityEventMarkMissListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityEventMarkMissListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeSecurityEventMarkMissListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityEventMarkMissListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
