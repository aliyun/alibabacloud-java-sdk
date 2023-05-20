// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeRequest extends TeaModel {
    @NameInMap("ExpiredDate")
    public Long expiredDate;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OnlyImage")
    public Boolean onlyImage;

    @NameInMap("Os")
    public String os;

    @NameInMap("ProxyCluster")
    public String proxyCluster;

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
