// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Domain extends TeaModel {
    /**
     * <p>The time when the domain was created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The method used to calculate the hash value of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>sha1</p>
     */
    @NameInMap("data_hash_name")
    public String dataHashName;

    /**
     * <p>The description of the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>my domain</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>domain ID</p>
     * 
     * <strong>example:</strong>
     * <p>bj2</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The name of the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsdomain</p>
     */
    @NameInMap("domain_name")
    public String domainName;

    /**
     * <p>Specifies whether to enable the default drive feature. Valid values: true and false. A value of true specifies that all users are assigned a drive by default on the first logon. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>The size of the default drive. Unit: bytes. This parameter is required if you set init_drive_enable to true. Default value: 0. A value of 0 indicates that the size of the default drive is 0 byte and you cannot upload files to the drive. To initialize the default drive, set init_drive_size to a positive number or -1. A value of -1 indicates that the size is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>The ID of the parent domain. If the parent domain exists, the current domain is a child domain. Otherwise, the current domain is a common domain.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("parent_domain_id")
    public String parentDomainId;

    /**
     * <p>The access policy of the application.</p>
     */
    @NameInMap("published_app_access_strategy")
    public AppAccessStrategy publishedAppAccessStrategy;

    /**
     * <p>Specifies whether to enable sharing.</p>
     */
    @NameInMap("sharable")
    public Boolean sharable;

    /**
     * <p>The total storage quota for all drives in the domain. A value of 0 indicates that the quota is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    /**
     * <p>The used storage quota of all drives in the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota_used")
    public Long sizeQuotaUsed;

    /**
     * <p>The status of the domain. 1: The domain runs normally. 2: The domain is being created. 6: The domain has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("store_redundancy_type")
    public String storeRedundancyType;

    /**
     * <p>The time when the domain was last modified. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The usage of the logic space. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    /**
     * <p>The maximum allowed number of users.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("user_count_quota")
    public Long userCountQuota;

    public static Domain build(java.util.Map<String, ?> map) throws Exception {
        Domain self = new Domain();
        return TeaModel.build(map, self);
    }

    public Domain setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Domain setDataHashName(String dataHashName) {
        this.dataHashName = dataHashName;
        return this;
    }
    public String getDataHashName() {
        return this.dataHashName;
    }

    public Domain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Domain setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Domain setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public Domain setInitDriveEnable(Boolean initDriveEnable) {
        this.initDriveEnable = initDriveEnable;
        return this;
    }
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    public Domain setInitDriveSize(Long initDriveSize) {
        this.initDriveSize = initDriveSize;
        return this;
    }
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    public Domain setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
        return this;
    }
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    public Domain setPublishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
        this.publishedAppAccessStrategy = publishedAppAccessStrategy;
        return this;
    }
    public AppAccessStrategy getPublishedAppAccessStrategy() {
        return this.publishedAppAccessStrategy;
    }

    public Domain setSharable(Boolean sharable) {
        this.sharable = sharable;
        return this;
    }
    public Boolean getSharable() {
        return this.sharable;
    }

    public Domain setSizeQuota(Long sizeQuota) {
        this.sizeQuota = sizeQuota;
        return this;
    }
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    public Domain setSizeQuotaUsed(Long sizeQuotaUsed) {
        this.sizeQuotaUsed = sizeQuotaUsed;
        return this;
    }
    public Long getSizeQuotaUsed() {
        return this.sizeQuotaUsed;
    }

    public Domain setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Domain setStoreRedundancyType(String storeRedundancyType) {
        this.storeRedundancyType = storeRedundancyType;
        return this;
    }
    public String getStoreRedundancyType() {
        return this.storeRedundancyType;
    }

    public Domain setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Domain setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }
    public Long getUsedSize() {
        return this.usedSize;
    }

    public Domain setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

}
