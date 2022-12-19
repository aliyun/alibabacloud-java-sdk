// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsRequest extends TeaModel {
    // The ID of the asset group. Separate multiple IDs with commas (,). 
    // > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups
    @NameInMap("GroupIdList")
    public String groupIdList;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the vulnerability whose statistics you want to query. Separate multiple vulnerability types with commas (,). Valid values:
    // - **cve**:Linux software vulnerabilities
    // - **sys**:Windows system vulnerabilities
    // - **cms**: Web-CMS vulnerabilities
    // - **emg**: urgent vulnerabilities
    // - **app**: application vulnerabilities
    // - **sca**: vulnerabilities that are detected based on software component analysis
    @NameInMap("TypeList")
    public String typeList;

    public static GetVulStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsRequest self = new GetVulStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public String getGroupIdList() {
        return this.groupIdList;
    }

    public GetVulStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetVulStatisticsRequest setTypeList(String typeList) {
        this.typeList = typeList;
        return this;
    }
    public String getTypeList() {
        return this.typeList;
    }

}
