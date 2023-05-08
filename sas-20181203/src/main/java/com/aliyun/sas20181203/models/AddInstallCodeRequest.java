// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeRequest extends TeaModel {
    /**
     * <p>6134</p>
     */
    @NameInMap("ExpiredDate")
    public Long expiredDate;

    /**
     * <p>Specifies whether to create an image. Default value: **false**. Valid values:</p>
     * <br>
     * <p>*   **false**: does not create an image.</p>
     * <p>*   **true**: creates an image.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The operating system of the instance. Default value: **linux**. Valid values:</p>
     * <br>
     * <p>*   **linux**</p>
     * <p>*   **windows**</p>
     * <p>*   **windows-2003**</p>
     */
    @NameInMap("OnlyImage")
    public Boolean onlyImage;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The ID of the asset group to which the you want to add the asset.</p>
     * <br>
     * <p>>  You can call the [DescribeAllGroups](~~describeallgroups~~) operation to query the IDs of asset groups.</p>
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

    public AddInstallCodeRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
