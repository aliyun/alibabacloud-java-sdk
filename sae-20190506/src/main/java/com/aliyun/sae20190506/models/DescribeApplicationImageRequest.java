// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageRequest extends TeaModel {
    /**
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/demo:latest</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/demo:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static DescribeApplicationImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageRequest self = new DescribeApplicationImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
