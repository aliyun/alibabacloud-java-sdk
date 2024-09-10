// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllRegionsStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the request. Default value: <strong>aqs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>sas</strong>: Security Center.</li>
     * <li><strong>aqs</strong>: Server Guard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/130972.html">DescribeAllGroups</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1161****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name or public IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>33.80.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAllRegionsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRegionsStatisticsRequest self = new DescribeAllRegionsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllRegionsStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAllRegionsStatisticsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeAllRegionsStatisticsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeAllRegionsStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
