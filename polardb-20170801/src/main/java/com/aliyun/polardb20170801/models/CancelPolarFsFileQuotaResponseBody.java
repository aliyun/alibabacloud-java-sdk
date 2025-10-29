// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CancelPolarFsFileQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/path1,/path2</p>
     */
    @NameInMap("FilePathIds")
    public String filePathIds;

    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPolarFsFileQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPolarFsFileQuotaResponseBody self = new CancelPolarFsFileQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPolarFsFileQuotaResponseBody setFilePathIds(String filePathIds) {
        this.filePathIds = filePathIds;
        return this;
    }
    public String getFilePathIds() {
        return this.filePathIds;
    }

    public CancelPolarFsFileQuotaResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CancelPolarFsFileQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
