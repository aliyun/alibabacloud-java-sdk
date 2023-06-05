// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetDetailByUuidRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Uuid")
    public String uuid;

    public static GetAssetDetailByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailByUuidRequest self = new GetAssetDetailByUuidRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailByUuidRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAssetDetailByUuidRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetAssetDetailByUuidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
