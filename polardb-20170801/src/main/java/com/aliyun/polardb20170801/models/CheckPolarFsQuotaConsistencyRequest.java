// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarFsQuotaConsistencyRequest extends TeaModel {
    /**
     * <p>Specifies whether to repair an inconsistent quota. Valid values:</p>
     * <ul>
     * <li><p>false</p>
     * </li>
     * <li><p>true</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRepair")
    public Boolean enableRepair;

    /**
     * <p>Specifies whether to calculate the total usage of the directory in strict mode. Valid values:</p>
     * <ul>
     * <li><p>false</p>
     * </li>
     * <li><p>true</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableStrictCalculate")
    public Boolean enableStrictCalculate;

    /**
     * <p>The directory path.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the PolarFS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-test****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static CheckPolarFsQuotaConsistencyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarFsQuotaConsistencyRequest self = new CheckPolarFsQuotaConsistencyRequest();
        return TeaModel.build(map, self);
    }

    public CheckPolarFsQuotaConsistencyRequest setEnableRepair(Boolean enableRepair) {
        this.enableRepair = enableRepair;
        return this;
    }
    public Boolean getEnableRepair() {
        return this.enableRepair;
    }

    public CheckPolarFsQuotaConsistencyRequest setEnableStrictCalculate(Boolean enableStrictCalculate) {
        this.enableStrictCalculate = enableStrictCalculate;
        return this;
    }
    public Boolean getEnableStrictCalculate() {
        return this.enableStrictCalculate;
    }

    public CheckPolarFsQuotaConsistencyRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CheckPolarFsQuotaConsistencyRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
