// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTotalStatisticsRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("GroupId")
    public Long groupId;

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
