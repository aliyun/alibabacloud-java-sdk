// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BlockVodObjectCachesResponseBody extends TeaModel {
    @NameInMap("BlockTaskId")
    public String blockTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static BlockVodObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BlockVodObjectCachesResponseBody self = new BlockVodObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public BlockVodObjectCachesResponseBody setBlockTaskId(String blockTaskId) {
        this.blockTaskId = blockTaskId;
        return this;
    }
    public String getBlockTaskId() {
        return this.blockTaskId;
    }

    public BlockVodObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
