// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVodStreamURLRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeVodStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStreamURLRequest self = new DescribeVodStreamURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodStreamURLRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
