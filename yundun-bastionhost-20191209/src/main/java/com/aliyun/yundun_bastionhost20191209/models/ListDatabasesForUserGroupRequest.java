// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupRequest extends TeaModel {
    /**
     * <p>The address of the database that you want to query. Only term query is supported.</p>
     * 
     * <strong>example:</strong>
     * <p><code>47.101.**.**</code></p>
     */
    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    /**
     * <p>The name of the database instance that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The type of the database that you want to query. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>SQLServer</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2ve7h00a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the network domain.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The page number of the paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries to return on each page for a paged query.<br> The maximum value of the PageSize parameter is 100. By default, 20 entries are returned on each page. If you leave the PageSize parameter empty, 20 entries are returned.</p>
     * <blockquote>
     * <p>We recommend that you do not leave the PageSize parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group for which you want to query authorized databases.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListDatabasesForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserGroupRequest self = new ListDatabasesForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserGroupRequest setDatabaseAddress(String databaseAddress) {
        this.databaseAddress = databaseAddress;
        return this;
    }
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    public ListDatabasesForUserGroupRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListDatabasesForUserGroupRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public ListDatabasesForUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDatabasesForUserGroupRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ListDatabasesForUserGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabasesForUserGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatabasesForUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDatabasesForUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
