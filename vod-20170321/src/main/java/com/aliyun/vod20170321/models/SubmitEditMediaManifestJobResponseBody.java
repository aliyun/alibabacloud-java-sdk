// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitEditMediaManifestJobResponseBody extends TeaModel {
    /**
     * <p>The manifest editing task ID, which is the MediaConvert pipeline task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93e154cb83e54b7a0f1236f847f4****</p>
     */
    @NameInMap("ManifestEditJobId")
    public String manifestEditJobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitEditMediaManifestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditMediaManifestJobResponseBody self = new SubmitEditMediaManifestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEditMediaManifestJobResponseBody setManifestEditJobId(String manifestEditJobId) {
        this.manifestEditJobId = manifestEditJobId;
        return this;
    }
    public String getManifestEditJobId() {
        return this.manifestEditJobId;
    }

    public SubmitEditMediaManifestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
