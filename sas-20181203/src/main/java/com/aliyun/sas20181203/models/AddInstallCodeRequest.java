// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeRequest extends TeaModel {
    /**
     * <p>The validity period of the installation command. The value is a 13-digit timestamp.</p>
     * <blockquote>
     * <p> The installation command is valid only within the validity period. An expired installation command cannot be used to install the Security Center agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1680257463853</p>
     */
    @NameInMap("ExpiredDate")
    public Long expiredDate;

    /**
     * <p>The ID of the asset group to which you want to add the asset.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8076980</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Specifies whether to create an image. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not create an image.</li>
     * <li><strong>true</strong>: creates an image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyImage")
    public Boolean onlyImage;

    /**
     * <p>The operating system of the asset. Default value: <strong>linux</strong>. Valid values:</p>
     * <ul>
     * <li><strong>linux</strong></li>
     * <li><strong>windows</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The ID of the PrivateLink endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>72845</p>
     */
    @NameInMap("PrivateLinkId")
    public Long privateLinkId;

    /**
     * <p>The name of the proxy cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy_test</p>
     */
    @NameInMap("ProxyCluster")
    public String proxyCluster;

    /**
     * <p>The name of the service provider for the asset. Default value: <strong>ALIYUN</strong>.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeVendorList~~">DescribeVendorList</a> operation to query the names of service providers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("VendorName")
    public String vendorName;

    public static AddInstallCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstallCodeRequest self = new AddInstallCodeRequest();
        return TeaModel.build(map, self);
    }

    public AddInstallCodeRequest setExpiredDate(Long expiredDate) {
        this.expiredDate = expiredDate;
        return this;
    }
    public Long getExpiredDate() {
        return this.expiredDate;
    }

    public AddInstallCodeRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public AddInstallCodeRequest setOnlyImage(Boolean onlyImage) {
        this.onlyImage = onlyImage;
        return this;
    }
    public Boolean getOnlyImage() {
        return this.onlyImage;
    }

    public AddInstallCodeRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public AddInstallCodeRequest setPrivateLinkId(Long privateLinkId) {
        this.privateLinkId = privateLinkId;
        return this;
    }
    public Long getPrivateLinkId() {
        return this.privateLinkId;
    }

    public AddInstallCodeRequest setProxyCluster(String proxyCluster) {
        this.proxyCluster = proxyCluster;
        return this;
    }
    public String getProxyCluster() {
        return this.proxyCluster;
    }

    public AddInstallCodeRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
