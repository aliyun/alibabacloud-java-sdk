// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationRequest extends TeaModel {
    /**
     * <p>The instance ID of the instance for which you want to query the authorization relationship.</p>
     * <ul>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, set this parameter to the instance ID of the VBR instance.</p>
     * </li>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, set this parameter to the instance ID of the VPC-connected instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance for which you want to query the authorization relationship. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: Virtual Border vRouter (VBR) instance used for routing. Queries the VPC-connected instances that have authorized the VBR instance.</li>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) instance. Queries the VBR instances that the VPC-connected instance has authorized.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page for paging in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the VBR instance for which you want to query the authorization relationship.</p>
     * <ul>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, this parameter is required.</p>
     * </li>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
