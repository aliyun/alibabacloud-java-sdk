// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRplInspectionTaskRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailPageNumber")
    public Integer failPageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailPageSize")
    public Integer failPageSize;

    /**
     * <p>The region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The switchover task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <p>The requested page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessPageNumber")
    public Long successPageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SuccessPageSize")
    public Long successPageSize;

    public static DescribeRplInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRplInspectionTaskRequest self = new DescribeRplInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRplInspectionTaskRequest setFailPageNumber(Integer failPageNumber) {
        this.failPageNumber = failPageNumber;
        return this;
    }
    public Integer getFailPageNumber() {
        return this.failPageNumber;
    }

    public DescribeRplInspectionTaskRequest setFailPageSize(Integer failPageSize) {
        this.failPageSize = failPageSize;
        return this;
    }
    public Integer getFailPageSize() {
        return this.failPageSize;
    }

    public DescribeRplInspectionTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRplInspectionTaskRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public DescribeRplInspectionTaskRequest setSuccessPageNumber(Long successPageNumber) {
        this.successPageNumber = successPageNumber;
        return this;
    }
    public Long getSuccessPageNumber() {
        return this.successPageNumber;
    }

    public DescribeRplInspectionTaskRequest setSuccessPageSize(Long successPageSize) {
        this.successPageSize = successPageSize;
        return this;
    }
    public Long getSuccessPageSize() {
        return this.successPageSize;
    }

}
