// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeRequest extends TeaModel {
    // The validity period of the installation command. The value is a 13-digit timestamp.
    // 
    // >  The installation command is valid only within the validity period. An expired installation command cannot be used to install the Security Center agent.
    @NameInMap("ExpiredDate")
    public Long expiredDate;

    // The ID of the asset group to which the you want to add the asset.
    // 
    // >  You can call the [DescribeAllGroups](~~describeallgroups~~) operation to query the IDs of asset groups.
    @NameInMap("GroupId")
    public Long groupId;

    // Specifies whether to create an image. Default value: **false**. Valid values:
    // 
    // *   **false**: does not create an image.
    // *   **true**: creates an image.
    @NameInMap("OnlyImage")
    public Boolean onlyImage;

    // The operating system of the instance. Default value: **linux**. Valid values:
    // 
    // *   **linux**
    // *   **windows**
    // *   **windows-2003**
    @NameInMap("Os")
    public String os;

    // The name of the service provider for the asset. Default value: **ALIYUN**.
    // 
    // >  You can call the [DescribeVendorList](~~DescribeVendorList~~) operation to query the names of service providers.
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

    public AddInstallCodeRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
