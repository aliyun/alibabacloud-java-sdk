// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountRequest extends TeaModel {
    // The type of the asset fingerprints. Separate multiple types with commas (,). Valid values:
    // 
    // *   **port**: port
    // *   **process**: process
    // *   **software**: software
    // *   **user**: account
    // *   **cron**: scheduled task
    // *   **sca**: middleware
    // *   **web**: website
    // *   **database**: database
    // *   **lkm**: kernel module
    // *   **autorun**: startup item
    // *   **web_server**: web service
    @NameInMap("Type")
    public String type;

    // The UUIDs of the assets. Separate multiple UUIDs with commas (,).
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
