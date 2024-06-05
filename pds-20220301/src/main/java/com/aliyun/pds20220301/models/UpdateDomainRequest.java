// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    /**
     * <p>The description of the domain.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The name of the domain.</p>
     */
    @NameInMap("domain_name")
    public String domainName;

    /**
     * <p>Specifies whether to enable the default drive feature. A value of true specifies that all users are assigned a drive by default on the first logon. Default value: false.</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>The size of the default drive. Unit: bytes. You must specify init_drive_size if you set init_drive_enable to true. Default value: 0. A value of 0 specifies that the size of the default drive is 0 bytes and you cannot upload files to the drive. To initialize the default drive, set init_drive_size to 0. A value of -1 specifies that the size is unlimited.</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>The access policy of the application.</p>
     */
    @NameInMap("published_app_access_strategy")
    public AppAccessStrategy publishedAppAccessStrategy;

    /**
     * <p>The total storage quota for all drives in the domain. A value of 0 specifies that the quota is unlimited.</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    /**
     * <p>The maximum number of users that can be created in the domain.</p>
     */
    @NameInMap("user_count_quota")
    public Long userCountQuota;

    public static UpdateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRequest self = new UpdateDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public UpdateDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDomainRequest setInitDriveEnable(Boolean initDriveEnable) {
        this.initDriveEnable = initDriveEnable;
        return this;
    }
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    public UpdateDomainRequest setInitDriveSize(Long initDriveSize) {
        this.initDriveSize = initDriveSize;
        return this;
    }
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    public UpdateDomainRequest setPublishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
        this.publishedAppAccessStrategy = publishedAppAccessStrategy;
        return this;
    }
    public AppAccessStrategy getPublishedAppAccessStrategy() {
        return this.publishedAppAccessStrategy;
    }

    public UpdateDomainRequest setSizeQuota(Long sizeQuota) {
        this.sizeQuota = sizeQuota;
        return this;
    }
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    public UpdateDomainRequest setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

}
