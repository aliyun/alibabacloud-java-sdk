// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The description of the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>domain for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_domain</p>
     */
    @NameInMap("domain_name")
    public String domainName;

    /**
     * <p>Specifies whether to enable the default drive feature. A value of true specifies that all users are assigned a drive by default on the first logon. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>The size of the default drive. Unit: bytes. You must specify init_drive_size if you set init_drive_enable to true. Default value: 0. A value of 0 specifies that the size of the default drive is 0 bytes and you cannot upload files to the drive. To initialize the default drive, set init_drive_size to 0. A value of -1 specifies that the size is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>The ID of the parent domain. If you want to create a child domain, specify parent_domain_id. In most cases, you do not need to create a child domain. If you want to perform secondary operations based on Drive and Photo Service, contact the customer service.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("parent_domain_id")
    public String parentDomainId;

    /**
     * <p>The total storage quota for all drives in the domain. A value of 0 specifies that the quota is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    /**
     * <p>The largest number of users that can be created in the domain. A value of 0 specifies that the number is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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
