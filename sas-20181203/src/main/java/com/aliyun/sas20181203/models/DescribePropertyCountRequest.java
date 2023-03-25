// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprints. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **port**: port</p>
     * <p>*   **process**: process</p>
     * <p>*   **software**: software</p>
     * <p>*   **user**: account</p>
     * <p>*   **cron**: scheduled task</p>
     * <p>*   **sca**: middleware</p>
     * <p>*   **web**: website</p>
     * <p>*   **database**: database</p>
     * <p>*   **lkm**: kernel module</p>
     * <p>*   **autorun**: startup item</p>
     * <p>*   **web_server**: web service</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the assets. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("UuidList")
    public String uuidList;

    public static DescribePropertyCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCountRequest self = new DescribePropertyCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePropertyCountRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
