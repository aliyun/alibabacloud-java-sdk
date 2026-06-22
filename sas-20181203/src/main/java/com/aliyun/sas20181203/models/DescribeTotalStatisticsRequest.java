// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTotalStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the data request. Default value: <strong>aqs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>sas</strong>: The data request comes from Security Center.</li>
     * <li><strong>aqs</strong>: The data request comes from Server Guard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/130972.html">DescribeAllGroups</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8076980</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The asset name or public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>222.185.XX.XX</p>
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
