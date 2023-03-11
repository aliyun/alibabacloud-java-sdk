// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTotalStatisticsRequest extends TeaModel {
    /**
     * <p>The source of data. Default value: **aqs**. Valid values:</p>
     * <br>
     * <p>*   **sas**: Security Center</p>
     * <p>*   **aqs**: Server Guard</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~130972~~) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name or public IP address of the asset.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static DescribeTotalStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatisticsRequest self = new DescribeTotalStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeTotalStatisticsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeTotalStatisticsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
