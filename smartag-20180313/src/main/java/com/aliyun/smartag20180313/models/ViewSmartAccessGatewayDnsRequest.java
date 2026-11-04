// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only Smart Access Gateway instances that belong to other accounts. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the Smart Access Gateway instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>109790620697****</p>
     */
    @NameInMap("ResourceUid")
    public String resourceUid;

    /**
     * <p>The Smart Access Gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-sv487b7lno6go5****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number of the Smart Access Gateway device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4ea****</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    public static ViewSmartAccessGatewayDnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsRequest self = new ViewSmartAccessGatewayDnsRequest();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public ViewSmartAccessGatewayDnsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewSmartAccessGatewayDnsRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public ViewSmartAccessGatewayDnsRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public ViewSmartAccessGatewayDnsRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
