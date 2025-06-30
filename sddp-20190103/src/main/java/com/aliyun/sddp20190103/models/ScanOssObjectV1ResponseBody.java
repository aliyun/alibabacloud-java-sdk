// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ScanOssObjectV1ResponseBody extends TeaModel {
    /**
     * <p>The ID of the identification task that is returned after the identification task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C3AC882-E5A8-4855-BE77-B6837B695EF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScanOssObjectV1ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanOssObjectV1ResponseBody self = new ScanOssObjectV1ResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanOssObjectV1ResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ScanOssObjectV1ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
