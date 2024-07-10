// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebAclConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("WebAclEntries")
    public java.util.List<WebAclEntryConfig> webAclEntries;

    public static WebAclConfig build(java.util.Map<String, ?> map) throws Exception {
        WebAclConfig self = new WebAclConfig();
        return TeaModel.build(map, self);
    }

    public WebAclConfig setWebAclEntries(java.util.List<WebAclEntryConfig> webAclEntries) {
        this.webAclEntries = webAclEntries;
        return this;
    }
    public java.util.List<WebAclEntryConfig> getWebAclEntries() {
        return this.webAclEntries;
    }

}
