// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebAclEntryConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4/32</p>
     */
    @NameInMap("Entry")
    public String entry;

    public static WebAclEntryConfig build(java.util.Map<String, ?> map) throws Exception {
        WebAclEntryConfig self = new WebAclEntryConfig();
        return TeaModel.build(map, self);
    }

    public WebAclEntryConfig setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

}
