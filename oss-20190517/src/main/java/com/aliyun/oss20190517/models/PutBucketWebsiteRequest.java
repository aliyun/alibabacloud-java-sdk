// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketWebsiteRequest extends TeaModel {
    @NameInMap("WebsiteConfiguration")
    public WebsiteConfiguration websiteConfiguration;

    public static PutBucketWebsiteRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketWebsiteRequest self = new PutBucketWebsiteRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketWebsiteRequest setWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) {
        this.websiteConfiguration = websiteConfiguration;
        return this;
    }
    public WebsiteConfiguration getWebsiteConfiguration() {
        return this.websiteConfiguration;
    }

}
