// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSlinkTaskInfoRequest extends TeaModel {
    @NameInMap("FailPageNumber")
    public Integer failPageNumber;

    @NameInMap("FailPageSize")
    public Integer failPageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    @NameInMap("SuccessPageNumber")
    public Long successPageNumber;

    @NameInMap("SuccessPageSize")
    public Long successPageSize;

    public static DescribeSlinkTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlinkTaskInfoRequest self = new DescribeSlinkTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlinkTaskInfoRequest setFailPageNumber(Integer failPageNumber) {
        this.failPageNumber = failPageNumber;
        return this;
    }
    public Integer getFailPageNumber() {
        return this.failPageNumber;
    }

    public DescribeSlinkTaskInfoRequest setFailPageSize(Integer failPageSize) {
        this.failPageSize = failPageSize;
        return this;
    }
    public Integer getFailPageSize() {
        return this.failPageSize;
    }

    public DescribeSlinkTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlinkTaskInfoRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public DescribeSlinkTaskInfoRequest setSuccessPageNumber(Long successPageNumber) {
        this.successPageNumber = successPageNumber;
        return this;
    }
    public Long getSuccessPageNumber() {
        return this.successPageNumber;
    }

    public DescribeSlinkTaskInfoRequest setSuccessPageSize(Long successPageSize) {
        this.successPageSize = successPageSize;
        return this;
    }
    public Long getSuccessPageSize() {
        return this.successPageSize;
    }

}
