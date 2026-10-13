// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Domain extends TeaModel {
    /**
     * <p>The time when the domain was created. The time is in the ISO 8601 format. Example: 2019-03-28T13:03:29.298Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The name of the algorithm that is used to calculate the data hash value.</p>
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
     * <p>The ID of the domain.</p>
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
     * <p>Specifies whether to automatically create a default drive for each user when they first log on. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>The size of the default drive in bytes. This parameter is required if <code>init_drive_enable</code> is set to <code>true</code>. The default value is <code>0</code>, which specifies that the drive is 0 bytes in size and files cannot be uploaded. To initialize the drive, set this parameter to a non-zero value. A value of -1 indicates an unlimited size.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>The ID of the parent domain. If specified, the domain is a child domain. Otherwise, it is a standard domain.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("parent_domain_id")
    public String parentDomainId;

    /**
     * <p>The access policy of applications.</p>
     */
    @NameInMap("published_app_access_strategy")
    public AppAccessStrategy publishedAppAccessStrategy;

    /**
     * <p>Indicates whether sharing is enabled.</p>
     */
    @NameInMap("sharable")
    public Boolean sharable;

    /**
     * <p>The total quota of all drives in the domain. A value of 0 indicates that the quota is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    /**
     * <p>The used quota of all drives.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota_used")
    public Long sizeQuotaUsed;

    /**
     * <p>The status of the domain. Valid values: 1: enabled. 2: being created. 6: expired.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>The storage redundancy type.</p>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("store_redundancy_type")
    public String storeRedundancyType;

    /**
     * <p>The time when the domain was last modified. The time is in the ISO 8601 format. Example: 2019-04-08T07:05:18.825Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("updated_at")
    public String updatedAt;

    /**
     * <p>The used logical space in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("used_size")
    public Long usedSize;

    /**
     * <p>The quota of users.</p>
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
