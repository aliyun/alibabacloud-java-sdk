// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddTagWithUuidRequest extends TeaModel {
    /**
     * <p>The name of the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InternetIp</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The UUIDs of the servers. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>71f5313e-4355-4c59-86d1-557dda7b****,71f5313e-4355-4c59-86d1-557dda7b****</p>
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
