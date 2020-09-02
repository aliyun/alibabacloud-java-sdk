// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnatTableId")
    @Validation(required = true)
    public String snatTableId;

    @NameInMap("SnatEntryId")
    @Validation(required = true)
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifySnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryRequest self = new ModifySnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySnatEntryRequest setSnatTableId(String snatTableId) {
        this.snatTableId = snatTableId;
        return this;
    }
    public String getSnatTableId() {
        return this.snatTableId;
    }

    public ModifySnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public ModifySnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public ModifySnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public ModifySnatEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
