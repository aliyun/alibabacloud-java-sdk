// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressRequest extends TeaModel {
    /**
     * <p>The type of service address. Valid values:</p>
     * <ul>
     * <li><strong>ProbeTask</strong>: probes the source IP address.</li>
     * <li><strong>RemoteWeb</strong>: probes the IP address for remote logon.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify a value, all service IP addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ProbeTask</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The serial number of the SAG device.</p>
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
