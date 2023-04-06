// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("domain_name")
    public String domainName;

    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    @NameInMap("init_drive_size")
    public Long initDriveSize;

    @NameInMap("parent_domain_id")
    public String parentDomainId;

    @NameInMap("size_quota")
    public Long sizeQuota;

    @NameInMap("user_count_quota")
    public Long userCountQuota;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDomainRequest setInitDriveEnable(Boolean initDriveEnable) {
        this.initDriveEnable = initDriveEnable;
        return this;
    }
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    public CreateDomainRequest setInitDriveSize(Long initDriveSize) {
        this.initDriveSize = initDriveSize;
        return this;
    }
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    public CreateDomainRequest setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
        return this;
    }
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    public CreateDomainRequest setSizeQuota(Long sizeQuota) {
        this.sizeQuota = sizeQuota;
        return this;
    }
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    public CreateDomainRequest setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

}
