// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayGlobalRouteProtocolRequest extends TeaModel {
    /**
     * <p>Specifies whether the query is limited to cross-account Smart Access Gateway instances. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): No.</p>
     * </li>
     * <li><p><strong>true</strong>: Yes.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to retrieve region IDs.</p>
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
     * <p>The ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-iv408aov6k7xxm****</p>
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

    public static ViewSmartAccessGatewayGlobalRouteProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayGlobalRouteProtocolRequest self = new ViewSmartAccessGatewayGlobalRouteProtocolRequest();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public ViewSmartAccessGatewayGlobalRouteProtocolRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
