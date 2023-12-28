// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetQuotaRequest extends TeaModel {
    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("Value")
    public String value;

    public static SetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQuotaRequest self = new SetQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public SetQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetQuotaRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SetQuotaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
