// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarFsQuotaConsistencyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRepair")
    public Boolean enableRepair;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableStrictCalculate")
    public Boolean enableStrictCalculate;

    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
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
