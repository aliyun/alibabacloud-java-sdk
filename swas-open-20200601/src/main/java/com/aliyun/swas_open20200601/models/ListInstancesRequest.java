// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the simple application server. Set the value to PrePaid, which indicates the subscription billing method. Only the subscription billing method is supported.</p>
     * <br>
     * <p>Default value: PrePaid.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the simple application servers. The value can be a JSON array that consists of up to 100 simple application server IDs. Separate the server IDs with commas (,).</p>
     * <br>
     * <p>>  If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that each specified ID and its corresponding public IP address belong to the same simple application server. Otherwise, an empty result is returned.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The public IP addresses of the simple application servers. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     * <br>
     * <p>>  If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that each specified ID and its corresponding public IP address belong to the same simple application server. Otherwise, an empty result is returned.</p>
     */
    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    /**
     * <p>The region ID of the simple application servers.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setPublicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public ListInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
