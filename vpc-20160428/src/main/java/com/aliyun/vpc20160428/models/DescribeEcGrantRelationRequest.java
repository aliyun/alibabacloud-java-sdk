// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <ul>
     * <li>If you set <strong>InstanceType</strong> to <strong>VBR</strong>, specify a VBR ID.</li>
     * <li>If you set <strong>InstanceType</strong> to <strong>VPC</strong>, specify a VPC ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: queries the permissions that are granted to a VBR.</li>
     * <li><strong>VPC</strong>: queries the permissions that are granted from a VPC.</li>
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
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the region where the instance is deployed.</p>
     * <ul>
     * <li>If <strong>InstanceType</strong> is set to <strong>VBR</strong>, this parameter is required.</li>
     * <li>If <strong>InstanceType</strong> is set to <strong>VPC</strong>, you can ignore this parameter.</li>
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
