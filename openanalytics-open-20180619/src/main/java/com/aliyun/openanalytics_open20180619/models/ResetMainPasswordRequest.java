// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ResetMainPasswordRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UseRandomPassword")
    @Validation(required = true)
    public Boolean useRandomPassword;

    @NameInMap("InitPassword")
    public String initPassword;

    @NameInMap("EnableKMS")
    public Boolean enableKMS;

    @NameInMap("ExternalUid")
    public String externalUid;

    @NameInMap("ExternalAliyunUid")
    public String externalAliyunUid;

    @NameInMap("ExternalBizAliyunUid")
    public String externalBizAliyunUid;

    public static ResetMainPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetMainPasswordRequest self = new ResetMainPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetMainPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetMainPasswordRequest setUseRandomPassword(Boolean useRandomPassword) {
        this.useRandomPassword = useRandomPassword;
        return this;
    }
    public Boolean getUseRandomPassword() {
        return this.useRandomPassword;
    }

    public ResetMainPasswordRequest setInitPassword(String initPassword) {
        this.initPassword = initPassword;
        return this;
    }
    public String getInitPassword() {
        return this.initPassword;
    }

    public ResetMainPasswordRequest setEnableKMS(Boolean enableKMS) {
        this.enableKMS = enableKMS;
        return this;
    }
    public Boolean getEnableKMS() {
        return this.enableKMS;
    }

    public ResetMainPasswordRequest setExternalUid(String externalUid) {
        this.externalUid = externalUid;
        return this;
    }
    public String getExternalUid() {
        return this.externalUid;
    }

    public ResetMainPasswordRequest setExternalAliyunUid(String externalAliyunUid) {
        this.externalAliyunUid = externalAliyunUid;
        return this;
    }
    public String getExternalAliyunUid() {
        return this.externalAliyunUid;
    }

    public ResetMainPasswordRequest setExternalBizAliyunUid(String externalBizAliyunUid) {
        this.externalBizAliyunUid = externalBizAliyunUid;
        return this;
    }
    public String getExternalBizAliyunUid() {
        return this.externalBizAliyunUid;
    }

}
