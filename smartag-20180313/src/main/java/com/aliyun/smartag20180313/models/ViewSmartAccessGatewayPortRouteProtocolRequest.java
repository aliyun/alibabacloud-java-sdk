// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayPortRouteProtocolRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only the Smart Access Gateway instances that belong to other accounts. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    /**
     * <p>The ID of the region where the Smart Access Gateway instance is deployed.</p>
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
     * <p>The ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-sv487b7lno6go5****</p>
     */
    @NameInMap("SagInsId")
    public String sagInsId;

    /**
     * <p>The serial number (SN) of the Smart Access Gateway device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sagf4dk****</p>
     */
    @NameInMap("SagSn")
    public String sagSn;

    public static ViewSmartAccessGatewayPortRouteProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayPortRouteProtocolRequest self = new ViewSmartAccessGatewayPortRouteProtocolRequest();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayPortRouteProtocolRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public ViewSmartAccessGatewayPortRouteProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewSmartAccessGatewayPortRouteProtocolRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public ViewSmartAccessGatewayPortRouteProtocolRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public ViewSmartAccessGatewayPortRouteProtocolRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
