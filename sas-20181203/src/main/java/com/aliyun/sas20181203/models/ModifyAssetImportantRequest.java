// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetImportantRequest extends TeaModel {
    /**
     * <p>The importance of the asset. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: test</li>
     * <li><strong>1</strong>: normal</li>
     * <li><strong>2</strong>: important</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ImportantCode")
    public Integer importantCode;

    /**
     * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
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
