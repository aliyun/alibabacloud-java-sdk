// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccountRequest extends TeaModel {
    /**
     * <p>The ID of the database account that you want to delete.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758839.html">ListDatabaseAccounts</a> operation to query the database account ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

    /**
     * <p>The ID of the bastion host from which you want to delete the database account.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host from which you want to delete the database account.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, <a href="https://help.aliyun.com/document_detail/40654.html">see Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccountRequest self = new DeleteDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccountRequest setDatabaseAccountId(String databaseAccountId) {
        this.databaseAccountId = databaseAccountId;
        return this;
    }
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    public DeleteDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
