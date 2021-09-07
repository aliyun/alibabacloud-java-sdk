// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceSSLRequest extends TeaModel {
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    @NameInMap("CertCommonName")
    public String certCommonName;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceSSLRequest self = new UpdateDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceSSLRequest setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public UpdateDBInstanceSSLRequest setCertCommonName(String certCommonName) {
        this.certCommonName = certCommonName;
        return this;
    }
    public String getCertCommonName() {
        return this.certCommonName;
    }

    public UpdateDBInstanceSSLRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdateDBInstanceSSLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
