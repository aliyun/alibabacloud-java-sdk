// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCountRequest extends TeaModel {
    /**
     * <p>The type of the asset fingerprints. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: port</li>
     * <li><strong>process</strong>: process</li>
     * <li><strong>software</strong>: software</li>
     * <li><strong>user</strong>: account</li>
     * <li><strong>cron</strong>: scheduled task</li>
     * <li><strong>sca</strong>: middleware</li>
     * <li><strong>web</strong>: website</li>
     * <li><strong>database</strong>: database</li>
     * <li><strong>lkm</strong>: kernel module</li>
     * <li><strong>autorun</strong>: startup item</li>
     * <li><strong>web_server</strong>: web service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>port,process</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the assets. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>9658314a-7609-4426-afc4-2c924072****,
     * 9658314a-7609-4426-afc4-2c924072****</p>
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
