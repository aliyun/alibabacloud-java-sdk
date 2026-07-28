// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationRequest extends TeaModel {
    /**
     * <p>The instance ID of the instance for which you want to query authorization relationships.</p>
     * <ul>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, set this parameter to the VBR instance ID.</p>
     * </li>
     * <li><p>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, set this parameter to the VPC-connected instance ID.</p>
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
     * <p>The type of instance for which you want to query authorization relationships. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: Virtual Border Router (VBR) instance. Queries the VPC-connected instances that have granted authorization to the VBR instance.</li>
     * <li><strong>VPC</strong>: virtual private cloud (VPC) instance. Queries the VBR instances to which the VPC-connected instance has granted authorization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the VBR instance for which you want to query authorization relationships.</p>
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
