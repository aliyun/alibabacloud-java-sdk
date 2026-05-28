// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutLogsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The compression format. lz4 and gzip are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lz4</p>
     */
    @NameInMap("x-log-compresstype")
    public String xLogCompresstype;

    public static PutLogsHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutLogsHeaders self = new PutLogsHeaders();
        return TeaModel.build(map, self);
    }

    public PutLogsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutLogsHeaders setXLogCompresstype(String xLogCompresstype) {
        this.xLogCompresstype = xLogCompresstype;
        return this;
    }
    public String getXLogCompresstype() {
        return this.xLogCompresstype;
    }

}
