// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The description of the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud drive dev</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud drive</p>
     */
    @NameInMap("domain_name")
    public String domainName;

    /**
     * <p>Specifies whether to enable a default drive for users. If set to <code>true</code>, a drive is automatically provisioned for each user upon their first login. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("init_drive_enable")
    public Boolean initDriveEnable;

    /**
     * <p>This parameter is required if <code>init_drive_enable</code> is set to <code>true</code>. The size of the default drive for new users, in bytes. The default value is <code>0</code>, which creates a drive with zero capacity, preventing users from uploading files. To provide initial storage, you must set this parameter. A value of <code>-1</code> indicates an unlimited size.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("init_drive_size")
    public Long initDriveSize;

    /**
     * <p>The ID of the parent domain. Set this parameter to create a child domain. This parameter is optional. For information about implementing custom operations, contact PDS customer service.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("parent_domain_id")
    public String parentDomainId;

    /**
     * <p>The total storage quota for the domain, in bytes. This value represents the combined storage limit for all drives within the domain. A value of <code>0</code> indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1099511627776</p>
     */
    @NameInMap("size_quota")
    public Long sizeQuota;

    /**
     * <p>The storage redundancy type. Valid values:</p>
     * <ul>
     * <li><p><code>LRS</code>: Locally Redundant Storage</p>
     * </li>
     * <li><p><code>ZRS</code>: Zone-Redundant Storage</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("store_redundancy_type")
    public String storeRedundancyType;

    /**
     * <p>The user count quota for the domain. This specifies the maximum number of users that can be created. A value of <code>0</code> indicates no limit.</p>
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

    public CreateDomainRequest setStoreRedundancyType(String storeRedundancyType) {
        this.storeRedundancyType = storeRedundancyType;
        return this;
    }
    public String getStoreRedundancyType() {
        return this.storeRedundancyType;
    }

    public CreateDomainRequest setUserCountQuota(Long userCountQuota) {
        this.userCountQuota = userCountQuota;
        return this;
    }
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

}
