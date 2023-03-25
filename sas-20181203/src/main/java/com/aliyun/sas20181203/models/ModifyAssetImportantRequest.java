// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetImportantRequest extends TeaModel {
    /**
     * <p>The importance of the asset. Valid values:</p>
     * <br>
     * <p>*   **0**: test</p>
     * <p>*   **1**: normal</p>
     * <p>*   **2**: important</p>
     */
    @NameInMap("ImportantCode")
    public Integer importantCode;

    /**
     * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
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
