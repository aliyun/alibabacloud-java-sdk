// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the asset group. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdList;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the vulnerability whose statistics you want to query. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     * <p>*   **app**: vulnerability detected by using a web scanner</p>
     * <p>*   **sca**: vulnerability detected based on software component analysis</p>
     */
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
