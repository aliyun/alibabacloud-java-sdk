// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ApplyNumberDistrictInfoParsingResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ffaaa8f0-2de1-438c-ba66-5ac30d83a304</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static ApplyNumberDistrictInfoParsingResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNumberDistrictInfoParsingResultRequest self = new ApplyNumberDistrictInfoParsingResultRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNumberDistrictInfoParsingResultRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
