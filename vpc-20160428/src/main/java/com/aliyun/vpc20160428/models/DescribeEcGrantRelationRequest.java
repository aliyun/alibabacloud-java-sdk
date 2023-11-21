// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>*   If you set **InstanceType** to **VBR**, specify a VBR ID.</p>
     * <p>*   If you set **InstanceType** to **VPC**, specify a VPC ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance. Valid values:</p>
     * <br>
     * <p>*   **VBR**: queries the permissions that are granted to a VBR.</p>
     * <p>*   **VPC**: queries the permissions that are granted from a VPC.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the region where the instance is deployed.</p>
     * <br>
     * <p>*   If **InstanceType** is set to **VBR**, this parameter is required.</p>
     * <p>*   If **InstanceType** is set to **VPC**, you can ignore this parameter.</p>
     */
    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static DescribeEcGrantRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcGrantRelationRequest self = new DescribeEcGrantRelationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEcGrantRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeEcGrantRelationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeEcGrantRelationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEcGrantRelationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEcGrantRelationRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
