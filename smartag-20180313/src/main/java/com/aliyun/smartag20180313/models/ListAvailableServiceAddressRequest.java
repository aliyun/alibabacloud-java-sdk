// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressRequest extends TeaModel {
    /**
     * <p>The type of the service address for the Smart Access Gateway instance. Valid values:</p>
     * <ul>
     * <li><p><strong>ProbeTask</strong>: the source IP address for network probes.</p>
     * </li>
     * <li><p><strong>RemoteWeb</strong>: the IP address for remote logon.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all types of service addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ProbeTask</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the region where the Smart Access Gateway instance is deployed.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The serial number of the Smart Access Gateway device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag****</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static ListAvailableServiceAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableServiceAddressRequest self = new ListAvailableServiceAddressRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableServiceAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ListAvailableServiceAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAvailableServiceAddressRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public ListAvailableServiceAddressRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
