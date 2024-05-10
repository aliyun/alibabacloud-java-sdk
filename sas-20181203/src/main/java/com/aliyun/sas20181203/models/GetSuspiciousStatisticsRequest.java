// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSuspiciousStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the asset group. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdList;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static GetSuspiciousStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuspiciousStatisticsRequest self = new GetSuspiciousStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetSuspiciousStatisticsRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public GetSuspiciousStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
