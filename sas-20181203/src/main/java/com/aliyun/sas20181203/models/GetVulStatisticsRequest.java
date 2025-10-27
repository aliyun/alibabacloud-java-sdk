// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the asset group. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9997897</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdList;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10.12.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the vulnerability whose statistics you want to query. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * <li><strong>app</strong>: vulnerability detected by using a web scanner</li>
     * <li><strong>sca</strong>: vulnerability detected based on software component analysis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
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

    public GetVulStatisticsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
