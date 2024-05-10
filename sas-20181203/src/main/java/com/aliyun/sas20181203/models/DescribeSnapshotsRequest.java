// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The version of the anti-ransomware policy. Valid values:</p>
     * <br>
     * <p>*   **1.0.0**</p>
     * <p>*   **2.0.0**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the server is an Elastic Compute Service (ECS) instance. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsAliYunEcs")
    public String isAliYunEcs;

    /**
     * <p>The region in which the server resides.</p>
     */
    @NameInMap("MachineRegion")
    public String machineRegion;

    /**
     * <p>The name or IP address of the server.</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The starting position of the query. If this parameter is left empty, the query starts from the beginning.</p>
     * <br>
     * <p>>  If you call the operation for the first time, you do not need to specify the parameter. The response to the first call contains the token that can be used for the second call. Each subsequent response contains the token that can be used for the next call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of backup snapshots from which data can be restored. Valid values:</p>
     * <br>
     * <p>*   **COMPLETE**: complete</p>
     * <p>*   **PARTIAL_COMPLETE**: partial complete</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The UUID of the server.</p>
     * <br>
     * <p>>  You can call the [DescribeBackupPolicy](~~DescribeBackupPolicy~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeSnapshotsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSnapshotsRequest setIsAliYunEcs(String isAliYunEcs) {
        this.isAliYunEcs = isAliYunEcs;
        return this;
    }
    public String getIsAliYunEcs() {
        return this.isAliYunEcs;
    }

    public DescribeSnapshotsRequest setMachineRegion(String machineRegion) {
        this.machineRegion = machineRegion;
        return this;
    }
    public String getMachineRegion() {
        return this.machineRegion;
    }

    public DescribeSnapshotsRequest setMachineRemark(String machineRemark) {
        this.machineRemark = machineRemark;
        return this;
    }
    public String getMachineRemark() {
        return this.machineRemark;
    }

    public DescribeSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeSnapshotsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
