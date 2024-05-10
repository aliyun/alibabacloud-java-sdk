// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddTagWithUuidRequest extends TeaModel {
    /**
     * <p>The name of the tag.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The UUIDs of the servers. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("UuidList")
    public String uuidList;

    public static AddTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagWithUuidRequest self = new AddTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public AddTagWithUuidRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public AddTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
