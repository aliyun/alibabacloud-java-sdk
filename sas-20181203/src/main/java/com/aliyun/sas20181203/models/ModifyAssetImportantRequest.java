// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetImportantRequest extends TeaModel {
    @NameInMap("ImportantCode")
    public Integer importantCode;

    @NameInMap("UuidList")
    public String uuidList;

    public static ModifyAssetImportantRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetImportantRequest self = new ModifyAssetImportantRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAssetImportantRequest setImportantCode(Integer importantCode) {
        this.importantCode = importantCode;
        return this;
    }
    public Integer getImportantCode() {
        return this.importantCode;
    }

    public ModifyAssetImportantRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
